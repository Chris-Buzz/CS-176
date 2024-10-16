package edu.monmouth.problemSet2;

import edu.monmouth.musicalInstrument.*;

public class ProblemSet2 {

	public static void main(String[] args) {
		
		MusicalInstrument instrument1 = new MusicalInstrument();
		//Musical instrument class with the default constructor 
		
		System.out.println("Instrument 1 details (default constructor):");
	    System.out.println("Instrument Name: " + instrument1.getName());
	    System.out.println("Instrument Type: " + instrument1.getType());
	    System.out.println("Number of Keys or Strings: " + instrument1.getNumberOfKeysorStrings());
	    //Using getter/accessor methods to print attributes of default constructor

        instrument1.setName("Piano");
        instrument1.setType("keyboard");
        instrument1.setNumberOfKeysorStrings(88);
        //Setting valid values using mutator methods
       
        System.out.println("\nUpdated Instrument 1 details with valid values:");
        System.out.println("Instrument Name: " + instrument1.getName());
        System.out.println("Instrument Type: " + instrument1.getType());
        System.out.println("Number of Keys or Strings: " + instrument1.getNumberOfKeysorStrings());
        //Using getter methods to print the valid attributes 
       
        
        MusicalInstrument instrument2 = new MusicalInstrument("Guitar", "string", 6);
        //Create another instrument with valid values 
        
        System.out.println("\n Instrument 2 details:");
        System.out.println("Instrument Name: " + instrument2.getName());
        System.out.println("Instrument Type: " + instrument2.getType());
        System.out.println("Number of Keys or Strings: " + instrument2.getNumberOfKeysorStrings());
        //Using getter methods to print the valid attributes of instrument2
        
        instrument2.setName("snare drum");
        instrument2.setType("percussion");
        instrument2.setNumberOfKeysorStrings(0);
        //Using a mutator method, change this object’s name to “snare drum”, its type to “percussion” and its numberOfKeysorStrings to 0.
        
        System.out.println("\nUpdated Instrument 2 details:");
        System.out.println("Instrument Name: " + instrument2.getName());
        System.out.println("Instrument Type: " + instrument2.getType());
        System.out.println("Number of Keys or Strings: " + instrument2.getNumberOfKeysorStrings());
        //Using getters to print the updated attributes
        
        
        MusicalInstrument instrument3 = new MusicalInstrument("Trumpet", "BrasS", 6);
        //Creating another instrument object to test case sensitivity for setType method
        
        System.out.println("\nInstrument 3 details:");
        System.out.println("Instrument Name: " + instrument3.getName());
        System.out.println("Instrument Type: " + instrument3.getType());
        System.out.println("Number of Keys or Strings: " + instrument3.getNumberOfKeysorStrings());
        //Using getters to print attributes
        
        instrument3.setName("Saxophone");
        instrument3.setType("WOODWIND");
        instrument3.setNumberOfKeysorStrings(22);
        //Using setters to test case sensitivity once again
        
        System.out.println("\nUpdated Instrument 3 details:");
        System.out.println("Instrument Name: " + instrument3.getName());
        System.out.println("Instrument Type: " + instrument3.getType());
        System.out.println("Number of Keys or Strings: " + instrument3.getNumberOfKeysorStrings());
        //Using getters to print attributes
        
        
        MusicalInstrument instrument4 = new MusicalInstrument("", "", 101);
        //Creating another instrument object to test that invalid values output to the constant instance variables
        
        System.out.println("\nInstrument 4 details with invalid values:");
        System.out.println("Instrument Name: " + instrument4.getName());
        System.out.println("Instrument Type: " + instrument4.getType());
        System.out.println("Number of Keys or Strings: " + instrument4.getNumberOfKeysorStrings());
        
        
        instrument4.setName("");
        instrument4.setType("invalidType");
        instrument4.setNumberOfKeysorStrings(-2); // Invalid value
        //Using mutator methods to test negative number of keys or strings
        //Also tests if types that are not instrument types returns to "UNKNOWNTYPE"
        
        System.out.println("\nUpdated Instrument 4 details with invalid values:");
        System.out.println("Instrument Name: " + instrument4.getName());
        System.out.println("Instrument Type: " + instrument4.getType());
        System.out.println("Number of Keys or Strings: " + instrument4.getNumberOfKeysorStrings());
        
    
        
        
    }


}


