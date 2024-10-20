package com.facebook.graphql.enums;

import X.DKF;
import java.util.HashSet;
import java.util.Set;

/* loaded from: GraphQLCurrencyCodeSet.class */
public final class GraphQLCurrencyCodeSet {
    public static final HashSet A00;

    static {
        String[] strArr = new String[57];
        System.arraycopy(new String[]{"AED", "ARS", "AUD", "BDT", "BOB", "BRL", "CAD", "CHF", "CLP", "CNY", "COP", "CRC", "CZK", "DKK", "DZD", "EGP", "EUR", "GBP", "GTQ", "HKD", "HNL", "HUF", "IDR", "ILS", "INR", "ISK", "JPY"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"KES", "KRW", "LKR", "MOP", "MXN", "MYR", "NGN", "NIO", "NOK", "NZD", "PEN", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RUB", "SAR", "SEK", "SGD", "THB", "TRY", "TWD", "UAH", "USD", "UYU"}, 0, strArr, 27, 27);
        A00 = DKF.A0w(new String[]{"VEF", "VND", "ZAR"}, strArr, 0, 54, 3);
    }

    public static final Set getSet() {
        return A00;
    }
}
