package cs;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
//inheritance
public class CounterTerrorists extends CounterStrike implements NecessaryInterface {
	Scanner input = new Scanner(System.in);
	public void chooseCharacter() {
		System.out.println("1 for GIGN");
		System.out.println("2 for CSG-9");
		System.out.println("3 for SA S");
		System.out.println("4 for SEAL Team 6");
		int a = input.nextInt();
		switch(a) {
		case 1: System.out.println("You are now GIGN");
			    break;
		case 2: System.out.println("You are now CSG-9");
	    	    break;
		case 3: System.out.println("You are now SA S");
	        	break;
		case 4: System.out.println("You are now SEAL Team 6");
	        	break;
		}	
	}
	public void choosePistol() {
	System.out.println("1 for USP-S");
	System.out.println("2 for Deagle");
	System.out.println("3 for Five-Seven");
	int a = input.nextInt();
	switch (a) {
	case 1: System.out.println("You have now equipped USP-S");
			break;
	case 2: System.out.println("You have now equipped Deagle");
			break;
	case 3: System.out.println("You have now equipped Five-Seven");
			break;

	}
	}
	public void chooseAssaultRifle() {
		System.out.println("1 for M4A1-S");
		System.out.println("2 for Famas");
		System.out.println("3 for AWP");
		int a = input.nextInt();
		switch (a) {
		case 1: System.out.println("You have now equipped M4A1-S");
				break;
		case 2: System.out.println("You have now equipped Famas");
				break;
		case 3: System.out.println("You have now equipped AWP");
				break;
		}
	}
	public void chooseEquipment() {
		
		System.out.println("Enter the number of grenades:");
		bg = input.nextInt();
		if (bg<=1) 
		{
			System.out.println("You have equipped correct amount of Grenades");
		}
		else 
		{
			System.out.println("You can only have 1 grenade, automatically adjusting inventory to 1 Grenade");
			System.out.println("You have 1 Grenade");
		}
		System.out.println("Enter the number of flash grenades:");
		fg = input.nextInt();
		if (fg<=2 && bg <= 1)
		{
			System.out.println("You have equipped correct amount of Flash Bangs");
		}
		else 
		{
			System.out.println("You can only have 2 Flash Bangs, automatically adjusting inventory to 2 Flash bangs");
			System.out.println("You have 2 Flashes");
		}
		System.out.println("Enter the number of smoke grenades:");
		sg = input.nextInt();
		if (sg<=1 && bg <=1 && fg <=2) {
			System.out.println("You have equipped correct amount of Smoke Grenades");
		}
		else
		{
			System.out.println("You can only have 1 Smoke Grenade, automatically adjusting to 1 Smoke Grenade");
			System.out.println("You have 1 Smoke");
		}
		
		System.out.println("You have Bomb Defusal kit");
		
	}
	public void defuseBomb() {	
		
		System.out.println("Press d in 30 seconds to defuse the the bomb");
		System.out.println("Otherwise the bomb will explode");
		try {
			TimeUnit.SECONDS.sleep(1);
			char c = input.next().charAt(0);
			if (c=='d') {
				System.out.println("Counter Terrorists Win!!");
			}
			else {
				System.out.println("The Bomb has Exploded!");
				System.out.println("Terrorists Win!!");
			}
			System.out.println("\t\t Round Ended");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
