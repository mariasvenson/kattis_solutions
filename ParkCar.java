import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Scanner;


public class ParkCar{

    public static class ParkingScore{

        public int free_slots;
        public int one_car;
        public int two_cars;
        public int three_cars; 
        public int four_cars; 


    public ParkingScore(){

        free_slots = 0; 
        one_car = 0; 
        two_cars = 0; 
        three_cars = 0; 
        four_cars = 0; 

    }

    public void print(){
        System.out.println(free_slots + "\n" + one_car + "\n" + two_cars + "\n" + three_cars + "\n" + four_cars);

    }

}

    public static void main(String[] args) {      
        //String input = "4 5\n..XX.\n.#XX.\n..#..\n.....\n"; 
        //Scanner sc = new Scanner(input);
        Scanner sc = new Scanner(System.in);        
        String str = sc.nextLine();
        String[] rowsAndCol = str.split("\\s+");
        
        //first time
        String bottomLine = ""; 
        int rows = Integer.parseInt(rowsAndCol[0]); 
        int col = Integer.parseInt(rowsAndCol[1]);
        int numIterationCol = col-1;
        ParkingScore score = new ParkingScore();

        while(sc.hasNextLine()) {
        String topLine = bottomLine; 
        bottomLine = sc.nextLine(); 
        
            if(topLine.equals("")){
                continue; 
            }

            String[] firstRowChar = topLine.split("");
            String[] secondRowChar = bottomLine.split("");
            
            for(int i=0; i<numIterationCol; i++){
            String[] firstAndSecondRow = new String [] {firstRowChar[i], firstRowChar[i+1], secondRowChar[i], secondRowChar[i+1]};
            int totFreeSlots = nrFreeParkingslots(firstAndSecondRow);
                
                switch(totFreeSlots){
                        case 0:    
                            score.free_slots += 1; 
                            break; 
                        case 1: 
                            score.one_car += 1;   
                            break;
                        case 2:
                            score.two_cars += 1;   
                            break;
                        case 3:
                            score.three_cars += 1;        
                            break;
                        case 4:    
                            score.four_cars += 1;   
                            break;  
                        default: 
                            break;
    
                }
            }
        }

        score.print();
    }    

    //returning number of free parking slots 
    public static int nrFreeParkingslots(String[] firstAndSecondRow){   
        int nrCars = 0; 
        int nrHouse = 0; 
        for(int i = 0; i < 4; i++){
            switch(firstAndSecondRow[i]){
                    case "X": 
                        nrCars += 1;   
                        break;
                    case "#":
                        nrHouse = -1; 
                        break;
                    case ".":      
                        break;
                    default: 
                        break;
            }
        }

        if(nrHouse < 0){
            return nrHouse;
        } else{
            return nrCars; 
        }

    }

}
