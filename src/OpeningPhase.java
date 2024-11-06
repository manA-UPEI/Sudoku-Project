import java.util.Random;
import java.util.Scanner;

public class OpeningPhase {

 public static void run(){
     String[] greetings = {"Hello!","Hola!","Whatsup!","Hi!","Greetings!","Howdy!","Yo","Whatzupp!"};
     Random random = new Random();
     int anyNum = random.nextInt(8);

     Scanner scanner = new Scanner(System.in);
     System.out.println("\"Welcome to Sudoku\"");
     System.out.println("Please Enter Your Name:");
     String name = scanner.nextLine();
     System.out.print(greetings[anyNum]);
     System.out.println(" "+name+ ", Do you want to continue playing?(Press X to Play / Any other buttons to Exit)!");
     String button = scanner.nextLine();
     if (button.equalsIgnoreCase("X")){
         rules();

     }
     else{
         System.exit(0);
     }

 }
    public static void rules(){
        Random value = new Random();
        String[] ruleGreetings = {"Because you clicked the X button,", "Now that you've hit the X button,", "Since you chose the X button,", "Given that you clicked the X button,"};
        String[] closingGreetings = {"Best wishes","Good luck", "Wishing you success", "Take care", "Wishing you all the best",
        "All the best to you", "Good fortune", "Hope all goes well", "Best of luck", "Wishing you the very best"};
        int val = value.nextInt(ruleGreetings.length);
        int val2 = value.nextInt(closingGreetings.length);
        System.out.println(ruleGreetings[val]+ " Here are the rules to be followed:-");

        try {
            Thread.sleep(3000);


            System.out.println("Each row must contain the numbers 1-9 exactly once.");
            System.out.println("Each column must contain the numbers 1-9 exactly once.");
            System.out.println("Each 3x3 must contain the numbers 1-9 exactly once.");
            System.out.println("Most importantly, don't use random guess! Use the process of Eliminations.");

            Thread.sleep(3000);
            System.out.println(closingGreetings[val2]);
            Thread.sleep(3000);
            System.out.println("Lets Play:-");
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            System.out.println("Wait for a while please!");
        }
        }

}

