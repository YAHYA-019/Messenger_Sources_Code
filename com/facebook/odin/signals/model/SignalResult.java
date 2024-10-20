package com.facebook.odin.signals.model;

import X.03W;
import X.04R;
import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.5Yu;
import X.5ZL;
import X.5ZP;
import X.5ZR;
import X.5cI;
import X.7zL;
import X.7zT;
import X.AbF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.KZ3;
import X.Lv7;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.OdinContext$$serializer;
import java.util.Map;
import kotlinx.serialization.ContextualSerializer;

/* loaded from: SignalResult.class */
public final class SignalResult extends C04v {
    public static final 5Yu[] A09;
    public static final Companion Companion = new Object();
    public final long A00;
    public final OdinContext A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;

    /* loaded from: SignalResult$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return SignalResult$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.odin.signals.model.SignalResult$Companion] */
    static {
        5ZL r0 = 5ZL.A01;
        A09 = new 5Yu[]{null, null, new 5ZR(r0, 5ZP.A00), new 5ZR(r0, Lv7.A00), new 5ZR(r0, r0), new 5ZR(r0, new 5cI(r0)), null, null, new ContextualSerializer(7zL.A18(OdinContext.class), KZ3.A00(OdinContext$$serializer.INSTANCE), new 5Yu[0])};
    }

    public SignalResult() {
        03W A0G = 04R.A0G();
        03W A0G2 = 04R.A0G();
        03W A0G3 = 04R.A0G();
        03W A0G4 = 04R.A0G();
        7zT.A11(3, A0G, A0G2, A0G3, A0G4);
        this.A03 = "";
        this.A04 = null;
        this.A06 = A0G;
        this.A05 = A0G2;
        this.A08 = A0G3;
        this.A07 = A0G4;
        this.A02 = null;
        this.A00 = 0L;
        this.A01 = null;
    }

    public /* synthetic */ SignalResult(OdinContext odinContext, String str, String str2, String str3, Map map, Map map2, Map map3, Map map4, int i, long j) {
        this.A03 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A04 = null;
        } else {
            this.A04 = str2;
        }
        if ((i & 4) == 0) {
            this.A06 = 04R.A0G();
        } else {
            this.A06 = map;
        }
        if ((i & 8) == 0) {
            this.A05 = 04R.A0G();
        } else {
            this.A05 = map2;
        }
        if ((i & 16) == 0) {
            this.A08 = 04R.A0G();
        } else {
            this.A08 = map3;
        }
        if ((i & 32) == 0) {
            this.A07 = 04R.A0G();
        } else {
            this.A07 = map4;
        }
        if ((i & 64) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str3;
        }
        if ((i & 128) == 0) {
            this.A00 = 0L;
        } else {
            this.A00 = j;
        }
        if ((i & 256) == 0) {
            this.A01 = null;
        } else {
            this.A01 = odinContext;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SignalResult)) {
                return false;
            }
            SignalResult signalResult = (SignalResult) obj;
            if (!11T.A0O(this.A03, signalResult.A03) || !11T.A0O(this.A04, signalResult.A04) || !11T.A0O(this.A06, signalResult.A06) || !11T.A0O(this.A05, signalResult.A05) || !11T.A0O(this.A08, signalResult.A08) || !11T.A0O(this.A07, signalResult.A07) || !11T.A0O(this.A02, signalResult.A02) || this.A00 != signalResult.A00 || !11T.A0O(this.A01, signalResult.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A00, (AnonymousClass002.A05(this.A07, AnonymousClass002.A05(this.A08, AnonymousClass002.A05(this.A05, AnonymousClass002.A05(this.A06, (4YV.A02(this.A03) + 1BL.A05(this.A04)) * 31)))) + 1BL.A05(this.A02)) * 31) + 4YU.A03(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        4YU.A1S("(id:", this.A03, A0k);
        Map map = this.A06;
        if (AbF.A1b(map)) {
            A0k.append(AnonymousClass001.A0Z(map, ",L: ", AnonymousClass001.A0k()));
        }
        Map map2 = this.A05;
        if (AbF.A1b(map2)) {
            A0k.append(AnonymousClass001.A0Z(map2, ",F: ", AnonymousClass001.A0k()));
        }
        Map map3 = this.A08;
        if (AbF.A1b(map3)) {
            A0k.append(AnonymousClass001.A0Z(map3, ",S: ", AnonymousClass001.A0k()));
        }
        Map map4 = this.A07;
        if (AbF.A1b(map4)) {
            A0k.append(AnonymousClass001.A0Z(map4, ",SL: ", AnonymousClass001.A0k()));
        }
        String A0d = AnonymousClass001.A0d(")", A0k);
        11T.A0A(A0d);
        return A0d;
    }
}
