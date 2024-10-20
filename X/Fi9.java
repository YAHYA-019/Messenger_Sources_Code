package X;

import android.content.Context;

/* loaded from: Fi9.class */
public final class Fi9 implements C00g {
    public final Context A02;
    public final 1Br A01 = 7zM.A0V();
    public final 1Br A00 = 1Bq.A00(16617);

    public Fi9(Context context) {
        this.A02 = context;
    }

    public String A00() {
        String A04 = ((1Oe) 1Br.A0B(this.A00)).A04(C1fe.A0d);
        if (A04 == null || A04.length() == 0) {
            A04 = ((1H2) 1Br.A0B(this.A01)).A02();
            if (A04 == null) {
                throw 1BK.A0h();
            }
        }
        return A04;
    }

    @Override // X.C00g
    public Context getContext() {
        return this.A02;
    }
}
