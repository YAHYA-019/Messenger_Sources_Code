package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8di, reason: invalid class name */
/* loaded from: 8di.class */
public final class C8di extends 1LH {
    public final int A00;
    public final MigColorScheme A01;
    public final boolean A02;
    public final int A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final 5Aw A06;
    public final 2KV A07;
    public final CharSequence A08;

    public C8di(View.OnClickListener onClickListener, 5Aw r303, MigColorScheme migColorScheme, 2KV r305, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A08 = charSequence;
        this.A07 = r305;
        this.A00 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A06 = r303;
        this.A02 = z;
        this.A05 = onClickListener;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        boolean z = this.A02;
        Boolean valueOf = Boolean.valueOf(z);
        boolean z2 = false;
        MigColorScheme migColorScheme = this.A01;
        Drawable drawable = (Drawable) 2rO.A00(c2k5, AQc.A00(c2k5, this, 8), new Object[]{valueOf, migColorScheme});
        int Atv = z ? migColorScheme.Atv() : migColorScheme.Ahv();
        C5Ax A00 = 5Av.A00(c2k5.A05);
        int A01 = 7zS.A01(c2k5, this.A00);
        5Av r0 = A00.A01;
        r0.A00 = A01;
        A00.A2d(this.A03);
        A00.A2a(this.A04);
        A00.A2i(this.A08);
        7zR.A1H(A00, this.A07, false);
        if (z && this.A06 != 5Aw.A03) {
            z2 = true;
        }
        A00.A2j(z2);
        r0.A0G = this.A06;
        r0.A0E = this.A05;
        A00.A2f(drawable);
        A00.A2Y();
        r0.A07 = migColorScheme.B9O();
        return 7zM.A0x(A00, Atv);
    }
}
