import java.util.*;

//switch statement, remember the class has to be same as the file name class.java, public class class(parameters)

// here an exception is created and thrown back, either a generic exception or a exception class (later on)but as soon as 
// the exception is found, the method terminates and throws trhe exception (throws exception line beneath method declaration)
// back at the main function (the function that called it) so that it is dealt with in the main with the try-catch.

public class hello {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
     try 
     {
        dosomething(true);
     }  
     catch(Exception e)
     {
        System.out.println("caught an exception");
     }
    }

    public static void dosomething (boolean t)
    throws Exception
    {
        if(t == true)
        {
            throw new Exception();
        }
    }
}
