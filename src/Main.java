import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        NumberToWord word = new NumberToWord(args[0]);
        int num = parseInt(args[0]);
        if (num <= 0 || num <= 9) {
            word.ones();
        } else if (num == 10) {
            word.tens();
        } else if (num <= 11 || num <= 19) {
            word.teens();
        } else if (num >= 20 || num <= 99) {
            word.tens();
            word.ones();
        } else {
            System.out.println("Please insert path for file, line for search or line for search and than line for replace");
            System.exit(1);
        }
    }
}

