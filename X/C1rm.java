package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.1rm, reason: invalid class name */
/* loaded from: 1rm.class */
public final class C1rm {
    public static C1rm A01;
    public final SharedPreferences A00;

    public C1rm(Context context) {
        this.A00 = context.getSharedPreferences("msys-preferences", 0);
    }

    public static C1rm A00() {
        C1rm c1rm;
        synchronized (C1rm.class) {
            c1rm = A01;
        }
        return c1rm;
    }

    public static void A01(Context context) {
        synchronized (C1rm.class) {
            if (A01 == null) {
                A01 = new C1rm(context);
            }
        }
    }
}
