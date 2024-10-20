package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: C5Y.class */
public final class C5Y {
    public final 1Br A00 = 7zM.A0d();
    public final 1Br A01;
    public final 1Br A02;
    public final C01i A03;
    public final ThreadKey A04;
    public final String A05;

    public C5Y(Context context, FbUserSession fbUserSession, ThreadKey threadKey, String str) {
        this.A05 = str;
        this.A04 = threadKey;
        this.A01 = 1Bu.A01(context, 68199);
        this.A02 = 1Bu.A01(context, 84109);
        this.A03 = C01g.A01(new AKW(context, fbUserSession, 42));
    }

    public final int A00() {
        ThreadKey threadKey = this.A04;
        if (threadKey == null || threadKey.A0z()) {
            return -1;
        }
        String str = this.A05;
        if (11T.A0O(str, "FORWARD_PHOTO") || 11T.A0O(str, "FORWARD_VIDEO")) {
            return 2yD.A00(1Br.A07(((BiW) 1Br.A0B(this.A02)).A00), 36603888845003168L);
        }
        return -1;
    }
}
