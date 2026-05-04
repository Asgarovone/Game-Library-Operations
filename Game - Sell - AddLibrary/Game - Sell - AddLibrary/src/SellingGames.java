import db.DBConnection;
import model.Game;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SellingGames {

    // ── Bütün oyunları DB-dən oxu ──────────────────────────────────────────
    public static List<Game> getGames() {
        List<Game> games = new ArrayList<>();
        String sql = "SELECT id, name, price FROM games ORDER BY id";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                games.add(new Game(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price")
                ));
            }

        } catch (SQLException e) {
            System.out.println("Xəta (getGames): " + e.getMessage());
        }

        return games;
    }

    // ── Oyunları ekrana çap et ─────────────────────────────────────────────
    public static int showGames() {
        List<Game> games = getGames();

        if (games.isEmpty()) {
            System.out.println("There is no game yet!");
            return 0;
        }

        for (Game game : games) {
            System.out.println(game);
        }
        return 1;
    }

    // ── Yeni oyun əlavə et ────────────────────────────────────────────────
    public static void addGameToList(Game game) {
        String sql = "INSERT INTO games (name, price) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, game.getName());
            ps.setFloat(2, game.getPrice());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Xəta (addGame): " + e.getMessage());
        }
    }

    // ── Oyunu yenilə ──────────────────────────────────────────────────────
    public static void updateGame(int id, String name, float price) {
        String sql = "UPDATE games SET name = ?, price = ? WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setFloat(2, price);
            ps.setInt(3, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Xəta (updateGame): " + e.getMessage());
        }
    }

    // ── Oyunu sil ─────────────────────────────────────────────────────────
    public static void deleteGame(int id) {
        String sql = "DELETE FROM games WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Xəta (deleteGame): " + e.getMessage());
        }
    }
}
