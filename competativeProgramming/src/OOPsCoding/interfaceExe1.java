package OOPsCoding;
import java.io.*;

interface Player{
	final String Origin = "Indian";
	void Bowler(String bowler);
	void Batsman(String batsman);
	void Speed(int speed);
	
}

class BiharState implements Player{
	
	String state1 = "Bihar";
	String bow;
	String bat;
	int speed; 
	

	@Override
	public void Bowler(String bowler) {
		// TODO Auto-generated method stub
		this.bow = bowler;
	}

	@Override
	public void Batsman(String batsman) {
		// TODO Auto-generated method stub
		this.bat = batsman;
	}

	@Override
	public void Speed(int speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}
	
	public void printStat() {
		System.out.println("Origin* - "+ Origin + " State - "+ state1 + " Bowlers - " + bow + " batsman - " + bat + " TopSpeed - "+speed);
		
	}
	
}

class UPState implements Player{
	
	String state1 = "UP";
	String bow;
	String bat;
	int speed; 
	

	@Override
	public void Bowler(String bowler) {
		// TODO Auto-generated method stub
		this.bow = bowler;
	}

	@Override
	public void Batsman(String batsman) {
		// TODO Auto-generated method stub
		this.bat = batsman;
	}

	@Override
	public void Speed(int speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
	}
	
	public void printStat() {
		System.out.println("Origin* - "+ Origin + " State - "+ state1 + " Bowlers - " + bow + " batsman - " + bat + " TopSpeed - "+speed);
		
	}
	
}

public class interfaceExe1 {
	//What is abstraction ->
	//Abstraction in Java is a process of hiding the implementation details from the user and showing only the functionality to the user. 
	//It can be achieved by using abstract classes, methods, and interfaces. 
	
	//What is interface -> 
	//The interface in Java is a mechanism to achieve abstraction. 
	//There can be only abstract methods in the Java interface, not the method body. 
	//It is used to achieve abstraction and multiple inheritances in Java using Interface. 
	//In other words, you can say that interfaces can have abstract methods and variables. 
	//It cannot have a method body. Java Interface also represents the IS-A relationship.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instance of BiharState
		BiharState bs = new BiharState();
		bs.Bowler("nkBowler");
		bs.Batsman("nkbatsman");
		bs.Speed(300);
		System.out.println("Details pring for Bihar State Player -");
		bs.printStat();
		
		UPState up = new UPState();
		up.Bowler("xyzBowler");
		up.Batsman("xyzbatsman");
		up.Speed(350);
		System.out.println("Details pring for UP State Player -");
		up.printStat();
		

	}

}
