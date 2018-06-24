package com.sri.ZipRangeAutomation;

import static org.junit.Assert.*;
import org.junit.Test;


public class AppTest 
{
    
    @Test
    public void testOutputZipRange()
    {
    	String[] inputZipRange = {"[94133,94133]","[94200,94609]","[94600,94699]"}; 
		String [] outputArray;
        CreateZipRangeArray zipRangeArray =  new CreateZipRangeArray(inputZipRange);
        int[] zipArray = zipRangeArray.buildZipRangeArray();
        BuildOutputZipRange buildOutputRange = new BuildOutputZipRange(zipArray);
        outputArray = buildOutputRange.buildOutput();
        String[] expectedZipRange = {"[94133,94133]","[94200,94699]"};
        assertArrayEquals( expectedZipRange,outputArray );
    }
    @Test
    public void testOutputZipRange1()
    {
    	 
		String[] inputZipRange ={"[49679,52015]","[49800,50000]", "[51500,53479]", "[45012,46937]","[54012,59607]","[45500,45590]", "[45999,47900]","[44000,45000]","[43012,45950]"};
		String [] outputArray;
        CreateZipRangeArray zipRangeArray =  new CreateZipRangeArray(inputZipRange);
        int[] zipArray = zipRangeArray.buildZipRangeArray();
        BuildOutputZipRange buildOutputRange = new BuildOutputZipRange(zipArray);
        outputArray = buildOutputRange.buildOutput();
        String[] expectedZipRange = {"[43012,47900]","[49679,53479]","[54012,59607]"};
        assertArrayEquals( expectedZipRange,outputArray );
    }
    @Test
    public void testOutputZipRange2()
    {
    	 
    	String[] inputZipRange = {"[94133,94133]","[94200,94299]","[94600,94699]"};
		String [] outputArray;
        CreateZipRangeArray zipRangeArray =  new CreateZipRangeArray(inputZipRange);
        int[] zipArray = zipRangeArray.buildZipRangeArray();
        BuildOutputZipRange buildOutputRange = new BuildOutputZipRange(zipArray);
        outputArray = buildOutputRange.buildOutput();
        String[] expectedZipRange = {"[94133,94133]","[94200,94299]","[94600,94699]"};
        assertArrayEquals( expectedZipRange,outputArray );
    }
}
