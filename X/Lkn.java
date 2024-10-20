package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: Lkn.class */
public final class Lkn implements Runnable {
    public static final String __redex_internal_original_name = "FxFbFetaUserInfoHelper$readFetaUserInfoFromDisk$1";
    public final /* synthetic */ MAS A00;

    public Lkn(MAS mas) {
        this.A00 = mas;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MAS mas = this.A00;
        C00i c00i = mas.A04.A00;
        c00i.get();
        int ArU = ((FbSharedPreferences) 1Bi.A03(33013)).ArU(L7L.A00(), -1);
        boolean z = true;
        if (ArU == -1 || ArU == 0 || ArU != 1) {
            z = false;
        }
        ((KT7) mas).A01 = z;
        c00i.get();
        ((KT7) mas).A00 = 1BL.A0A((FbSharedPreferences) 1Bi.A03(33013), L7L.A01());
    }
}
