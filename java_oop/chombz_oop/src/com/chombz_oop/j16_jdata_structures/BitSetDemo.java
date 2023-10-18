package com.chombz_oop.j16_jdata_structures;

import java.util.BitSet;

/**
 * Java program that demonstrates how to work with the java.util.Bitset
 * class and some of its methods
 * @author e.chomba
 */
public class BitSetDemo
{
    //main method begins program execution
    public static void main(String[] args)
    {
        BitSet bitset1 = new BitSet();
        BitSet bitset2 = new BitSet();
        bitset1.set(1);
        bitset1.set(2);
        bitset1.set(3);
        bitset1.set(4);
        bitset1.set(5);
        bitset1.set(6);
        bitset1.set(7);
        
        bitset2.set(2);
        bitset2.set(4);
        bitset2.set(6);
        bitset2.set(8);
        
        //Display the contents of the bitsets
        System.out.println("The values in bitset1 are: " + bitset1);
        System.out.println("The values in bitset2 are: " + bitset2);
    }
}
