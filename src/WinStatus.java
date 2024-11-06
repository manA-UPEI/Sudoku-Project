import java.util.ArrayList;

public class WinStatus {



public static void displayResults(ArrayList<ArrayList<Integer>> board){
    var soln = SetupBoard.solnBoard();
    boolean answer = soln.equals(board);
    if(answer){
        System.out.println("You won, Congrats");}

}
}

