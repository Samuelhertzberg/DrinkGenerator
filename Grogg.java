import java.util.ArrayList;
public class Grogg extends Drink{
  public Grogg(PartitionGenerator p, Inventory i){
    super(p,i);
    noIngredientsMax = 1;
    noIngredientsMin = 1;
    amountMax = 6;
    amountMin = 4;
    getPartition();
    getIngredientList();
  }
  private void getIngredientList(){
    ingredients = new ArrayList<String>();
    for(int i = 0 ; i < partition.length ; i++){
      String ingredient = inv.getIngredient(ingredientsIn, false,true,true,true,false);
      ingredientsIn.add(ingredient);
      ingredients.add(ingredient + ": " + partition[i] + " cl");
    }
    String ingredient = inv.getIngredient(ingredients, true,false,false,false,false);
    ingredients.add(ingredient);
  }
}
