package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Dyc.class */
public final class Dyc extends C1rj {
    public 1Im A00;
    public C1p8 A01;
    public MigColorScheme A02;
    public boolean A03;
    public boolean A04;

    public Dyc() {
        super("MigCheckbox");
        this.A04 = true;
    }

    public static AwZ A00(1Iw r301) {
        return new AwZ(r301, new Dyc());
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A03), this.A01, this.A02, Boolean.valueOf(this.A04)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        boolean z = this.A03;
        C1p8 c1p8 = this.A01;
        boolean z2 = this.A04;
        F4h f4h = (F4h) 1Bn.A0A(99488);
        DuX duX = new DuX(r302, new Dyt());
        Dyt dyt = duX.A01;
        dyt.A06 = migColorScheme;
        BitSet bitSet = duX.A02;
        bitSet.set(2);
        dyt.A07 = Boolean.valueOf(z);
        if (c1p8 == null) {
            c1p8 = F4h.A04;
        }
        dyt.A04 = c1p8;
        bitSet.set(0);
        dyt.A05 = F4h.A05;
        1LI r0 = r302.A02;
        dyt.A03 = r0 == null ? null : ((Dyc) r0).A00;
        C00i c00i = f4h.A00;
        C1u2 c1u2 = (C1u2) c00i.get();
        C1u3 c1u3 = F4h.A01;
        C1u4 c1u4 = F4h.A03;
        duX.A2X(c1u2.A04(c1u3, c1u4));
        duX.A2Y(((C1u2) c00i.get()).A04(F4h.A02, c1u4));
        duX.A1D(4YU.A00(2RH.A07));
        dyt.A0A = false;
        duX.A2W(32.0f);
        duX.A2Z(z2);
        C1rs.A04(bitSet, duX.A03);
        duX.A0J();
        return dyt;
    }
}
