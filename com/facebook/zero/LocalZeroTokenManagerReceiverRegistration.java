package com.facebook.zero;

import X.1BJ;
import X.1BQ;
import X.1Bi;
import X.1Ni;
import X.1Od;
import X.2BR;
import X.2Bx;
import X.C00i;
import X.C02w;
import X.DKB;
import android.content.Context;
import android.content.Intent;

/* loaded from: LocalZeroTokenManagerReceiverRegistration.class */
public final class LocalZeroTokenManagerReceiverRegistration extends 1Ni {
    public boolean A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;

    public LocalZeroTokenManagerReceiverRegistration() {
        super(new 1BQ(16923), (C02w) 1Bi.A03(0));
        this.A02 = new 1BQ(16616);
        this.A03 = new 1BQ(16385);
        this.A01 = new 1BQ(16923);
        this.A04 = new 1BQ(16930);
        this.A00 = false;
    }

    public /* bridge */ /* synthetic */ void A02(Context context, Intent intent, Object obj) {
        2BR r0 = (2BR) obj;
        if (intent != null) {
            String action = intent.getAction();
            if ("com.facebook.orca.ACTION_NETWORK_CONNECTIVITY_CHANGED".equals(action)) {
                if (!((1Od) this.A02.get()).A0E()) {
                    ((2Bx) this.A04.get()).A01("network_changed_in_foreground");
                    return;
                } else {
                    synchronized (this) {
                        this.A00 = true;
                    }
                    return;
                }
            }
            if (1BJ.A00(1185).equals(action)) {
                String stringExtra = intent.getStringExtra(DKB.A00(61));
                if (stringExtra == null) {
                    stringExtra = 1BJ.A00(2110);
                }
                r0.A0J(stringExtra);
            }
        }
    }
}
