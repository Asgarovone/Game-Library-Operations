package menuProcessesOfUser;

import repo.SellingGames;

import java.util.Scanner;

public class MenuProcessOfSelling {

    Scanner scanner = new Scanner(System.in);

    public void process(){
        while (true) {
            SellingGames.showGames();
            System.out.println();
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choiceInSellingGamesSection = scanner.nextInt();
            System.out.println();

            if (choiceInSellingGamesSection == 0) {
                System.out.println("Exiting ...");
                break;
            } else System.out.println("Invalid input !");
        }
    }

}
