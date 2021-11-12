import java.util.Scanner;

public class Operation
{
    private static String statement;
    boolean start;

    public Operation()
    {

    }

    public boolean isStart()
    {
        if(this.statement.equalsIgnoreCase("y"))
        {
            this.start = start;
        }
        return start;
    }

    public void setStart(String statement)
    {
        this.start = start;
    }

}
