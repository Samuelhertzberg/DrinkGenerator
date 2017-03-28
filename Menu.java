import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Menu{
	Scanner scan;
	public Menu(){
		scan = new Scanner(System.in);
	}

	private void writeMenu(){
		System.out.println(1 + ": Sour");
		System.out.println(2 + ": Grogg");
		System.out.println(3 + ": Cocktail");
		System.out.println(4 + ": Öl");
		System.out.println(5 + ": Exit");
		System.out.print(">");
	}

	public void getResponse(){
		int response;
		loop: while(true){
			writeMenu();
			response = getInt(scan.next());
			switch (response) {
				case 1:
					Sour s = new Sour(new PartitionGenerator(), new Inventory());
					System.out.println("Sour: " + s.getString());
					break;
				case 2:
					Grogg g = new Grogg(new PartitionGenerator(), new Inventory());
					System.out.println("Grogg: " + g.getString());
					break;
				case 3:
					Cocktail c = new Cocktail(new PartitionGenerator(), new Inventory());
					System.out.println("Cocktail: " + c.getString());
					break;
				case 4:
					Beer b = new Beer(new PartitionGenerator(), new Inventory());
					System.out.println("Beer: " + b.getString());
					break;
				case 5:
					break loop;
				default:
					System.out.println("Är du full eller? Försök igen");
			}
			System.out.println("----------------------------------------");
		}
		System.out.println("Barstoppad?");
	}

	/**
	 * Returns 0 if input String is not an int.
	 */
	private int getInt(String next) {
		try {
			return Integer.parseInt(next);
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
