import java.io.*;

public class Exercise1 {
    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int sum = 0;
        for(int i = 0;i<10;i++)
        {   
            System.out.print("Enter integer " + i + ": ");
            String input = br.readLine();
            int number = Integer.parseInt(input);

            sum = sum + number;
        }

        // Print the sum
        System.out.println("The sum of the 10 integers is: " + sum);
    }
}
