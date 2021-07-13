package cs;
import java.util.Scanner;
//abstraction
public abstract class CounterStrike implements NecessaryInterface {

	Scanner input = new Scanner(System.in);
	public int  bg,fg,sg;
//encapsulation
private void chooseEquipment() {
	System.out.println("Enter the number of Grenades:");
	bg = input.nextInt();
	System.out.println("Enter the number of Flashes:");
	fg = input.nextInt();
	System.out.println("Enter the number of Smokes:");
	sg = input.nextInt();
}

public void explodeBomb () {

System.out.println("The bomb is set to explode in 30 seconds");
	
}


}
