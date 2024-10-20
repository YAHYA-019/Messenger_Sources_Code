package com.shopify.checkout.models;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M39;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ProgressButtonState.class */
public final class ProgressButtonState {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ProgressButtonState[] A02;
    public static final ProgressButtonState A03;
    public static final ProgressButtonState A04;
    public static final Companion Companion;
    public final String value;

    /* loaded from: ProgressButtonState$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(ProgressButtonState.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.shopify.checkout.models.ProgressButtonState$Companion, java.lang.Object] */
    static {
        ProgressButtonState progressButtonState = new ProgressButtonState("Loading", 0, "loading");
        A04 = progressButtonState;
        ProgressButtonState progressButtonState2 = new ProgressButtonState("Disabled", 1, "disabled");
        A03 = progressButtonState2;
        ProgressButtonState[] progressButtonStateArr = {progressButtonState, progressButtonState2, new ProgressButtonState("Enabled", 2, "enabled")};
        A02 = progressButtonStateArr;
        A01 = C00t.A00(progressButtonStateArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M39.A00);
    }

    public ProgressButtonState(String str, int i, String str2) {
        this.value = str2;
    }

    public static ProgressButtonState valueOf(String str) {
        return (ProgressButtonState) Enum.valueOf(ProgressButtonState.class, str);
    }

    public static ProgressButtonState[] values() {
        return (ProgressButtonState[]) A02.clone();
    }
}
