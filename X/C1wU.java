package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1wU, reason: invalid class name */
/* loaded from: 1wU.class */
public final class C1wU {
    public final 1Br A01 = 1Bq.A00(66529);
    public final 1Br A00 = 1Bu.A00(66523);

    public final boolean A00() {
        1Ql putBoolean;
        String str = ((1Fv) 1Bi.A03(66351)).A04().A02;
        C00i c00i = this.A01.A00;
        c00i.get();
        C00i c00i2 = this.A00.A00;
        c00i2.get();
        1G2 A00 = 1wX.A00(1wX.A03, str);
        2yD r0 = (2yD) ((1wZ) c00i2.get()).A00.A00.get();
        1GD A01 = 1GD.A01(new 1GD());
        A01.A02 = true;
        boolean AZr = r0.AZr(A01, 36316426683819990L);
        2yD r02 = (2yD) ((1wZ) c00i2.get()).A00.A00.get();
        1GD A012 = 1GD.A01(new 1GD());
        A012.A02 = true;
        boolean AZr2 = r02.AZr(A012, 36316426685786075L);
        if (A00 == null || ((FbSharedPreferences) ((1wX) c00i.get()).A00.A00.get()).BIj(A00) == null) {
            if (AZr && !AZr2 && A00 != null) {
                putBoolean = ((FbSharedPreferences) ((1wX) c00i.get()).A00.A00.get()).edit().putBoolean(A00, true);
            }
            return AZr;
        }
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) ((1wX) c00i.get()).A00.A00.get();
        if (!AZr2) {
            return fbSharedPreferences.AZn(A00, true);
        }
        putBoolean = fbSharedPreferences.edit();
        putBoolean.Cdj(A00);
        putBoolean.commit();
        return AZr;
    }
}
