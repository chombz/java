package com.chombz_oop.classes;

/**
 * Java Class that will be used to create Module Objects
 * @author chomb
 */
public class Module
{
    private String ModuleID;
    private String ModuleName;
    private String CourseCode;
    private int ForeginKey;
    
    public Module()
    {
    }

    public Module(String ModuleID, String ModuleName, String CourseCode, int ForeginKey)
    {
        this.ModuleID = ModuleID;
        this.ModuleName = ModuleName;
        this.CourseCode = CourseCode;
        this.ForeginKey = ForeginKey;
    }

    public int getForeginKey()
    {
        return ForeginKey;
    }

    public void setForeginKey(int ForeginKey)
    {
        this.ForeginKey = ForeginKey;
    }

    public String getModuleID()
    {
        return ModuleID;
    }

    public void setModuleID(String ModuleID)
    {
        this.ModuleID = ModuleID;
    }

    public String getModuleName()
    {
        return ModuleName;
    }

    public void setModuleName(String ModuleName)
    {
        this.ModuleName = ModuleName;
    }

    public String getCourseCode()
    {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode)
    {
        this.CourseCode = CourseCode;
    }
    
    
    
    @Override
    public String toString()
    {
        return String.format("\n~~~~~~~~~~~~~~~~~~~~~~~"
                            + "\nModule ID: %s"
                            + "\nCourse Name: %s"
                            + "\nCourse Code: %s"
                            + "\nForeign Key: %d"
                            + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}
