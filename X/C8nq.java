package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;

/* renamed from: X.8nq, reason: invalid class name */
/* loaded from: 8nq.class */
public final class C8nq extends C1rj {
    public static final 86K A08 = 86K.A03;
    public static final 5Aw A09 = 5Aw.A02;
    public int A00;
    public Drawable A01;
    public View.OnClickListener A02;
    public 86K A03;
    public 5Aw A04;
    public MigColorScheme A05;
    public CharSequence A06;
    public boolean A07;

    public C8nq() {
        super("MigFilledPrimaryButton");
        this.A03 = A08;
        this.A07 = true;
        this.A00 = (-1) << (-1);
        this.A04 = A09;
    }

    public static 8Th A00(1Iw r301) {
        return new 8Th(r301, new C8nq());
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A02, this.A05, Boolean.valueOf(this.A07), this.A01, null, Integer.valueOf(this.A00), this.A04, this.A06};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A06;
        MigColorScheme migColorScheme = this.A05;
        boolean z = this.A07;
        int i = this.A00;
        86K r0 = this.A03;
        5Aw r02 = this.A04;
        Drawable drawable = this.A01;
        View.OnClickListener onClickListener = this.A02;
        11T.A0G(r302, 0, migColorScheme);
        1BL.A1G(r0, r02);
        8Sn r03 = new 8Sn(r302, new 8mK());
        8mK r04 = r03.A01;
        r04.A0A = charSequence;
        BitSet bitSet = r03.A02;
        bitSet.set(4);
        r04.A06 = r0 == 86K.A03 ? 2cQ.A06 : 2cQ.A03;
        bitSet.set(1);
        r04.A08 = 2cQ.A07;
        bitSet.set(3);
        r04.A07 = C1u7.A0D;
        bitSet.set(2);
        r04.A09 = migColorScheme;
        bitSet.set(0);
        r03.A2W(z);
        r04.A03 = r02;
        r04.A01 = drawable;
        r04.A00 = i;
        r04.A02 = onClickListener;
        C1rs.A04(bitSet, r03.A03);
        r03.A0J();
        return r04;
    }
}
