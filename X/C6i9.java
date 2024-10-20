package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6i9, reason: invalid class name */
/* loaded from: 6i9.class */
public abstract class C6i9 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.nativepagereply.plugins.richmedia.BiiMSendFileKillSwitch", "messaging.nativepagereply.richmedia.BiiMSendFileKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((C2ib) 1Bi.A03(17077)).A03());
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.nativepagereply.richmedia.BiiMSendFileKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.nativepagereply.richmedia.BiiMSendFileKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
