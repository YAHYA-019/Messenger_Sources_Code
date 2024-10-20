package com.facebook.messaging.msys.thread.embodiment.datafetch;

import X.11T;
import X.1BK;
import X.1BL;
import X.1BV;
import X.1BY;
import X.1Bn;
import X.1Lm;
import X.1Lo;
import X.2S4;
import X.4YT;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.5iN;
import X.5iR;
import X.7Ds;
import X.7zL;
import X.7zQ;
import X.A3H;
import X.C07444jw;
import X.C5jh;
import X.C5js;
import X.C5jx;
import X.C6rr;
import X.C93c;
import X.InterfaceC07434jv;
import X.InterfaceC07464jy;
import X.InterfaceC07514k3;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: AIBotEmbodimentDataFetch.class */
public final class AIBotEmbodimentDataFetch extends 5iK {
    public Bundle A00;
    public ViewerContext A01;
    public 2S4 A02;
    public 7Ds A03;
    public 5iJ A04;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.msys.thread.embodiment.datafetch.AIBotEmbodimentDataFetch, java.lang.Object] */
    public static AIBotEmbodimentDataFetch create(5iJ r301, 7Ds r302) {
        ?? obj = new Object();
        obj.A04 = r301;
        obj.A00 = r302.A00;
        obj.A02 = r302.A02;
        obj.A01 = r302.A01;
        obj.A03 = r302;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A04;
        Bundle bundle = this.A00;
        ViewerContext viewerContext = this.A01;
        2S4 r02 = this.A02;
        boolean A1W = 1BL.A1W(r0, bundle);
        1BK.A1J(viewerContext, 2, r02);
        FbUserSession A08 = 7zQ.A0N().A08(viewerContext);
        Context context = r0.A00;
        11T.A0A(context);
        C6rr c6rr = (C6rr) 1Lm.A05(context, A08, 67330);
        1Bn.A0A(67331);
        11T.A0F(A08, 2);
        1BV A0R = 7zL.A0R(context, 147662);
        C5jh c5jh = (C5jh) 1Lo.A04(context, A08, (1BY) null, 99664);
        Parcelable parcelable = bundle.getParcelable("thread_key");
        if (parcelable == null) {
            throw 1BK.A0h();
        }
        ThreadKey threadKey = (ThreadKey) parcelable;
        5iN A00 = 5iN.A00(r0, 5iR.A02.A00(bundle, c6rr));
        Parcelable parcelable2 = bundle.getParcelable("thread_key");
        if (parcelable2 == null) {
            throw 1BK.A0h();
        }
        long j = ((ThreadKey) parcelable2).A02;
        A0R.get();
        C93c c93c = new C93c(context, A08, j);
        InterfaceC07434jv interfaceC07434jv = C5js.A00;
        String A002 = 4YT.A00(415);
        11T.A0I(interfaceC07434jv, A002);
        InterfaceC07464jy interfaceC07464jy = C5js.A01;
        String A003 = 4YT.A00(416);
        11T.A0I(interfaceC07464jy, A003);
        InterfaceC07434jv interfaceC07434jv2 = (InterfaceC07434jv) 1Bn.A0E(context, (1BY) null, 68705);
        11T.A0A(interfaceC07434jv2);
        C07444jw c07444jw = C6rr.A00;
        11T.A0I(c07444jw, 4YT.A00(1347));
        11T.A0A(c07444jw);
        5iN A004 = 5iN.A00(r0, new 5iR(interfaceC07434jv2, c07444jw, c93c));
        InterfaceC07514k3 AgW = c5jh.AgW(threadKey);
        11T.A0I(interfaceC07434jv, A002);
        11T.A0I(interfaceC07464jy, A003);
        InterfaceC07434jv AVj = c5jh.AVj(threadKey);
        11T.A0A(AVj);
        return C5jx.A00(new A3H(r02, r0), A00, A004, 5iN.A00(r0, new 5iR(AVj, c5jh.Ad8(threadKey), AgW)), null, null, null, null, r0, false, false, A1W, A1W, A1W);
    }
}
