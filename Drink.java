import java.util.ArrayList;
public class Drink{
  PartitionGenerator partGen;
  Inventory inv;
  int[] partition;
  ArrayList<String> ingredients;
  ArrayList<String> ingredientsIn;
  int noIngredientsMax;
  int noIngredientsMin;
  int amountMax;
  int amountMin;
  public Drink(PartitionGenerator p, Inventory i){
    partGen = p;
    inv = i;
  }
  protected void getPartition(){
    ingredientsIn = new ArrayList<String>();
    partition = partGen.getPartition(noIngredientsMax,noIngredientsMin,amountMax,amountMin);
  }
  public String getString(){
    return ingredients.toString();
  }
}
