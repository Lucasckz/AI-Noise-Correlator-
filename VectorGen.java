/*
@Name: Lucas Keizur
@Date: 6/6/2021

@Project: Finale Project
@File: VectorGen.java

@Description: This program will generate a data set of letter vectores with a certain percentage
              of noise and a certain size 10*n_samples.
*/
import java.util.Random;

public class VectorGen{
   
   //This method takes in the noise, random double, and initial value to 
   //determine whether or not noise will be applied.
   public static int stat(int value, double noise, double rand){
      if (noise > rand) {
         if (value == 1)
            return 0;
         else
            return 1;
      }
      return value;
   }
   
   public static void main(String[] args){
   
      int[][] base_Vector = new int[10][];
      Random rand = new Random();
      
      //Each array reresents a letter.
      int[] a = new int[]{0,0,0,1,0,0,0,
                          0,0,1,0,1,0,0,
                          0,1,0,0,0,1,0,
                          1,0,0,0,0,0,1,
                          1,1,1,1,1,1,1,
                          1,0,0,0,0,0,1,
                          1,0,0,0,0,0,1};
      int[] b = new int[]{0,1,1,1,1,0,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,1,1,1,0,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,1,1,1,0,0};
      int[] c = new int[]{0,0,1,1,1,0,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,1,0,
                          0,0,1,1,1,0,0};
      int[] d = new int[]{0,1,1,1,1,0,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,1,1,1,0,0};
      int[] e = new int[]{0,1,1,1,1,1,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,1,1,1,0,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,1,1,1,1,0};
      int[] f = new int[]{0,1,1,1,1,1,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,1,1,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0};
      int[] g = new int[]{0,0,1,1,1,0,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,0,0,
                          0,1,0,0,0,0,0,
                          0,1,0,1,1,1,0,
                          0,1,0,0,0,1,0,
                          0,0,1,1,1,0,0};
      int[] h = new int[]{0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,1,1,1,1,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0};
      int[] i = new int[]{0,0,1,1,1,0,0,
                          0,0,0,1,0,0,0,
                          0,0,0,1,0,0,0,
                          0,0,0,1,0,0,0,
                          0,0,0,1,0,0,0,
                          0,0,0,1,0,0,0,
                          0,0,1,1,1,0,0};
      int[] j = new int[]{0,0,0,0,0,1,0,
                          0,0,0,0,0,1,0,
                          0,0,0,0,0,1,0,
                          0,0,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,1,0,0,0,1,0,
                          0,0,1,1,1,0,0};
                          
      //Each letter vectore is placed on an array to consolidate the data.
      base_Vector[0] = a;
      base_Vector[1] = b;
      base_Vector[2] = c;
      base_Vector[3] = d;
      base_Vector[4] = e;
      base_Vector[5] = f;
      base_Vector[6] = g;
      base_Vector[7] = h;
      base_Vector[8] = i;
      base_Vector[9] = j;
      
      //Noise determines the rate at which a bit will be inverted.
         //Noise is a double between 0.0 and 1.0
      double noise = .3;
      //n_Samples is the number of noisy vectors of each letter.
      int n_Samples = 50;
      
      int cur;
      
      //This loop goes through each letter from 0 to 9 and print n_Samples of noisy variations.
      for ( int x = 0; x < 10; x++ ){
      
         for ( int y = 0; y < n_Samples; y++ ) {
         
            for ( int z = 0; z < 49; z++ ){
               //determines if the bit will be noisy
               if (y>0) 
                  cur = stat(base_Vector[x][z], noise, rand.nextDouble() ); 
               else
                  cur = base_Vector[x][z];
                  
               System.out.print(cur + ",");
            }
            //applies the letter to the end of the line to accomidate the .arff format.
            if (x == 0)
               System.out.println("a");
            else if (x == 1)
               System.out.println("b");
            else if (x == 2)
               System.out.println("c");
            else if (x == 3)
               System.out.println("d");
            else if (x == 4)
               System.out.println("e");
            else if (x == 5)
               System.out.println("f");
            else if (x == 6)
               System.out.println("g");
            else if (x == 7)
               System.out.println("h");
            else if (x == 8)
               System.out.println("i");
            else
               System.out.println("j");
         }
      }
   }
}