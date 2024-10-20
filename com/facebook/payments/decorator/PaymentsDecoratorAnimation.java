package com.facebook.payments.decorator;

import X.C0e1;
import X.ELS;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A02' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: PaymentsDecoratorAnimation.class */
public final class PaymentsDecoratorAnimation {
    public static final /* synthetic */ PaymentsDecoratorAnimation[] A00;
    public static final PaymentsDecoratorAnimation A01;
    public static final PaymentsDecoratorAnimation A02;
    public static final PaymentsDecoratorAnimation A03;
    public static final PaymentsDecoratorAnimation A04;
    public final ELS mTitleBarNavIconStyle;

    static {
        PaymentsDecoratorAnimation paymentsDecoratorAnimation = new PaymentsDecoratorAnimation(ELS.A03, "MODAL_BOTTOM", 0);
        A01 = paymentsDecoratorAnimation;
        ELS els = ELS.A02;
        PaymentsDecoratorAnimation paymentsDecoratorAnimation2 = new PaymentsDecoratorAnimation(els, "SLIDE_BOTTOM", 1);
        A02 = paymentsDecoratorAnimation2;
        PaymentsDecoratorAnimation paymentsDecoratorAnimation3 = new PaymentsDecoratorAnimation(els, "SLIDE_RIGHT", 2);
        A03 = paymentsDecoratorAnimation3;
        PaymentsDecoratorAnimation paymentsDecoratorAnimation4 = new PaymentsDecoratorAnimation(ELS.A04, "SLIDE_RIGHT_FOR_NO_NAV_ICON", 3);
        A04 = paymentsDecoratorAnimation4;
        A00 = new PaymentsDecoratorAnimation[]{paymentsDecoratorAnimation, paymentsDecoratorAnimation2, paymentsDecoratorAnimation3, paymentsDecoratorAnimation4, new PaymentsDecoratorAnimation(els, "NO_ANIMATION", 4)};
    }

    public PaymentsDecoratorAnimation(ELS els, String str, int i) {
        this.mTitleBarNavIconStyle = els;
    }

    public static PaymentsDecoratorAnimation forValue(String str) {
        Object obj = A01;
        Object A002 = C0e1.A00(PaymentsDecoratorAnimation.class, str);
        if (A002 != null) {
            obj = A002;
        }
        return (PaymentsDecoratorAnimation) obj;
    }

    public static PaymentsDecoratorAnimation valueOf(String str) {
        return (PaymentsDecoratorAnimation) Enum.valueOf(PaymentsDecoratorAnimation.class, str);
    }

    public static PaymentsDecoratorAnimation[] values() {
        return (PaymentsDecoratorAnimation[]) A00.clone();
    }
}
