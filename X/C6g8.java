package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6g8, reason: invalid class name */
/* loaded from: 6g8.class */
public abstract class C6g8 {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(C6g9 c6g9, 1YC r302, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r302.A05("com.facebook.messaging.media.plugins.mediapicker.MediaPickerKillSwitchKillSwitch", "messaging.media.mediapicker.MediaPickerKillSwitchKillSwitch", andIncrement);
            Exception e = null;
            try {
                try {
                    11T.A0F(c6g9, 0);
                    Boolean valueOf = Boolean.valueOf(((1CO) c6g9.A00.A00.get()).AZk(2342156974881512798L));
                    A01 = valueOf;
                    A00 = i;
                    r302.A01(valueOf, (Exception) null, "messaging.media.mediapicker.MediaPickerKillSwitchKillSwitch", andIncrement);
                } catch (Exception e2) {
                    e = e2;
                    throw e;
                }
            } catch (Throwable th) {
                r302.A01(A01, e, "messaging.media.mediapicker.MediaPickerKillSwitchKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
