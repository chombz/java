package beanclient;

import ejb.ApplicationSessionRemote;
import javax.ejb.EJB;

public class Main
{

    @EJB
    private static ApplicationSessionRemote applicationSession;

    public static void main(String[] args)
    {
        //invoke the method of the remote session bean
        System.out.println("Result of 2 + 5 is : " 
                          + applicationSession.add(2, 5));
    }
    
}
