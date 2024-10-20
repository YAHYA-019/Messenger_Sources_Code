package X;

import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.086, reason: invalid class name */
/* loaded from: 086.class */
public abstract class AnonymousClass086 {
    public static Object A00(Bundle bundle, Class cls, String str) {
        Object parcelable;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = 0E8.A00(bundle, cls, str);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!cls.isInstance(parcelable)) {
                return null;
            }
        }
        return parcelable;
    }

    public static ArrayList A01(Bundle bundle, Class cls, String str) {
        return Build.VERSION.SDK_INT >= 34 ? 0E8.A01(bundle, cls, str) : bundle.getParcelableArrayList(str);
    }
}
