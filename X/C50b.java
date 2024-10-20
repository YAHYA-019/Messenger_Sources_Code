package X;

import android.net.Uri;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.50b, reason: invalid class name */
/* loaded from: 50b.class */
public final class C50b extends C50c {
    public static final 1G2 A04 = 1G0.A04.A0D("notif_disp/");
    public long A00;
    public final boolean A01;
    public final FbSharedPreferences A02;
    public final String A03;

    public C50b(FbSharedPreferences fbSharedPreferences, String str, boolean z) {
        this.A03 = str;
        this.A02 = fbSharedPreferences;
        this.A01 = z;
    }

    public static void A00(C50b c50b, String str, long j) {
        String encode = Uri.encode(c50b.A03);
        1Ql edit = c50b.A02.edit();
        edit.CaH(A04.A0D(encode).A0D(str), j);
        edit.commit();
    }
}
