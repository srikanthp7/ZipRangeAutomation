package com.sri.ZipRangeAutomation;

import java.util.ArrayList;

public class BuildOutputZipRange {
	int[] zipArray;
	int lowerBound,upperBound;
	ArrayList<Integer> output = new ArrayList<Integer>();
	public BuildOutputZipRange(int[] zipArray) {
		this.zipArray=zipArray;
	}
	public String[] buildOutput()
	{
		lowerBound= zipArray[0];
		upperBound= zipArray[1];
		output.add(lowerBound);
    	output.add(upperBound);
        
        if(zipArray.length > 2)
        {
        	for (int i = 2; i < zipArray.length; i++) {
        		int k = i;
        		int newUpperBound = 0;
        		int newLowerBound =0;
        		newLowerBound = zipArray[k];
            	if(k<zipArray.length -1 ) 
            		newUpperBound = zipArray[k+1];
            	if(upperBound > newLowerBound && upperBound > newUpperBound )
            	{
            		if(!output.contains(Integer.valueOf(lowerBound)))
            			{
            				output.add(lowerBound);
            			}
            		if(!output.contains(Integer.valueOf(upperBound)))
            			{
            				output.add(upperBound);
            			}
                	i = i+1;
              	}
            	else if(upperBound > newLowerBound && upperBound < newUpperBound )
            	{
            		output.remove(Integer.valueOf(upperBound));
            		i = i+1;
            		upperBound = newUpperBound;
            		if(!output.contains(Integer.valueOf(upperBound)))
        			{
        				output.add(upperBound);
        			}
            		
            		
            	}
            	else if(upperBound < newLowerBound && upperBound < newUpperBound )
            	{
            		lowerBound = newLowerBound;
            		upperBound = newUpperBound;
            		if(!output.contains(Integer.valueOf(lowerBound)))
        			{
        				output.add(lowerBound);
        			}
        		if(!output.contains(Integer.valueOf(upperBound)))
        			{
        				output.add(upperBound);
        			}              	
            	}
            	else
            	{

//            		output.add(lowerBound);
//                	output.add(upperBound);
            	}
            	 
			}
        	
        }
        else
        {
        	output.add(lowerBound);
        	output.add(upperBound);
        }
      
	return constructOutputArray(output);
		 
	}
	
	public String[] constructOutputArray(ArrayList output)
	{
		String[] outputArray = new String[output.size() / 2];
		int j=0;
		for (int k = 0; k < output.size()/2 ; k++) {
			outputArray[k] = "[" + output.get(j) + "," ;
			outputArray[k]  = outputArray[k] + output.get(++j) + "]" ;
			j++;
		}
		return outputArray;
		
	}

}
