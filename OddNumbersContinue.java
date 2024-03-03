public class OddNumbersContinue {
    public static void main(String[] args) {
       
        for (int number = 1; number <= 10; number++) 
	{  
            if (number % 2 == 0) 
		{ 
                continue;  
       		}
            System.out.println(number);
        }
    }
}
