package com.example.integertoroman;

import java.util.*;

public class RomanNumber {
	
	//private Long id;
	//private String content;
	
	private final Integer numeral;
    private final String romanNumeral;
    
    private static NavigableMap<Integer, String> romanNumerals = new TreeMap<Integer, String>();
	
	/*public RomanNumber(Long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getContent() {
		return content;
	}*/
    
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
     * Given an input number returns the roman numeral conversion.
     *
     * @param  number input to convert to roman numeral 
     * @return        the roman numeral string representation of input 
     */
    private String convert(int number)
    {
        StringBuilder sb = new StringBuilder();

        while (number > 0) {
            // floor the input number to the highest key that is < number
            int floored  = romanNumerals.floorKey(number);
            String numeral = romanNumerals.get(floored);

            sb.append(numeral);

            // subtract the floored value and continue
            number -= floored;
        }

        return sb.toString();
    }

}
