import java.util.Scanner;

public class DmvSimulator {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = (int) ((Math.random() * 200) + 1);
        System.out.println("Welcome to the DMV! You are number " + number + " in line. Please wait until your number is called.");
        
        int currNumber = number + 1;
        do {
            if (currNumber == 0) currNumber = 1;
            System.out.println("Number " + currNumber + ", you are up next.");
            currNumber = (currNumber + 1) % 201;
        } while (currNumber != number);

        int miracle = (int) ((Math.random() * 100) + 1);
        if (miracle == 100) {
            System.out.println("Your paperwork is valid and up-to-date. Thank you, you are all set.");
        }
        else {
            System.out.println("Number " + currNumber + ", you are up next. \nYou IDIOT!!! You do not have the required paperwork. \nStop wasting our time and get out!");
        }
    }
}
