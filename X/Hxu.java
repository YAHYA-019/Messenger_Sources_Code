package X;

import android.app.Application;
import android.os.Build;
import com.facebook.acra.constants.ActionId;

/* loaded from: Hxu.class */
public final class Hxu {
    public static final Hxu A01 = new Hxu();
    public final HBE A00;

    public Hxu() {
        HBE hbe;
        String str;
        String str2 = Build.MODEL;
        11T.A0D(str2);
        if (0CV.A0b(str2, "MOS", false) || 0CU.A0T(str2, "Colada", false) || 0CU.A0T(str2, "Monaco", false)) {
            hbe = HBE.A08;
        } else if (0CV.A0b(str2, "Saigon", false) || 0CV.A0b(str2, "Greatwhite", false)) {
            hbe = HBE.A03;
        } else {
            synchronized (C19c.A01) {
                str = C19c.A00;
                if (str == null) {
                    str = null;
                    try {
                        str = Application.getProcessName();
                    } catch (Exception e) {
                        android.util.Log.e("ProcessName", "exception", e);
                    }
                    C19c.A00 = str;
                }
            }
            if (str != null) {
                if (0CV.A0b(str, AnonymousClass000.A00(99), false)) {
                    hbe = HBE.A06;
                } else {
                    if (0CV.A0b(str, AnonymousClass000.A00(54), false)) {
                        hbe = HBE.A07;
                    } else {
                        if (0CV.A0b(str, AnonymousClass000.A00(ActionId.DATA_LOAD_START), false)) {
                            hbe = HBE.A05;
                        }
                    }
                }
            }
            hbe = HBE.A04;
        }
        this.A00 = hbe;
    }
}
