package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.7t4, reason: invalid class name */
/* loaded from: 7t4.class */
public final class C7t4 {
    public static final boolean A00(Context context, FbUserSession fbUserSession, ThreadSummary threadSummary, UserKey userKey, Capabilities capabilities) {
        11T.A0F(fbUserSession, 0);
        boolean z = false;
        if (capabilities == null || userKey == null || !4YU.A1Y(capabilities, 83)) {
            return false;
        }
        UserKey A0X = 1BK.A0X(((1G1) fbUserSession).A02);
        1Lm.A05(context, fbUserSession, 16907);
        ThreadParticipant A05 = AnonymousClass242.A05(threadSummary, A0X);
        if (A05 == null) {
            return false;
        }
        if (A05.A0F || A05.A0G) {
            return true;
        }
        ThreadParticipant A052 = AnonymousClass242.A05(threadSummary, userKey);
        if (((65C) 1Bn.A0A(66479)).A00(context, fbUserSession, threadSummary, A0X) && (A052 == null || (!A052.A0F && !A052.A0G))) {
            z = true;
        }
        return z;
    }
}
