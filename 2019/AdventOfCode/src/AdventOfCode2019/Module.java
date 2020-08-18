/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventOfCode2019;

/**
 *
 * @author Euan
 */
public class Module {
    double mass;
    double requiredFuel;
    double totalFuelForModule;

    public Module(double mass) {
        this.mass = mass;
        setRequiredFuel();
    }
    
    
    public void setMass(double Mass) {
        this.mass = Mass;
    }
    public double getMass() {
        return mass;
    }

    public void setRequiredFuel() {
        
        requiredFuel = Math.floor(mass / 3)-2;
    }
    
    public double getRequiredFuel(){
        return requiredFuel;
    }
    
    
    
}
