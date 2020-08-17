/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventOfCode2019;

import util.FileReader;

/**
 *
 * @author Euan
 */
public class MissionControl {
        public static void main(String[] args) {
        // TODO code application logic here
        Rocket SantaRescue = new Rocket(FileReader.ReadInputDouble("1.1.txt"));
        System.out.println("The Fuel Required for this rocket is " + SantaRescue.fuelRequiredForRocketMass());
        
        
    }
}
