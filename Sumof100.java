import java.io.*; 
class Sumof100
{ 
    public static void main(String[] args) 
    { 
        int N = 100; 
        int sum = 0; 
  
        // with 1 and increment each time with 1 
        for (int i = 1; i <= N; i++) { 
            sum += i; 
        } 
        System.out.println("Sum of first " + N + " Natural Number = " + sum); 
    } 
}