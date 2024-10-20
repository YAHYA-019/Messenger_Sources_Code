package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* loaded from: Gz5.class */
public final class Gz5 extends Ig0 implements JLw {
    public final int A00;
    public final Drawable A01;
    public final Drawable A02;
    public final Drawable A03;
    public final ImageView.ScaleType A04;
    public final Integer A05;
    public final boolean A06;
    public final int A07;
    public final Integer A08;
    public final Integer A09;
    public final Function1 A0A;
    public final boolean A0B;

    public Gz5(Drawable drawable, Drawable drawable2, Drawable drawable3, ImageView.ScaleType scaleType, Integer num, Integer num2, Integer num3, Function1 function1, int i, int i2, boolean z, boolean z2) {
        11T.A0F(function1, 4);
        this.A00 = i;
        this.A03 = drawable;
        this.A01 = drawable2;
        this.A0A = function1;
        this.A07 = i2;
        this.A09 = num;
        this.A05 = num2;
        this.A02 = drawable3;
        this.A08 = num3;
        this.A04 = scaleType;
        this.A0B = z;
        this.A06 = z2;
    }

    @Override // X.JLw
    public Function1 AYa() {
        return this.A0A;
    }

    @Override // X.JLw
    public Integer Ahr() {
        return this.A08;
    }

    @Override // X.JLw
    public boolean Aja() {
        return this.A0B;
    }

    @Override // X.JLw
    public Integer Ajd() {
        return this.A09;
    }

    @Override // X.JLw
    public Drawable Aje() {
        return this.A03;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Gz5)) {
                return false;
            }
            Gz5 gz5 = (Gz5) obj;
            if (this.A00 != gz5.A00 || !11T.A0O(this.A03, gz5.A03) || !11T.A0O(this.A01, gz5.A01) || !11T.A0O(this.A0A, gz5.A0A) || this.A07 != gz5.A07 || !11T.A0O(this.A09, gz5.A09) || !11T.A0O(this.A05, gz5.A05) || !11T.A0O(this.A02, gz5.A02) || !11T.A0O(this.A08, gz5.A08) || this.A04 != gz5.A04 || this.A0B != gz5.A0B || this.A06 != gz5.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        int A05 = (((((((AnonymousClass002.A05(this.A02, (((((AnonymousClass002.A05(this.A0A, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A03, this.A00 * 31))) + this.A07) * 31) + AnonymousClass001.A02(this.A09)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A08)) * 31) + 4YU.A03(this.A04)) * 31 * 31 * 31 * 31 * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + 1237) * 31;
        if (this.A06) {
            i = 1231;
        }
        return A05 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CheckableButtonModel(viewId=");
        A0k.append(this.A00);
        A0k.append(", enabledDrawable=");
        A0k.append(this.A03);
        A0k.append(", disabledDrawable=");
        A0k.append(this.A01);
        A0k.append(", backgroundDrawableProvider=");
        A0k.append(this.A0A);
        A0k.append(", label=");
        A0k.append(this.A07);
        A0k.append(", enabledAccessibilityDescription=");
        A0k.append(this.A09);
        A0k.append(", enabledAndCheckedAccessibilityDescription=");
        A0k.append(this.A05);
        A0k.append(", enabledAndCheckedDrawable=");
        A0k.append(this.A02);
        A0k.append(", disabledAccessibilityDescription=");
        A0k.append(this.A08);
        A0k.append(", scaleType=");
        boolean A00 = Ig0.A00(this.A04, A0k);
        A0k.append(this.A0B);
        A0k.append(", overrideAccessibilityHint=");
        A0k.append(A00);
        A0k.append(", isPrivacyAware=");
        return DKH.A0q(A0k, this.A06);
    }
}
