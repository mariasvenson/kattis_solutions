import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Scanner;


public class ParkCar{

    public class ParkingScore{

        public int free_slots ;
        public int one_car;
        public int two_cars;
        public int three_cars; 
        public int four_cars; 

    }

    public ParkCar(){
        free_slots = 0; 
        one_car = 0; 
        two_cars = 0; 
        three_cars = 0; 
        four_cars = 0; 
    }

    public static void print(){
        system.out.println(free_slots + "\n" + one_car + "\n" + two_cars + "\n" + three_cars + "\n" + four_cars);

    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String input = "4 4\n#..#\n..X.\n..X.\n#XX#\n"; 
        Scanner sc = new Scanner(input);
        String str = sc.nextLine();

        String[] rowsAndCol = str.split("\\s+");
        int rows = Integer.parseInt(rowsAndCol[0]); 
        int col = Integer.parseInt(rowsAndCol[1]);
        int numIterationCol = col-1;
       
        String firstRow = sc.nextLine();
        String secondRow = sc.nextLine();
        String[] firstRowChar = firstRow.split("");
        String[] secondRowChar = secondRow.split("");

        ParkingScore score = new ParkingScore();

        while (sc.hasNextLine()) {
        for(int i=0; i<numIterationCol; i++){

        Int freeParkingSlots = nrFreeParkingslots((firstRowChar[i], (firstRowChar[i+1], (secondRowChar[i], (firstRowChar[i+1]);
        

        }

        firstRow = secondRow;
        secondRow = sc.nextLine();
        secondRowChar = secondRow.split("");
      
        }


        score.print();
    }    

    public static int nrFreeParkingslots(x1, x2, y1, y2){


    }
}
