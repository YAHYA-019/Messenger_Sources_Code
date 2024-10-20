package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Ll8.class */
public final class Ll8 implements Runnable {
    public static final String __redex_internal_original_name = "FxMsgrFetaUserInfoHelper$readFetaUserInfoFromDisk$1";
    public final /* synthetic */ MAT A00;

    public Ll8(MAT mat) {
        this.A00 = mat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MAT mat = this.A00;
        C00i c00i = mat.A05.A00;
        c00i.get();
        int ArU = ((FbSharedPreferences) 1Bi.A03(33013)).ArU(L7L.A00(), -1);
        boolean z = true;
        if (ArU == -1 || ArU == 0 || ArU != 1) {
            z = false;
        }
        ((KT7) mat).A01 = z;
        c00i.get();
        ((KT7) mat).A00 = 1BL.A0A((FbSharedPreferences) 1Bi.A03(33013), L7L.A01());
    }
}
