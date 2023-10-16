package com.chombz.j14_annotations_and_base64_encoding;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;

/**
 * Java class with a method that will be used to encode strings using base64
 * encoding
 * @author chomb
 */
public class Base64_Encoder
{
    /**
     * Method to decode a string that has been encoded using base 64 encoding
     * 
     * @param encodedText text encoded using base 64 encoding.
     * 
     * @return formatted text with encoded and decoded text 
     */
    
    public String encodeText(String text2Encode)
    {
        Encoder textEncoder = Base64.getEncoder();
        String encodedText = textEncoder.encodeToString(
        text2Encode.getBytes(StandardCharsets.UTF_8));
        return encodedText;
    }
}
