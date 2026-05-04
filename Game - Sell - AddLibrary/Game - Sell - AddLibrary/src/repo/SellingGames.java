package repo;

import model.Game;

import java.util.ArrayList;


public class SellingGames {

    static ArrayList<Game> games = new ArrayList<>();

    public static void addGameToList(Game game) {
        games.add(game);
    }

    public static int showGames() {
        if (games.isEmpty()) {
            System.out.println("There is no game yet !");
            return 0;
        } else {
            for (Game game : games) {
                System.out.println(game);
            }
            return 1;
        }

    }

    public static void updateGame(int id, String name, float price) {
        for (Game game : games) {
            if (game.getId() == id) {
                game.setName(name);
                game.setPrice(price);
                break;
            }
        }
    }

    public static void deleteGame(int id) {
        for (Game game : games) {
            if (game.getId() == id) {
                games.remove(game);
                break;
            }
        }
    }


}
