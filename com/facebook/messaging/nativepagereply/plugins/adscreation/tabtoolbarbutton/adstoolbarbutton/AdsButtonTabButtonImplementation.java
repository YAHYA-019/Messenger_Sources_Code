package com.facebook.messaging.nativepagereply.plugins.adscreation.tabtoolbarbutton.adstoolbarbutton;

import X.0S2;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.C00i;
import X.C2137Deq;
import X.C2iw;
import X.FFk;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: AdsButtonTabButtonImplementation.class */
public final class AdsButtonTabButtonImplementation {
    public C2137Deq A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final C2iw A0A;
    public final MigColorScheme A0B;

    /* JADX WARN: Type inference failed for: r0v30, types: [X.2iw, java.lang.Object] */
    public AdsButtonTabButtonImplementation(Context context) {
        11T.A0F(context, 1);
        this.A01 = context;
        this.A02 = 1Bu.A00(66596);
        this.A03 = 1Bu.A01(context, 99777);
        this.A04 = 1Bu.A01(context, 68282);
        this.A07 = 1Bq.A00(16839);
        this.A08 = 1Bu.A00(68279);
        this.A05 = 1Bq.A00(84491);
        this.A06 = 1BK.A0E();
        this.A09 = 1Bu.A01(context, 85202);
        this.A0B = (MigColorScheme) 1Bn.A0E(context, (1BY) null, 16979);
        this.A0A = new Object();
    }

    public static final boolean A00(FbUserSession fbUserSession, AdsButtonTabButtonImplementation adsButtonTabButtonImplementation, Integer num) {
        C00i c00i = adsButtonTabButtonImplementation.A03.A00;
        FFk fFk = (FFk) c00i.get();
        Context context = adsButtonTabButtonImplementation.A01;
        Integer num2 = 0S2.A00;
        fFk.A03(context, num2);
        FFk.A01(context, fbUserSession, (FFk) c00i.get(), num2, num, (String) null, true);
        return true;
    }
}
