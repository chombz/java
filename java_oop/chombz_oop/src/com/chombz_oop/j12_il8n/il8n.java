package com.chombz_oop.j12_il8n;


import java.util.Locale;
import java.util.ResourceBundle;


/**
 * failed to code....asisstance please?
 * @author pc
 */
public class il8n
{

    public static void main(String[] args)
    {
        String languageCode = "en"; // Change this to the desired language code

        // Load the appropriate resource bundle based on the selected language
        ResourceBundle resourceBundle;
        switch (languageCode)
        {
            case "en":
                resourceBundle = ResourceBundle.getBundle("EnglishBundle", new Locale("en"));
                break;
            case "sw":
                resourceBundle = ResourceBundle.getBundle("addition_sw_KE_properties", new Locale("sw"));
                break;
            case "fr":
                resourceBundle = ResourceBundle.getBundle("addition_fr_FR_properties", new Locale("fr"));
                break;
            case "de":
                resourceBundle = ResourceBundle.getBundle("addition_de_DE_properties", new Locale("de"));
                break;
            default:
                resourceBundle = ResourceBundle.getBundle("EnglishBundle", new Locale("en"));
                break;
        }

        // Now you can access the localized strings using the resourceBundle
        String firstNumberLabel = resourceBundle.getString("FirstNum");
        String addButtonLabel = resourceBundle.getString("AddButton");

        System.out.println("First Number Label: " + firstNumberLabel);
        System.out.println("Add Button Text: " + addButtonLabel);
    }
}
