import static java.lang.Integer.parseInt;

public class NumberToWord {
    String num;

    public NumberToWord(String num) {
        this.num = num;
    }

    public String ones() {
        int numb = parseInt(num) % 10;
        switch (numb) {
            case 1:
                return "один";
            case 2:
                return "два";
            case 3:
                return "три";
            case 4:
                return "четыре";
            case 5:
                return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            default:
                return "ноль";
        }
    }

    public String teens() {
        int numb = parseInt(num);
        switch (numb) {
            case 11:
                return "одинадцать ";
            case 12:
                return "двенадцать ";
            case 13:
                return "тринадцать ";
            case 14:
                return "четырнадцать ";
            case 15:
                return "пятнадцать ";
            case 16:
                return "шестнадцать ";
            case 17:
                return "семнадцать ";
            case 18:
                return "восемнадцать ";
            case 19:
                return "девятнадцать ";
        }
        return "";
    }

    public String tens() {
        int numb = parseInt(num) / 10;
        switch (numb) {
            case 1:
                return "десять ";
            case 2:
                return "двадцать";
            case 3:
                return "тридцать";
            case 4:
                return "сорок";
            case 5:
                return "пятдесят";
            case 6:
                return "шестьдесят";
            case 7:
                return "семдесят";
            case 8:
                return "восемдесят";
            case 9:
                return "девяносто";
        }
        return "";
    }
}