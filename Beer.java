import java.util.ArrayList;
public class Beer extends Drink{
  public Beer(PartitionGenerator p, Inventory i){
    super(p,i);
    getIngredientList();
  }
  private void getIngredientList(){
    ingredients = new ArrayList<String>();
    ingredients.add(inv.getIngredient(new ArrayList<String>(),false,false,false,false,true));
  }
}
