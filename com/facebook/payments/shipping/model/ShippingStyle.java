package com.facebook.payments.shipping.model;

import X.C0e1;

/* loaded from: ShippingStyle.class */
public enum ShippingStyle {
    SIMPLE,
    SIMPLE_V2,
    TXN_HUB;

    public static ShippingStyle forValue(String str) {
        Object obj = SIMPLE;
        Object A002 = C0e1.A00(ShippingStyle.class, str);
        if (A002 != null) {
            obj = A002;
        }
        return (ShippingStyle) obj;
    }
}
