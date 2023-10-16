package com.chombz.j14_annotations_and_base64_encoding;

import java.util.Scanner;

/**
 * Java program that accepts a string from the user, encodes and decodes it
 * using base64 encoding and decoding APIs. 
 * @author chomb
 */
public class DemoBase64_EncoderDecoder
{
    //main method begins program execution
    public static void main(String[] args)
    {
        //use a try...with resources to autoclode resources
        try (Scanner userInput = new Scanner(System.in))
        {
            //Prompt thte user for the text to be encoded
            System.out.println("Please enter the string you wish to encode ->");
            String text2Encode = userInput.nextLine();
            
            //Encode the text supplied by the user
            String encodedText = new Base64_Encoder().encodeText(text2Encode);
            
            //Display the entered text and the encided text
            System.out.printf("Input text -> %s.\n", text2Encode);
            
            //Decode and display the decoded text
            System.out.println(new Base64_Decoder().decodeText(encodedText));
        }
        catch(Exception e)
        {
             System.err.println("Sorry, the error " + e.getLocalizedMessage()
                                  + " occrured.");
        }
    }
    
}
