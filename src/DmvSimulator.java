import java.util.Scanner;

public class DmvSimulator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = (int) ((Math.random() * 100) + 1);
        System.out.println("Welcome to the DMV! You are number " + number + " in line. Please wait until your number is called.");
        
        int currNumber = number + 1;
        do {
            if (currNumber == 0) currNumber = 1;
            System.out.println("Number " + currNumber + ", you are up next.");
            currNumber = (currNumber + 1) % 101;
        } while (currNumber != number);

        System.out.println("Number " + currNumber + ", you are up next. \nI'm sorry, you do not have the required paperwork. \nWe hope to see you again!");
    }
}
