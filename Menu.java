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
    while(true){
      writeMenu();
      response = scan.nextInt();
      if(response == 1){
        Sour s = new Sour(new PartitionGenerator(), new Inventory());
        System.out.println(s.getString());
      }
      else if(response == 2){
        Grogg g = new Grogg(new PartitionGenerator(), new Inventory());
        System.out.println(g.getString());
      }
      else if(response == 3){
        Cocktail c = new Cocktail(new PartitionGenerator(), new Inventory());
        System.out.println(c.getString());
      }
      else if(response == 4){
        Beer b = new Beer(new PartitionGenerator(), new Inventory());
        System.out.println(b.getString());
      }
      else if(response == 5){
        break;
      }
    }
    System.out.println("Barstoppad?");
  }
}
