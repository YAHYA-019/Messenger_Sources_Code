package X;

import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Krw.class */
public final class Krw {
    public final C00i A05 = 1BQ.A02(131214);
    public final C00i A02 = AbH.A0S();
    public final C00i A03 = 1BQ.A02(16618);
    public final C00i A04 = 1BQ.A02(32798);
    public final C00i A01 = 1BQ.A02(65904);
    public final C00i A00 = AbH.A0a();

    public void A00(Intent intent) {
        String stringExtra = intent.getStringExtra("registration_error_id");
        LY1 ly1 = (LY1) this.A05.get();
        C1Oc c1Oc = ly1.A04;
        0fH.A03(LY1.class, (Object) null, stringExtra, true, c1Oc.A05(), "RegId changed: new token:%s, error:%b, removed:%b, old token:%s");
        c1Oc.A07();
        ly1.A06.A0A("SUCCESS", (String) null);
        1uD.A00();
        synchronized (ly1) {
            C49f c49f = ly1.A00;
            if (c49f != null) {
                c49f.C2v(false);
            }
        }
        synchronized (ly1) {
            ly1.A00 = null;
        }
    }

    public void A01(Intent intent, FbUserSession fbUserSession) {
        String stringExtra = intent.getStringExtra(1BJ.A00(219));
        LY1 ly1 = (LY1) this.A05.get();
        C1Oc c1Oc = ly1.A04;
        0fH.A03(LY1.class, stringExtra, (Object) null, false, c1Oc.A05(), "RegId changed: new token:%s, error:%b, removed:%b, old token:%s");
        c1Oc.A0A(stringExtra, c1Oc.A00());
        ly1.A06.A09("SUCCESS", (String) null);
        0fH.A0A(LY1.class, AbstractC00603o4.A00(396));
        ly1.A05.A07(fbUserSession, ly1.A03, 1OZ.A01);
        1uD.A02();
        synchronized (ly1) {
            C49f c49f = ly1.A00;
            if (c49f != null) {
                c49f.C2v(false);
            }
        }
        synchronized (ly1) {
            ly1.A00 = null;
        }
    }
}
