package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* renamed from: X.9g7, reason: invalid class name */
/* loaded from: 9g7.class */
public final class C9g7 {
    public long A00;
    public final 1Br A01;
    public final 1Br A02;
    public final String A03;
    public final FbUserSession A04;
    public final 1BP A05;
    public final 1G2 A06;

    public C9g7(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A04 = fbUserSession;
        this.A01 = 1BK.A0E();
        this.A05 = FbInjector.A00;
        1Br A00 = 1Bq.A00(68332);
        this.A02 = A00;
        this.A06 = C5xr.A00((C5xr) 1Br.A0B(A00)).AZk(36322499768370776L) ? 1NK.A3s : 1NK.A3r;
        this.A03 = C5xr.A00((C5xr) 1Br.A0B(this.A02)).AZk(36322499768370776L) ? "sidechat_mustache_link" : "sidechat_mustache";
    }

    public static final 1G2 A00(Context context, C9g7 c9g7) {
        return 1G3.A00(c9g7.A06, 0Pz.A0K((String) 1Bn.A0E(context, (1BY) null, 83439), '/'));
    }
}
