package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2ia, reason: invalid class name */
/* loaded from: 2ia.class */
public abstract class C2ia {
    public static int A00 = 255;
    public static Boolean A01;

    public static Boolean A00(int i) {
        if (A00 != i) {
            return null;
        }
        return A01;
    }

    public static boolean A01(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.nativepagereply.plugins.core.BusinessInboxCoreKillSwitch", "messaging.nativepagereply.core.BusinessInboxCoreKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((C2ib) 1Bi.A03(17077)).A09());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.nativepagereply.core.BusinessInboxCoreKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.nativepagereply.core.BusinessInboxCoreKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
