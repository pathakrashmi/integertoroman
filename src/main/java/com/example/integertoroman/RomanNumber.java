package com.example.integertoroman;

import java.util.*;

public class RomanNumber {
	
	private final Integer numeral;
    private final String romanNumeral;
    
    private static NavigableMap<Integer, String> romanNumerals = new TreeMap<Integer, String>();
    
    static {
        romanNumerals.put(1, "I");
        romanNumerals.put(4, "IV");
        romanNumerals.put(5, "V");
        romanNumerals.put(9, "IX");
        romanNumerals.put(10, "X");
        romanNumerals.put(40, "XL");
        romanNumerals.put(50, "L");
        romanNumerals.put(90, "XC");
        romanNumerals.put(100, "C");
        romanNumerals.put(400, "CD");
        romanNumerals.put(500, "D");
        romanNumerals.put(900, "CM");
        romanNumerals.put(1000, "M");
        romanNumerals.put(4000, "I\u0305V\u0305");
    }
    
    public RomanNumber(int number) {
        this.numeral = number;
        this.romanNumeral = convert(number);
    }

    public String toString() {
        return this.romanNumeral;
    }

    public int getNumeral() {
        return this.numeral;
    }

    public String getRomanNumeral() {
        return this.romanNumeral;
    }

    /**
     * This method converts integer number to roman numeral equivalent.
     *
     * It takes integer as input and returns its roman equivalent
     * 
     * @param number integer number (range 1-4000)
     * @return roman equivalent of number
     */
    private String convert(int number)
    {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            int floored  = romanNumerals.floorKey(number);
            String numeral = romanNumerals.get(floored);
            sb.append(numeral);
            number -= floored;
        }

        return sb.toString();
    }

}
