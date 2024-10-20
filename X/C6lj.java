package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6lj, reason: invalid class name */
/* loaded from: 6lj.class */
public abstract class C6lj {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.communitymessaging.plugins.notify.communitychannelcreation.CommunitymessagingNotifyCommunitychannelcreationKillSwitch", "messaging.communitymessaging.notify.communitychannelcreation.CommunitymessagingNotifyCommunitychannelcreationKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.communitymessaging.notify.communitychannelcreation.CommunitymessagingNotifyCommunitychannelcreationKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.communitymessaging.notify.communitychannelcreation.CommunitymessagingNotifyCommunitychannelcreationKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
