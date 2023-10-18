package com.chombz_oop.j06_javanio;


import java.util.Scanner;
import java.util.zip.Deflater;
import java.util.zip.Inflater;


/**
 * Java program how to compress(deflate) and decompress
 * a string using deflater and inflater classes in java.util.zip.package
 * @author chomb
 */
public class DeflationInflationDemo
{
    //main method begund program execuiton
    public static void main(String[] args)
    {
        //use a try...with resources to auto-close resources after use
        try (Scanner userInput = new Scanner(System.in))
        {
            //Prompt the user for a string to be compressed
            System.out.println("Please enter a string to be compressed and later decompressed -> ");
            String strInput = userInput.nextLine();
            byte[] inputObj = strInput.getBytes("UTF-8");

            // Compress the data
            byte[] output = new byte[150];
            Deflater deflater = new Deflater();
            deflater.setInput(inputObj);
            deflater.finish();

            //get the size of the compressed data
            int compressedDataLength = deflater.deflate(output);

            System.out.println("The size of the compressed data is: " + compressedDataLength + " bytes");

            // compress the data
            Inflater inflater = new Inflater();
            inflater.setInput(output, 0, compressedDataLength); // Use the actual length of the compressed data
            byte[] resultObj = new byte[150];

            //get the size of the compressed data
            int decompressedDataSize = inflater.inflate(resultObj);

            // Decode the decompressed data back into a string
            String strOutput = new String(resultObj, 0, decompressedDataSize, "UTF-8");

            //Display the size of the compressed data in bytes
            System.out.println("Decompressed String: " + strOutput);
        } catch (Exception ex)
        {
            System.err.println("An error occurred: " + ex.getMessage());
        }
    }
}
