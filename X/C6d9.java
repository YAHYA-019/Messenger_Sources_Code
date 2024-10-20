package X;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.video.plugins.views.VideoPluginInnerContainer;

/* renamed from: X.6d9, reason: invalid class name */
/* loaded from: 6d9.class */
public final class C6d9 extends 6dA {
    public String A00;
    public boolean A01;
    public final View A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final VideoPluginInnerContainer A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C6d9(Context context, FbUserSession fbUserSession) {
        super(context, null, 0);
        1BK.A1K(context, 1, fbUserSession);
        this.A08 = (VideoPluginInnerContainer) C09s.A01(this, 2131368334);
        this.A03 = fbUserSession;
        this.A06 = 1Bq.A00(16520);
        this.A04 = 1Bq.A00(115528);
        this.A05 = 1BK.A0C();
        this.A07 = 1Bu.A00(16430);
        A0h(new GPl(this, 13));
        this.A02 = C09s.A01(this, 2131362345);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A03() {
        if (getRootView() == null || !1Br.A07(this.A05).AZk(2342157400084848551L)) {
            return;
        }
        ((Handler) 1Br.A0B(this.A07)).post(new IqE(getRootView().getContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0M() {
        A03();
        super/*com.facebook.video.plugins.common.VideoPlugin*/.A0M();
        this.A01 = false;
        this.A00 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0e(X.6TI r302, boolean r303) {
        /*
            r301 = this;
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            r0.A03()
            r0 = r302
            com.facebook.video.engine.api.VideoPlayerParams r0 = r0.A03
            java.lang.String r0 = r0.A0k
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2a
            r0 = r305
            int r0 = r0.length()
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L2c
        L2a:
            r0 = 1
            r304 = r0
        L2c:
            r0 = r304
            r1 = 1
            r0 = r0 ^ r1
            r304 = r0
            r0 = r301
            r1 = r304
            r0.A01 = r1
            r0 = r301
            r1 = r302
            r2 = r303
            super/*com.facebook.video.plugins.common.VideoPlugin*/.A0e(r1, r2)
            java.lang.Integer r0 = X.0S2.A01
            r305 = r0
            r0 = 1
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r1 = r0
            r2 = 0
            r3 = r305
            r1[r2] = r3
            r305 = r0
            r0 = r301
            r1 = r305
            r0.A0o(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6d9.A0e(X.6TI, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0l() {
        A0n(-1.0d);
        super/*com.facebook.video.plugins.common.VideoPlugin*/.A0l();
    }
}
