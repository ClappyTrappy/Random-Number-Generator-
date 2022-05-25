import java.util.Random;
class GenerateRandom {
    public static void main( String args[] ) {
      Random rand = new Random(); 
      int upperbound = 26;
        //generate random values from 1-25
      int int_random = rand.nextInt(upperbound); 
      int int_random2 = rand.nextInt(upperbound); 
      int int_random3 = rand.nextInt(upperbound); 
      int int_random4 = rand.nextInt(upperbound); 
      int int_random5 = rand.nextInt(upperbound); 
   
      System.out.println("Random integer value from 1 to" + (upperbound-1) + " : "+ int_random);
      System.out.println("Random integer value from 1 to" + (upperbound-1) + " : "+ int_random2);
      System.out.println("Random integer value from 1 to" + (upperbound-1) + " : "+ int_random3);
      System.out.println("Random integer value from 1 to" + (upperbound-1) + " : "+ int_random4);
      System.out.println("Random integer value from 1 to" + (upperbound-1) + " : "+ int_random5);
      
    }
}
