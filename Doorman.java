import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Scanner;


public class Doorman{

    public static void main(String[] args) {  
    Scanner sc = new Scanner(System.in);           
    String str = sc.nextLine();
    int maxDiff = Integer.parseInt(str);
    
    String queue = sc.nextLine();
    String [] queueList = queue.split(""); 
    int count = 0; 
    int countPeopleIn = 0; 
    int queueLength = queueList.length;
    String tmp = ""; 

    
    for(int i = 0; i < queueList.length; i++){
    	if(count == (-1)*maxDiff && queueList[i].equals("W")){
    		if((queueLength-1) == i){
    			break;
    		}
    		if(queueList[i+1].equals("M") ){
    		    tmp = queueList[i];
    			queueList[i] = queueList[i+1];
    			queueList[i+1] = tmp; 
    		}else{
    			break; 
    		}
    	}
    	 
    	if(count == maxDiff && queueList[i].equals("M")){
    		if((queueLength-1) == i){
    			break;
    		}
    		if(queueList[i+1].equals("W")){
    			tmp = queueList[i];
    			queueList[i] = queueList[i+1];
   			    queueList[i+1] = tmp; 
   		}else{
   			break; 
    		}
    	}
    		
        switch(queueList[i]){
    		case "W":
    			count--; 
    			countPeopleIn++; 
    			break; 
    		case "M":
				count++; 
                countPeopleIn++; 
    			break; 
    		default: 
    			break; 
		}
    }
    
    System.out.println(countPeopleIn);
    
    }
}


