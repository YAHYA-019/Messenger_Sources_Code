package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8m7, reason: invalid class name */
/* loaded from: 8m7.class */
public final class C8m7 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A03;

    public C8m7() {
        super("QuicksilverGlyphIcon");
        this.A00 = 48;
        this.A01 = 2132213766;
        this.A02 = 24;
    }

    public static C8Sa A00(1Iw r301) {
        return new C8Sa(r301, new C8m7());
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), null, this.A03, Integer.valueOf(this.A01), Integer.valueOf(this.A02), 4YU.A0k()};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable drawable = this.A03;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = this.A02;
        11T.A0F(r302, 0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        float f = i2;
        A01.A0z(f);
        A01.A0l(f);
        A01.A24(C26z.ALL, 0.0f);
        A01.A2b();
        A01.A2c();
        7zL.A1J(A01);
        A01.A1n(null);
        C2cm A00 = C2cl.A00(r302);
        A00.A2b(drawable);
        A00.A2Z(i);
        float f2 = i3;
        A00.A0z(f2);
        A00.A0l(f2);
        return 7zL.A0U(A01, A00);
    }
}
