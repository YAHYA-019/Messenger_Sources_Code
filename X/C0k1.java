package X;

import android.content.Context;

/* renamed from: X.0k1, reason: invalid class name */
/* loaded from: 0k1.class */
public abstract class C0k1 {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dF, java.lang.Object] */
    public static int A00(Context context, String str, int i) {
        ?? obj = new Object();
        ((0dF) obj).A00 = context;
        return C0k2.A00(obj, str, i);
    }

    /* JADX WARN: Type inference failed for: r304v0, types: [X.0dF, java.lang.Object] */
    public static void A01(Context context, String str, int i) {
        0dF r304;
        if (context == null) {
            r304 = null;
        } else {
            ?? obj = new Object();
            ((0dF) obj).A00 = context;
            r304 = obj;
        }
        C0k2.A03(r304, str, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dF, java.lang.Object] */
    public static void A02(Context context, String str, boolean z) {
        ?? obj = new Object();
        ((0dF) obj).A00 = context;
        C0k2.A03(obj, str, z ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dF, java.lang.Object] */
    public static boolean A03(Context context, String str) {
        ?? obj = new Object();
        ((0dF) obj).A00 = context;
        boolean z = true;
        if (C0k2.A00(obj, str, 0) != 1) {
            z = false;
        }
        return z;
    }
}
