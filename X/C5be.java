package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import java.util.Arrays;

/* renamed from: X.5be, reason: invalid class name */
/* loaded from: 5be.class */
public final class C5be extends GradientDrawable implements 2hW {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public float[] A0D;
    public int[] A0E;

    public C5be() {
        this(GradientDrawable.Orientation.TOP_BOTTOM, null);
    }

    public C5be(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.A0E = iArr;
        this.A0A = -1;
        this.A06 = -1;
        this.A09 = -1;
    }

    public boolean BSD(2hW r302) {
        11T.A0F(r302, 0);
        return equals(r302);
    }

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        11T.A0F(obj, 0);
        return equals(obj);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof C5be)) {
                return false;
            }
            C5be c5be = (C5be) obj;
            if (this.A04 == c5be.A04 && 11T.A0O(this.A0B, c5be.A0B) && this.A00 == c5be.A00 && this.A05 == c5be.A05 && this.A01 == c5be.A01 && this.A07 == c5be.A07 && this.A0A == c5be.A0A && this.A06 == c5be.A06 && this.A09 == c5be.A09 && this.A03 == c5be.A03 && this.A02 == c5be.A02 && this.A08 == c5be.A08 && getOrientation() == c5be.getOrientation() && Arrays.equals(this.A0E, c5be.A0E) && Arrays.equals(this.A0D, c5be.A0D) && 11T.A0O(this.A0C, c5be.A0C)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((Arrays.hashCode(new Object[]{getOrientation(), Integer.valueOf(this.A04), this.A0B, Float.valueOf(this.A00), Integer.valueOf(this.A05), Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A0A), Integer.valueOf(this.A06), Integer.valueOf(this.A09), Float.valueOf(this.A03), Float.valueOf(this.A02), Integer.valueOf(this.A08), this.A0C}) * 31) + Arrays.hashCode(this.A0E)) * 31) + Arrays.hashCode(this.A0D);
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColor(int i) {
        super.setColor(i);
        this.A04 = i;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColor(ColorStateList colorStateList) {
        super.setColor(colorStateList);
        this.A0B = colorStateList;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColors(int[] iArr) {
        super.setColors(iArr);
        this.A0E = iArr;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setCornerRadii(float[] fArr) {
        super.setCornerRadii(fArr);
        this.A0D = fArr;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setCornerRadius(float f) {
        super.setCornerRadius(f);
        this.A00 = f;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setGradientRadius(float f) {
        super.setGradientRadius(f);
        this.A01 = f;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setGradientType(int i) {
        super.setGradientType(i);
        this.A05 = i;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setShape(int i) {
        super.setShape(i);
        this.A07 = i;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setSize(int i, int i2) {
        super.setSize(i, i2);
        this.A0A = i;
        this.A06 = i2;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setStroke(int i, int i2, float f, float f2) {
        super.setStroke(i, i2, f, f2);
        this.A09 = i;
        this.A03 = f;
        this.A02 = f2;
        this.A08 = i2;
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setStroke(int i, ColorStateList colorStateList, float f, float f2) {
        11T.A0F(colorStateList, 1);
        super.setStroke(i, colorStateList, f, f2);
        this.A09 = i;
        this.A03 = f;
        this.A02 = f2;
        this.A0C = colorStateList;
    }
}
