package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5ys, reason: invalid class name */
/* loaded from: 5ys.class */
public abstract class C5ys {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.groups.plugins.leavegroup.GroupsLeavegroupKillSwitch", "messaging.groups.leavegroup.GroupsLeavegroupKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    A01 = true;
                    A00 = i;
                    r301.A01(true, (Exception) null, "messaging.groups.leavegroup.GroupsLeavegroupKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.groups.leavegroup.GroupsLeavegroupKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}