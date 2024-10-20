package com.facebook.messaging.messageexpiration.plugins.ebrestoremewarningbanner;

import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Lm;
import X.2Ws;
import X.AQr;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C9qq;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: EbRestoreMeWarningBanner.class */
public final class EbRestoreMeWarningBanner {
    public final Context A00;
    public final Observer A01;
    public final FbUserSession A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2Ws A05;
    public final C01i A06;
    public final C01i A07;

    public EbRestoreMeWarningBanner(Context context, FbUserSession fbUserSession, 2Ws r304) {
        1BL.A1H(context, r304, fbUserSession);
        this.A00 = context;
        this.A05 = r304;
        this.A02 = fbUserSession;
        this.A04 = 1Bq.A00(66572);
        this.A07 = C01g.A01(new AQr(this, 49));
        this.A03 = 1Lm.A00(context, fbUserSession, 67213);
        this.A01 = new C9qq(this, 71);
        this.A06 = AQr.A01(this, C03i.A02, 48);
    }
}
