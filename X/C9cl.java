package X;

/* renamed from: X.9cl, reason: invalid class name */
/* loaded from: 9cl.class */
public final class C9cl {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Fy2 A07;
    public final C99p A08;
    public final GOf A09;
    public final GOg A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;

    public C9cl(Fy2 fy2, C99p c99p, GOf gOf, GOg gOg, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, float f, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A0A = gOg;
        this.A0G = num;
        this.A0F = num2;
        this.A0E = num3;
        this.A0D = num4;
        this.A03 = i;
        this.A0B = num5;
        this.A02 = i2;
        this.A01 = i3;
        this.A0C = num6;
        this.A05 = i4;
        this.A04 = i5;
        this.A08 = c99p;
        this.A06 = i6;
        this.A09 = gOf;
        this.A07 = fy2;
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9cl)) {
                return false;
            }
            C9cl c9cl = (C9cl) obj;
            if (!11T.A0O(this.A0A, c9cl.A0A) || !11T.A0O(this.A0G, c9cl.A0G) || !11T.A0O(this.A0F, c9cl.A0F) || !11T.A0O(this.A0E, c9cl.A0E) || !11T.A0O(this.A0D, c9cl.A0D) || this.A03 != c9cl.A03 || !11T.A0O(this.A0B, c9cl.A0B) || this.A02 != c9cl.A02 || this.A01 != c9cl.A01 || !11T.A0O(this.A0C, c9cl.A0C) || this.A05 != c9cl.A05 || this.A04 != c9cl.A04 || !11T.A0O(this.A08, c9cl.A08) || this.A06 != c9cl.A06 || !11T.A0O(this.A09, c9cl.A09) || !11T.A0O(this.A07, c9cl.A07) || Float.compare(this.A00, c9cl.A00) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A09, (AnonymousClass002.A05(this.A08, ((((((((((((((((((((AnonymousClass002.A05(this.A0F, AnonymousClass002.A05(this.A0G, (1BL.A03(this.A0A) + 1) * 31)) * 31) + AnonymousClass001.A02(this.A0E)) * 31) + AnonymousClass001.A02(this.A0D)) * 31) - 766850501) * 31) + this.A03) * 31) + AnonymousClass001.A02(this.A0B)) * 31) + this.A02) * 31) + this.A01) * 31) + AnonymousClass001.A02(this.A0C)) * 31) + this.A05) * 31) + this.A04) * 31) + this.A06) * 31) + 4YU.A03(this.A07)) * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ButtonStyleValues(textVariant=");
        A0k.append(this.A0A);
        A0k.append(", textMaxLines=");
        A0k.append(1);
        A0k.append(", textCapSpacingDp=");
        A0k.append(this.A0G);
        A0k.append(", textBaselineSpacingDp=");
        A0k.append(this.A0F);
        A0k.append(", startIconVariant=");
        A0k.append((Object) null);
        A0k.append(", startIconSizeDp=");
        A0k.append(this.A0E);
        A0k.append(", startIconMarginEndDp=");
        A0k.append(this.A0D);
        A0k.append(", startIconAlignment=");
        A0k.append("CENTERED_WITH_TEXT");
        A0k.append(", heightDp=");
        A0k.append(this.A03);
        A0k.append(DKB.A00(34));
        A0k.append(this.A0B);
        A0k.append(", cornerRadiusDp=");
        A0k.append(this.A02);
        A0k.append(", borderWidthDp=");
        A0k.append(this.A01);
        A0k.append(", borderColor=");
        A0k.append(this.A0C);
        A0k.append(", paddingStartDp=");
        A0k.append(this.A05);
        A0k.append(", paddingEndDp=");
        A0k.append(this.A04);
        A0k.append(", widthMode=");
        A0k.append(this.A08);
        A0k.append(", touchExpansionDp=");
        A0k.append(this.A06);
        A0k.append(", pressedStateVariant=");
        A0k.append(this.A09);
        A0k.append(", loadingSpinnerVariant=");
        A0k.append(this.A07);
        A0k.append(", disabledAlpha=");
        A0k.append(this.A00);
        return 4YV.A0x(A0k);
    }
}
