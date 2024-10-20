package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.5rk, reason: invalid class name */
/* loaded from: 5rk.class */
public final class C5rk {
    public static final 1G2 A04;
    public static final 1G2 A05;
    public final C00i A02 = new 1BV(16607);
    public final C00i A01 = new 1BQ(33013);
    public final C00i A03 = new 1BQ(16385);
    public final 1Od A00 = (1Od) 1Bi.A03(16616);

    static {
        1G2 r0 = 1NK.A1l;
        A04 = r0.A0D("bool_value_key");
        A05 = r0.A0D("update_version_key");
    }

    public static boolean A00(1CO r301, FbSharedPreferences fbSharedPreferences, int i) {
        1G2 r0 = A04;
        boolean AZn = fbSharedPreferences.AZn(r0, false);
        1G2 r02 = A05;
        int ArU = fbSharedPreferences.ArU(r02, -1);
        if (fbSharedPreferences.BNM(r0) && fbSharedPreferences.BNM(r02) && i == ArU) {
            return AZn;
        }
        1GD A01 = 1GD.A01(new 1GD());
        A01.A03 = true;
        boolean AZr = r301.AZr(A01, 36312479609459102L);
        MobileConfigValueSource mobileConfigValueSource = A01.A01.A00;
        if (mobileConfigValueSource != MobileConfigValueSource.SERVER && mobileConfigValueSource != MobileConfigValueSource.OVERRIDE) {
            return false;
        }
        1Ql edit = fbSharedPreferences.edit();
        edit.putBoolean(r0, AZr);
        edit.CaE(r02, i);
        edit.commit();
        return AZr;
    }
}
