package com.chombz.j18_additionalfeatures;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;//to use ScriptEgine
import javax.script.ScriptException;

/**
 * Java program that demonstrate how to work with JavaScriot with Java
 *
 * @author e.chomba
 */
public class ScriptEngineUsage
{

    //
    public static void main(String[] args) throws ScriptException
    {
        try
        {
            ScriptEngineManager newEngManager = new ScriptEngineManager();
            ScriptEngine newEng = newEngManager.getEngineByName("javascript");
            newEng.eval("var x = 10;");
            newEng.eval("var y = 20;");
            newEng.eval("var z = x + y;");
            newEng.eval("print(z);");//display result
        } catch (Exception e)
        {
            System.err.println("Sorry, the error " + e.getLocalizedMessage()
                    + " occrured.");
        }
    }

}
