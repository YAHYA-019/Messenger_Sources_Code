package com.facebook.rtc.plugins.calllifecycle.callaudio;

import X.11T;
import X.1BK;
import X.1BL;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Lm;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.GOn;
import X.GOq;
import X.GS1;
import X.HXg;
import X.I29;
import X.J9p;
import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.rsys.call.gen.CallModel;

/* loaded from: CallAudioCallLifecycle.class */
public final class CallAudioCallLifecycle {
    public static final String A0K = 11T.A02(Uri.EMPTY);
    public static final long[] A0L = {0, 800, 1838};
    public boolean A00;
    public final Context A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final HXg A0H;
    public final C01i A0I;
    public final FbUserSession A0J;

    public CallAudioCallLifecycle(Context context, FbUserSession fbUserSession) {
        1BL.A1F(context, fbUserSession);
        this.A01 = context;
        this.A0J = fbUserSession;
        this.A0B = 1Bq.A00(115639);
        this.A06 = GOn.A0Z(context, fbUserSession);
        this.A03 = 1Bq.A00(115668);
        this.A08 = 1BK.A0E();
        this.A04 = 1HG.A00(context, 100191);
        this.A0G = 1HG.A00(context, 100192);
        this.A0F = 1Bu.A00(115602);
        this.A05 = GOn.A0a(context, fbUserSession);
        this.A0A = 1BK.A0C();
        this.A0E = 1Bq.A00(115627);
        this.A0C = GOn.A0U(context, fbUserSession);
        this.A0D = 1Bq.A00(115629);
        this.A02 = 1Bu.A00(115726);
        this.A07 = 1Lm.A00(context, fbUserSession, 85223);
        this.A09 = 1Bq.A00(115601);
        this.A0I = C01g.A00(C03i.A03, new J9p(this, 39));
        this.A0H = new HXg(this);
    }

    public static final void A00(CallAudioCallLifecycle callAudioCallLifecycle) {
        CallModel A01;
        if (I29.A00(callAudioCallLifecycle.A0E)) {
            return;
        }
        boolean z = false;
        if (AnonymousClass001.A1P((GOq.A0s(callAudioCallLifecycle.A06).A02 > 0L ? 1 : (GOq.A0s(callAudioCallLifecycle.A06).A02 == 0L ? 0 : -1))) || (A01 = GS1.A01(callAudioCallLifecycle.A0C)) == null || A01.initialDirection != 1) {
            z = true;
        }
        GOq.A0r(callAudioCallLifecycle.A05).AF6(true, z);
    }
}
