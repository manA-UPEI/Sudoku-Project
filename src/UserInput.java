import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {


    public static ArrayList<ArrayList<Integer>> takeValues() {

        int count = 28;
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> solution = SetupBoard.solnBoard();

        ArrayList<ArrayList<Integer>> board = SetupBoard.playGame();
        System.out.println();
        while (count > 0) {
            int row = -1, col = -1, value = -1;

            // Input for row
            while (true) {
                try {
                    System.out.println("Enter the row number (1-9) which you want to put the value in, and Enter 0 to EXIT: ");
                    row = scanner.nextInt();
                    if (row < 0 || row > 9) {
                        System.out.println("Invalid row number. Please enter a row number between 1 and 9 and Enter 0 to EXIT.");
                    }
                    if (row == 0){
                        System.out.println("You pressed 0, Game is successfully exited.");
                        System.exit(0);
                    }
                    else {
                        break; // Exit the loop if the input is valid
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer value for the row.");
                    scanner.next(); // Clear the invalid input from the scanner buffer
                }
            }

            // Input for column
            while (true) {
                try {
                    System.out.println("Enter the column number (1-9) which you want to put the value in: ");
                    col = scanner.nextInt();
                    if (col < 0 || col > 9) {
                        System.out.println("Invalid column number. Please enter a column number between 1 and 9.");
                    }
                    if (col == 0){
                        System.out.println("You pressed 0, Game is successfully exited.");
                        System.exit(0);
                    }
                    else {
                        break; // Exit the loop if the input is valid
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an Integer Value for the column.");
                    scanner.next(); // Clear the invalid input from the scanner buffer
                }
            }

            // Input for value
            while (true) {
                try {
                    System.out.println("Enter the value (1-9) you want to place at position (" + row + "," + col + "): ");
                    value = scanner.nextInt();
                    if (value < 1 || value > 9) {
                        System.out.println("Invalid value. Please enter a number between 1 and 9.");
                    } else {
                        break; // Exit the loop if the input is valid
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer value for the value.");
                    scanner.next(); // Clear the invalid input from the scanner buffer
                }
            }
            if (board.get(row-1).get(col-1) == 0){
                if (solution.get(row-1).get(col-1) == value){
                    board.get(row - 1).set(col - 1, value);
                    count -= 1;
                }
                else{
                    System.out.println("Sorry, its not correct! , Please try again");
                }

            }
            else{ System.out.println("Sorry, You can't Change the Already Defined Value. You can Only Change the values on the positions of 0s!!");

            }

            SetupBoard.printBoard(board);
        }
        scanner.close();
        return board;
    }
}