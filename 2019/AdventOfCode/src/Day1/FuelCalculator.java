/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Euan
 */
public class FuelCalculator {
static List<Double> moduleMasses = new ArrayList<Double>();
static double fuelRequired = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         moduleMasses = ReadInput.ReadInputDouble();
          //System.out.println(moduleMasses);
          fuelRequired = fuelCalc();
          System.out.println("The fuel required for this mission is : " + fuelRequired);
    }
    public  static double fuelCalc(){
        List<Double> fuelRequiredPerModule = new ArrayList<Double>();
        int i = 0;
        double result;
        double totalFuel = 0;
         while(i < moduleMasses.size()){
             result = (moduleMasses.get(i) / 3);
             result = Math.floor(result);
             result = result - 2; 
             fuelRequiredPerModule.add(i,result);
             i++;
            }
         i = 0;
         while(i < fuelRequiredPerModule.size()){
             totalFuel = totalFuel + fuelRequiredPerModule.get(i);
             i++;
         }
         return totalFuel; 
      
        
        
    }
} 
