package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* loaded from: Dyo.class */
public final class Dyo extends C1rj {
    public View.OnClickListener A00;
    public C1p8 A01;
    public MigColorScheme A02;
    public boolean A03;
    public boolean A04;

    public Dyo() {
        super("MigListRadioButton");
        this.A04 = true;
    }

    public static DuY A00(1Iw r301) {
        return new DuY(r301, new Dyo());
    }

    public final Object[] A0k() {
        return new Object[]{Boolean.valueOf(this.A03), this.A00, this.A01, this.A02, Boolean.valueOf(this.A04)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        boolean z = this.A03;
        boolean z2 = this.A04;
        C1p8 c1p8 = this.A01;
        if (c1p8 == null) {
            c1p8 = C1ut.A02;
        }
        DuX duX = new DuX(r302, new Dyt());
        Dyt dyt = duX.A01;
        dyt.A06 = migColorScheme;
        BitSet bitSet = duX.A02;
        bitSet.set(2);
        dyt.A07 = Boolean.valueOf(z);
        dyt.A03 = 1LI.A09(r302, Dyo.class, "MigListRadioButton", -1904285062);
        duX.A2X(2132346763);
        duX.A2Y(2132346762);
        dyt.A04 = c1p8;
        bitSet.set(0);
        dyt.A0A = true;
        duX.A2W(24.0f);
        duX.A2Z(z2);
        C1rs.A04(bitSet, duX.A03);
        duX.A0J();
        return dyt;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1904285062) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((Ehh) obj).A00;
        View.OnClickListener onClickListener = ((Dyo) r0).A00;
        if (onClickListener == null) {
            return null;
        }
        onClickListener.onClick(view);
        return null;
    }
}
