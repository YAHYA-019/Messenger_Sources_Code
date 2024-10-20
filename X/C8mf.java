package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8mf, reason: invalid class name */
/* loaded from: 8mf.class */
public final class C8mf extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public 1LI A05;

    public C8mf() {
        super("RoundedCorner");
        this.A00 = 0;
        this.A01 = 0;
    }

    public static 8Tm A00(1Iw r301) {
        return new 8Tm(new C8mf(), r301);
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A05, Integer.valueOf(this.A03), Integer.valueOf(this.A04), null};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8mf c8mf = (C8mf) super.A0l();
        c8mf.A05 = 4YV.A0J(c8mf.A05);
        return c8mf;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A03;
        int i2 = this.A02;
        int i3 = this.A04;
        1LI r0 = this.A05;
        Drawable drawable = new 8Bc(i2, this.A00, i3, i, this.A01, true);
        2dD A0p = 7zM.A0p(r0, r302);
        A0p.A1e(drawable);
        A0p.A0g(0.0f);
        return A0p.A2W();
    }
}
