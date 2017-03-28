public class test{
  public static String[] testArray = new String[3];
  public static void main(String[] args) {
    testArray[0] = "1";
    testArray[1] = "2";
    testArray[2] = "3";
    changeGlobalArray();
    for(String i : testArray){
      System.out.println(i);
    }
  }

  public static void changeGlobalArray(){
    testArray[1] = "3";
    testArray[2] = "2";
  }
}
