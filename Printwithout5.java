public class Printwithout5 {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            if (number == 5) {
                // Skip printing 5
                continue;
            }
            System.out.println(number);
        }
    }
}
