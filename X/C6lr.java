package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.6lr, reason: invalid class name */
/* loaded from: 6lr.class */
public final class C6lr {
    public static final C6lr A00 = new Object();

    public final boolean A00(String str) {
        long Auy = C61c.A00((C61c) 1Bi.A03(68021)).Auy(36602772153636729L);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        11T.A0A(1NK.A0k.A0D(str));
        boolean z = false;
        if (fbSharedPreferences.ArU((1G2) r0, 0) < Auy) {
            z = true;
        }
        return z;
    }
}
