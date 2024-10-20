package com.facebook.messaging.threadview.plugins.banner.stax.lifecycle;

import X.1BL;
import X.2S4;
import X.63D;
import X.6Fz;
import X.6G3;
import X.7zT;
import X.AbstractC07504k2;
import X.C01i;
import X.C6uv;
import X.C7gx;
import X.DCy;
import android.content.Context;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadViewBannerLifecycleImplementation.class */
public final class ThreadViewBannerLifecycleImplementation {
    public ViewGroup A00;
    public ThreadKey A01;
    public C6uv A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 2S4 A05;
    public final 63D A06;
    public final 6G3 A07;
    public final 6Fz A08;
    public final C7gx A09;
    public final C01i A0A;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.4k2, X.7gx] */
    public ThreadViewBannerLifecycleImplementation(Context context, FbUserSession fbUserSession, 2S4 r304, 63D r305, 6G3 r306, 6Fz r307) {
        7zT.A1W(context, r306, r305, r304);
        1BL.A1G(r307, fbUserSession);
        this.A03 = context;
        this.A07 = r306;
        this.A06 = r305;
        this.A05 = r304;
        this.A08 = r307;
        this.A04 = fbUserSession;
        this.A09 = new AbstractC07504k2();
        this.A0A = DCy.A00(this, 10);
    }
}
