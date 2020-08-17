/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventOfCode2019;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Euan
 */
public class Rocket {
    static List<Module> modulesOnRocket = new ArrayList<Module>();

    public Rocket(Double... moduleMasses) {
        for (Double d : moduleMasses){
            modulesOnRocket.add(new Module(d));
        }
        
        
    }
    
public double fuelRequiredForRocketMass(){
double additionalFuelMass =0;
double totalAdditionalMass= 0;
double fuelRequiredForModuleMass = 0;
double totalFuelRequired = 0;
double previousFuelLevel = 0;
boolean calculationComplete = false;

    
    for(Module m : modulesOnRocket){
        
        fuelRequiredForModuleMass = m.getRequiredFuel(); //Gets the fuel required for the module mass. 
        additionalFuelMass = fuelRequiredForModuleMass;
        //until the ammount of fuel required is less than 0
        
        //take the mass of the required fuel and divide by 3 and taken away 2 rounding it down
        
        //update the total fuel required of the module  
        while(!calculationComplete){ 
            
            totalAdditionalMass = (Math.floor((additionalFuelMass/3)))-2; 
            
            additionalFuelMass = totalAdditionalMass;
            
            
        
        }
        
        
        /**
         * 
         
        additionalFuelMass =(Math.floor((fuelRequiredForModuleMass/3)))-2;
        
        totalAdditionalMass = additionalFuelMass;
        
        while(!calculationComplete){    
            
        previousFuelLevel = additionalFuelMass;  
        
        
        additionalFuelMass = (Math.floor((additionalFuelMass/3)))-2;    
        
        if(additionalFuelMass <= 0){
            
         totalAdditionalMass = totalAdditionalMass + previousFuelLevel;
         calculationComplete = true;
         
        }else{
        totalAdditionalMass = totalAdditionalMass + additionalFuelMass;
        }
        }
        totalFuelRequired = totalFuelRequired +(fuelRequiredForModuleMass + totalAdditionalMass);
    }
    return totalFuelRequired;
}
**/
        
        

}
