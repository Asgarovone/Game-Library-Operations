package repo;

import db.DBConnection;
import model.Game;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserLibrary {

    // ── Kitabxanaya oyun əlavə et ─────────────────────────────────────────
    public static void addToLibrary(int gameId) {
        // Əvvəlcə oyunun artıq kitabxanada olub olmadığını yoxla
        if (isAlreadyInLibrary(gameId)) {
            System.out.println("Bu oyun artıq kitabxananda var!");
            return;
        }

        String sql = "INSERT INTO user_library (game_id) VALUES (?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, gameId);
            ps.executeUpdate();
            System.out.println("model.Game added to library!");

        } catch (SQLException e) {
            System.out.println("Xəta (addToLibrary): " + e.getMessage());
        }
    }

    // ── Kitabxanadakı oyunları gör ────────────────────────────────────────
    public static List<Game> getLibrary() {
        List<Game> library = new ArrayList<>();
        String sql = """
                SELECT g.id, g.name, g.price
                FROM user_library ul
                JOIN games g ON ul.game_id = g.id
                ORDER BY ul.added_at
                """;

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                library.add(new Game(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Xəta (getLibrary): " + e.getMessage());
        }

        return library;
    }

    // ── Kitabxanadakı oyunları ekrana çap et ─────────────────────────────
    public static void showLibrary() {
        List<Game> library = getLibrary();

        if (library.isEmpty()) {
            System.out.println("Your library is empty!");
            return;
        }

        System.out.println("=== YOUR LIBRARY ===");
        for (Game game : library) {
            System.out.println(game);
        }
    }

    // ── Oyun artıq kitabxanadadır? ────────────────────────────────────────
    private static boolean isAlreadyInLibrary(int gameId) {
        String sql = "SELECT 1 FROM user_library WHERE game_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, gameId);
            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            System.out.println("Xəta (isAlreadyInLibrary): " + e.getMessage());
        }

        return false;
    }
}
