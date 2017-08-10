import java.io.*;
import java.util.*;
import java.text.*;
import java.util.Scanner;


public class ParkCar{

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String input = "4 4\n#..#\n..X.\n..X.\n#XX#\n"; 
        Scanner sc = new Scanner(input);
        String str = sc.nextLine();

        String[] rowsAndCol = str.split("\\s+");
        int rows = Integer.parseInt(rowsAndCol[0]); 
        int col = Integer.parseInt(rowsAndCol[1]);
        int numIterationCol = col-1;
        //System.out.println(numIterationCol);
       
        String firstRow = sc.nextLine();
        String secondRow = sc.nextLine();
        //System.out.println(firstRow + "first");
        //System.out.println(secondRow + "second" );
        String[] firstRowChar = firstRow.split("");
        String[] secondRowChar = secondRow.split("");

        while (sc.hasNextLine()) {
        for(int i=0; i<numIterationCol; i++){
        
        if ((firstRowChar[i] == ".") && (firstRowChar[i+1] == ".") && (secondRowChar[i] == ".") && (secondRowChar[i+1] == ".")){
            countParkingSlots("0");
        
        } else if (firstRowChar[i] == "X"){

        
        } else{
            //System.out.println("NO!!!!");
        }


        firstRow = secondRow;
        secondRow = sc.nextLine();
        secondRowChar = secondRow.split("");

        //for(int j=0; j<(numIterationCol); j++){
        //    for(int i=0; i<2; i++){
        //        System.out.println(firstrowChar[i]);
        //}*/
      }
    }
  }

    public static void countParkingSlots(String whatToDo) {
        List<Integer> countParkingSlot = Collections.nCopies(4, 0);
        System.out.println(countParkingSlot.get(5));
        switch(whatToDo){
                    case "0":    
                        break;
                    case "1":
                        break;
                    case "2":              
                        break;
                    default: 
                        break;
      }
}
}
