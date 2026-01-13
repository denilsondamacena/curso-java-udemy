package lista5.entities;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double amount) {
        double basicValue = dollarPrice * amount;
        return basicValue + (basicValue * IOF);
    }
}
