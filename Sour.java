import java.util.ArrayList;
class Sour extends Drink{
  public Sour(PartitionGenerator p, Inventory i){
    super(p,i);
    noIngredientsMax = 2;
    noIngredientsMin = 1;
    amountMax = 6;
    amountMin = 4;
    getPartition();
    getIngredientList();
  }
  private void getIngredientList(){
    ingredients = new ArrayList<String>();
    for(int i = 0 ; i < partition.length ; i++){
      String ingredient = inv.getIngredient(ingredientsIn, false,true,true,false,false);
      ingredientsIn.add(ingredient);
      ingredients.add(ingredient + ": " + partition[i] + " cl");
    }
    ingredients.add("Citron: " + (partGen.getRand(4)+1) + " cl");
    ingredients.add("Sockerlag: " + (partGen.getRand(2)+1) + " cl");
    ingredients.add("Äggvita: " + (partGen.getRand(1)+1) + " cl");
  }
}
