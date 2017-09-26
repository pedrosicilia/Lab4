import java.util.Scanner;
import java.util.Random;


public class main {
    public static void main(String args[]) {

        int usernum = 0;
        int num = 0;
        //Testing 1 2


        Random rand = new Random();
        Scanner myscanner = new Scanner(System.in);

        System.out.println("PICK A WHOlE NUMBER BETWEEEN 0 and 10!");
        usernum = myscanner.nextInt();

        num = rand.nextInt(10)+1;

        if(num == usernum) {
            System.out.println("WOW, we both picked: " +num+ " !!");
        }

        else
        {
            System.out.println("AWW, I picked " +num+ " but you picked " +usernum+ " ");
        }



    }


}
