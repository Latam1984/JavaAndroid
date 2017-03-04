package ja_11_syntax.lesson_05_methods;

/**
 * Created by Aleksey on 28.02.2017.
 */
public class someCurrencyChange {
    public static void main(String[] args) {
        double sum;
        String currency;
        String currencyChange;
        double sumInUAH = convert(100, "USD", "UAH");
        double sumInUSD = convert(100, "UAH", "USD");
        double sumInEUR = convert(100, "USD", "EUR");
        //System.out.println(convert(500, "USD", "UAH"));
        System.out.println("sumInEUR " + sumInEUR);
        System.out.println("sumInUSD " + sumInUSD);
        System.out.println("sumInUAH " + sumInUAH);
    }

    private static double convert(double amount, String from, String to) {
        //[Сумма в валюте конвертации]=[Курс]*[Сумма в базовой валюте]/[Кратность]
        //[Сумма в валюте конвертации]=1,94*1000/100=19,4
        double result = -1;
        double USD_UAH = 28.0;
        double EUR_USD = 1.05;
        double EUR_UAH = 30.0;
        from = from.toUpperCase();
        to = to.toUpperCase();
        String pair = from + to;

        if (from.equals(to)) return amount;

        switch (pair) {
            case "USDUAH":
                result = amount * USD_UAH;
                break;
            case "UAHUSD":
                result = amount / USD_UAH;
                break;
            case "EURUSD":
                result = amount * EUR_USD;
                break;
            case "USDEUR":
                result = amount / EUR_USD;
                break;
            case "EURUAH":
                result = amount * EUR_UAH;
                break;
            case "UAHEUR":
                result = amount / EUR_UAH;
                break;
        }
        return result;
    }
}
