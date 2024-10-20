package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.6c1, reason: invalid class name */
/* loaded from: 6c1.class */
public final class C6c1 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public C6c1() {
        super("Dot");
    }

    public static C6c2 A00(1Iw r301) {
        return new C6c2(new C6c1(), r301);
    }

    public final Object[] A0k() {
        return new Object[]{Integer.valueOf(this.A00), 0, 0, Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A03;
        int i2 = this.A02;
        int i3 = this.A00;
        int i4 = this.A01;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setSize(i, i);
        if (i4 > 0 && i3 != 0) {
            gradientDrawable.setStroke(i4, i3, 0.0f, 0.0f);
        }
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2a(gradientDrawable);
        return A00.A2W();
    }
}
