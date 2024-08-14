
public class hello
{

    public static void main (String arg[])
    {
        statement();
        for(int i = 0; i < 10; i++)
        {
            something c1 = new something(); //remember that the variable is killed at the end of the forloop each time so c1 is made and then killed
            // over and over again until the end of the for loop. each time the static variable changes.
            statement();
        }

    }

    public static void statement()
    {
        System.out.println("The class has been called " + something.count + " times");
    }
    
}

class something
{
    static int count = 0;

    public something() //this constructor adds one to the static variable every single time this class is created. 
    {
        count++;
    }

    public int getcount()
    {
        return count;
    }
}
