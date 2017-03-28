import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Inventory{
  private ArrayList<String> mix;
  private ArrayList<String> sprit;
  private ArrayList<String> likor;
  private ArrayList<String> barKit;
  private ArrayList<String> bira;
  private Random rand;

  public Inventory(){
    fillLists();
    rand = new Random();
  }

  public String getIngredient(ArrayList<String> toBeRemoved, Boolean wMix, Boolean wSpirit, Boolean wLikor, Boolean wBarKit, Boolean wBira){
    ArrayList<String> assortment = new ArrayList<String>();
    if(wMix) assortment.addAll(mix);
    if(wSpirit) assortment.addAll(sprit);
    if(wLikor) assortment.addAll(likor);
    if(wBarKit) assortment.addAll(barKit);
    if(wBira) assortment.addAll(bira);
    ArrayList<String> spiritsLeft = removeItems(assortment, toBeRemoved);
    try{
      return spiritsLeft.get(rand.nextInt(spiritsLeft.size()-1));
    }catch(IllegalArgumentException e){
      return spiritsLeft.get(0);
    }
  }

  public ArrayList<String> removeItems(ArrayList<String> drinkables, ArrayList<String> toBeRemoved){
    ArrayList<String> drinkablesRemoved = drinkables;
    for (String i : toBeRemoved) {
      if(drinkables.contains(i))
      drinkablesRemoved.remove(i);
    }
    return drinkablesRemoved;
  }

  private void fillLists(){
    mix = new ArrayList<String>(Arrays.asList("Sprite","Cola","Fanta","Transbärjuice","Tonic","Äpplejuice","Mangojuice","Passionjuice","Guanabanajuice", "Ramlösa", "Apelsinjuice ", "Ananasjuice", "red bull", "Ginger ale"));

    sprit = new ArrayList<String>(Arrays.asList("Vodka","Gin","Tequila","Rom","ChiliVodka","IngefäraVodka","HallonVodka","Wiskey","TripleSeq","Fireball","VodkaLemon","bourbon"));

    likor = new ArrayList<String>(Arrays.asList("Amaretto","Licor43","Hpnotiq","SourzRaspberry","SourzApple","SourzRedBerry","SourzTropical"));

    barKit = new ArrayList<String>(Arrays.asList("Citron","Lime","SockerLag","Äggvita"));

    bira = new ArrayList<String>(Arrays.asList("calleBalle","Staro","daura","stella","brooklyn lager","brooklyn lager","tiger","krlek","all the way","avenyn","cristmas idjit","fuck art","berliner vice","crooked moon","indianen","leon","nebuchanezzer","zodiak","peter pale and mary","cloud 9 wit","ta en bara","den där asdyra","en cider"));
    return;
  }
}
