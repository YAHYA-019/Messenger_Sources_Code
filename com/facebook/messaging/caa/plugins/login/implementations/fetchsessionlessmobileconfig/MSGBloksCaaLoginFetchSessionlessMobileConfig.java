package com.facebook.messaging.caa.plugins.login.implementations.fetchsessionlessmobileconfig;

import X.0S2;
import X.1BK;
import X.1Bn;
import X.1Br;
import X.1CE;
import X.C00i;
import X.C00o;
import X.C05924fb;
import X.C3TJ;
import X.CME;
import X.DKc;
import X.FEK;
import X.FGb;
import X.FHh;
import X.FyG;
import X.GJj;

/* loaded from: MSGBloksCaaLoginFetchSessionlessMobileConfig.class */
public final class MSGBloksCaaLoginFetchSessionlessMobileConfig {
    public static final Object A00(FHh fHh, DKc dKc) {
        GJj gJj = ((FGb) dKc.A01(1)).A00;
        GJj gJj2 = ((FGb) dKc.A01(2)).A00;
        FyG fyG = fHh.A03;
        if (fyG == null || fyG.A00 == null) {
            throw 1BK.A0h();
        }
        CME cme = (CME) 1Bn.A0A(83236);
        C05924fb c05924fb = new C05924fb();
        c05924fb.A02 = 0S2.A0C;
        c05924fb.A03 = true;
        c05924fb.A00 = 5000;
        C00i c00i = cme.A03.A00;
        if (!((1CE) c00i.get()).AvS().updateConfigs(c05924fb)) {
            FEK.A00(fHh, DKc.A01, gJj2);
            return null;
        }
        CME.A05.set(CME.A00(cme));
        C00o c00o = ((C3TJ) 1Br.A0B(cme.A04)).A00;
        if (c00o != null) {
            c00o.removeAllOverrides();
        }
        ((1CE) c00i.get()).AvS().clearOverrides();
        FEK.A00(fHh, DKc.A01, gJj);
        return null;
    }
}
