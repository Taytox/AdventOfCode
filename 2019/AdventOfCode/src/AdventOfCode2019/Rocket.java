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
    ShipsComputer mainComputer = new ShipsComputer();

    public Rocket(Double... moduleMasses) {
        for (Double d : moduleMasses){
            modulesOnRocket.add(new Module(d));
        }
        //modulesOnRocket.add(new Module(1969));
        setFuelRequiredForRocket();
        mainComputer.loadProgram(",","2.1.txt");
        mainComputer.runProgram();
        
    }
    
public void setFuelRequiredForRocket(){

    for(Module m : modulesOnRocket){
       fuelRequiredForRocket = fuelRequiredForRocket + m.getRequiredFuel();
        }
    
    }
public double getFuelRequiredForRocket(){
    return fuelRequiredForRocket;
}
}
