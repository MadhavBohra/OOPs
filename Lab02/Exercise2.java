import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i<=10;i++)
        {
            System.out.println("Enter Number "+ i + " :");
            int num = in.nextInt();
            sum = sum+num;

        }
        System.out.println("The sum of the 10 integers is: " + sum);
    }
}
