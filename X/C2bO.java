package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2bO, reason: invalid class name */
/* loaded from: 2bO.class */
public abstract class C2bO {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.encryptedbackups.plugins.EncryptedBackupsKillSwitch", "messaging.encryptedbackups.EncryptedBackupsKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((C1ud) 1Bi.A03(65997)).A08());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.encryptedbackups.EncryptedBackupsKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.encryptedbackups.EncryptedBackupsKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
