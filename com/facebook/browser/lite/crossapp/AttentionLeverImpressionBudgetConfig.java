package com.facebook.browser.lite.crossapp;

import X.0BY;
import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.7zL;
import X.C04v;
import X.LvW;
import X.LvX;
import X.M9h;
import java.util.Arrays;

/* loaded from: AttentionLeverImpressionBudgetConfig.class */
public final class AttentionLeverImpressionBudgetConfig extends C04v {
    public static final 5Yu[] A03;
    public static final Companion Companion = new Object();
    public final int A00;
    public final AttentionLeverBudget[] A01;
    public final AttentionLeverBudget[] A02;

    /* loaded from: AttentionLeverImpressionBudgetConfig$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LvX.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.browser.lite.crossapp.AttentionLeverImpressionBudgetConfig$Companion] */
    static {
        0BY A18 = 7zL.A18(AttentionLeverBudget.class);
        LvW lvW = LvW.A00;
        A03 = new 5Yu[]{null, new M9h(A18, lvW), new M9h(7zL.A18(AttentionLeverBudget.class), lvW)};
    }

    public /* synthetic */ AttentionLeverImpressionBudgetConfig(AttentionLeverBudget[] attentionLeverBudgetArr, AttentionLeverBudget[] attentionLeverBudgetArr2, int i, int i2) {
        if (7 != (i & 7)) {
            7mU.A00(LvX.A01, i, 7);
            throw 0Q8.createAndThrow();
        }
        this.A00 = i2;
        this.A02 = attentionLeverBudgetArr;
        this.A01 = attentionLeverBudgetArr2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AttentionLeverImpressionBudgetConfig)) {
                return false;
            }
            AttentionLeverImpressionBudgetConfig attentionLeverImpressionBudgetConfig = (AttentionLeverImpressionBudgetConfig) obj;
            if (this.A00 != attentionLeverImpressionBudgetConfig.A00 || !11T.A0O(this.A02, attentionLeverImpressionBudgetConfig.A02) || !11T.A0O(this.A01, attentionLeverImpressionBudgetConfig.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + Arrays.hashCode(this.A02)) * 31) + Arrays.hashCode(this.A01);
    }
}
