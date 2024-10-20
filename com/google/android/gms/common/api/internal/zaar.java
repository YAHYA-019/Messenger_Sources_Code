package com.google.android.gms.common.api.internal;

import X.0FI;
import X.1BK;
import X.7zL;
import X.K2h;
import X.Lch;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* loaded from: zaar.class */
public final class zaar extends zac {
    public final WeakReference A00;

    public zaar(Lch lch) {
        int A03 = 0FI.A03(-1157827430);
        this.A00 = 7zL.A14(lch);
        0FI.A09(1919574501, A03);
    }

    @Override // com.google.android.gms.signin.internal.zae
    public final void DBZ(zak zakVar) {
        int i;
        int A03 = 0FI.A03(1474510984);
        Lch lch = (Lch) this.A00.get();
        if (lch == null) {
            i = -1937852179;
        } else {
            1BK.A1I(lch.A0D.A06, new K2h(lch, lch, zakVar), 1);
            i = 579599609;
        }
        0FI.A09(i, A03);
    }
}
