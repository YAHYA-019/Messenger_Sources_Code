package com.facebook.messaging.messageexpiration.plugins.lowdiskspacebanner;

import X.11T;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.2Ws;
import X.3UZ;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C2xn;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: LowDiskSpaceBanner.class */
public final class LowDiskSpaceBanner {
    public final Context A00;
    public final Observer A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2Ws A05;
    public final C01i A06;
    public final C01i A07;

    public LowDiskSpaceBanner(Context context, FbUserSession fbUserSession, 2Ws r304) {
        11T.A0F(context, 1);
        11T.A0F(r304, 2);
        11T.A0F(fbUserSession, 3);
        this.A00 = context;
        this.A05 = r304;
        this.A02 = fbUserSession;
        this.A07 = C01g.A01(new C2xn(this, 20));
        this.A03 = 1Lm.A00(context, fbUserSession, 67215);
        this.A04 = 1Bq.A00(6);
        this.A01 = new 3UZ(this, 8);
        this.A06 = C01g.A00(C03i.A02, new C2xn(this, 19));
    }
}
