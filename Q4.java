
class MyException extends Exception 
{
    int m;
    MyException(int marks)
    {
        m=marks;
    }
    @Override
    public String toString()
    {
        return "MarkOutofBoundException: "+m;
    }
}
public class Q4 
{
    static void check(int marks) throws MyException
    {
        if(marks<=100)
            System.out.print("Marks "+marks+"\n");
        else
            throw new MyException(marks);
    }
    public static void main(String[] args) 
    {
        try
        {
            check(90);
            check(100);
            check(110);
        }
        catch(MyException e)
        {
            System.out.print("Caught: "+e+"\n");
        }        
    }    
}
