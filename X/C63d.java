package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.63d, reason: invalid class name */
/* loaded from: 63d.class */
public abstract class C63d {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.wellbeing.safetyecosystem.communitymessaging.plugins.postsendfriction.WellbeingSafetyecosystemCommunitymessagingPostsendfrictionKillSwitch", "messaging.wellbeing.safetyecosystem.communitymessaging.postsendfriction.WellbeingSafetyecosystemCommunitymessagingPostsendfrictionKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.wellbeing.safetyecosystem.communitymessaging.postsendfriction.WellbeingSafetyecosystemCommunitymessagingPostsendfrictionKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.wellbeing.safetyecosystem.communitymessaging.postsendfriction.WellbeingSafetyecosystemCommunitymessagingPostsendfrictionKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
