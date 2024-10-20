package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.9eo, reason: invalid class name */
/* loaded from: 9eo.class */
public abstract class C9eo {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public static final C97i A07 = C97i.A0n;
    public static final C97i A08 = C97i.A04;
    public static final C97i A09;

    static {
        long A0F = 7zP.A0F();
        A03 = A0F;
        A02 = A0F;
        long A082 = 7zQ.A08();
        A01 = A082;
        A00 = A082;
        A06 = A082;
        A09 = C97i.A0B;
        A05 = Double.doubleToRawLongBits(168.0d);
        A04 = 7zP.A0A();
    }

    public static final GradientDrawable A00(C2k6 c2k6, Integer num, float f, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i2 = 0;
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i);
        int A062 = 7zO.A06(c2k6, Double.doubleToRawLongBits(1.0d));
        if (num != null) {
            i2 = num.intValue();
        }
        gradientDrawable.setStroke(A062, i2);
        return gradientDrawable;
    }
}
