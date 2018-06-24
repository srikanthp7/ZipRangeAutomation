package com.sri.ZipRangeAutomation;



import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;

import org.hamcrest.core.SubstringMatcher;

/**
 * Hello world!
 *
 */
public class App 
{
      

	public static void main( String[] args )
    {
		int j=0;
    	String[] zipRange = {"[94133,94133]","[94200,94709]","[94600,94699]"}; 
	//	String[] zipRange ={"[49679,52015]","[49800,50000]", "[51500,53479]", "[45012,46937]","[54012,59607]","[45500,45590]", "[45999,47900]","[44000,45000]","[43012,45950]"};
    	ArrayList<Integer> output = new ArrayList<Integer>();
        System.out.println( "Hello World!" );
        Arrays.sort(zipRange);
        int[] zipArray = new int[zipRange.length * 2];
        for (int i = 0; i < zipRange.length; i++) {
        	zipArray[j] = Integer.parseInt( zipRange[i].substring(1, 6));
        	j=j+1;
        	zipArray[j] = Integer.parseInt( zipRange[i].substring(7, 12));
        	j=j+1;
		}
       
      //  Arrays.sort(zipArray);
        for (int i = 0; i < zipArray.length; i++) {
        	System.out.println(zipArray[i]);
		}
        
        int startPoint,endPoint;
        startPoint = zipArray[0];
        endPoint = zipArray[1];
        
        output.add(startPoint);
    	output.add(endPoint);
        
        if(zipArray.length > 2)
        {
        	for (int i = 2; i < zipArray.length; i++) {
        		int k = i;
        		int newEndPoint = 0;
        		int newStartPoint;
            	newStartPoint = zipArray[k];
            	if(k<zipArray.length -1 ) 
            	newEndPoint = zipArray[k+1];
//            	if(startPoint < newStartPoint && endPoint < newStartPoint)
//            	{
//            		startPoint=newStartPoint;
//            		endPoint= newEndPoint;
//            		output.add(startPoint);
//                	output.add(endPoint);
//            		
//            	}
//            	else 
            	if(endPoint > newStartPoint && endPoint > newEndPoint )
            	{
            		if(!output.contains(Integer.valueOf(startPoint)))
            			{
            				output.add(startPoint);
            			}
            		if(!output.contains(Integer.valueOf(endPoint)))
            			{
            				output.add(endPoint);
            			}
                	i = i+1;
              	}
            	else if(endPoint > newStartPoint && endPoint < newEndPoint )
            	{
            		output.remove(Integer.valueOf(endPoint));
            		i = i+1;
            		endPoint = newEndPoint;
            		if(!output.contains(Integer.valueOf(endPoint)))
        			{
        				output.add(endPoint);
        			}
            		
            		
            	}
            	else if(endPoint < newStartPoint && endPoint < newEndPoint )
            	{
            		startPoint = newStartPoint;
            		endPoint = newEndPoint;
            		if(!output.contains(Integer.valueOf(startPoint)))
        			{
        				output.add(startPoint);
        			}
        		if(!output.contains(Integer.valueOf(endPoint)))
        			{
        				output.add(endPoint);
        			}              	
            	}
            	else
            	{
//            		endPoint = newEndPoint;
//            		output.add(startPoint);
//                	output.add(endPoint);
            	}
            	 
			}
        	
        }
        else
        {
        	output.add(startPoint);
        	output.add(endPoint);
        }
      
	for(Integer i: output)
	{
		System.out.println("Output " + i);
	}
    }
}