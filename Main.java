import java.util.Scanner;

class Main
{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        String input;
        
        System.out.println("Enter a word:");
        input = userInput.nextLine();

        System.out.println(input.length());

      userInput.close();
    }
}