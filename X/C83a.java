package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.83a, reason: invalid class name */
/* loaded from: 83a.class */
public final class C83a implements 1Vf {
    public 1PA A00;
    public 1PA A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 2S4 A04;

    public C83a(Context context, FbUserSession fbUserSession, 2S4 r304) {
        this.A04 = r304;
        this.A02 = context;
        this.A03 = fbUserSession;
    }

    public void BQC(1Q5 r302, 1Vp r303, String str) {
        11T.A0H(r302, str);
        if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnVisible")) {
            if (!str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnInvisible")) {
                throw 4YV.A0f(str);
            }
            1PA r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
            this.A01 = null;
            1PA r02 = this.A00;
            if (r02 != null) {
                r02.A01();
            }
            this.A00 = null;
            return;
        }
        if (this.A01 == null) {
            1PA A00 = 83Y.A00(this.A02, AV3.A00(this, 26));
            this.A01 = A00;
            A00.A00();
        }
        if (this.A00 == null) {
            1PA A01 = 1P9.A01(new 1P9((1I7) 1Hv.A02(this.A02, 65728)), new A38(AV3.A00(this, 25), 8), "INBOX_MULTI_SELECT_BULK_ACTION_BUTTON_CLICKED");
            this.A00 = A01;
            A01.A00();
        }
    }
}
