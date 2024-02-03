import java.util.Scanner;
public class Example2 {
    public static void main(String args[])
    {
        //No need to use IOException
        int num1;
        double double1;
        String numStr1, numStr2;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an integer : ");
        num1 = in.nextInt();
        System.out.println("You entered:" + num1);

        System.out.println("Enter a double: ");
        double1=in.nextDouble();//reads an int from keyboard
        System.out.println("You entered: " + double1);
        System.out.println("Enter your first name ");
        numStr1 = in.next(); // This will leave a `\n` character
        System.out.println("Your name is " + numStr1);
        System.out.println("Enter your surname ");
        in.nextLine(); // This new line method will catch the `\n` character
        numStr2 = in.nextLine();
        System.out.println("Your surname is " + numStr2);

    }
}
