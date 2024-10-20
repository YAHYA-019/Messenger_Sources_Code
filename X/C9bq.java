package X;

/* renamed from: X.9bq, reason: invalid class name */
/* loaded from: 9bq.class */
public final class C9bq {
    public final 1Br A02 = 7zM.A0W();
    public final 1Br A04 = 1Bu.A00(66524);
    public final 1Br A01 = 7zM.A0d();
    public final 1Br A03 = 1Bu.A00(68807);
    public final 1Br A00 = 1Bq.A00(68885);

    public final C96m A00() {
        if (!A01()) {
            C00i c00i = this.A04.A00;
            if (!1BK.A0G(c00i).A0N()) {
                if (1BK.A1X(((C1wi) 1Br.A0B(this.A00)).A01(), true)) {
                    C1wk A0G = 1BK.A0G(c00i);
                    long A0A = 1BL.A0A(C1wk.A03(A0G), C1wg.A01(A0G, 1NK.A57, 1));
                    C1ud A0a = 7zP.A0a(this.A02);
                    if (A0A >= 7zM.A06(A0a, C1ud.A00(A0a), 36597901667208999L) - 1) {
                        return C96m.A02;
                    }
                }
                return C96m.A03;
            }
        }
        return C96m.A0A;
    }

    public final boolean A01() {
        long A06;
        boolean z = true;
        boolean A1X = 1BK.A1X(((C1wi) 1Br.A0B(this.A00)).A01(), true);
        C00i c00i = this.A04.A00;
        long A0C = 1BK.A0G(c00i).A0C();
        C1wk A0G = 1BK.A0G(c00i);
        long Av1 = C1wk.A03(A0G).Av1(C1wg.A01(A0G, A1X ? 1NK.A57 : 1NK.A58, 1), 0L);
        if (A0C == 0 && Av1 == 0) {
            return false;
        }
        long now = ((C0dp) 1Br.A0B(this.A01)).now();
        if (A1X) {
            A06 = 0;
            if (Av1 != 0) {
                C00i c00i2 = this.A02.A00;
                C1ud A0z = 7zM.A0z(c00i2);
                long A062 = 7zM.A06(A0z, C1ud.A00(A0z), 36597901667208999L) - 1;
                C1ud A0z2 = 7zM.A0z(c00i2);
                A06 = 7zM.A06(A0z2, C1ud.A00(A0z2), Av1 == A062 ? 36597901667077926L : 36597901667012389L);
            }
        } else {
            C1ud A0a = 7zP.A0a(this.A02);
            A06 = 7zM.A06(A0a, C1ud.A00(A0a), 36597901667733288L);
        }
        if (now >= A0C + (A06 * 60000)) {
            z = false;
        }
        return z;
    }
}
