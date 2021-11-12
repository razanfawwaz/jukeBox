import java.util.Scanner;

public class Operation
{
    boolean start;
    String statement;

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

    public static void main(String[] args)
    {
        Scanner menu = new Scanner(System.in);
        boolean condition = true;
        while (condition)
        {
            System.out.println("\n\t \t \t \t \t \t \t\t\t\t   JUKEBOX \t \t \t \t\t \t \t ");
            System.out.println(("____________________________________________________________________________________________________"));
            System.out.print("|\t ");
            System.out.println("SONG NAME \t \t \t \t \t\tARTIST \t \t \t \t \t\t ALBUM \t \t \t\t \t DURATION \t|");
            System.out.println("____________________________________________________________________________________________________");
            System.out.println("|(1)Traitor\t\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t3.50\t|");
            System.out.println("|(2)Good 4 U\t\t\t\t\tOlivia Rodrigo\t\t\t\tSour\t\t\t\t\t\t\t2.59\t|");
            System.out.println("|(3)Happier Than Ever\t\t\tBillie Eilish\t\t\t\tHappier Than Ever\t\t\t\t4.59\t|");
            System.out.println("|(4)Bad Habits\t\t\t\t\tEd Sheeran\t\t\t\t\tBad Habits \t\t\t\t\t\t3.52\t|");
            System.out.println("|(5)Painkiller\t\t\t\t\tRuel \t\t\t\t\t\tPainkiller\t\t\t\t\t\t3.34 \t|");
            System.out.println("|(6)Cheap Thrills\t\t\t\tSia\t\t\t\t\t\t\tThis is Acting\t\t\t\t\t3.45\t|");
            System.out.println("|(7)Wish U Were Here\t\t\tAvril Lavigne\t\t\t\tGoodbye Lullaby\t\t\t\t\t3.46\t|");
            System.out.println("|(8)Womanizer\t\t\t\t\tBritney Spears \t\t\t\tCircus\t\t\t\t\t\t\t3.45\t|");
            System.out.println("|(9)Rumah ke Rumah\t\t\t\tHindia \t\t\t\t\t\tMenari dengan bayangan\t\t\t4.38\t|");
            System.out.println("|(10)Lara\t\t\t\t\t\tDialog Senja \t\t\t\tLara\t\t\t\t\t\t\t5.27\t|");
            System.out.println("|\t \t __________________________________________________________________________________         |");
            System.out.println("|\t \t|          (1) PLAY MUSIC                 |         (2)GO TO PLAYLIST              |        |");
            System.out.println("|\t \t|_________________________________________|________________________________________|        |");
            System.out.println("|\t \t                                                                                            |");
            System.out.println("|___________________________________________________________________________________________________| ");
            System.out.print(" \t \tPUT INPUT NUMBER : "); String option = menu.nextLine();
            System.out.println();
            switch (option)
            {
                case "1" ->
                    {
                        System.out.println("\n\t \t \t \t \t \t \t\t\t\t   PLAY MUSIC \t \t \t \t\t \t \t ");
                        System.out.println(("____________________________________________________________________________________________________"));
                    }
            }

        }
    }
}
