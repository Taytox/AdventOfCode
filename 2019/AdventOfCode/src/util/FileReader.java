/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Euan
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FileReader {
    public static Double[] ReadInputDouble(String Filename) {
    List<Double> doubleList = new ArrayList<Double>();
    Double[] doubleArray = new Double[doubleList.size()];
   
    String data; 
    double dataConvertedToDouble;

        try{ 
            File myInput = new File("Resources\\" + Filename);
            Scanner myReader = new Scanner(myInput);
            while (myReader.hasNextLine()){
                data = myReader.nextLine();
                dataConvertedToDouble = Double.parseDouble(data);
                doubleList.add(dataConvertedToDouble );
            }
            myReader.close();
        } catch (FileNotFoundException e){
            System.out.println("An Error Occurred.");
        }
        doubleArray = doubleList.toArray(doubleArray);
        return doubleArray;
    }
    
    public static int[] readIntBySeperator(String seperator, String Filename){
        String data;
        String[] seperatedData;
        List<Integer> intList = new ArrayList<Integer>();
        //int[] intArray = new int[intList.size()];
        
        try{ 
            File myInput = new File("Resources\\" + Filename);
            Scanner myReader = new Scanner(myInput).useDelimiter(",");

            while (myReader.hasNextInt()) {
                intList.add(myReader.nextInt());
            }
            myReader.close();
            }
        catch (FileNotFoundException e){
            System.out.println("An Error Occurred.");
        }
        

        System.out.println();
        int[] intArray = intList.stream().mapToInt(i->i).toArray();
        return intArray;
    }
}
