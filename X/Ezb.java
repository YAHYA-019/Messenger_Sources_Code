package X;

/* loaded from: Ezb.class */
public final class Ezb {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final GOg A0K;
    public final GOg A0L;
    public final GOg A0M;
    public final GOg A0N;
    public final 9cU A0O;
    public final 9cU A0P;
    public final 9cU A0Q;
    public final GJA A0R;
    public final Integer A0S;
    public final Integer A0T;
    public final Integer A0U;
    public final Integer A0V;
    public final Integer A0W;

    public Ezb(GOg gOg, GOg gOg2, GOg gOg3, GOg gOg4, 9cU r306, 9cU r307, 9cU r308, GJA gja, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        11T.A0F(num5, 37);
        this.A0M = gOg;
        this.A0K = gOg2;
        this.A0A = i;
        this.A0T = num;
        this.A01 = i2;
        this.A0N = gOg3;
        this.A0D = i3;
        this.A0C = i4;
        this.A0E = i5;
        this.A0U = num2;
        this.A0W = num3;
        this.A0L = gOg4;
        this.A06 = i6;
        this.A05 = i7;
        this.A07 = i8;
        this.A08 = i9;
        this.A0F = i10;
        this.A0H = i11;
        this.A0I = i12;
        this.A04 = i13;
        this.A00 = i14;
        this.A0B = i15;
        this.A09 = i16;
        this.A0P = r306;
        this.A0J = i17;
        this.A0Q = r307;
        this.A02 = i18;
        this.A0O = r308;
        this.A0G = i19;
        this.A0V = num4;
        this.A0R = gja;
        this.A03 = i20;
        this.A0S = num5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ezb)) {
                return false;
            }
            Ezb ezb = (Ezb) obj;
            if (!11T.A0O(this.A0M, ezb.A0M) || !11T.A0O(this.A0K, ezb.A0K) || this.A0A != ezb.A0A || !11T.A0O(this.A0T, ezb.A0T) || this.A01 != ezb.A01 || !11T.A0O(this.A0N, ezb.A0N) || this.A0D != ezb.A0D || this.A0C != ezb.A0C || this.A0E != ezb.A0E || this.A0U != ezb.A0U || this.A0W != ezb.A0W || !11T.A0O(this.A0L, ezb.A0L) || this.A06 != ezb.A06 || this.A05 != ezb.A05 || this.A07 != ezb.A07 || this.A08 != ezb.A08 || this.A0F != ezb.A0F || this.A0H != ezb.A0H || this.A0I != ezb.A0I || this.A04 != ezb.A04 || this.A00 != ezb.A00 || this.A0B != ezb.A0B || this.A09 != ezb.A09 || !11T.A0O(this.A0P, ezb.A0P) || this.A0J != ezb.A0J || !11T.A0O(this.A0Q, ezb.A0Q) || this.A02 != ezb.A02 || !11T.A0O(this.A0O, ezb.A0O) || this.A0G != ezb.A0G || !11T.A0O(this.A0R, ezb.A0R) || this.A03 != ezb.A03 || this.A0S != ezb.A0S) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A04;
        int A05 = (((((((((((((AnonymousClass002.A05(this.A0K, 1BL.A03(this.A0M)) + this.A0A) * 31 * 31) + AnonymousClass001.A02(this.A0T)) * 31) + this.A01) * 31 * 31) + AnonymousClass001.A02(this.A0N)) * 31) + this.A0D) * 31) + this.A0C) * 31) + this.A0E) * 31;
        int intValue = this.A0U.intValue();
        int A07 = 7zR.A07(intValue != 0 ? "EditTextHint" : "FloatingLabel", intValue, A05);
        Integer num = this.A0W;
        if (num == null) {
            A04 = 0;
        } else {
            int intValue2 = num.intValue();
            switch (intValue2) {
                case 1:
                    str = "Center";
                    break;
                case 2:
                    str = "End";
                    break;
                default:
                    str = "Start";
                    break;
            }
            A04 = 7zM.A04(str, intValue2);
        }
        return (((((((((AnonymousClass002.A05(this.A0O, (AnonymousClass002.A05(this.A0Q, (AnonymousClass002.A05(this.A0P, (((((((((((((((((((((((((A07 + A04) * 31) + AnonymousClass001.A02(this.A0L)) * 31) + this.A06) * 31) + this.A05) * 31) + this.A07) * 31 * 31) + this.A08) * 31) + this.A0F) * 31) + this.A0H) * 31) + this.A0I) * 31) + this.A04) * 31) + this.A00) * 31) + this.A0B) * 31) + this.A09) * 31) + this.A0J) * 31) + this.A02) * 31) * 31) + this.A0G) * 31) + F2b.A00(this.A0V)) * 31) + 4YU.A03(this.A0R)) * 31) + this.A03) * 31) + F2b.A00(this.A0S);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("TextInputStyleValues(inputTextVariant=");
        A0k.append(this.A0M);
        A0k.append(", disabledInputTextVariant=");
        A0k.append(this.A0K);
        A0k.append(", inputMaxLines=");
        A0k.append(this.A0A);
        A0k.append(", inputStaticPrefixLength=");
        A0k.append(0);
        A0k.append(", hintTextColor=");
        A0k.append(this.A0T);
        A0k.append(", cursorColor=");
        A0k.append(this.A01);
        DKG.A1X(A0k, ", highlightColor=");
        A0k.append(", labelTextVariant=");
        A0k.append(this.A0N);
        A0k.append(", labelCapSpacingDp=");
        A0k.append(this.A0D);
        A0k.append(", labelBaselineSpacingDp=");
        A0k.append(this.A0C);
        A0k.append(", labelMaxLines=");
        A0k.append(this.A0E);
        A0k.append(", labelBehaviour=");
        A0k.append(this.A0U.intValue() != 0 ? "EditTextHint" : "FloatingLabel");
        A0k.append(", textColumnVerticalAlignment=");
        Integer num = this.A0W;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "Center";
                    break;
                case 2:
                    str = "End";
                    break;
                default:
                    str = "Start";
                    break;
            }
        } else {
            str = "null";
        }
        A0k.append(str);
        A0k.append(", floatingLabelTextVariant=");
        A0k.append(this.A0L);
        A0k.append(", floatingLabelCapSpacingDp=");
        A0k.append(this.A06);
        A0k.append(", floatingLabelBaselineSpacingDp=");
        A0k.append(this.A05);
        A0k.append(", floatingLabelMaxLines=");
        A0k.append(this.A07);
        A0k.append(", floatingLabelStartDp=");
        A0k.append(0);
        A0k.append(", floatingLabelTopDp=");
        A0k.append(this.A08);
        A0k.append(", minHeightDp=");
        A0k.append(this.A0F);
        A0k.append(", startPaddingDp=");
        A0k.append(this.A0H);
        A0k.append(", topPaddingDp=");
        A0k.append(this.A0I);
        A0k.append(", endPaddingDp=");
        A0k.append(this.A04);
        A0k.append(", bottomPaddingDp=");
        A0k.append(this.A00);
        A0k.append(", inputToLabelDp=");
        A0k.append(this.A0B);
        A0k.append(", focusedBackgroundColor=");
        A0k.append(this.A09);
        A0k.append(", focusedBorder=");
        A0k.append(this.A0P);
        A0k.append(", unFocusedBackgroundColor=");
        A0k.append(this.A0J);
        A0k.append(", unFocusedBorder=");
        A0k.append(this.A0Q);
        A0k.append(", disabledBackgroundColor=");
        A0k.append(this.A02);
        A0k.append(", disabledBorder=");
        A0k.append(this.A0O);
        DKG.A1X(A0k, ", startAddOn=");
        A0k.append(", startAddOnEndMarginDp=");
        A0k.append(this.A0G);
        A0k.append(", startAddOnVerticalAlignment=");
        A0k.append(F2b.A01(this.A0V));
        A0k.append(", endAddOn=");
        A0k.append(this.A0R);
        A0k.append(", endAddOnStartMarginDp=");
        A0k.append(this.A03);
        A0k.append(", endAddOnVerticalAlignment=");
        return DKH.A0o(F2b.A01(this.A0S), A0k);
    }
}
