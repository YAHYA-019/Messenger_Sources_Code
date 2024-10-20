package com.facebook.browser.lite.crossapp;

import X.0Q8;
import X.11T;
import X.4YV;
import X.5Yu;
import X.7mU;
import X.AnonymousClass002;
import X.C04v;
import X.LvW;

/* loaded from: AttentionLeverBudget.class */
public final class AttentionLeverBudget extends C04v {
    public static final Companion Companion = new Object();
    public final int A00;
    public final String A01;
    public final String A02;

    /* loaded from: AttentionLeverBudget$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LvW.A00;
        }
    }

    public /* synthetic */ AttentionLeverBudget(String str, String str2, int i, int i2) {
        if (7 != (i & 7)) {
            7mU.A00(LvW.A01, i, 7);
            throw 0Q8.createAndThrow();
        }
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AttentionLeverBudget)) {
                return false;
            }
            AttentionLeverBudget attentionLeverBudget = (AttentionLeverBudget) obj;
            if (!11T.A0O(this.A02, attentionLeverBudget.A02) || !11T.A0O(this.A01, attentionLeverBudget.A01) || this.A00 != attentionLeverBudget.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, 4YV.A02(this.A02)) + this.A00;
    }
}
