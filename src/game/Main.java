package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1, please enter your name.");
        player1.setName(scanner.next());
        System.out.println("Player 2, please enter your name.");
        player2.setName(scanner.next());

        while(true){
            System.out.println("\nType 1 to play the game.\nType 2 to check the score");
            int menuChoice = scanner.nextInt();

            if(menuChoice == 1){
                player1.setRpsChoice();
                player2.setRpsChoice();

                Player.checkPlayerMoves(player1, player2);
            }
            else if(menuChoice == 2){
                System.out.println(player1.getName() + " has " + player1.getScore() + " point(s).");
                System.out.println(player2.getName() + " has " + player2.getScore() + " point(s).");
            }
            else{
                System.out.println("Please enter a valid option.");
            }
        }
    }
}
