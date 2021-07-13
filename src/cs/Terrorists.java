package cs;
import java.util.Scanner; 
import java.util.concurrent.TimeUnit;
//inheritance 
public class Terrorists extends CounterStrike implements NecessaryInterface {
	Scanner input = new Scanner(System.in);
	public void chooseCharacter() {
		System.out.println("1 for Arctic Avenger");
		System.out.println("2 for Elite Crew");
		System.out.println("3 for Guerilla Warfare");
		System.out.println("4 for Phoenix Connexion");
		int a = input.nextInt();
		switch(a) {
		case 1: System.out.println("You are now Arctic Avenger");
			    break;
		case 2: System.out.println("You are now Elite Crew");
	    	    break;
		case 3: System.out.println("You are now Guerilla Warfare");
	        	break;
		case 4: System.out.println("You are now Phoenix Connexion");
	        	break;
		}
	}
	public void choosePistol() {
		System.out.println("1 for Glock-18");
		System.out.println("2 for Deagle");
		System.out.println("3 for Dualies");
		int a = input.nextInt();
		switch (a) {
		case 1: System.out.println("You have now equipped Glock-18");
				break;
		case 2: System.out.println("You have now equipped Deagle");
				break;
		case 3: System.out.println("You have now equipped Dualies");
				break;
		}
	}
	public void chooseAssaultRifle() {
		System.out.println("1 for Ak-47");
		System.out.println("2 for Galil");
		System.out.println("3 for AWP");
		int a = input.nextInt();
		switch (a) {
		case 1: System.out.println("You have now equipped Ak-47");
				break;
		case 2: System.out.println("You have now equipped Galil");
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
		System.out.println("You have C4 Bomb");
		
}
	public void plantBomb() {
		System.out.println("Bomb has been planted");

		long startTime = System.nanoTime();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.nanoTime();
		long timeElapsed = endTime-startTime;

	}

}
