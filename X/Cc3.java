package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Cc3.class */
public final class Cc3 implements 2SQ {
    public 2TV A00;
    public Long A01;
    public boolean A02;
    public final FbUserSession A03;
    public final 1Br A04;
    public final 1Br A05;
    public final Context A08;
    public final 1Br A06 = 7zM.A0P();
    public final 1K9 A09 = D4q.A00(this, 81);
    public final C1qM A07 = new CxO(this, 22);

    public Cc3(FbUserSession fbUserSession, Context context) {
        this.A03 = fbUserSession;
        this.A08 = context;
        this.A05 = 1Bu.A01(context, 84119);
        this.A04 = 1Lm.A00(context, fbUserSession, 33124);
    }

    public static final void A00(FbUserSession fbUserSession, Cc3 cc3) {
        BqT bqT = (BqT) 1Br.A0B(cc3.A05);
        Long l = cc3.A01;
        if (l == null) {
            throw 1BK.A0h();
        }
        S5T s5t = new S5T(fbUserSession, bqT, 7zN.A0j(l));
        C00i c00i = bqT.A02.A00;
        2FT A02 = 2FP.A02(S5G.A00, 1Kd.A0B(s5t, AbG.A1D(c00i)), AbG.A1D(c00i));
        1Br.A0D(cc3.A06, cc3.A09, A02);
    }

    public void AEC() {
        ((C21N) 1Br.A0B(this.A04)).A01(this.A07);
        this.A02 = false;
    }

    public void CmR(2TV r302) {
        this.A00 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        Long A0e = 0CW.A0e(7zO.A0v(obj));
        if (A0e == null) {
            A0e = 4YV.A0i();
        }
        this.A01 = A0e;
        ((C21N) 1Br.A0B(this.A04)).A00(this.A07);
        this.A02 = true;
        A00(this.A03, this);
    }
}
