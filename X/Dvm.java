package X;

import java.util.List;

/* loaded from: Dvm.class */
public final class Dvm extends 1LH {
    public final String A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;
    public final long A04;
    public final 2lO A05;
    public final C00m A06;

    public Dvm(2lO r302, String str, List list, C00m c00m, long j, boolean z, boolean z2) {
        this.A01 = list;
        this.A03 = z;
        this.A02 = z2;
        this.A06 = c00m;
        this.A04 = j;
        this.A05 = r302;
        this.A00 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        if (this.A01.isEmpty()) {
            return 7zL.A0Y();
        }
        return new DvP(this.A05, this.A06, new G9J(32, EZ3.A00(c2k5, new G9D(c2k5, 22), new Object[]{04S.A00}), c2k5, this), this.A04);
    }
}
