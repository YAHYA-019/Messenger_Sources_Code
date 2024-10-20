package X;

import android.os.StrictMode;
import java.lang.reflect.Method;

/* renamed from: X.0bv, reason: invalid class name */
/* loaded from: 0bv.class */
public abstract class C0bv {
    public static Method A00;
    public static final boolean A01;

    static {
        boolean z;
        try {
            A00 = StrictMode.VmPolicy.Builder.class.getMethod("permitNonSdkApiUsage", new Class[0]);
            z = true;
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            android.util.Log.i("StrictModeAllowHiddenApis", "Could not find needed StrictMode allow hidden apis");
            z = false;
        }
        A01 = z;
    }
}
