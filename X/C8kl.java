package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.8kl, reason: invalid class name */
/* loaded from: 8kl.class */
public final class C8kl extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Drawable A07;
    public boolean A08;

    public C8kl() {
        super("GlyphComponent");
        this.A00 = -1;
        this.A01 = -1;
        this.A02 = -16777216;
        this.A03 = -1;
        this.A04 = -1;
        this.A05 = -1;
        this.A06 = -1;
        this.A08 = true;
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), 0, 0, this.A07, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), Integer.valueOf(this.A04), Integer.valueOf(this.A05), 0, Integer.valueOf(this.A06), Boolean.valueOf(this.A08)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable drawable = this.A07;
        boolean z = this.A08;
        int i = this.A00;
        int i2 = this.A02;
        int i3 = this.A04;
        int i4 = this.A03;
        int i5 = this.A05;
        int i6 = this.A06;
        int i7 = this.A01;
        boolean A1X = 1BL.A1X(r302, drawable);
        Resources A0J = 7zQ.A0J(r302);
        int dimensionPixelSize = A0J.getDimensionPixelSize(2132279310);
        int A01 = 7zN.A01(A0J);
        C2cm A00 = C2cl.A00(r302);
        A00.A2X(i2);
        A00.A2b(drawable);
        2cM A002 = 2cK.A00(r302);
        8T1 A003 = C8nu.A00(r302);
        C8nu c8nu = A003.A00;
        c8nu.A01 = 0;
        A003.A2Y(7zL.A0J(A00));
        c8nu.A03 = dimensionPixelSize;
        A003.A02.set(A1X ? 1 : 0);
        c8nu.A00 = i;
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        A003.A0B(f);
        C26z c26z = C26z.LEFT;
        int i8 = i3;
        if (i4 != -1) {
            i8 = 0;
        } else if (i3 == -1) {
            i8 = A01;
        }
        A003.A2C(c26z, i8);
        C26z c26z2 = C26z.TOP;
        int i9 = i3;
        if (i6 != -1) {
            i9 = 0;
        } else if (i3 == -1) {
            i9 = A01;
        }
        A003.A2C(c26z2, i9);
        C26z c26z3 = C26z.RIGHT;
        int i10 = i3;
        if (i5 != -1) {
            i10 = 0;
        } else if (i3 == -1) {
            i10 = A01;
        }
        A003.A2C(c26z3, i10);
        C26z c26z4 = C26z.BOTTOM;
        if (i7 != -1) {
            i3 = 0;
        } else if (i3 == -1) {
            i3 = A01;
        }
        A003.A2C(c26z4, i3);
        return 7zL.A0V(A002, A003.A2W());
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 2698774113730146L);
        return A00;
    }
}
