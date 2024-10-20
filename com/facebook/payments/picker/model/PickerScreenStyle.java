package com.facebook.payments.picker.model;

import X.C0e1;

/* loaded from: PickerScreenStyle.class */
public enum PickerScreenStyle {
    CONTACT_INFORMATION,
    FB_PAYMENT_SETTINGS,
    MESSENGER_COMMERCE_PAYMENT_METHODS,
    PAYMENT_HISTORY,
    FBPAY_STARS_HISTORY,
    FBPAY_SUBSCRIPTIONS_HISTORY,
    PAYMENT_METHODS,
    P2P_PAYMENT_METHODS,
    PAYMENTS_OPTIONS_PICKER,
    SIMPLE,
    SIMPLE_SHIPPING_OPTION_PICKER,
    SIMPLE_SHIPPING_ADDRESS;

    public static PickerScreenStyle forValue(String str) {
        Object obj = SIMPLE;
        Object A002 = C0e1.A00(PickerScreenStyle.class, str);
        if (A002 != null) {
            obj = A002;
        }
        return (PickerScreenStyle) obj;
    }
}
