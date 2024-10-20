package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4Mt, reason: invalid class name */
/* loaded from: 4Mt.class */
public abstract class C4Mt {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.navigation.plugins.communities.NavigationCommunitiesKillSwitch", "messaging.navigation.communities.NavigationCommunitiesKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.navigation.communities.NavigationCommunitiesKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.navigation.communities.NavigationCommunitiesKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
