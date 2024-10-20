package com.facebook.darts;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.5Yu;
import X.5ZL;
import X.5cI;
import X.7mU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C0ty;
import X.LvY;
import java.util.List;

/* loaded from: SignalConfig.class */
public final class SignalConfig extends C04v {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final EventId A04;
    public final Float A05;
    public final Integer A06;
    public final String A07;
    public final List A08;
    public static final Companion Companion = new Object();
    public static final 5Yu[] A09 = {null, null, null, null, null, null, null, null, new 5cI(5ZL.A01)};

    /* loaded from: SignalConfig$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return LvY.A00;
        }
    }

    public /* synthetic */ SignalConfig(EventId eventId, Float f, Integer num, String str, List list, int i, int i2, int i3, int i4, long j) {
        if (7 != (i & 7)) {
            7mU.A00(LvY.A01, i, 7);
            throw 0Q8.createAndThrow();
        }
        this.A04 = eventId;
        this.A03 = j;
        this.A07 = str;
        if ((i & 8) != 0) {
            this.A05 = f;
        }
        if ((i & 16) != 0) {
            this.A01 = i2;
        }
        if ((i & 32) != 0) {
            this.A02 = i3;
        }
        if ((i & 64) != 0) {
            this.A00 = i4;
        }
        if ((i & 128) != 0) {
            this.A06 = num;
        }
        if ((i & 256) == 0) {
            this.A08 = C0ty.A00;
        } else {
            this.A08 = list;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SignalConfig)) {
                return false;
            }
            SignalConfig signalConfig = (SignalConfig) obj;
            if (this.A04 != signalConfig.A04 || this.A03 != signalConfig.A03 || !11T.A0O(this.A07, signalConfig.A07) || !11T.A0O(this.A05, signalConfig.A05) || this.A01 != signalConfig.A01 || this.A02 != signalConfig.A02 || this.A00 != signalConfig.A00 || !11T.A0O(this.A06, signalConfig.A06) || !11T.A0O(this.A08, signalConfig.A08)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A08, (((((((((AnonymousClass002.A07(this.A07, AnonymousClass002.A02(this.A03, 1BL.A03(this.A04))) + AnonymousClass001.A02(this.A05)) * 31) + this.A01) * 31) + this.A02) * 31) + this.A00) * 31) + 4YU.A03(this.A06)) * 31);
    }
}
