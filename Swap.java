public class Swap {
	public static void main(String[] args)
	{
		int a = 1, b = 2;
		int temp = a;
		System.out.println("Before Swapping");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}