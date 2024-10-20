package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* renamed from: X.3N4, reason: invalid class name */
/* loaded from: 3N4.class */
public final class C3N4 {
    public String A00;
    public boolean A01;
    public final 1Br A02;
    public final FbUserSession A03;
    public final 1I7 A04;
    public final 1BP A05;
    public final 1Br A06;

    public C3N4(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A03 = fbUserSession;
        this.A05 = FbInjector.A00;
        this.A02 = 1Bu.A00(33101);
        this.A06 = 1Bq.A00(16464);
        Context context = FbInjector.A03;
        11T.A0A(context);
        this.A04 = (1I7) 1Hv.A02(context, 65731);
        this.A00 = 2BX.A04(1Br.A0B(this.A02));
    }
}
