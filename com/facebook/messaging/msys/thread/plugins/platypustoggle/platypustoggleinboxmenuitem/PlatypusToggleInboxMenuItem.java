package com.facebook.messaging.msys.thread.plugins.platypustoggle.platypustoggleinboxmenuitem;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1uZ;
import X.4YU;
import X.4YV;
import X.AbF;
import X.C00i;
import X.C1u3;
import X.C77;
import X.C9T;
import X.CQE;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: PlatypusToggleInboxMenuItem.class */
public final class PlatypusToggleInboxMenuItem {
    public final Context A00;
    public final 1Br A01;
    public final ThreadSummary A02;

    public PlatypusToggleInboxMenuItem(Context context, ThreadSummary threadSummary) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A02 = threadSummary;
        this.A01 = 1Bq.A00(82532);
    }

    public final C9T A00() {
        C00i c00i = this.A01.A00;
        C77 c77 = (C77) c00i.get();
        ThreadKey A0f = AbF.A0f(this.A02);
        Resources A09 = 4YV.A09(c77.A01);
        int i = 2131963412;
        if (((1uZ) 1Br.A0B(c77.A00)).A07(A0f)) {
            i = 2131963410;
        }
        String A0t = 4YU.A0t(A09, i);
        CQE cqe = new CQE();
        cqe.A00 = 47;
        cqe.A07(A0t);
        cqe.A08(A0t);
        cqe.A06(((1uZ) 1Br.A0B(((C77) c00i.get()).A00)).A07(A0f) ? C1u3.A1x : C1u3.A1V);
        return CQE.A01(cqe, "platypus toggle");
    }
}
