package com.facebook.payments.ui.titlebar.model;

import X.C00t;
import X.ErJ;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PaymentsTitleBarTitleStyle.class */
public final class PaymentsTitleBarTitleStyle {
    public static final ErJ A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ PaymentsTitleBarTitleStyle[] A02;
    public static final PaymentsTitleBarTitleStyle A03;
    public static final PaymentsTitleBarTitleStyle A04;
    public static final PaymentsTitleBarTitleStyle A05;

    /* JADX WARN: Type inference failed for: r0v14, types: [X.ErJ, java.lang.Object] */
    static {
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle = new PaymentsTitleBarTitleStyle("DEFAULT", 0);
        A04 = paymentsTitleBarTitleStyle;
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle2 = new PaymentsTitleBarTitleStyle("CENTER_ALIGNED", 1);
        A03 = paymentsTitleBarTitleStyle2;
        PaymentsTitleBarTitleStyle paymentsTitleBarTitleStyle3 = new PaymentsTitleBarTitleStyle("LEFT_ALIGNED", 2);
        A05 = paymentsTitleBarTitleStyle3;
        PaymentsTitleBarTitleStyle[] paymentsTitleBarTitleStyleArr = {paymentsTitleBarTitleStyle, paymentsTitleBarTitleStyle2, paymentsTitleBarTitleStyle3};
        A02 = paymentsTitleBarTitleStyleArr;
        A01 = C00t.A00(paymentsTitleBarTitleStyleArr);
        A00 = new Object();
    }

    public PaymentsTitleBarTitleStyle(String str, int i) {
    }

    public static final PaymentsTitleBarTitleStyle forValue(String str) {
        return A00.forValue(str);
    }

    public static PaymentsTitleBarTitleStyle valueOf(String str) {
        return (PaymentsTitleBarTitleStyle) Enum.valueOf(PaymentsTitleBarTitleStyle.class, str);
    }

    public static PaymentsTitleBarTitleStyle[] values() {
        return (PaymentsTitleBarTitleStyle[]) A02.clone();
    }
}
