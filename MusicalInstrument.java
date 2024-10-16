package edu.monmouth.musicalInstrument;


public class MusicalInstrument {
	
	private static final String UNKNOWNNAME = "UNKNOWNNAME";
	private static final String UNKNOWNTYPE = "UNKNOWNTYPE";
	private static final int UNKNOWNKEYSORSTRINGS = -1;
	private static final int MIN_KEYS_STRINGS = 0;
	private static final int MAX_KEYS_STRINGS = 100;
	
	private String name;
	private String type;
	private int numberOfKeysorStrings;

	public MusicalInstrument() {
		 setName(UNKNOWNNAME);
	     setType(UNKNOWNTYPE);
	     setNumberOfKeysorStrings(UNKNOWNKEYSORSTRINGS);
	}
	public MusicalInstrument(String name, String type, int numberOfKeysorStrings) {
		setName(name);
		setType(type);
		setNumberOfKeysorStrings(numberOfKeysorStrings);
	}
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		if(name == null || name.isEmpty()) {
			this.name = UNKNOWNNAME;
		}
		else {
			this.name = name;
		}
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type == null || type.isEmpty() || !(type.equalsIgnoreCase("woodwind") || type.equalsIgnoreCase("brass") || type.equalsIgnoreCase("percussion") || type.equalsIgnoreCase("string") || type.equalsIgnoreCase("keyboard"))) {
			this.type = UNKNOWNTYPE;
		}
		else {
			this.type = type; 
		}
		
	}
	public int getNumberOfKeysorStrings() {
		return numberOfKeysorStrings;
	}
	public void setNumberOfKeysorStrings(int numberOfKeysorStrings) {
		if (numberOfKeysorStrings < MIN_KEYS_STRINGS || numberOfKeysorStrings > MAX_KEYS_STRINGS) {
            this.numberOfKeysorStrings = UNKNOWNKEYSORSTRINGS;
        } else {
            this.numberOfKeysorStrings = numberOfKeysorStrings;
        }
		
	}
	
}
