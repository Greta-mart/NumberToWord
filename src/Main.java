import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        NumberToWord word = new NumberToWord(args[0]);
        int num = parseInt(args[0]);
        if (num <= 0 || num <= 9) {
            System.out.println(word.ones());
        } else if (num == 10) {
            System.out.println(word.tens());
        } else if (num <= 11 || num <= 19) {
            System.out.println(word.teens());
        } else if (num >= 20 || num <= 99) {
            System.out.print(word.tens() + " ");
            System.out.println(word.ones());
        } else {
            System.out.println("Please enter number");
            System.exit(1);
        }
    }
}

