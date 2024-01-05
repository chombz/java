package ejb;

import javax.ejb.Remote;


@Remote
public interface ApplicationSessionRemote
{

    int add(int num1, int num2);
    
}
