package com.chombz.j14_annotations_and_base64_encoding;

import java.util.Base64;
import java.util.Base64.Decoder;

/**
 * Java class that with a method to decode a method to decode a string encoded
 * using base64 encoding
 * @author chomb
 */
public class Base64_Decoder
{
    /**
     * Method to encode a string that has been encoded using base 64 encoding
     * 
     * @param decodedText text decoded using base 64 encoding.
     * 
     * @return formatted text with encoded and decoded text 
     */
    
    public String decodeText(String encodedText)
    {
        Decoder decoder = Base64.getDecoder();
        
        //Byte array for the decoded text
        byte[] decodedByteArray = decoder.decode(encodedText);
        String decodedText = new String(decodedByteArray);
        
        //Format the decoded string
        return (String.format("\nEncoded Text -> %s\n"
                + "\nDecoded Text -> %s.\n", encodedText, decodedText));
    }
}
