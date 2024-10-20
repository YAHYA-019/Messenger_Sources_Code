package com.facebook.messaging.threadview.plugins.banner.stax.datafetch.spec;

import X.11T;
import X.1Bn;
import X.2S4;
import X.4YT;
import X.5Tn;
import X.5iJ;
import X.5iK;
import X.5iN;
import X.5iR;
import X.63D;
import X.7RM;
import X.7zQ;
import X.7zT;
import X.AnonymousClass001;
import X.BJO;
import X.C5js;
import X.C7gx;
import X.C7w0;
import X.InterfaceC07464jy;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadViewBannerDataFetch.class */
public final class ThreadViewBannerDataFetch extends 5iK {
    public ViewerContext A00;
    public 2S4 A01;
    public ThreadKey A02;
    public 63D A03;
    public C7gx A04;
    public 7RM A05;
    public 5iJ A06;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.messaging.threadview.plugins.banner.stax.datafetch.spec.ThreadViewBannerDataFetch, java.lang.Object] */
    public static ThreadViewBannerDataFetch create(5iJ r301, 7RM r302) {
        ?? obj = new Object();
        obj.A06 = r301;
        obj.A03 = r302.A03;
        obj.A04 = r302.A04;
        obj.A02 = r302.A02;
        obj.A01 = r302.A01;
        obj.A00 = r302.A00;
        obj.A05 = r302;
        return obj;
    }

    public 5Tn A00() {
        5iJ r0 = this.A06;
        ViewerContext viewerContext = this.A00;
        ThreadKey threadKey = this.A02;
        C7gx c7gx = this.A04;
        63D r02 = this.A03;
        2S4 r03 = this.A01;
        7zT.A1S(r0, viewerContext, threadKey);
        FbUserSession A08 = 7zQ.A0N().A08(viewerContext);
        1Bn.A0A(147758);
        C7w0 c7w0 = (C7w0) 1Bn.A0A(67873);
        if (c7gx == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        if (r02 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        if (r03 == null) {
            throw AnonymousClass001.A0L("Required value was null.");
        }
        BJO bjo = new BJO(r0.A00, A08, r03, threadKey, r02, c7gx);
        11T.A0I(C5js.A00, 4YT.A00(415));
        InterfaceC07464jy interfaceC07464jy = C5js.A01;
        11T.A0I(interfaceC07464jy, 4YT.A00(416));
        11T.A0F(c7w0, 0);
        return 5iN.A00(r0, new 5iR(c7w0, interfaceC07464jy, bjo));
    }
}
