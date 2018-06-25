package com.sri.ZipRangeAutomation;

import java.util.Arrays;

/**
 * This class parses the String array into Integer array
 * @author SPodishe
 *
 */
public class CreateZipRangeArray {
	
	private String[] zipRange;
	/**
	 * @param zipRange
	 */
	public CreateZipRangeArray(String[] zipRange)
	{
		this.zipRange= zipRange;
	}
	
	/**
	 * This function takes the input String Array and parses in to integer array.
	 * {[94133,94133] [94200,94299] [94600,94699]}
	 * @return a integer array which contains all the zipcodes  
	 *  {94133,94133,94200,94299,94600,94699}
	 */
	public int[] buildZipRangeArray()
	{
		int j=0;
		Arrays.sort(this.zipRange);
        int[] zipArray = new int[this.zipRange.length * 2];
        for (int i = 0; i < this.zipRange.length; i++) {
        	zipArray[j] = Integer.parseInt( this.zipRange[i].substring(1, 6));
        	zipArray[++j] = Integer.parseInt( this.zipRange[i].substring(7, 12));
        	j++;
		}
		return zipArray;
		
	}

}
