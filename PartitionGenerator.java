import java.util.Random;
public class PartitionGenerator{
  Random rand;
  public PartitionGenerator(){
    rand = new Random();
  }

  public int[] getPartition(int noIngredientsMax, int noIngredientsMin,  int amountMax, int amountMin){
    if(noIngredientsMin > noIngredientsMax || amountMin > amountMax){
      //TODO
    }
    if(noIngredientsMin > amountMax){
      //TODO
    }

    int noIngredients = getRand(noIngredientsMax-noIngredientsMin+1)+noIngredientsMin;
    int[] ingredients = new int[noIngredients];
    int amountOfCl = getRand(amountMax-amountMin+1)+amountMin;
    for(int i = 0 ; i < noIngredients ; i++){
      ingredients[i] = 1;
    }
    if(amountOfCl<noIngredients){
      return ingredients;
    }
    amountOfCl-=noIngredients;
    while(amountOfCl > 0){
      ingredients[getRand(ingredients.length)]++;
      amountOfCl--;
    }
    return ingredients;
  }

  public int getRand(int i){
    try{
      return rand.nextInt(i);
    }catch(IllegalArgumentException e){
      return 0;
    }
  }
}
