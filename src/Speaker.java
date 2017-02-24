import java.awt.*;
import java.util.Scanner;

/**
 * @author: Robert
 * @version: 2/22/17.
 * @assign.ment: Create Classes
 * descrip.tion: This program creates a speaker class. Speakers have different states and behaviors that can be gotten and set.
 */
public class Speaker {
    boolean isOn;
    int volume;
    int dimX;
    int dimY;
    int dimZ;
    String color;
//constructor
    public Speaker(){
        isOn = false;
        volume = 0;
        dimX = 10;
        dimY = 5;
        dimZ = 8;
        color = "cream";
    }
//getters
    public boolean getOn(){
        return isOn;
    }
    public int getVolume(){
        return volume;
    }
    public int getDimX(){
        return dimX;
    }
    public int getDimY(){
        return dimY;
    }
    public int getDimZ(){
        return dimZ;
    }
    public String getColor(){
        return color;
    }
//setters
    public void setOn(boolean newOn){
        isOn = newOn;
    }
    public void setVolume(int newVolume) {
		volume = newVolume;
	}
//test
	public static void main(String args[]){
		Speaker s1 = new Speaker();
		Speaker s2 = new Speaker();
		Speaker s3 = new Speaker();
		String turnOn;
		String dump;
		String changeVol;
		int newVolume;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Speaker s1's color is "+s1.getColor());
		System.out.println("Speaker s2 is off. Do you want to turn it on? Y or N.");
		turnOn = scanner.nextLine();
		if (turnOn.equals("Y")){
			s2.setOn(true);
			System.out.println("s2 is now on");
		}
		if (turnOn.equals("N")){
			System.out.println("s2 is still false");
		}
		System.out.println("Speaker s3 is now at volume " + s3.getVolume() + ".");
		System.out.println("Do you want to change it? Y or N.");
		changeVol = scanner.nextLine();
		if (changeVol.equals("Y")){
			System.out.println("Change volume to what?");
			newVolume = scanner.nextInt();
			s3.setVolume(newVolume);
			System.out.println("s3's volume is now "+s3.getVolume());
		}
	}
}
