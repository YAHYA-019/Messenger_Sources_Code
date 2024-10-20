package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.6i3, reason: invalid class name */
/* loaded from: 6i3.class */
public final class C6i3 implements 1Vf {
    public final 1Br A00;
    public final 6Fz A01;
    public final Context A02;
    public final FbUserSession A03;

    public C6i3(Context context, FbUserSession fbUserSession, 6Fz r304) {
        11T.A0F(r304, 3);
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A01 = r304;
        this.A00 = 1Lm.A00(context, fbUserSession, 68074);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        C6i4 c6i4;
        AnonymousClass836 anonymousClass836;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadVisible")) {
            c6i4 = (C6i4) this.A00.A00.get();
            anonymousClass836 = new AnonymousClass836(this, 6);
        } else {
            if (!str.equals("com.facebook.xapp.messaging.events.common.threadview.OnThreadNoLongerVisible")) {
                throw 4YV.A0f(str);
            }
            c6i4 = (C6i4) this.A00.A00.get();
            anonymousClass836 = null;
        }
        c6i4.A00 = anonymousClass836;
    }
}
