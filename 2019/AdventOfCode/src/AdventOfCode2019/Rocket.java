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
    double fuelRequiredForRocket;
    double rocketMass;

    public Rocket(Double... moduleMasses) {
        for (Double d : moduleMasses){
            modulesOnRocket.add(new Module(d));
        }
        
        
    }
    
public void setFuelRequiredForRocket(){
   double fuelRequiredForModules = 0;
   double fuelRequiredForFuel = 0;
    for(Module m : modulesOnRocket){
       fuelRequiredForModules = fuelRequiredForModules + m.getRequiredFuel();
        }
    calculateRequiredFuel(fuelRequiredForModules);
    fuelRequiredForRocket = fuelRequiredForRocket + fuelRequiredForModules;
    }
public double getFuelRequiredForRocket(){
    return fuelRequiredForRocket;
}
private void calculateRequiredFuel(double massToCalculateFor){
        
        if(massToCalculateFor > 0){
            
            fuelRequiredForRocket = fuelRequiredForRocket + massToCalculateFor;
          // System.out.print(massToCalculateFor + " + ");
            massToCalculateFor = Math.floor(massToCalculateFor / 3)-2;
            calculateRequiredFuel(massToCalculateFor);
        }
        
    }

}
