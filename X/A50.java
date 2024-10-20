package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: A50.class */
public final class A50 implements 74V {
    public final 1Br A00;
    public final AnonymousClass726 A01;

    public A50(Context context, FbUserSession fbUserSession, AnonymousClass726 anonymousClass726) {
        11T.A0F(anonymousClass726, 1);
        this.A01 = anonymousClass726;
        this.A00 = 1Lm.A00(context, fbUserSession, 65962);
    }

    public void A7C(Capabilities capabilities, Long l, Long l2, String str, String str2) {
        11T.A0H(str, str2);
        ((22C) 1Br.A0B(this.A00)).A0M(l, str2, Long.parseLong(str), this.A01.B32());
    }

    public void Cf4(Capabilities capabilities, Long l, String str, String str2) {
        11T.A0F(str, 0);
        ((22C) 1Br.A0B(this.A00)).A0M((Number) null, (String) null, Long.parseLong(str), this.A01.B32());
    }
}
