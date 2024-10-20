package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.2dj, reason: invalid class name */
/* loaded from: 2dj.class */
public final class C2dj {
    public static final String[] A04 = {"android.permission.READ_SMS", "android.permission.READ_CONTACTS"};
    public final 1Rv A00;
    public final Context A01;
    public final C2dk A02;
    public final FbSharedPreferences A03;

    public C2dj() {
        Context A00 = FbInjector.A00();
        1Rv r0 = (1Rv) 1Bi.A03(67262);
        C2dk c2dk = (C2dk) 1Bi.A03(17051);
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) 1Bi.A03(33013);
        this.A01 = A00.getApplicationContext();
        this.A00 = r0;
        this.A02 = c2dk;
        this.A03 = fbSharedPreferences;
    }
}
