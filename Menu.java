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
		System.out.print("> ");
	}

	private void writeOptions() {
		System.out.println("Är du lite kräsen? Välj isåfall ett passande alternativ");
		System.out.println(1 + ": Mängd alkohol (i cl)");
		System.out.println(2 + ": Jag bryr mig inte, kör ba");
		System.out.print("> ");
	}

	public void getResponse(){
		int response;
		int options;
		System.out.println("Hej och välkommen till Drinkgenerator 5000 deluxe.");
		loop: while(true){
			writeMenu();
			response = getInt(scan.next());
			switch (response) {
				case 1:
					options = getOptions();
					Sour s = new Sour(new PartitionGenerator(), new Inventory(), options);
					System.out.println("Sour: " + s.getString());
					break;
				case 2:
					options = getOptions();
					Grogg g = new Grogg(new PartitionGenerator(), new Inventory(), options);
					System.out.println("Grogg: " + g.getString());
					break;
				case 3:
					options = getOptions();
					Cocktail c = new Cocktail(new PartitionGenerator(), new Inventory(), options);
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
			System.out.println("Äh vi tar en till va?");

		}
		System.out.println("Barstoppad?");
	}

	/**
	 * Returns 0 if input String is not an int.
	 */
	private int getInt(String next) {
		try {
			int a = Integer.parseInt(next);
			if (a > 10) {
				return 0;
			}
			return a;
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	private int getOptions() {
		opLoop: while (true) {
			writeOptions();
			int res = getInt(scan.next());
			switch (res) {
				case 1:
					amountLoop: while (true) {
						System.out.println("Hur många cl vill du ha?");
						System.out.print("> ");
						int r = getInt(scan.next());
						if (r != 0) {
							return r;
						}
						System.out.println("Antingen försökte du nyss köpa sjukt mycket sprit (max 10cl) eller så är du full, prova igen.");
					}
				case 2:
					return 0;
				default:
					System.out.println("Är du full eller?");
			}
		}
	}
}
