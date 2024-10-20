package com.facebook.presence.plugins.status.statussetting;

import X.1BL;
import X.1Bn;
import X.1Br;
import X.1pI;
import X.7zM;
import X.AbG;
import X.AbL;
import X.C1F6;
import X.C8Z;
import X.DFp;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: StatusSetting.class */
public final class StatusSetting {
    public final Context A00;
    public final 1pI A01;
    public final 1Br A02;
    public final DFp A03;
    public final C8Z A04;

    public StatusSetting(Context context, 1pI r303, DFp dFp) {
        1BL.A1H(context, dFp, r303);
        this.A00 = context;
        this.A03 = dFp;
        this.A01 = r303;
        this.A02 = 7zM.A0e(context);
        C1F6 A0F = AbG.A0F(84764);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0F);
        try {
            C8Z c8z = new C8Z(context);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A04 = c8z;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
