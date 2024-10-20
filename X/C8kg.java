package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.8kg, reason: invalid class name */
/* loaded from: 8kg.class */
public final class C8kg extends C1rj {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public 1LI A05;
    public 1LI A06;

    public C8kg() {
        super("SnippetBadge");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, Float.valueOf(this.A00), Integer.valueOf(this.A02), Float.valueOf(this.A01), Integer.valueOf(this.A03), this.A05, this.A06};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8kg c8kg = (C8kg) super.A0l();
        1LI r304 = null;
        c8kg.A05 = 7zO.A0S(c8kg.A05);
        1LI r0 = c8kg.A06;
        if (r0 != null) {
            r304 = r0.A0l();
        }
        c8kg.A06 = r304;
        return c8kg;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rq A01;
        C26z c26z;
        1LI r0 = this.A05;
        int i = this.A03;
        Drawable drawable = this.A04;
        int i2 = this.A02;
        float f = this.A01;
        float f2 = this.A00;
        1LI r02 = this.A06;
        if (i == 1) {
            A01 = 2cK.A01(r302, (String) null, 0);
            c26z = C26z.BOTTOM;
        } else if (i == 2) {
            A01 = C1rg.A01(r302, null, 0);
            A01.A00.A05 = true;
            c26z = C26z.START;
        } else if (i != 3) {
            A01 = C1rg.A01(r302, null, 0);
            c26z = C26z.END;
        } else {
            A01 = 2cK.A01(r302, (String) null, 0);
            ((2cM) A01).A00.A05 = true;
            c26z = C26z.TOP;
        }
        A01.A2Y(C1ro.FLEX_START);
        A01.A2a(C1rp.CENTER);
        A01.A2Z(C1ro.CENTER);
        if (i == 2 && r02 != null) {
            A01.A2X(r02);
        }
        if (drawable != null) {
            C2cq A0u = 7zM.A0u(drawable, r302, 0);
            A0u.A2C(c26z, i2);
            if (f != -1.0f) {
                A0u.A0z(f);
            }
            if (f2 != -1.0f) {
                A0u.A0l(f2);
            }
            A01.A2X(A0u.A2W());
        }
        A01.A2X(r0);
        return A01.A2V();
    }
}
