package com.facebook.xapp.messaging.clockskew;

import X.1BK;
import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Ni;
import X.6Ds;
import X.C00i;
import X.C02w;
import X.C08564nI;
import X.C0et;
import X.D71;
import android.content.Context;
import android.content.Intent;

/* loaded from: ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration.class */
public final class ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration extends 1Ni {
    public final C00i A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;

    public ClockSkewChecker$ClockSkewCheckerOnInitBroadcastReceiverRegistration() {
        super(1BQ.A02(84726), (C02w) 1Bi.A03(0));
        this.A01 = 1BQ.A02(84726);
        this.A04 = 1BQ.A02(83604);
        this.A00 = 1BV.A00(49258);
        this.A02 = 1BQ.A02(49992);
        this.A03 = 1BQ.A02(33053);
    }

    public /* bridge */ /* synthetic */ void A02(Context context, Intent intent, Object obj) {
        if (this.A04.get() == C0et.A0P) {
            boolean A00 = ((C08564nI) this.A00.get()).A00();
            6Ds r0 = (6Ds) this.A02.get();
            if (A00) {
                r0.A00(0L);
                return;
            }
            long now = r0.A06.now() - r0.A03.now();
            r0.A00(r0.A01 + (now - r0.A00));
            r0.A00 = now;
            1BK.A1E(this.A03).execute(new D71(this));
        }
    }
}
