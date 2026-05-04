package menuProcessesOfAdminOperations;

import repo.SellingGames;

import java.util.Scanner;

public class MenuProcessOfDeleteGame {

    Scanner scanner = new Scanner(System.in);

    public int isThereGame;

    public void process(){
        isThereGame = SellingGames.showGames();
        System.out.println();

        if (isThereGame == 1) {
            System.out.print("Enter ID: ");
            int idOfGame = scanner.nextInt();

            SellingGames.deleteGame(idOfGame);

            System.out.println("model.Game Deleted !");
        }
    }

}
