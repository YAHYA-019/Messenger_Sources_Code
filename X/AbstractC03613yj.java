package X;

import android.content.Context;
import android.os.Build;
import com.facebook.inject.FbInjector;

/* renamed from: X.3yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3yj.class */
public abstract class AbstractC03613yj {
    public static final C03653yo A00() {
        Context A00 = FbInjector.A00();
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return C03653yo.A00(A00);
    }

    public static final C03623yk A01() {
        Context A00 = FbInjector.A00();
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return C03623yk.A00(A00);
    }
}
