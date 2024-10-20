package com.facebook.payments.paymentmethods.cardform;

import X.C0e1;

/* loaded from: CardFormStyle.class */
public enum CardFormStyle {
    P2P_PAY_ADD,
    P2P_PAY_EDIT,
    CONFIRM_CSC,
    SIMPLE,
    TXN_HUB;

    public static CardFormStyle forValue(String str) {
        Object obj = SIMPLE;
        Object A002 = C0e1.A00(CardFormStyle.class, str);
        if (A002 != null) {
            obj = A002;
        }
        return (CardFormStyle) obj;
    }
}
