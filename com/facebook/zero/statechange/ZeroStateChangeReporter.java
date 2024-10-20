package com.facebook.zero.statechange;

import X.04J;
import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1QE;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.2BX;
import X.2C8;
import X.AnonymousClass001;
import X.C07294jf;
import X.C15h;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: ZeroStateChangeReporter.class */
public final class ZeroStateChangeReporter {
    public C07294jf A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final C15h A04;
    public final C15h A05;
    public final Context A06;
    public final Object A07;
    public volatile boolean A08;

    public ZeroStateChangeReporter() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A06 = A00;
        this.A02 = 1HG.A00(A00, 65728);
        this.A01 = 1Bu.A00(33101);
        this.A03 = 1Bq.A00(16634);
        this.A04 = new C15h() { // from class: X.4jc
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                return 1Bn.A0A(98484);
            }
        };
        this.A05 = new C15h() { // from class: X.4jd
            @Override // X.C15h
            public /* bridge */ /* synthetic */ Object get() {
                return 1Bn.A0A(33096);
            }
        };
        this.A07 = new Object();
    }

    public static final void A00(ZeroStateChangeReporter zeroStateChangeReporter) {
        try {
            1UG A00 = 1UD.A00((04J) zeroStateChangeReporter.A03.A00.get(), 1ZG.A01, "zero_rating_state_change_fb4a");
            if (A00.isSampled()) {
                synchronized (zeroStateChangeReporter.A07) {
                    1QE A002 = 2C8.A00((String) zeroStateChangeReporter.A04.get());
                    11T.A0A(A002);
                    C07294jf c07294jf = new C07294jf(((2BX) zeroStateChangeReporter.A01.A00.get()).A09(A002), (Boolean) zeroStateChangeReporter.A05.get());
                    if (!c07294jf.equals(zeroStateChangeReporter.A00)) {
                        zeroStateChangeReporter.A00 = c07294jf;
                        A00.A7R("eligibility_hash", c07294jf.A01);
                        A00.A5H("is_dialtone", c07294jf.A00);
                        A00.BZL();
                    }
                }
            }
        } catch (RuntimeException e) {
            0fH.A0N(ZeroStateChangeReporter.class, "Error logging eligibility hash change", e, AnonymousClass001.A1Z());
        }
    }
}
