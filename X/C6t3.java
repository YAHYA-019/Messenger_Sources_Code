package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.6t3, reason: invalid class name */
/* loaded from: 6t3.class */
public final class C6t3 implements 1Vf {
    public final LifecycleOwner A00;
    public final 1Br A01;
    public final Context A02;
    public final FbUserSession A03;

    public C6t3(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A00 = lifecycleOwner;
        this.A01 = 1Lm.A00(context, fbUserSession, 68074);
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        C6i4 c6i4;
        AnonymousClass836 anonymousClass836;
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
            c6i4 = (C6i4) this.A01.A00.get();
            anonymousClass836 = new AnonymousClass836(this, 5);
        } else {
            if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy")) {
                throw 4YV.A0f(str);
            }
            c6i4 = (C6i4) this.A01.A00.get();
            anonymousClass836 = null;
        }
        c6i4.A00 = anonymousClass836;
    }
}
