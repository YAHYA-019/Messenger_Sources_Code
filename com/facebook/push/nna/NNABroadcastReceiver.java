package com.facebook.push.nna;

import X.0Iz;
import X.0LS;
import X.0fH;
import X.1BY;
import X.1Bn;
import X.C01q;
import X.C0hq;
import X.Heg;
import X.RRc;
import android.content.Context;
import android.content.Intent;

/* loaded from: NNABroadcastReceiver.class */
public class NNABroadcastReceiver extends C0hq {
    public Heg A00;

    public void A02(Context context, Intent intent, C01q c01q) {
        0fH.A07(NNABroadcastReceiver.class, intent.getAction(), "received intent with action: %s");
        Heg heg = (Heg) 1Bn.A0E(context, (1BY) null, 115071);
        this.A00 = heg;
        RRc rRc = heg.A02.A00;
        synchronized (rRc) {
            try {
                int i = rRc.A01;
                rRc.A01 = i + 1;
                if (i == 0) {
                    rRc.A00++;
                    if (!rRc.A05) {
                        rRc.A02 = rRc.A09.A01.now();
                    }
                    rRc.A05 = true;
                }
                0Iz.A00(rRc.A07);
            } finally {
            }
        }
        try {
            Context context2 = heg.A01;
            intent.setClass(context2, NNAService.class);
            if (0LS.A00(context2, intent) == null) {
            }
            c01q.setResult(-1, null, null);
        } finally {
            rRc.A00();
            0fH.A0E(Heg.class, "Failed to start service");
        }
    }
}
