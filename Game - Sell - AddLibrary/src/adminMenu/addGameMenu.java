package adminMenu;

import java.util.Scanner;

import model.Game;
import repo.SellingGames;

public class addGameMenu {

    Scanner scanner = new Scanner(System.in);

    public void process(){
        System.out.print("Name: ");
        scanner.next();
        String nameOfGame = scanner.nextLine();

        System.out.print("Price: ");
        float priceOfGame = scanner.nextFloat();

        Game game = new Game(nameOfGame, priceOfGame);
        SellingGames.addGameToList(game);

        System.out.println();
        System.out.println("Game Added !");
    }

}
