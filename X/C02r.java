package X;

import android.content.Context;
import com.facebook.voltron.runtime.ModuleApkUtil$ModuleResolver;
import java.io.File;

/* renamed from: X.02r, reason: invalid class name */
/* loaded from: 02r.class */
public abstract class C02r {
    public static File A00(Context context, String str) {
        String A00 = ModuleApkUtil$ModuleResolver.A00(context, str);
        if (A00 == null) {
            A00 = ModuleApkUtil$ModuleResolver.A00(C0bu.A00(context), str);
            if (A00 == null) {
                return null;
            }
        }
        return new File(A00);
    }

    public static boolean A01(Context context, String str) {
        boolean z = false;
        String A00 = ModuleApkUtil$ModuleResolver.A00(context, str);
        if (A00 != null) {
            z = new File(A00).exists();
        }
        return z;
    }
}
