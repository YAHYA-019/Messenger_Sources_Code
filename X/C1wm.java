package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1wm, reason: invalid class name */
/* loaded from: 1wm.class */
public final class C1wm {
    public final 1Br A02 = 1Bq.A00(65997);
    public final 1Br A03 = 1Bu.A00(66524);
    public final 1Br A01 = 1Bq.A00(99390);
    public final 1Br A00 = 1Bq.A00(68885);

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A00(Integer num) {
        long Av9;
        int intValue;
        Boolean bool;
        int ordinal;
        C00i c00i = this.A00.A00;
        byte b = true;
        if (!11T.A0O(((C1wi) c00i.get()).A01(), true) || !((C1ud) this.A02.A00.get()).A0B()) {
            b = false;
        }
        if (b == false) {
            C1wj A00 = ((C1wi) c00i.get()).A00();
            if (A00 == null || (ordinal = A00.ordinal()) == -1) {
                bool = null;
            } else {
                boolean z = true;
                if (ordinal != 2) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
            if (!11T.A0O(bool, true)) {
                return false;
            }
            C00i c00i2 = this.A02.A00;
            if (!((C1ud) c00i2.get()).A0B()) {
                return false;
            }
            C1ud c1ud = (C1ud) c00i2.get();
            if (!c1ud.A01() || !C1ud.A00(c1ud).AZr(c1ud.A02, 36316426692864004L)) {
                return false;
            }
        }
        C00i c00i3 = this.A03.A00;
        if (!1BK.A0G(c00i3).A0M()) {
            return false;
        }
        C1wk A0G = 1BK.A0G(c00i3);
        FbSharedPreferences A03 = C1wk.A03(A0G);
        1G9 r0 = 1NK.A4m;
        boolean A07 = C1wk.A07(A0G);
        if (A03.AZn(C1wg.A02(r0), false)) {
            return false;
        }
        boolean A0O = 11T.A0O(((C1wi) c00i.get()).A01(), true);
        C1wk A0G2 = 1BK.A0G(c00i3);
        long Av1 = C1wk.A03(A0G2).Av1(C1wg.A01(A0G2, 1NK.A4o, A07 ? 1 : 0), 0L);
        C1wk A0G3 = 1BK.A0G(c00i3);
        long A0A = 1BL.A0A(C1wk.A03(A0G3), C1wg.A00(A0G3, 1NK.A4n));
        if (Av1 != 0 || A0A != 0) {
            if (!A0O) {
                C1ud c1ud2 = (C1ud) 1Br.A0B(this.A02);
                if (A0A >= C1ud.A00(c1ud2).Av9(c1ud2.A02, 36597901669633841L)) {
                    return false;
                }
            }
            if (A0O) {
                Av9 = 0;
                if (A0A != 0) {
                    C00i c00i4 = this.A02.A00;
                    C1ud c1ud3 = (C1ud) c00i4.get();
                    long Av92 = C1ud.A00(c1ud3).Av9(c1ud3.A02, 36597901668257579L);
                    C1ud c1ud4 = (C1ud) c00i4.get();
                    Av9 = C1ud.A00(c1ud4).Av9(c1ud4.A02, A0A <= Av92 ? 36597901668126506L : 36597901667995433L);
                }
            } else {
                C1ud c1ud5 = (C1ud) 1Br.A0B(this.A02);
                Av9 = C1ud.A00(c1ud5).Av9(c1ud5.A02, 36597901668781869L);
            }
            if (1Br.A00(this.A01) < Av1 + (Av9 * 60000)) {
                return false;
            }
        }
        if (num == null || (intValue = num.intValue()) == -1 || intValue == 3 || intValue == 4) {
            return true;
        }
        if (intValue != A07) {
            return false;
        }
        1BK.A0G(c00i3).A0F();
        return false;
    }
}
