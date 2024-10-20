package X;

import java.util.Set;

/* loaded from: Hv6.class */
public abstract class Hv6 {
    public static void A00(String str) {
        Set set = HME.A00;
        if (set.contains(str)) {
            return;
        }
        android.util.Log.w("LOTTIE", str, null);
        set.add(str);
    }

    public static void A01(String str, Throwable th) {
        Set set = HME.A00;
        if (set.contains(str)) {
            return;
        }
        android.util.Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
