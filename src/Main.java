import java.util.ArrayList;



public class Main {
    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> board = SetupBoard.solnBoard();

        OpeningPhase.run();
        //var a = SetupBoard.playGame();
        var b =UserInput.takeValues();
        WinStatus.displayResults(b);

    }







}
