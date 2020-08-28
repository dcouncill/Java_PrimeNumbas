import  java.util.Scanner;
public class UserInput {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter an integer number:");
                
                int number = input.nextInt();
                boolean flag = false;
                for(int i = 2; i <= number/2; ++i)
                {
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
                
            }
}

