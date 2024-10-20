package com.facebook.payments.ui.titlebar.model;

import X.C00t;
import X.ErI;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PaymentsTitleBarStyle.class */
public final class PaymentsTitleBarStyle {
    public static final ErI A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ PaymentsTitleBarStyle[] A02;
    public static final PaymentsTitleBarStyle A03;
    public static final PaymentsTitleBarStyle A04;
    public static final PaymentsTitleBarStyle A05;

    /* JADX WARN: Type inference failed for: r0v14, types: [X.ErI, java.lang.Object] */
    static {
        PaymentsTitleBarStyle paymentsTitleBarStyle = new PaymentsTitleBarStyle("DEFAULT", 0);
        A03 = paymentsTitleBarStyle;
        PaymentsTitleBarStyle paymentsTitleBarStyle2 = new PaymentsTitleBarStyle("PAYMENTS_WHITE", 1);
        A05 = paymentsTitleBarStyle2;
        PaymentsTitleBarStyle paymentsTitleBarStyle3 = new PaymentsTitleBarStyle("FB_BLUE", 2);
        A04 = paymentsTitleBarStyle3;
        PaymentsTitleBarStyle[] paymentsTitleBarStyleArr = {paymentsTitleBarStyle, paymentsTitleBarStyle2, paymentsTitleBarStyle3};
        A02 = paymentsTitleBarStyleArr;
        A01 = C00t.A00(paymentsTitleBarStyleArr);
        A00 = new Object();
    }

    public PaymentsTitleBarStyle(String str, int i) {
    }

    public static final PaymentsTitleBarStyle forValue(String str) {
        return A00.forValue(str);
    }

    public static PaymentsTitleBarStyle valueOf(String str) {
        return (PaymentsTitleBarStyle) Enum.valueOf(PaymentsTitleBarStyle.class, str);
    }

    public static PaymentsTitleBarStyle[] values() {
        return (PaymentsTitleBarStyle[]) A02.clone();
    }
}
