package X;

import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: C08.class */
public final class C08 {
    public final 1De A00;

    public C08(1De r302) {
        this.A00 = r302;
    }

    public final int A00(FbUserSession fbUserSession, ThreadSummary threadSummary) {
        String obj;
        C2fr A0N = ((2fZ) 4YU.A0o(fbUserSession, this.A00, 17067)).A0N(threadSummary);
        int i = 0;
        if (A0N.Azi() == 0) {
            Uri Alb = A0N.Alb(0, 0, 0);
            if (Alb != null && (obj = Alb.toString()) != null) {
                i = obj.hashCode();
            }
            return i;
        }
        ImmutableList BIP = A0N.BIP(0, 0);
        11T.A0A(BIP);
        int size = BIP.size();
        int i2 = 0;
        while (i < size) {
            i2 = 7zM.A05(BIP.toString(), i2);
            i++;
        }
        return i2;
    }
}
