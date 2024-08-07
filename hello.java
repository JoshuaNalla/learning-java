import java.util.*;

//switch statement, remember the class has to be same as the file name class.java, public class class(parameters)

// this time im accounting for exceptions, what if five is entered instead of '5'

public class hello {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("What number do you want: ");
        int n = getint();
        // added this exception so i can account for if a wrong input is entered at first
        switch (n) {
            case 1:
                System.out.println("It's Monday!");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Get your facts straight, cuh");
                break;
        }
    }

    public static int getint ()
    {
        while(true) // this loop will only stop when the return in the try block is successful
        {
            try{
                return sc.nextInt(); // when this return statement wont work, it will trigger the catch mechanism to catch the exception
            }
            catch (Exception e) // this general exception catches all types of exceptions and the body will do the same thing 
            // for any kind of exception
            {
                sc.next(); // this takes the input, that was not accepted, and then disposes of it? it just wont be a prob no more
                System.out.println("whoops, pls enter a valid number yo"); // prints out the error msg and reruns the loop
            }
        }
    } 
}

// diff