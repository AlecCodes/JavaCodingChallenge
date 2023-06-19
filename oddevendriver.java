import java.util.Scanner;

public class oddevendriver {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer > ");

        int userinput = input.nextInt();

        System.out.println("----Result----");

        oddeven test = new oddeven();

        String result = test.challenge(userinput);

        System.out.println(result);


    }
}