package com.facebook.payments.shipping.model;

import X.C0e1;

/* loaded from: ShippingSource.class */
public enum ShippingSource {
    CHECKOUT,
    OTHERS;

    public static ShippingSource forValue(String str) {
        Object obj = OTHERS;
        Object A002 = C0e1.A00(ShippingSource.class, str);
        if (A002 != null) {
            obj = A002;
        }
        return (ShippingSource) obj;
    }
}
