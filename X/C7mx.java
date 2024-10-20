package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7mx, reason: invalid class name */
/* loaded from: 7mx.class */
public abstract class C7mx {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(ICR icr, 1YC r302, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r302.A05("com.facebook.messaging.cowatch.plugins.core.WatchTogetherKillSwitch", "messaging.cowatch.core.WatchTogetherKillSwitch", andIncrement);
            try {
                try {
                    11T.A0F(icr, 0);
                    Context A002 = FbInjector.A00();
                    11T.A0A(A002);
                    Boolean valueOf = Boolean.valueOf(icr.A05(4YV.A0E(A002)));
                    A01 = valueOf;
                    A00 = i;
                    r302.A01(valueOf, (Exception) null, "messaging.cowatch.core.WatchTogetherKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r302.A01(A01, (Exception) null, "messaging.cowatch.core.WatchTogetherKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
