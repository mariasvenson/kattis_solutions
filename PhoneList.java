import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Comparator;


public class PhoneList{
	public static void main(String[] args) {  

	Scanner sc = new Scanner(System.in);
    int numTimes = Integer.parseInt(sc.nextLine());
	    
    for(int i = 0; i < numTimes; i++){
    	int nrNumbers = Integer.parseInt(sc.nextLine());
    	String[] allNumbers = new String[nrNumbers]; 
    	for(int j = 0; j < nrNumbers; j++){
    		String phoneNr = sc.nextLine(); 
    		allNumbers[j] = phoneNr;
    	}

		Arrays.sort(allNumbers);
		boolean nrFound = true; 
		
		for(int k = 1; k < allNumbers.length; k++){
	 			if(allNumbers[k].startsWith(allNumbers[k - 1])){
		    		nrFound = false;
		    		break;    	
		   	}
	    }
	    
		if(nrFound){
	    	System.out.println("YES");
	    }else{
	    	System.out.println("NO");
	    }

	}
	
	}

}


