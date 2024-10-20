package X;

import android.os.Build;

/* renamed from: X.4K2, reason: invalid class name */
/* loaded from: 4K2.class */
public final class C4K2 extends C4Jy {
    @Override // X.C4Jy
    public boolean A01(C4Kf c4Kf) {
        Integer num = c4Kf.A0B.A02;
        if (num != 0S2.A0C) {
            return Build.VERSION.SDK_INT >= 30 && num == 0S2.A0j;
        }
        return true;
    }
}
