package com.facebook.bloks.messenger.hosting.screens;

import X.0Pz;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1Bi;
import X.1Ew;
import X.2Jd;
import X.2Jf;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.5iL;
import X.5iN;
import X.AbF;
import X.AnonymousClass001;
import X.C30G;
import X.C3tA;
import X.DKC;
import X.DKE;
import X.EAC;
import X.F9Q;
import X.FIV;
import X.Fs6;
import X.GEs;
import X.Jvn;
import java.util.HashMap;

/* loaded from: MSGBloksScreenDataFetch.class */
public final class MSGBloksScreenDataFetch extends 5iK {
    public long A00;
    public String A01;
    public HashMap A02;
    public EAC A03;
    public 5iJ A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.bloks.messenger.hosting.screens.MSGBloksScreenDataFetch, java.lang.Object] */
    public static MSGBloksScreenDataFetch create(5iJ r301, EAC eac) {
        ?? obj = new Object();
        obj.A04 = r301;
        obj.A01 = eac.A01;
        obj.A00 = eac.A00;
        obj.A02 = eac.A03;
        obj.A03 = eac;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A04;
        String str = this.A01;
        HashMap hashMap = this.A02;
        long j = this.A00;
        11T.A0F(r0, 0);
        if (str == null || str.length() == 0) {
            throw AnonymousClass001.A0L("AppId cannot be unavailable");
        }
        boolean BNC = ((1Ew) 1Bi.A03(65755)).BNC();
        2Jd A0Q = DKC.A0Q();
        A0Q.A09("app_id", str);
        A0Q.A09("bloks_versioning_id", 1BJ.A00(11));
        if (hashMap != null) {
            A0Q.A09("params", FIV.A01(hashMap));
        }
        C30G A0H = AbF.A0H(5);
        DKC.A1S(A0Q, A0H, "params");
        DKC.A1S(C3tA.A00(), A0H, "nt_context");
        F9Q f9q = new F9Q(A0H, (GEs) null);
        f9q.A02(j);
        f9q.A00 = j;
        f9q.A0B = false;
        if (!BNC) {
            f9q.A07 = 0S2.A01;
        }
        f9q.A05 = DKE.A0Q();
        f9q.A09 = 0Pz.A0Y(((2Jf) A0H).A08, str, '-');
        return Jvn.A00(5iN.A02(r0, 5iL.A01(r0, f9q), "screen_query"), r0, new Fs6(r0, 0));
    }
}
