import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> board = new ArrayList<>(9);
        for (int i = 0; i < 9; i++){
            ArrayList<Integer> row = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
            board.add(row);

        }



        printBoard(board);

        ArrayList<ArrayList<Integer>> board2 = makeBoard();
        printBoard(board2);


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
                System.out.println("------+-------+------");
            }


        }

        }
        public static ArrayList<ArrayList<Integer>> makeBoard(){
            //ArrayList<ArrayList<Integer>> boards = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> row1 = new ArrayList<> (Arrays.asList(5,3,4,6,7,8,9,1,2));
            ArrayList<Integer> row2 = new ArrayList<> (Arrays.asList(6,7,2,1,9,5,3,4,8));
            ArrayList<Integer> row3 = new ArrayList<> (Arrays.asList(1,9,8,3,4,2,5,6,7));
            ArrayList<Integer> row4 = new ArrayList<> (Arrays.asList(8,5,9,7,6,1,4,2,3));
            ArrayList<Integer> row5 = new ArrayList<> (Arrays.asList(4,2,6,8,5,3,7,9,1));
            ArrayList<Integer> row6 = new ArrayList<> (Arrays.asList(7,1,3,9,2,4,8,5,6));
            ArrayList<Integer> row7 = new ArrayList<> (Arrays.asList(9,6,1,5,3,7,2,8,4));
            ArrayList<Integer> row8 = new ArrayList<> (Arrays.asList(2,8,7,4,1,9,6,3,5));
            ArrayList<Integer> row9 = new ArrayList<> (Arrays.asList(3,4,5,2,8,6,1,7,9));
            //boards.add(row1);
            ArrayList<ArrayList<Integer>> boards = new ArrayList<>(Arrays.asList(row1,row2,row3,row4,row5,row6,row7,row8,row9));
            return boards;

        }


}
