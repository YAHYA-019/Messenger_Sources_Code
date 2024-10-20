package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ns, reason: invalid class name */
/* loaded from: 8ns.class */
public final class C8ns extends C1rj {
    public static final 86K A09 = 86K.A03;
    public static final 5Aw A0A = 5Aw.A02;
    public int A00;
    public int A01;
    public Drawable A02;
    public View.OnClickListener A03;
    public 86K A04;
    public 5Aw A05;
    public MigColorScheme A06;
    public CharSequence A07;
    public boolean A08;

    public C8ns() {
        super("MigFilledLargeSecondaryButton");
        this.A04 = A09;
        this.A08 = true;
        this.A01 = 28;
        this.A05 = A0A;
    }

    public static 8TV A00(1Iw r301) {
        return new 8TV(r301, new C8ns());
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A06, Boolean.valueOf(this.A08), this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A03, this.A05, null, this.A07};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A07;
        MigColorScheme migColorScheme = this.A06;
        Drawable drawable = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        86K r0 = this.A04;
        5Aw r02 = this.A05;
        boolean z = this.A08;
        View.OnClickListener onClickListener = this.A03;
        11T.A0F(r302, 0);
        7zR.A1P(r0, r02);
        8TY A00 = C8ny.A00(r302);
        11T.A0D(charSequence);
        A00.A2b(charSequence);
        A00.A2X(2cQ.A08);
        A00.A2Z(2cR.A04);
        A00.A2Y(r0 == 86K.A03 ? C1u7.A08 : C1u7.A05);
        C8ny c8ny = A00.A01;
        c8ny.A02 = drawable;
        c8ny.A01 = i;
        c8ny.A00 = i2;
        c8ny.A0C = C1ut.A07;
        c8ny.A06 = r02;
        A00.A2c(z);
        11T.A0D(migColorScheme);
        A00.A2a(migColorScheme);
        c8ny.A05 = 8Ay.A02;
        c8ny.A03 = onClickListener;
        return A00.A2W();
    }
}
