
public class SmallestNum 
{ 
    public static void main(String[] args)
  {
     
        int a = 56;
        int b = 10;
        int c = 36;
         
        int smallest;
         
        if(a<b && a<c) 
	{
            smallest = a;
        } 
	else if (b<c) 
	{
            smallest = b;
        } 
	
	else 
	{
            smallest = c;
        }
         
        System.out.println(smallest + " is the smallest.");
    }
}