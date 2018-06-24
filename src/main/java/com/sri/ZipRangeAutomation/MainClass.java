package com.sri.ZipRangeAutomation;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass 
{
  
	public static void main( String[] args )
    {	
    	//String[] zipRange = {"[94133,94133]","[94200,94609]","[94600,94699]"};
		String[] zipRange = {"[10001,10005]","[12009,20009]","[11001,19999]"};
		//String[] zipRange ={"[49679,52015]","[49800,50000]", "[51500,53479]", "[45012,46937]","[54012,59607]","[45500,45590]", "[45999,47900]","[44000,45000]","[43012,45950]"};
		String [] outputArray;
        CreateZipRangeArray zipRangeArray =  new CreateZipRangeArray(zipRange);
        int[] zipArray = zipRangeArray.buildZipRangeArray();
        BuildOutputZipRange buildOutputRange = new BuildOutputZipRange(zipArray);
        outputArray = buildOutputRange.buildOutput();
        for (int i = 0; i < outputArray.length; i++) {
			System.out.println("FINAL OUTPUT" + outputArray[i]);
		}
        
    }
}