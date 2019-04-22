package com.sino.daily;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created on 2019/4/22 11:23.
 *
 * @author caogu
 */
public class DailyTest {

    @Test
    public void doubleToDecimal() {
        double amountDouble = 16.67;
        BigDecimal amountDecimal = new BigDecimal("16.67");
        System.out.println(amountDecimal.compareTo(new BigDecimal(amountDouble)));

        System.out.println("amountDouble: " + amountDouble);
        System.out.println("amountDecimal: " + amountDecimal);
        System.out.println("new BigDecimal(amountDouble): " + new BigDecimal(amountDouble));
        System.out.println("BigDecimal.valueOf(amountDouble): " + BigDecimal.valueOf(amountDouble));
        System.out.println("new BigDecimal(Double.toString(amountDouble)): " + new BigDecimal(Double.toString(amountDouble)));
        System.out.println("new BigDecimal(String.valueOf(amountDouble)): " + new BigDecimal(String.valueOf(amountDouble)));
    }
}
