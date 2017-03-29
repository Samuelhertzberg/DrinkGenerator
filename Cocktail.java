import java.util.ArrayList;
class Cocktail extends Drink{
  public Cocktail(PartitionGenerator p, Inventory i, int amount){
    super(p,i);
    noIngredientsMax = 5;
    noIngredientsMin = 2;
	amountMax = amount;
    amountMin = amount;
	if (amount == 0) {
		amountMax = 8;
	    amountMin = 5;
	}
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
  }
}
