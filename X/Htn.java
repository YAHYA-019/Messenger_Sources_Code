package X;

import android.view.View;

/* loaded from: Htn.class */
public final class Htn {
    public Float A01;
    public Float A02;
    public final View A03;
    public final C01i A04 = C01g.A00(C03i.A02, new AQT(this, 3));
    public float A00 = 1.0f;

    public Htn(View view) {
        this.A03 = view;
    }

    public final void A00(int i, int i2) {
        Float f = this.A01;
        if (f == null && this.A00 == 1.0f) {
            return;
        }
        float size = View.MeasureSpec.getSize(i);
        float size2 = View.MeasureSpec.getSize(i2);
        float floatValue = f == null ? size2 : size / f.floatValue();
        float f2 = this.A00;
        float f3 = floatValue * f2;
        float f4 = f2 * size;
        if (f3 > size2 || f4 > size) {
            return;
        }
        this.A03.measure(View.MeasureSpec.makeMeasureSpec((int) f4, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f3, 1073741824));
    }

    public final void A01(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (this.A01 == null) {
            if (this.A00 < 1.0f) {
                int i6 = (int) (i5 * 0.0336f);
                View view = this.A03;
                view.layout(i6, i6, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + i6);
                return;
            }
            return;
        }
        int i7 = i4 - i2;
        View view2 = this.A03;
        int measuredHeight = view2.getMeasuredHeight();
        if (measuredHeight < i7) {
            Float f = this.A01;
            if (f == null) {
                throw 1BK.A0h();
            }
            float floatValue = f.floatValue();
            C01i c01i = this.A04;
            int i8 = (((RO5) c01i.getValue()).A03 + ((RO5) c01i.getValue()).A04) - ((RO5) c01i.getValue()).A02;
            int i9 = ((RO5) c01i.getValue()).A01 + ((RO5) c01i.getValue()).A00;
            float f2 = i5;
            float f3 = i7 - (f2 / floatValue);
            float f4 = i8;
            float f5 = (f3 - f4) - i9;
            Float valueOf = f5 >= 0.0f ? Float.valueOf(f4 + (f5 / 2.0f)) : null;
            this.A02 = valueOf;
            if (valueOf != null) {
                int i10 = this.A00 < 1.0f ? (int) (f2 * 0.0336f) : 0;
                int floatValue2 = ((int) valueOf.floatValue()) + i10;
                view2.layout(i10, floatValue2, view2.getMeasuredWidth() + i10, floatValue2 + measuredHeight);
            }
        }
    }

    public final void A02(Float f) {
        Float f2 = this.A01;
        if (f2 == null) {
            if (f == null) {
                return;
            }
        } else if (f != null && f2.floatValue() == f.floatValue()) {
            return;
        }
        this.A01 = f;
        if (f == null) {
            this.A02 = null;
        }
        this.A03.requestLayout();
    }
}
