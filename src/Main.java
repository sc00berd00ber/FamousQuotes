import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String [] quotes = {"The only thing we have to fear is fear itself." ,
                "To be or not to be, that is the question.",
                "Carpe diem.", "I think, therefore I am.", "Knowledge is power.",
                "Less is more.", "United we stand, divided we fall.",
                "You are never too old to set a new goal or to dream a new dream.",
                "The journey of a thousand miles begins with a single step.",
                "What doesn't kill you makes you stronger."};

        while(true) {
            try {
                System.out.println("Print a quote by choosing a number 0-9: ");
                int choice = in.nextInt();
                System.out.println(quotes[choice] + "\n");
                System.out.println("Would you like to see another quote? Reply with 'Yes' or 'No': ");
                String choice2 = in.next();
                if (choice2.equalsIgnoreCase("No")){
                    break;
                }else if (choice2.equalsIgnoreCase("Yes")){
                    continue;
                }else {
                    System.out.println("Invalid entry! Try again");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid entry. Please choose a number from 0-9! \n");
            }
        }
    }
}