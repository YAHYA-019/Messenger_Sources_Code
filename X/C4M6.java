package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.4M6, reason: invalid class name */
/* loaded from: 4M6.class */
public abstract class C4M6 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, C4M7 c4m7, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.support.plugins.supportfolder.SupportFolderKillSwitch", "messaging.support.supportfolder.SupportFolderKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    11T.A0F(c4m7, 0);
                    Boolean valueOf = Boolean.valueOf(((1CO) c4m7.A00.A00.get()).AZr(1GD.A07, 36324458272673454L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.support.supportfolder.SupportFolderKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, e, "messaging.support.supportfolder.SupportFolderKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
