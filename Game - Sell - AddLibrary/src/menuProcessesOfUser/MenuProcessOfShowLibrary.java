package menuProcessesOfUser;

import java.util.Scanner;

public class MenuProcessOfShowLibrary {

    Scanner scanner = new Scanner(System.in);

    public void process(){
        while (true) {
            System.out.println("Showing Library ...");
            System.out.println("1. Add Game");
            System.out.println("0. Exit");

            System.out.print("Choice: ");
            int choiceInLibrarySection = scanner.nextInt();
            System.out.println();

            if(choiceInLibrarySection == 1){
                System.out.println("Game Added !");
            }
            else if (choiceInLibrarySection == 0) {
                System.out.println("Exiting ...");
                break;
            } else System.out.println("Invalid input !");
        }
    }

}
