package com.facebook.messaging.sup.plugins.videocalling.impl;

import X.1BP;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.C01g;
import X.C01i;
import X.C03i;
import X.DCz;
import X.HG8;
import X.Hn2;
import X.IxI;
import X.JBa;
import X.JNL;
import X.T6G;
import android.os.Handler;
import com.facebook.inject.FbInjector;

/* loaded from: SUPVideoCallingImpl.class */
public final class SUPVideoCallingImpl {
    public static JNL A06;
    public static HG8 A07;
    public static boolean A08;
    public static final 1BP A0A = FbInjector.A00;
    public static final 1Br A09 = 1Bq.A00(115102);
    public final 1Br A02 = 1Bq.A00(116401);
    public final 1Br A03 = 1Bq.A00(116389);
    public final 1Br A01 = 1Bu.A00(49359);
    public final 1Br A00 = 1Bu.A00(50069);
    public final 1Br A04 = 1Bu.A00(16430);
    public final C01i A05 = C01g.A00(C03i.A02, new DCz(this, 18));

    public final void A00() {
        if (((Hn2) 1Br.A0B(this.A03)).A00 != null) {
            T6G.A02(false);
            A02();
        }
    }

    public final void A01() {
        if (((Hn2) 1Br.A0B(this.A03)).A00 != null) {
            T6G.A02(true);
            A02();
        }
    }

    public final void A02() {
        JBa jBa = JBa.A00;
        HG8 hg8 = A07;
        if (hg8 != null) {
            ((Handler) 1Br.A0B(this.A04)).post(new IxI(hg8, jBa));
        }
    }
}
