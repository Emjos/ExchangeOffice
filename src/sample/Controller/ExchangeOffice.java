package sample.Controller;

import java.io.IOException;

public class ExchangeOffice {

    public double exhange(double amount, Currency from,Currency to) throws Exception {
        Double exchanged = amount * CurrencyConventer.convert(from,to);
        return exchanged;
    }
    public double exchangedRate(Currency from,Currency to) throws Exception{
        return CurrencyConventer.convert(from,to);
    }
}
