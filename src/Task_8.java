import java.util.Random;
import java.util.Scanner;

public class Task_8 {
    public static void main (){

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int roll, dice1, dice2, dice3, diceTotal;
        String again = "";
        boolean done = false;

        System.out.println("Roll  Dice 1  Dice 2  Dice 3   Dice Total" );
        System.out.println("-----------------------------------------");

        for (int i = 0; i <= 10; i++){

            dice1 = rnd.nextInt(6) + 1;
            dice2 = rnd.nextInt(6) + 1;
            dice3 = rnd.nextInt(6 + 1);
            roll = i;
            diceTotal = dice1 + dice2 + dice3;

            System.out.printf("%3d %5d %7d %8d %10d\n", roll,dice1,dice2,dice3,diceTotal);

            if (dice1 == dice2 && dice1 == dice3){
                System.out.println("Would you like to roll again? Y/N");

                if (in.hasNext()){
                    again = in.next();

                    if (again.equalsIgnoreCase("Y")) {
                        main();
                        in.nextLine();
                    }

                }

            }
        }
    }
}

