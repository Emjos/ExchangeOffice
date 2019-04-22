package sample.Controller;

import java.util.ArrayList;
import java.util.List;

public enum Currency {
    USD("USD"),
    PLN("PLN"),
    EUR("EUR"),
    GBP("GBP");


    public String name;

    Currency() {
    }

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
