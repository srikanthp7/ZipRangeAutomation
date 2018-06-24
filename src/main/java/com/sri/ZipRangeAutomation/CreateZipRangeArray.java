package com.sri.ZipRangeAutomation;

import java.util.Arrays;

public class CreateZipRangeArray {
	
	String[] zipRange;
	public CreateZipRangeArray(String[] zipRange)
	{
		this.zipRange= zipRange;
	}
	public int[] buildZipRangeArray()
	{
		int j=0;
		Arrays.sort(this.zipRange);
        int[] zipArray = new int[this.zipRange.length * 2];
        for (int i = 0; i < this.zipRange.length; i++) {
        	zipArray[j] = Integer.parseInt( this.zipRange[i].substring(1, 6));
        	j=j+1;
        	zipArray[j] = Integer.parseInt( this.zipRange[i].substring(7, 12));
        	j=j+1;
		}
		return zipArray;
		
	}

}
