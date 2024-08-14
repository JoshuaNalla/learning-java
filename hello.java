import java.util.*;

// intro to object oriented programming
// you create classes, blueprints, and when you call or use them, you create an object which is an instance of the class
// classes have a couple aspects: methods (normal functions), constructors (a method called when an object is made), initializer (block-
// of code that only happen once which is when the object is made).

// another thing is you cannot have two public classes in one file or it wont compile but the non-public class wont be available for use
// elsewhere, you must only use it within that file. 
// if you want to use it in multiple places then you must create a new .java file

//public or private must be specifified (public means everyone can access it but privatet means only one person *you* can access it
// getters and setters are methods used to access private members, such as a private variable. getters get that variable for you 
// setters set it to whatever number you want

// overloading methods are when two methods have the same name but different parameter types (note that return types and parameter 
// names dont really mean anything here.

// constructors are methods with no return type, same name as the class

public class hello
{
    public static Scanner sc = new Scanner(System.in);
    public static void main (String arg[])
    {
        something name = new something();
        System.out.println("second class first variable: ");
        int x = input();
        System.out.println("second class second variable: ");
        int y = input();
        something name2 = new something(x,y);
        System.out.println("first class instance, addition: " + name.addition());
        System.out.println("first class, second method: multuplication: " + name.multiplication());
        System.out.println("second class first method: addition: " + name2.addition());
        System.out.println("Second class second method, multiplication: " + name2.multiplication());

    }

    public static int input()
    {
        while (true)
        {
            try
            {
                return sc.nextInt();
            }
            catch (Exception e)
            {
                sc.next();
                System.out.println("wrong type amigo, try again: ");
            }
        }
    }

}

// also note when you are creating your own private class within a class folder, you are ineffect creating a new .class file.
class something
{
    // this block of code that isnt in any method or constructor is known as the initializer which 'initializes' all the things that need to be
    private int x;
    private int y;
    // constructor and default constructor
    public something (int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public something ()
    {
        this.x = 1;
        this.y = 2;
    }

    // methods for something like addition

    public int addition()
    {
        return x + y;
    }

    public int multiplication()
    {
        return x * y;
    }
}