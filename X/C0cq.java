package X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.0cq, reason: invalid class name */
/* loaded from: 0cq.class */
public abstract class C0cq {
    public static String A00;
    public static boolean A01;
    public static boolean A02;
    public static final CountDownLatch A03 = AnonymousClass001.A11();

    public static String A00(String str, String str2) {
        if (str2 != null) {
            if (str == null) {
                return str2;
            }
            android.util.Log.d("JitUtils", String.format("Combining more than one jit error msg. Current: %s new: %s", str, str2));
            str = 0Pz.A0j(str, " / ", str2);
        }
        return str;
    }
}
