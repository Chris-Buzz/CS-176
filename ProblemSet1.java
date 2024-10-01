package edu.monmouth.problemSet1;

import edu.monmouth.musicalInstrument.*;
	
public class ProblemSet1 {


	public static void main(String[] args) {
		
		MusicalInstrument instrument1 = new MusicalInstrument();
		// Creating a MusicalInstrument object using the default constructor
		
        System.out.println("Instrument 1 details (default constructor):");
        System.out.println("Instrument Name: " + instrument1.getName());
        System.out.println("Instrument Type: " + instrument1.getType());
        System.out.println("Number of Keys or Strings: " + instrument1.getNumberOfKeysorStrings());
        //Using accessor methods (get)  to print the attributes of the default constructor
        
        
        instrument1.setName("Clarinet");
        instrument1.setType("Woodwind");
        instrument1.setNumberOfKeysorStrings(17);
        //Using mutator methods to set the attributes to other values
        
        System.out.println("\nUpdated Instrument 1 details:");
        System.out.println("Instrument Name: " + instrument1.getName());
        System.out.println("Instrument Type: " + instrument1.getType());
        System.out.println("Number of Keys or Strings: " + instrument1.getNumberOfKeysorStrings());
        //Using accessor methods (get) to print the updated attributes
        
        
        MusicalInstrument instrument2 = new MusicalInstrument("Guitar", "String", 6);
        //Create another MusicalInstrument object using the constructor that takes parameters
        
        System.out.println("\nInstrument 2 details:");
        System.out.println("Instrument Name: " + instrument2.getName());
        System.out.println("Instrument Type: " + instrument2.getType());
        System.out.println("Number of Keys or Strings: " + instrument2.getNumberOfKeysorStrings());
        // Using accessor methods(get) to print the attributes of this object
	}

}//class
