public class Reversenum  
{  
public static void main(String[] args)   
{  
int a = 956626, b = 0;  
while(a != 0)   
{  
int rem = a % 10;  
b = b * 10 + rem;  
a = a/10;  
}  
System.out.println("Reverse of the given number is: " + b);  
}  
}