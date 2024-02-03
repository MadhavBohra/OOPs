import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Buffered reader is primitive
// and old 
/**
 * Example1
 */
public class Example1 {

    public static void main(String args[])throws IOException
    {
        /*instantiate InputStreamReader class and pass System.in
         * to its constructor
         */
        InputStreamReader isr = new InputStreamReader(System.in);
        /*
         * instantiate BufferedReader class and pass the reference variable isr
         */
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter Your First name");
        String name = br.readLine();
        System.out.println("Your name is :" + name );

    }
}

//the main method have an IOException check which may be thrown by Buffered Reader
// InputStreamReader is initialized with standard input stream
// BufferedReader is created
// BufferedReader class have a readLine() method which is used.