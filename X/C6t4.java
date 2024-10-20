package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* renamed from: X.6t4, reason: invalid class name */
/* loaded from: 6t4.class */
public final class C6t4 implements 1Vf {
    public final Context A00;
    public final LifecycleOwner A01;
    public final FbUserSession A02;
    public final 1Br A03 = 1Bu.A00(33208);
    public final ThreadKey A04;

    public C6t4(Context context, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, ThreadKey threadKey) {
        this.A00 = context;
        this.A02 = fbUserSession;
        this.A04 = threadKey;
        this.A01 = lifecycleOwner;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0F(str, 1);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnCreate")) {
            throw 4YV.A0f(str);
        }
        this.A03.A00.get();
        new 2Vg(this.A00, this.A02).A01(this.A01, this.A04);
    }
}
