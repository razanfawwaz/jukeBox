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
            this.start = true;
        }else
        {
            this.start = false;
        }
        return start;
    }

    public void setStart(String statement)
    {
        this.statement = statement;
    }

}
