import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Descending
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	Integer[] arr = new Integer[size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i] = s.nextInt();
	}
	Arrays.sort(arr,Collections.reverseOrder());
	for(int array : arr)
	{
		System.out.print(array+" ");
	}
	}
}