package reg;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 * Managed bean that will be used to convert rupees to dollars
 *
 * @author HP
 */
@Named(value = "currencyBean")
@SessionScoped

public class CurrencyBean implements Serializable
{
    private int rupees;
    private int dollars;
    
    public CurrencyBean(){}

    public int getRupees()
    {
        return rupees;
    }

    public void setRupees(int rupees)
    {
        this.rupees = rupees;
    }

    public int getDollars()
    {
        return (this.rupees / 60);
    }

    public void setDollars(int dollars)
    {
        this.dollars = dollars;
    }

}
