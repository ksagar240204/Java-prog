import java.math.BigInteger;

public class MultiplyFirst100Numbers {
    public static void main(String[] args) {
       
        BigInteger product = BigInteger.ONE;

        for (int i = 1; i <= 100; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Product of the first 100 numbers: " + product);
    }
}
