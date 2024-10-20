package X;

import android.content.Context;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4Hs, reason: invalid class name */
/* loaded from: 4Hs.class */
public abstract class C4Hs {
    public static final 1G2 A02;
    public static final 1G2 A03;
    public static final 1G2 A04;
    public final Context A00;
    public final FbSharedPreferences A01;

    static {
        1G2 A0D = 1G0.A00.A0D("preloads/");
        11T.A0A(A0D);
        1G2 r0 = A0D;
        A04 = r0;
        1G2 A0D2 = r0.A0D("disclaimer_dialog_displayed");
        11T.A0A(A0D2);
        A03 = A0D2;
        1G2 A0D3 = r0.A0D("device_was_pre_android_13");
        11T.A0A(A0D3);
        A02 = A0D3;
    }

    public C4Hs(Context context, FbSharedPreferences fbSharedPreferences) {
        11T.A0F(fbSharedPreferences, 2);
        this.A00 = context;
        this.A01 = fbSharedPreferences;
    }
}
