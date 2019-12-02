/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class to read the input files required for the advent of code. 
 * @author Euan
 */
public class ReadInput {
    
    public static List ReadInputDouble() {
    List<Double> doubleList = new ArrayList<Double>();
    String data; 
    double dataConvertedToDouble;

        try{ 
            File myInput = new File("Input.txt");
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
        return doubleList;
    }
}
