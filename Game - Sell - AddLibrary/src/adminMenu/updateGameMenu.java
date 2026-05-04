package adminMenu;

import repo.SellingGames;

import java.util.Scanner;

public class updateGameMenu {

    Scanner scanner = new Scanner(System.in);

    public int isThereGame;


    public void process(){
        isThereGame = SellingGames.showGames();
        System.out.println();

        if (isThereGame == 1) {
            System.out.print("Enter ID: ");
            int idOfGame = scanner.nextInt();

            System.out.print("Enter New Name: ");
            scanner.next();
            String nameOfGame = scanner.nextLine();

            System.out.print("Enter New Price: ");
            float priceOfGame = scanner.nextFloat();
            System.out.println();

            SellingGames.updateGame(idOfGame, nameOfGame, priceOfGame);

            System.out.println("Game Updated !");
        }
    }

}
