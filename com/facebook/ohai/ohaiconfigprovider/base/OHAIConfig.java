package com.facebook.ohai.ohaiconfigprovider.base;

import X.0Q8;
import X.11T;
import X.5Yu;
import X.7mU;
import X.AnonymousClass002;
import X.C04v;
import X.Lvp;

/* loaded from: OHAIConfig.class */
public final class OHAIConfig extends C04v {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final String A06;

    /* loaded from: OHAIConfig$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return Lvp.A00;
        }
    }

    public /* synthetic */ OHAIConfig(String str, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        if (127 != (i & 127)) {
            7mU.A00(Lvp.A01, i, 127);
            throw 0Q8.createAndThrow();
        }
        this.A03 = i2;
        this.A06 = str;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A04 = j;
        this.A05 = j2;
    }

    public OHAIConfig(String str, int i, int i2, int i3, int i4, long j, long j2) {
        11T.A0F(str, 2);
        this.A03 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A04 = j;
        this.A05 = j2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OHAIConfig)) {
                return false;
            }
            OHAIConfig oHAIConfig = (OHAIConfig) obj;
            if (this.A03 != oHAIConfig.A03 || !11T.A0O(this.A06, oHAIConfig.A06) || this.A02 != oHAIConfig.A02 || this.A01 != oHAIConfig.A01 || this.A00 != oHAIConfig.A00 || this.A04 != oHAIConfig.A04 || this.A05 != oHAIConfig.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A03(this.A05, AnonymousClass002.A02(this.A04, (((((AnonymousClass002.A07(this.A06, this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31));
    }
}
