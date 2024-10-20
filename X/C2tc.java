package X;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2tc, reason: invalid class name */
/* loaded from: 2tc.class */
public abstract class C2tc {
    public static final ArrayList A00 = C0s8.A10(new 02C("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M"), new 02C("fOg8G3Hz1XL-0EyNQMXLEP915th9nfb71T8EaMKQUFM"), new 02C("GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA"));

    public static final boolean A00(Context context, boolean z) {
        11T.A0F(context, 0);
        boolean z2 = true;
        try {
            context.getPackageManager();
            C08h A01 = 0EB.A01(context, "com.android.vending", 64);
            if (z) {
                0EY A02 = 0EY.A02(A01, false);
                ArrayList arrayList = A00;
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (A02.A04.contains((02C) it.next())) {
                            return true;
                        }
                    }
                }
                z2 = false;
            }
            return z2;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }
}
