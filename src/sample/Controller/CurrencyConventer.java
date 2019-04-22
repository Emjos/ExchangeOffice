package sample.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class CurrencyConventer {


    public static double convert(Currency from, Currency to) throws Exception{
        URL url = new URL("https://free.currconv.com/api/v7/" +
                "convert" +
                "?q="+from.getName()+ "_" +to.getName()+
                "&compact=ultra" +
                "&apiKey=82c317c71e6bf6630634");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String lines = bufferedReader.readLine();
        if (lines.length() > 0){
            String value = lines.substring(lines.indexOf(":")+1 , lines.indexOf("}"));
            return Double.parseDouble(value);
        }
        return 0;


    }
}
