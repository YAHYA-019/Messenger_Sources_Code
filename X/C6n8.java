package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* renamed from: X.6n8, reason: invalid class name */
/* loaded from: 6n8.class */
public final class C6n8 {
    public long A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final String A04;
    public final 1BP A05;
    public final 1G2 A06;

    public C6n8(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A01 = fbUserSession;
        this.A03 = 1Bq.A00(33013);
        this.A05 = FbInjector.A00;
        1Br A00 = 1Bq.A00(68021);
        this.A02 = A00;
        this.A06 = ((C61c) A00.A00.get()).A08() ? 1NK.A3X : 1NK.A3W;
        this.A04 = ((C61c) this.A02.A00.get()).A08() ? "prompt_mustache_link" : "prompt_mustache";
    }

    public static final 1G2 A00(Context context, C6n8 c6n8) {
        1G2 A0D = c6n8.A06.A0D(0Pz.A0K((String) 1Bn.A0E(context, (1BY) null, 83439), '/'));
        11T.A0A(A0D);
        return A0D;
    }

    public final void A01() {
        1Ql A08 = 1Br.A08(this.A03);
        Context context = FbInjector.A03;
        11T.A0A(context);
        A08.CaE(A00(context, this), 4);
        A08.commit();
    }
}
