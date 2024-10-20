package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7a3, reason: invalid class name */
/* loaded from: 7a3.class */
public abstract class C7a3 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.communitymessaging.plugins.groupchatupgrades.CommunitymessagingGroupchatupgradesKillSwitch", "messaging.communitymessaging.groupchatupgrades.CommunitymessagingGroupchatupgradesKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean A012 = 2yD.A01(1BL.A0Q(), 36326687360833311L);
                    A01 = A012;
                    A00 = i;
                    r301.A01(A012, (Exception) null, "messaging.communitymessaging.groupchatupgrades.CommunitymessagingGroupchatupgradesKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.communitymessaging.groupchatupgrades.CommunitymessagingGroupchatupgradesKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
