package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Dyd.class */
public final class Dyd extends C1rj {
    public 1Im A00;
    public MigColorScheme A01;
    public Boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public Dyd() {
        super("MigRadioButton");
        this.A03 = true;
        this.A04 = true;
    }

    public static 8TG A00(1Iw r301) {
        return new 8TG(r301, new Dyd());
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A03), this.A02, null, this.A01, Boolean.valueOf(this.A04), Boolean.valueOf(this.A05)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        boolean z = this.A04;
        boolean z2 = this.A05;
        Boolean bool = this.A02;
        boolean z3 = this.A03;
        C1ut c1ut = C1ut.A02;
        DuX duX = new DuX(r302, new Dyt());
        Dyt dyt = duX.A01;
        dyt.A06 = migColorScheme;
        BitSet bitSet = duX.A02;
        bitSet.set(2);
        duX.A2Z(z);
        dyt.A09 = z2;
        1LI r0 = r302.A02;
        dyt.A03 = r0 == null ? null : ((Dyd) r0).A00;
        duX.A2X(2132346763);
        duX.A2Y(2132346762);
        dyt.A04 = c1ut;
        bitSet.set(0);
        dyt.A0A = !z3;
        duX.A2W(24.0f);
        if (bool != null) {
            dyt.A07 = bool;
        }
        C1rs.A04(bitSet, duX.A03);
        duX.A0J();
        return dyt;
    }
}
