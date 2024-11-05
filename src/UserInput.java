import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {


    public static ArrayList<ArrayList<Integer>> takeValues() {
        int count = 28;
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> solution = SetupBoard.solnBoard();
        ArrayList<ArrayList<Integer>> board = SetupBoard.playGame();
        while (count > 0) {
            System.out.println("Enter the row number which you want to put the value in:- ");
            int row = scanner.nextInt();
            System.out.println("Enter the column number which you want to put the value in:- ");
            int col = scanner.nextInt();
            System.out.println("Enter the value which you want to put the value in:- ");
            int value = scanner.nextInt();

            if (board.get(row-1).get(col-1) == 0){
                if (solution.get(row-1).get(col-1) == value){
                    board.get(row - 1).set(col - 1, value);
                    count -= 1;
                }
                else{
                    System.out.println("Sorry, its not correct! , Please try again");
                }

            }

            SetupBoard.printBoard(board);
        }
        return board;
    }
}