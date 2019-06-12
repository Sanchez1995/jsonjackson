package com.spartaglobal.jsondatajackson;

import jacksonDeserialisation.RatesDeserialiser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class tests {

    private static RatesDeserialiser ratesDeserialiser;

    @BeforeClass
    public static void setup(){
        ratesDeserialiser = new RatesDeserialiser("resources/rates.json");
    }
    @Test
    public void testsSuccessResponse(){
        Assert.assertTrue(ratesDeserialiser.ratesMapped.isSuccess());
    }
    @Test
    public void testTimeStamp(){
        Assert.assertEquals("timestamp",1539182646, ratesDeserialiser.ratesMapped.getTimestamp());
    }
    @Test
    public void testTimeStampValue(){
        Assert.assertEquals("epoch time", "2018-10-10 03:44:06", ratesDeserialiser.ratesMapped.getTimeStampValue());
    }
    @Test
    public void testBaseResponse(){
        Assert.assertEquals("EUR", ratesDeserialiser.ratesMapped.getBase());
    }
    @Test
    public void testRateResponse(){
        Assert.assertEquals(87.678396, ratesDeserialiser.ratesMapped.getRates().get("AFN"), 0);
    }

}
