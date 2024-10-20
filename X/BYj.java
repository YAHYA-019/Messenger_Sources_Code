package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: BYj.class */
public abstract class BYj {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.communitymessaging.plugins.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", "messaging.communitymessaging.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.communitymessaging.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.communitymessaging.communitycontainers.menuitems.CommunitymessagingCommunitycontainersMenuitemsKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
