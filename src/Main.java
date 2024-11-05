import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> board = new ArrayList<>(9);
        for (int i = 0; i < 9; i++){
            //ArrayList<Integer> row = new ArrayList<>(9);
            ArrayList<Integer> row = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
            board.add(row);

        }
        //ArrayList<ArrayList<Integer>> board2 = new ArrayList<>(9);
        //ArrayList<Integer> row = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        //board2.add(row);
        //row = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,1));
        //board2.add(row);

        //System.out.println(board2);
        printBoard(board);

        //System.out.println(board);
        //System.out.println(board.get(0));
    }

    public static void printBoard(ArrayList<ArrayList<Integer>> data){
        System.out.println();
        System.out.println("Currently, playing Sudoku: ");
        System.out.println();
        ArrayList<String> stringForm = new ArrayList<>();
        for (int j = 0; j<9; j++){        //creating row as string

            StringBuilder string = new StringBuilder();
            for (int i = 0; i<9; i++) {
                string.append(data.get(j).get(i));
                string.append(" ");
                if (i==2 || i==5 ){
                    string.append("| ");
                }
            }

            String strring = string.toString();
            stringForm.add(strring);

        }
        for (int x = 0; x<9; x++){
            System.out.println(stringForm.get(x));
            if (x ==2 || x==5){
                System.out.println("- - - - - - - - - - -");
            }


        }

        }


}
