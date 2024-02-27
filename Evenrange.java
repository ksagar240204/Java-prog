import java.util.*;
public class Evenrange {
  public static void main(String[] args) {
    
    System.out.println("Even Numbers from 1 to 100 are :");
    for(int i=2 ; i <= 100 ; i++){
      if(i % 2 == 0){
        System.out.print(""+i+" ");
      }
    }
  }
}