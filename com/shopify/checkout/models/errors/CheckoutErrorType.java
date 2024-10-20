package com.shopify.checkout.models.errors;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M3A;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: CheckoutErrorType.class */
public final class CheckoutErrorType {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ CheckoutErrorType[] A02;
    public static final CheckoutErrorType A03;
    public static final CheckoutErrorType A04;
    public static final CheckoutErrorType A05;
    public static final CheckoutErrorType A06;
    public static final CheckoutErrorType A07;
    public static final CheckoutErrorType A08;
    public static final Companion Companion;
    public final String value;

    /* loaded from: CheckoutErrorType$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(CheckoutErrorType.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, com.shopify.checkout.models.errors.CheckoutErrorType$Companion] */
    static {
        CheckoutErrorType checkoutErrorType = new CheckoutErrorType("Inventory", 0, "inventory");
        A05 = checkoutErrorType;
        CheckoutErrorType checkoutErrorType2 = new CheckoutErrorType("Payment", 1, "payment");
        A08 = checkoutErrorType2;
        CheckoutErrorType checkoutErrorType3 = new CheckoutErrorType("Other", 2, "other");
        A07 = checkoutErrorType3;
        CheckoutErrorType checkoutErrorType4 = new CheckoutErrorType("Discount", 3, "discount");
        A04 = checkoutErrorType4;
        CheckoutErrorType checkoutErrorType5 = new CheckoutErrorType("Order", 4, "order");
        A06 = checkoutErrorType5;
        CheckoutErrorType checkoutErrorType6 = new CheckoutErrorType("CustomerPersistence", 5, "customer_persistence");
        A03 = checkoutErrorType6;
        CheckoutErrorType[] checkoutErrorTypeArr = {checkoutErrorType, checkoutErrorType2, checkoutErrorType3, checkoutErrorType4, checkoutErrorType5, checkoutErrorType6, new CheckoutErrorType("CheckoutBlocking", 6, "checkout_blocking")};
        A02 = checkoutErrorTypeArr;
        A01 = C00t.A00(checkoutErrorTypeArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M3A.A00);
    }

    public CheckoutErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    public static CheckoutErrorType valueOf(String str) {
        return (CheckoutErrorType) Enum.valueOf(CheckoutErrorType.class, str);
    }

    public static CheckoutErrorType[] values() {
        return (CheckoutErrorType[]) A02.clone();
    }
}
