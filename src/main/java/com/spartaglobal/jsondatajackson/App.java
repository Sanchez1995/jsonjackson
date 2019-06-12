package com.spartaglobal.jsondatajackson;

import jacksonDeserialisation.RatesDeserialiser;
import jacksonManualParsing.JacksonManualExample;

public class App
{
    public static void main( String[] args )
    {
        JacksonManualExample manualExample = new JacksonManualExample("resources/rates.json");
        System.out.println(manualExample.getSuccess());
        RatesDeserialiser ratesDeserialiser = new RatesDeserialiser("resources/rates.json");
        System.out.println(ratesDeserialiser.ratesMapped.getDate());
        System.out.println(ratesDeserialiser.ratesMapped.getRates().get("AED"));
    }
}
