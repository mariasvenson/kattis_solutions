import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Scanner;


public class Doorman{

	public static void main(String[] args) {  

	//String input = "1\nMWWMWMMWM\n"; 
	String input = "2\nWMMMMWWMMMWWMW\n";
	Scanner sc = new Scanner(input);
    //Scanner sc = new Scanner(System.in);        
    
    String str = sc.nextLine();
    int maxDiff = Integer.parseInt(str);
    String queue = sc.nextLine();
    String [] queueList = queue.split(""); 
    int count = 0; 
    int countPeopleIn = 0; 
    //System.out.println(queueList.length);

    
    	for(int i = 0; i < queueList.length; i++){
    	if(count != (-1)*maxDiff || count != maxDiff){
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
    }
   	System.out.println(countPeopleIn); 

	}
}