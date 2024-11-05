import java.util.ArrayList;

public class WinStatus {



public static void displayResults(ArrayList<ArrayList<Integer>> board){
    var soln = SetupBoard.solnBoard();
    boolean answer = soln.equals(board);
    if(answer){
        System.out.println("You won, Congrats");}
    else{
        System.out.println("You lost, Try again later please..");}
}
}

