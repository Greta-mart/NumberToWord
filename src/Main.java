import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        String str = args[0];
        NumberToWord word = new NumberToWord(str);
        if (parseInt(args[0]) <= 0) {
            word.ones();
        } else if (parseInt(args[0]) <= 11 && parseInt(args[0]) <= 19) {
            word.teens();
        } else if (parseInt(args[0]) <= 20 || parseInt(args[0]) <= 99) {
            word.tens();
            word.ones();
        } else {
            System.out.println("Please insert path for file, line for search or line for search and than line for replace");
            System.exit(1);
        }
    }
}

