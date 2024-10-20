package com.facebook.messaging.msys.thread.plugins.platypustoggle.platypustogglemenuitem;

import X.1Bq;
import X.1Br;
import X.1uZ;
import X.7zR;
import X.BNV;
import X.C77;
import X.C7I;
import X.DHc;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PlatypusToggleMenuItem.class */
public final class PlatypusToggleMenuItem {
    public final 1Br A00;
    public final Context A01;
    public final ThreadKey A02;
    public final DHc A03;

    public PlatypusToggleMenuItem(Context context, ThreadKey threadKey, DHc dHc) {
        7zR.A1N(context, dHc);
        this.A01 = context;
        this.A02 = threadKey;
        this.A03 = dHc;
        this.A00 = 1Bq.A00(82532);
    }

    public final C7I A00() {
        int i = 2131963412;
        if (((1uZ) 1Br.A0B(((C77) 1Br.A0B(this.A00)).A00)).A07(this.A02)) {
            i = 2131963410;
        }
        return new C7I(BNV.A1q, i);
    }

    public final void A01() {
        ((C77) 1Br.A0B(this.A00)).A00(this.A01, this.A02, true);
        this.A03.C3T();
    }
}
