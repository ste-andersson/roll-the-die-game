import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        //Number of spaces on the board
        int boardSpaces = 20;
        //Highest number on the die that is used
        int dieMax = 6;
        //Starting spot
        int startingSpot = 0;
        //Maximum number of die rolls
        int maxDieRolls = 5;
        //Used die rolls
        int usedDieRolls = 0;
        //Die roll number
        int dieRoll;
        //Current spot
        int currentSpot = startingSpot;
        //Is the game over?
        boolean gameOver = false;
        //What does the user do?
        String action;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("You are at spot " + currentSpot + ". Press write \"Roll\" to roll the die!");
            action = scanner.next().toLowerCase();
            if(action.equals("roll")){
                dieRoll = (int)(Math.random() * dieMax + 1);
                currentSpot = currentSpot + dieRoll;
                System.out.println("You rolled a " + dieRoll);
                if(currentSpot >= boardSpaces) {
                    gameOver = true;
                }
            }
        } while(!gameOver);

        if(currentSpot == boardSpaces) {
            System.out.println("You win!");
        } else {
            System.out.println("You lost! You went " + (currentSpot - boardSpaces) + " steps too far");
        }


    }

}
