package com.chombz.j12_exeptions;
/**
 * Java program to demonstrate the ArrayIndexOutOfBoundsExecptions
 *
 * @author chomb
 */
public class DemoArrayIndexOutOfBounds
{

    /**
     * main method begins program execution
     *
     * @param args
     */
    public static void main(String[] args)
    {
        //Declare an array to hold students scores in am exam
        byte score[] =
        {
            34, 38, 41, 50, 21, 89, 33
        };
        
        //Display score
        try
        {
            for (int e = 0; e < score.length; e++)
            {
                System.out.printf("Score for Student %d : %d\n"
                                 , e + 1, score[e]);
            }
        } catch (ArrayIndexOutOfBoundsException aiob)
        {
            System.err.println("Sorry you tried to display an invalid score "
                              +"at index " + aiob.getLocalizedMessage());
        }
        catch(Exception e)
        {
            System.err.println("Sorry, the eroor " + e.getLocalizedMessage()
                              + " occured.");
        }
    }

}
