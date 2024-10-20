package com.facebook.messaging.caa.plugins.registration.implementations.getgooglesafetynettoken;

import X.0fH;
import X.11T;
import X.1Bn;
import X.1Br;
import X.1Bu;
import X.1De;
import X.28M;
import X.4FE;
import X.4YU;
import X.AnonymousClass001;
import X.C03r;
import X.C4Ez;
import X.C4F7;
import X.DKC;
import X.DKc;
import X.FGb;
import X.FHh;
import X.GJj;
import X.HOk;
import X.HZq;
import X.K2L;
import X.K2U;
import X.K7p;
import X.Kas;
import X.LcK;
import X.Lcp;
import X.Ldz;
import X.LeA;
import X.MCt;
import X.R3U;
import X.RQY;
import android.content.Context;
import android.util.Base64;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: MSGBloksCaaGetGoogleSafetyNetTokenImplementation.class */
public final class MSGBloksCaaGetGoogleSafetyNetTokenImplementation {
    public final 1Br A00;
    public final 1De A01;

    public MSGBloksCaaGetGoogleSafetyNetTokenImplementation(1De r302) {
        this.A01 = r302;
        this.A00 = 1Bu.A03(r302.A00, 114800);
    }

    /* JADX WARN: Type inference failed for: r0v70, types: [X.KSY, java.lang.Object] */
    public final Object A00(FHh fHh, DKc dKc) {
        String str;
        byte[] bArr;
        List list = dKc.A00;
        if (list.size() == 0) {
            return null;
        }
        GJj A01 = FGb.A01(list.get(0));
        if (A01 == null) {
            throw AnonymousClass001.A0N("GetGoogleSafetyNetToken requires callback argument");
        }
        list.get(1);
        HZq hZq = (HZq) 1Bn.A0E((Context) null, ((HOk) 1Br.A0B(this.A00)).A00.A00, 114805);
        RQY rqy = new RQY(fHh, A01);
        Context context = hZq.A00;
        long A06 = 4YU.A06(System.currentTimeMillis());
        str = "unknown";
        StringBuilder A0n = AnonymousClass001.A0n(str);
        A0n.append('|');
        A0n.append(A06);
        String A0g = AnonymousClass001.A0g(A0n, '|');
        byte[] bArr2 = new byte[24];
        new SecureRandom().nextBytes(bArr2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(DKC.A1a(A0g, C03r.A05));
            byteArrayOutputStream.write(bArr2);
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            bArr = null;
        }
        11T.A0D(context);
        11T.A0F(context, 0);
        str = bArr != null ? Base64.encodeToString(bArr, 2) : "unknown";
        int A04 = GoogleApiAvailability.A00.A04(context, 12451000);
        if (A04 != 0) {
            AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
            String A00 = ConnectionResult.A00(A04);
            11T.A0A(A00);
            0fH.A07(R3U.class, A00, "Google play unavailable. Error is %s");
            11T.A0D(str);
            11T.A0F(str, 1);
            rqy.A00(str);
            return null;
        }
        System.currentTimeMillis();
        11T.A0D(str);
        K2L k2l = new K2L(context);
        11T.A0D(bArr);
        28M r0 = k2l.A05;
        K2U k7p = new K7p(r0, bArr);
        r0.A06(k7p);
        Lcp lcp = new Lcp(new Object());
        MCt mCt = Kas.A00;
        4FE r02 = new 4FE();
        k7p.A03(new LcK(k7p, lcp, mCt, r02));
        C4Ez c4Ez = r02.A00;
        LeA leA = new LeA(rqy, str);
        Executor executor = C4F7.A00;
        c4Ez.A03(leA, executor);
        c4Ez.A0A(new Ldz(rqy, str), executor);
        return null;
    }
}
