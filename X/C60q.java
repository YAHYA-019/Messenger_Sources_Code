package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.60q, reason: invalid class name */
/* loaded from: 60q.class */
public abstract class C60q {
    public static int A00 = 255;
    public static Boolean A01;

    public static Boolean A00(int i) {
        if (A00 != i) {
            return null;
        }
        return A01;
    }

    public static boolean A01(C60r c60r, 1YC r302, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r302.A05("com.facebook.messaging.reactions.plugins.reactions.ReactionsKillSwitch", "messaging.reactions.reactions.ReactionsKillSwitch", andIncrement);
            try {
                try {
                    1Fw.A04((1EZ) 1Bn.A0E((Context) 1Bn.A0E((Context) null, c60r.A00, 83719), (1BY) null, 16428));
                    A01 = true;
                    A00 = i;
                    r302.A01(true, (Exception) null, "messaging.reactions.reactions.ReactionsKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r302.A01(A01, (Exception) null, "messaging.reactions.reactions.ReactionsKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
