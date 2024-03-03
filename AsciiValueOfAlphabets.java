public class AsciiValueOfAlphabets {
    public static void main(String[] args) {
        System.out.println("ASCII values of all alphabets:");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + ": " + (int) c + "\t" + (char) (c + 32) + ": " + (int) (c + 32));
        }
    }
}
