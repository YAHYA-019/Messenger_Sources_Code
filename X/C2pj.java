package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2pj, reason: invalid class name */
/* loaded from: 2pj.class */
public abstract class C2pj {
    public static int A00 = 255;
    public static Boolean A01;

    public static Boolean A00(int i) {
        if (A00 != i) {
            return null;
        }
        return A01;
    }

    public static boolean A01(1YC r301, AtomicInteger atomicInteger) {
        int i = C1Y6.A00;
        Boolean A002 = A00(i);
        return A002 != null ? A002.booleanValue() : A02(r301, atomicInteger, i);
    }

    public static boolean A02(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.communitymessaging.plugins.channellist.CommunitymessagingChannellistKillSwitch", "messaging.communitymessaging.channellist.CommunitymessagingChannellistKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.communitymessaging.channellist.CommunitymessagingChannellistKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.communitymessaging.channellist.CommunitymessagingChannellistKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
