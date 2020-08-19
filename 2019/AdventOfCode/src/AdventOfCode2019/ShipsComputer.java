/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdventOfCode2019;

import util.FileReader;

/**
 *
 * @author EZLuke
 */
public class ShipsComputer {
int[] programCode;
int programSize;
boolean programCompleted = false;
    public ShipsComputer() {
        
    }
    
public void loadProgram(String seperator, String fileName){
    
    programCode = FileReader.readIntBySeperator(seperator,fileName).clone();
    programSize = programCode.length;
    
    

    //load from file
    //check that is valid size for intcode program (Devisable by 4)
    //if valid store in program code
    //if not valid display error. 
    
    
}
public String runProgram(){
   String result = "";
   int currentLocation = 0;
   int currentOpCode;
   int[] currentSet = new int[4];
   
   while(!programCompleted){

    if((currentLocation + 4) > programSize){ //Check if this is the last opcode
       programCompleted = true; 
    }

    for(int i = 0; i < 4; i++){ //get the curent set of 4 ints 
       currentSet[i] = programCode[currentLocation + i];    
    }
    //System.out.print("Current location : " +currentLocation + " " );
    currentLocation = currentLocation + 4;
    executeOpCode(currentSet);  
    
    }
   
   for(int i = 0; i <programCode.length;i++){
    System.out.print(programCode[i]+ ", ");
   }
   

   return result; 
   
}
private void executeOpCode(int[] codeSet){
       
    switch(codeSet[0]){
        
        case(1): 
        System.out.println("Opcode : " + codeSet[0]+"Inserting :"+ (codeSet[1] + codeSet[2])+ "At Location : " + codeSet[3]);
        programCode[codeSet[3]] = codeSet[1] + codeSet[2];
        break;
            
        case(2):
        System.out.println("Opcode : " + codeSet[0]+"Inserting :"+ (codeSet[1] * codeSet[2])+ "At Location : " + codeSet[3]);
        programCode[codeSet[3]] = codeSet[1]* codeSet[2];    
        break; 
        
        case(99):
        System.out.println("OPCODE 99 DETECTED");
        programCompleted = true; 
        break;      
    }
    
    
    
}
}
