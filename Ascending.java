import java.util.Scanner;
import java.util.Arrays;

public class Ascending
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int[] arr = new int[size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = s.nextInt();
	}
	Arrays.sort(arr);
	for(int array : arr)
	{
		System.out.print(array+" ");
	}
	}
}