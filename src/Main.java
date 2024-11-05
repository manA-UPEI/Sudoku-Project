import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> board = SetupBoard.solnBoard();


        var a = SetupBoard.playGame();
        var b =UserInput.takeValues();
        WinStatus.displayResults(b);

    }







}
