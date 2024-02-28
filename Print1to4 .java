public class Print1to4 {
    public static void main(String[] args) {
        for (int number = 1; number <= 4; number++) {
            System.out.println(number);
            if (number == 4) {
                break;
            }
        }
    }
}
