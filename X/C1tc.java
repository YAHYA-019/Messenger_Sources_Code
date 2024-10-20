package X;

import com.facebook.storage.ionic.fbapps.IonicFBAppConnection;
import java.util.Random;

/* renamed from: X.1tc, reason: invalid class name */
/* loaded from: 1tc.class */
public abstract class C1tc {
    public static IonicFBAppConnection A00;
    public static final Random A01 = new Random();
    public static volatile long A02;
    public static volatile boolean A03;

    public static boolean A00() {
        boolean z = false;
        if (A02 > 0 && A01.nextInt() % A02 == 0 && A03) {
            z = true;
        }
        return z;
    }
}
