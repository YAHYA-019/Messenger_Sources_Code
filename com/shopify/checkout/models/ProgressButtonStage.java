package com.shopify.checkout.models;

import X.5Yu;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.JQz;
import X.M38;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ProgressButtonStage.class */
public final class ProgressButtonStage {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ProgressButtonStage[] A02;
    public static final ProgressButtonStage A03;
    public static final ProgressButtonStage A04;
    public static final Companion Companion;
    public final String value;

    /* loaded from: ProgressButtonStage$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JQz.A0x(ProgressButtonStage.A00);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.shopify.checkout.models.ProgressButtonStage$Companion, java.lang.Object] */
    static {
        ProgressButtonStage progressButtonStage = new ProgressButtonStage("ConfirmShipping", 0, "confirmShipping");
        A03 = progressButtonStage;
        ProgressButtonStage progressButtonStage2 = new ProgressButtonStage("Review", 1, "review");
        A04 = progressButtonStage2;
        ProgressButtonStage[] progressButtonStageArr = {progressButtonStage, progressButtonStage2, new ProgressButtonStage("Pay", 2, "pay")};
        A02 = progressButtonStageArr;
        A01 = C00t.A00(progressButtonStageArr);
        Companion = new Object();
        A00 = C01g.A00(C03i.A03, M38.A00);
    }

    public ProgressButtonStage(String str, int i, String str2) {
        this.value = str2;
    }

    public static ProgressButtonStage valueOf(String str) {
        return (ProgressButtonStage) Enum.valueOf(ProgressButtonStage.class, str);
    }

    public static ProgressButtonStage[] values() {
        return (ProgressButtonStage[]) A02.clone();
    }
}
