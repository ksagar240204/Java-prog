public class Armstrong 
{
public static void main(String[] args) 
{
for (int num = 1; num <= 1000; num++) 
{
int original, remainder, result = 0;
original = num;
while (original != 0) 
{
remainder = original % 10;
result += Math.pow(remainder, 3);
original /= 10;
}
if (result == num) 
{
System.out.println(num);
}
}
}
}