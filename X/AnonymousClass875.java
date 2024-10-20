package X;

import android.view.View;

/* renamed from: X.875, reason: invalid class name */
/* loaded from: 875.class */
public final class AnonymousClass875 implements AaE {
    public final 1Br A00 = 1Bq.A00(67721);
    public final int A01;
    public final int A02;

    public AnonymousClass875(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public static final AnonymousClass876 A00(AnonymousClass875 anonymousClass875, int i) {
        int i2 = anonymousClass875.A02;
        int i3 = anonymousClass875.A01;
        C00i c00i = anonymousClass875.A00.A00;
        AnonymousClass877 anonymousClass877 = (AnonymousClass877) c00i.get();
        int A07 = 1BL.A07(i2 > i3 ? anonymousClass877.A02 : anonymousClass877.A04);
        double d = A07;
        int i4 = (int) ((i2 / i3) * d);
        int min = Math.min(i, 1BL.A07(((AnonymousClass877) c00i.get()).A03));
        if (i4 > min) {
            A07 = (int) (d * (min / i4));
            i4 = min;
        } else if (i4 < 0) {
            A07 = (int) (d * (0.0d / i4));
            i4 = 0;
        }
        return new AnonymousClass876(A07, i4);
    }

    public AnonymousClass876 B8r() {
        return A00(this, (-1) >>> 1);
    }

    public void C5n(C23P c23p, int i, int i2) {
        AnonymousClass876 A00 = A00(this, View.MeasureSpec.getSize(i));
        C2ra.A05(c23p, i, i2, A00.A01, A00.A00);
    }

    public float getAspectRatio() {
        int i = this.A01;
        if (i == 0) {
            return 0.0f;
        }
        return this.A02 / i;
    }
}
