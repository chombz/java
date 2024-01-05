package ejb;

import javax.ejb.Stateless;


@Stateless
public class ApplicationSession implements ApplicationSessionRemote
{

    @Override
    public int add(int num1, int num2)
    {
        return num1 + num2;
    }
    
}
