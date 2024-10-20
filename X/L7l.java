package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: L7l.class */
public final class L7l {
    public final 1Br A05;
    public final 1Br A02 = 1BK.A0C();
    public final 1Br A03 = 1Bq.A00(16766);
    public final 1Br A04 = 1Bq.A00(16973);
    public final 1Br A01 = 1Bu.A00(114751);
    public final 1Br A00 = 1BK.A0D();

    public L7l(Context context) {
        this.A05 = 1Bu.A01(context, 100016);
    }

    public static final void A00(Activity activity, FbUserSession fbUserSession, L7l l7l, boolean z) {
        String A00 = 1BJ.A00(2027);
        C1is c1is = (C1is) 1Br.A0B(l7l.A03);
        if (!z) {
            c1is.A0A(null, null, "webview", null, null);
            ((2Kv) 1Br.A0B(l7l.A04)).A06((Object) null, "webview", A00);
            return;
        }
        c1is.A09(activity, fbUserSession);
        2Kv r0 = (2Kv) 1Br.A0B(l7l.A04);
        if (((1GU) r0.A01.get()).BWu()) {
            2Kv.A00(activity, r0);
        } else {
            ((Handler) r0.A02.get()).post(new SAC(activity, r0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (X.1Br.A07(r301.A02).AZk(36315962827875938L) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(X.L7l r301) {
        /*
            X.5ue r0 = X.C5ub.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto Lc
            X.5ud r0 = X.C5ud.A00
            r302 = r0
        Lc:
            r0 = r302
            boolean r0 = r0.isEnabled()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L35
            r0 = r301
            X.1Br r0 = r0.A02
            r302 = r0
            r0 = r302
            X.2yD r0 = X.1Br.A07(r0)
            r301 = r0
            r0 = 36315962827875938(0x81052d00082662, double:3.029699352769047E-306)
            r304 = r0
            r0 = r301
            r1 = r304
            boolean r0 = r0.AZk(r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L39
        L35:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L39:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L7l.A01(X.L7l):boolean");
    }
}
