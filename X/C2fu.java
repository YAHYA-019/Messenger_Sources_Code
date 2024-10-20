package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.2fu, reason: invalid class name */
/* loaded from: 2fu.class */
public final class C2fu {
    public final Context A00;
    public final FbUserSession A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 2SI A05;
    public final C01i A06;
    public final C01i A07;

    public C2fu(Context context, FbUserSession fbUserSession, 2SI r304) {
        11T.A0F(r304, 3);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A05 = r304;
        this.A06 = C01g.A01(new C2xn(this, 33));
        this.A03 = 1Bu.A01(context, 33234);
        this.A04 = 1Bu.A01(context, 33237);
        this.A02 = 1Bu.A01(context, 33236);
        this.A07 = C01g.A01(new C2xn(this, 34));
    }
}
