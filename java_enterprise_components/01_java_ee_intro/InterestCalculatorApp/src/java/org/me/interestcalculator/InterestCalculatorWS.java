package org.me.interestcalculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author e.chomba
 */
@WebService(serviceName = "InterestCalculatorWS")
@Stateless()
public class InterestCalculatorWS
{

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt)
    {
        return "Hello " + txt + " !";
    }

    /**
     * Web service to calculate simple interest
     * @param principal
     * @param rate
     * @param duration
     * @return 
     */
    @WebMethod(operationName = "simpleinterest")
    public double simpleInterest(@WebParam(name = "principal")double principal, 
                                 @WebParam(name = "rate") double rate, 
                                 @WebParam(name = "duration") float duration)
    {
        //TODO write your implementation code here:
        return (principal * rate * duration) / 100.0;
    }
}
