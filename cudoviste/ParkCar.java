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

        int[] firstArray; 
        int[] secondArray;

        while (sc.hasNextLine()) {
        String firstRow = sc.nextLine();
        String secondRow = sc.nextLine();
        String[] firstrowChar = firstRow.split("");
        String[] secondrowChar = secondRow.split("");
        for(int j=0; j<(numIterationCol); j++){
            for(int i=0; i<2; i++){
                System.out.println(firstrowChar[i]);
        }
      }
    }
  }
}
