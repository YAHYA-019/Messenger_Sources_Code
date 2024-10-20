package X;

import com.facebook.common.hiddenapis2.ApiExemption;
import dalvik.system.VMDebug;

/* renamed from: X.4fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4fl.class */
public abstract class AbstractC06024fl {
    public static boolean A00 = true;

    static {
        ApiExemption.enableUnsafeExemption();
        A00 = ApiExemption.removeRestriction_DO_NOT_USE();
    }

    public static long A00() {
        return VMDebug.countInstancesOfClass(C07764kq.class, true);
    }

    public static long[] A01(Class[] clsArr) {
        Runtime.getRuntime().gc();
        return VMDebug.countInstancesOfClasses(clsArr, true);
    }
}
