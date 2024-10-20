package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Set;

/* renamed from: X.9iA, reason: invalid class name */
/* loaded from: 9iA.class */
public final class C9iA {
    public C3RG A00;
    public C96q A01;
    public C1wv A02;
    public C9c4 A03;
    public C15t A04;
    public C15t A05;
    public final FbUserSession A06;
    public final 1De A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 1Br A0K;
    public final 1Br A0L;
    public final 1Br A0M;
    public final Set A0N;
    public final Set A0O;
    public final C4G7 A0P;
    public final 0zV A0Q;
    public final 0Xs A0R;
    public final 0Xs A0S;
    public final 0Xs A0T;
    public final 0Xs A0U;

    public C9iA(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A07 = r303;
        this.A06 = fbUserSession;
        this.A0C = 7zM.A0W();
        this.A0B = 1Bq.A00(65999);
        this.A0N = 02H.A02(new C1wj[]{C1wj.A06, C1wj.A04, C1wj.A03});
        C8ti c8ti = C8ti.A00;
        C8tm c8tm = C8tm.A00;
        C8tk c8tk = C8tk.A00;
        this.A0O = 02H.A02(new 99Z[]{c8ti, c8tm, c8tk, C8tl.A00, C8tn.A00});
        1BY r0 = r303.A00;
        this.A0A = 1Lm.A03(fbUserSession, r0, 16874);
        this.A0K = 7zM.A0M();
        this.A0E = 1Bu.A03(r0, 100011);
        this.A0J = 7zM.A0S();
        this.A0M = 1Bq.A00(49709);
        this.A09 = 1Bq.A00(68790);
        this.A0L = 1Bq.A00(68796);
        this.A08 = 1Bu.A03(r0, 67246);
        this.A0F = 1Bq.A00(66259);
        this.A0H = 1Bu.A03(r0, 67219);
        this.A0D = 1Lm.A03(fbUserSession, r0, 67215);
        this.A0G = 1Lm.A03(fbUserSession, r0, 67217);
        this.A0I = 1Bu.A03(r0, 147870);
        C4G6 c4g6 = new C4G6(0);
        this.A0P = c4g6;
        this.A0Q = 0Jq.A03(c4g6);
        this.A0T = 0Du.A00(Boolean.valueOf(((C2cr) 1Br.A0B(this.A0H)).A07()));
        this.A0U = 0Du.A00(c8tk);
        this.A0S = 0Du.A00((Object) null);
        this.A0R = 0Du.A00((Object) null);
    }

    public static final boolean A00(C96p c96p, 99P r302) {
        if (r302 instanceof C8sp) {
            return ((C8sp) r302).A00.contains(c96p);
        }
        return false;
    }

    public final void A01(Context context, FbUserSession fbUserSession) {
        boolean A1X = 7zP.A1X(fbUserSession);
        1Br A00 = 1Lm.A00(context, fbUserSession, 67220);
        C00i c00i = this.A0H.A00;
        C2cr c2cr = (C2cr) c00i.get();
        0Xs r0 = this.A0T;
        c2cr.A06(!AnonymousClass001.A1V(r0.getValue()));
        if (!((C2cr) c00i.get()).A07()) {
            ((C2cr) c00i.get()).A05(A1X);
            ((C2cv) 1Br.A0B(this.A0D)).A02(A1X);
            C9rb.A00(((1xF) 1Br.A0B(A00)).A05(0S2.A15), this, 28);
        } else if (1Br.A05(this.A0F).AZk(36322293610202412L)) {
            ((5Nv) 1Br.A0B(this.A0G)).A0D(A1X);
        }
        r0.Cvx(7zU.A0d(r0.getValue()));
    }

    public final void A02(99Z r302) {
        11T.A0F(r302, 0);
        this.A0U.Cvx(r302);
    }

    public final void A03(Boolean bool) {
        0fH.A0j("EncryptedBackupsSettingFragmentViewData", AnonymousClass001.A0Z(bool, "fetchBackupsWithProgress: withProgress: ", AnonymousClass001.A0k()));
        if (bool.equals(AnonymousClass001.A0K())) {
            A02(C8tk.A00);
        }
        7zP.A0e(this.A0J).markerStart(679423802);
        C1wv c1wv = this.A02;
        if (c1wv == null) {
            11T.A0L("repo");
            throw 0Q8.createAndThrow();
        }
        c1wv.A05("EncryptedBackupsSettingFragmentViewData");
    }
}
