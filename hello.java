// an exameple is listed below

public class hello
{
    public static void main (String arg[])
    {
        //like static used here means that main can run without an instance of the hello class being made
        System.out.println("the static variable: " + something.x);
        // notice how i just called the name of the class and then accessed its variable. this is because it is static and so 'exists'
        // without me having to create an instance to speak it into existance like a non-static variable.
    }
}

class something
{
    static int x = 5; //initializer but here it is static 
}

// IMPORTANT NOTE: a static member cannot access any non static member within its own class because they dont 'exist'.
// even in the main function for the hello class here, you cannot access an instance variable outside of the main function unless its static.
// but if the function is not static then you can access it.