package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7n2, reason: invalid class name */
/* loaded from: 7n2.class */
public abstract class C7n2 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.groups.invitelink.plugins.core.GroupsInvitelinkCoreKillSwitch", "messaging.groups.invitelink.core.GroupsInvitelinkCoreKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    Boolean A012 = 2yD.A01(1BL.A0Q(), 36317032274340776L);
                    A01 = A012;
                    A00 = i;
                    r301.A01(A012, (Exception) null, "messaging.groups.invitelink.core.GroupsInvitelinkCoreKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.groups.invitelink.core.GroupsInvitelinkCoreKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}