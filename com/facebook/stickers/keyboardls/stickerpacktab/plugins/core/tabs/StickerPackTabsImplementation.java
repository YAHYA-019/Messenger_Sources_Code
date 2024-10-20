package com.facebook.stickers.keyboardls.stickerpacktab.plugins.core.tabs;

import X.09K;
import X.0S2;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BO;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Du;
import X.1Fw;
import X.1He;
import X.1IB;
import X.1Kd;
import X.1Lo;
import X.2TV;
import X.2eS;
import X.4YT;
import X.4YU;
import X.5Qx;
import X.69H;
import X.7zL;
import X.7zM;
import X.AbL;
import X.C00i;
import X.C1F6;
import X.C2081Db6;
import X.C5es;
import X.C6xd;
import X.C7lo;
import X.Eg6;
import X.Eje;
import X.Fcw;
import X.H0K;
import X.Ho1;
import X.Hrk;
import X.IQN;
import X.JMq;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.service.models.FetchStickerPacksParams;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: StickerPackTabsImplementation.class */
public final class StickerPackTabsImplementation {
    public 1BY A00;
    public final C00i A03 = 1BV.A01((1BY) null, 100220);
    public final C00i A02 = 1BV.A01((1BY) null, 1104);
    public final C00i A01 = 1BV.A01((1BY) null, 100219);

    public StickerPackTabsImplementation(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public static Hrk A00(Context context, FbUserSession fbUserSession, JMq jMq, StickerPackTabsImplementation stickerPackTabsImplementation) {
        boolean A1b;
        ImmutableList.Builder A0h = 4YU.A0h();
        69H r0 = (69H) 1Lo.A04((Context) null, fbUserSession, stickerPackTabsImplementation.A00, 49969);
        5Qx r02 = 5Qx.A03;
        C6xd c6xd = C6xd.A06;
        synchronized (r0) {
            A1b = 7zM.A1b(r0.A04(c6xd, r02));
        }
        if (A1b) {
            1Du it = r0.A04(c6xd, r02).iterator();
            while (it.hasNext()) {
                StickerPack stickerPack = (StickerPack) it.next();
                C1F6 c1f6 = (C1F6) stickerPackTabsImplementation.A02.get();
                String str = stickerPack.A0B;
                ImmutableList immutableList = stickerPack.A08;
                String str2 = stickerPack.A0C;
                str2.getClass();
                C5es c5es = C5es.A0D;
                Eg6 eg6 = (Eg6) stickerPackTabsImplementation.A03.get();
                Uri uri = stickerPack.A05;
                Uri uri2 = null;
                if (uri != null) {
                    long A08 = 1BL.A08(eg6.A00);
                    String queryParameter = uri.getQueryParameter("oe");
                    List<String> pathSegments = uri.getPathSegments();
                    if (A08 < Long.valueOf((09K.A01(pathSegments) || !pathSegments.contains("v") || queryParameter == null) ? 0L : Long.parseLong(queryParameter, 16) * 1000).longValue()) {
                        uri2 = uri;
                    }
                }
                Context A01 = FbInjector.A01();
                AbL.A0y(c1f6);
                try {
                    H0K h0k = new H0K(context, uri2, jMq, c5es, immutableList, str, str2);
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    A0h.m11011add((Object) h0k);
                } catch (Throwable th) {
                    1Bn.A0K();
                    FbInjector.A04(A01);
                    throw th;
                }
            }
        }
        Ho1 ho1 = new Ho1();
        ho1.A00(A0h.build());
        ho1.A00 = 1;
        return new Hrk(ho1);
    }

    public static void A01(JMq jMq, StickerPackTabsImplementation stickerPackTabsImplementation) {
        C00i c00i = stickerPackTabsImplementation.A01;
        ((Fcw) c00i.get()).A01 = new IQN(jMq, stickerPackTabsImplementation, 1);
        Fcw fcw = (Fcw) c00i.get();
        Eje eje = new Eje(1He.A04, C6xd.A06);
        Bundle A05 = 1BK.A05();
        A05.putParcelable(4YT.A00(342), new FetchStickerPacksParams(eje.A00, 5Qx.A03, 0S2.A0C, C7lo.A00(eje.A01)));
        try {
            1IB A0M = 4YU.A0M(A05, Fcw.A05, 4YU.A0L(fcw.A03), 1BJ.A00(46), true);
            1BY r0 = fcw.A02;
            C2081Db6 c2081Db6 = new C2081Db6(18, eje, (69H) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 49969), fcw);
            2TV r02 = fcw.A01;
            if (r02 != null) {
                r02.C4n(A0M, eje);
            }
            1Kd.A0D(fcw.A04, c2081Db6, A0M);
            fcw.A00 = new 2eS(c2081Db6, A0M);
        } catch (Exception e) {
            2TV r03 = fcw.A01;
            if (r03 != null) {
                r03.C47(eje, e);
            }
        }
    }
}
