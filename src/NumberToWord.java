import static java.lang.Integer.parseInt;

public class NumberToWord {
    String num;

    public NumberToWord(String num) {
        this.num = num;
    }

    public void ones() {
        int numb = parseInt(num) % 10;
        if (numb == 0) {
            System.out.print("ноль");
        } else if (numb == 1) {
            System.out.print("один");
        } else if (numb == 2) {
            System.out.print("два");
        } else if (numb == 3) {
            System.out.print("три");
        } else if (numb == 4) {
            System.out.print("четыре");
        } else if (numb == 5) {
            System.out.print("пять");
        } else if (numb == 6) {
            System.out.print("шесть");
        } else if (numb == 7) {
            System.out.print("семь");
        } else if (numb == 8) {
            System.out.print("восемь");
        } else if (numb == 9) {
            System.out.print("девять");
        }
    }

    public void teens() {
        int numb = parseInt(num);
        if (numb == 11) {
            System.out.print("одинадцать ");
        } else if (numb == 12) {
            System.out.print("двенадцать ");
        } else if (numb == 13) {
            System.out.print("тринадцать ");
        } else if (numb == 14) {
            System.out.print("четырнадцать ");
        } else if (numb == 15) {
            System.out.print("пятнадцать ");
        } else if (numb == 16) {
            System.out.print("шестнадцать ");
        } else if (numb == 17) {
            System.out.print("семнадцать ");
        } else if (numb == 18) {
            System.out.print("восемнадцать ");
        } else if (numb == 19) {
            System.out.print("девятнадцать ");
        }
    }

    public void tens() {
        int numb = parseInt(num) / 10;
        if (numb == 1) {
            System.out.print("десять ");
        } else if (numb == 2) {
            System.out.print("двадцать ");
        } else if (numb == 3) {
            System.out.print("тридцать ");
        } else if (numb == 4) {
            System.out.print("сорок ");
        } else if (numb == 5) {
            System.out.print("пятдесят ");
        } else if (numb == 6) {
            System.out.print("шестьдесят ");
        } else if (numb == 7) {
            System.out.print("семдесят ");
        } else if (numb == 8) {
            System.out.print("восемдесят ");
        } else if (numb == 9) {
            System.out.print("девяносто ");
        }
    }
}