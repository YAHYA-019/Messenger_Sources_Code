package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* loaded from: Gz4.class */
public final class Gz4 extends Ig0 implements JLw {
    public final int A00;
    public final Drawable A01;
    public final Drawable A02;
    public final ImageView.ScaleType A03;
    public final int A04;
    public final Integer A05;
    public final Integer A06;
    public final Function1 A07;

    public Gz4(Drawable drawable, Drawable drawable2, ImageView.ScaleType scaleType, Integer num, Integer num2, Function1 function1, int i, int i2) {
        11T.A0F(function1, 4);
        this.A00 = i;
        this.A02 = drawable;
        this.A01 = drawable2;
        this.A07 = function1;
        this.A04 = i2;
        this.A06 = num;
        this.A05 = num2;
        this.A03 = scaleType;
    }

    @Override // X.JLw
    public Function1 AYa() {
        return this.A07;
    }

    @Override // X.JLw
    public Integer Ahr() {
        return this.A05;
    }

    @Override // X.JLw
    public boolean Aja() {
        return false;
    }

    @Override // X.JLw
    public Integer Ajd() {
        return this.A06;
    }

    @Override // X.JLw
    public Drawable Aje() {
        return this.A02;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Gz4)) {
                return false;
            }
            Gz4 gz4 = (Gz4) obj;
            if (this.A00 != gz4.A00 || !11T.A0O(this.A02, gz4.A02) || !11T.A0O(this.A01, gz4.A01) || !11T.A0O(this.A07, gz4.A07) || this.A04 != gz4.A04 || !11T.A0O(this.A06, gz4.A06) || !11T.A0O(this.A05, gz4.A05) || this.A03 != gz4.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((AnonymousClass002.A05(this.A07, AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A02, this.A00 * 31))) + this.A04) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 4YU.A03(this.A03)) * 31 * 31 * 31 * 31 * 31) + 1237) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ButtonModel(viewId=");
        A0k.append(this.A00);
        A0k.append(", enabledDrawable=");
        A0k.append(this.A02);
        A0k.append(", disabledDrawable=");
        A0k.append(this.A01);
        A0k.append(", backgroundDrawableProvider=");
        A0k.append(this.A07);
        A0k.append(", label=");
        A0k.append(this.A04);
        A0k.append(", enabledAccessibilityDescription=");
        A0k.append(this.A06);
        A0k.append(", disabledAccessibilityDescription=");
        A0k.append(this.A05);
        A0k.append(", scaleType=");
        boolean A00 = Ig0.A00(this.A03, A0k);
        A0k.append(A00);
        A0k.append(", overrideAccessibilityHint=");
        return DKH.A0q(A0k, A00);
    }
}
