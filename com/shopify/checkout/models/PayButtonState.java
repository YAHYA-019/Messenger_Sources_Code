package com.shopify.checkout.models;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M37;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PayButtonState.class */
public final class PayButtonState {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ PayButtonState[] A02;
    public static final PayButtonState A03;
    public static final PayButtonState A04;
    public static final Companion Companion;
    public final String value;

    /* loaded from: PayButtonState$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(PayButtonState.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.shopify.checkout.models.PayButtonState$Companion, java.lang.Object] */
    static {
        PayButtonState payButtonState = new PayButtonState("Loading", 0, "loading");
        A04 = payButtonState;
        PayButtonState payButtonState2 = new PayButtonState("Disabled", 1, "disabled");
        A03 = payButtonState2;
        PayButtonState[] payButtonStateArr = {payButtonState, payButtonState2, new PayButtonState("Enabled", 2, "enabled")};
        A02 = payButtonStateArr;
        A01 = C00t.A00(payButtonStateArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M37.A00);
    }

    public PayButtonState(String str, int i, String str2) {
        this.value = str2;
    }

    public static PayButtonState valueOf(String str) {
        return (PayButtonState) Enum.valueOf(PayButtonState.class, str);
    }

    public static PayButtonState[] values() {
        return (PayButtonState[]) A02.clone();
    }
}
