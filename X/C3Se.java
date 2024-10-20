package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.msys.thread.fragment.MsysThreadViewActivity;
import java.util.BitSet;

/* renamed from: X.3Se, reason: invalid class name */
/* loaded from: 3Se.class */
public final class C3Se {
    public static final C3Se A00 = new Object();

    public static final void A00(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        2yD A0Q = 1BL.A0Q();
        Intent intent = new Intent(context, (Class<?>) MsysThreadViewActivity.class);
        5TX r0 = new 5TX();
        ((5TY) r0).A00 = context.getApplicationContext();
        BitSet A18 = 1BK.A18(2);
        A18.clear();
        r0.A02 = threadKey;
        A18.set(0);
        r0.A01 = fbUserSession.BKF();
        A18.set(1);
        5TZ.A00(A18, new String[]{"threadKey", "viewerContext"}, 2);
        C6tt.A02(context, intent, r0);
        0fH.A0j("MsysThreadViewActivity", "Parallel fetch message list completed.");
        if (A0Q.AZk(36322319379940738L)) {
            5Tr r02 = new 5Tr();
            ((5TY) r02).A00 = context.getApplicationContext();
            BitSet A182 = 1BK.A18(3);
            A182.clear();
            r02.A02 = threadKey.A0u();
            A182.set(1);
            r02.A00 = 0PK.A00(new 03Y[]{1BK.A1G("thread_key", threadKey)});
            A182.set(0);
            r02.A01 = fbUserSession.BKF();
            A182.set(2);
            5TZ.A00(A182, new String[]{"bundle", "threadId", "viewerContext"}, 3);
            C6tt.A02(context, intent, r02);
            0fH.A0j("MsysThreadViewActivity", "Parallel fetch title bar completed.");
        }
        if (A0Q.AZk(36322319379875201L)) {
            7De r03 = new 7De();
            ((5TY) r03).A00 = context.getApplicationContext();
            BitSet A183 = 1BK.A18(3);
            A183.clear();
            r03.A02 = threadKey.A0u();
            A183.set(1);
            r03.A00 = 0PK.A00(new 03Y[]{1BK.A1G("thread_key", threadKey)});
            A183.set(0);
            r03.A01 = fbUserSession.BKF();
            A183.set(2);
            5TZ.A00(A183, new String[]{"bundle", "threadId", "viewerContext"}, 3);
            C6tt.A02(context, intent, r03);
            0fH.A0j("MsysThreadViewActivity", "Parallel fetch composer completed.");
        }
    }
}
