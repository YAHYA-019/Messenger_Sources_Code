package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.1b7, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1b7.class */
public abstract class AbstractC00481b7 {
    public static void A00() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw AnonymousClass001.A0N("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void A01(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw AnonymousClass001.A0N(0Pz.A0z("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void A02(Object obj) {
        if (obj == null) {
            throw AnonymousClass001.A0Q("null reference");
        }
    }

    public static void A03(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0Q(String.valueOf(obj2));
        }
    }

    public static void A04(String str) {
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass001.A0L("Given String is empty or null");
        }
    }

    public static void A05(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw AnonymousClass001.A0N(str);
        }
    }

    public static void A06(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass001.A0L(String.valueOf(obj));
        }
    }

    public static void A07(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void A08(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0L(String.valueOf(obj));
        }
    }

    public static void A09(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass001.A0N(String.valueOf(obj));
        }
    }
}
