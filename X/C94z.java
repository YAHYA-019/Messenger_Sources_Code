package X;

/* renamed from: X.94z, reason: invalid class name */
/* loaded from: 94z.class */
public final class C94z extends 9MX {
    public final C97h A00;
    public final C97i A01;
    public final C97i A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final C00m A07;
    public final boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final Integer A0B;
    public final Integer A0C;

    public C94z(C97h c97h, C97i c97i, C97i c97i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str, C00m c00m, boolean z) {
        super(num6);
        this.A00 = c97h;
        this.A07 = c00m;
        this.A06 = str;
        this.A01 = c97i;
        this.A02 = c97i2;
        this.A03 = num;
        this.A0B = num2;
        this.A0A = num3;
        this.A0C = num4;
        this.A09 = num5;
        this.A05 = num7;
        this.A08 = z;
        this.A04 = num8;
    }

    public static final 2lO A00(Aaq aaq, C94z c94z) {
        long A08 = 7zU.A08(aaq, 0S2.A0G);
        2lQ r0 = 2lO.A02;
        2lO A0Y = 7zT.A0Y(7zT.A0a(4YV.A0K((2lO) null, 0S2.A01, 7zU.A08(aaq, c94z.A09)), 7zL.A0i(0S2.A0u, 7zU.A08(aaq, c94z.A0B)), A08), 7zL.A0i(0S2.A1G, 7zU.A08(aaq, c94z.A0A)), A08);
        long A082 = 7zU.A08(aaq, 0S2.A0I);
        return 7zT.A0W(A0Y, 7zM.A0q(A082), 7zU.A08(aaq, 0S2.A0H)).A00(4YV.A0K((2lO) null, 0S2.A00, 7zU.A08(aaq, c94z.A0C)));
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "ButtonMediumHeight";
            case 1:
                return "ButtonLargeHeight";
            case 2:
                return "ButtonMediumCornerRadius";
            case 3:
                return "ButtonLargeCornerRadius";
            case 4:
                return "ButtonSmallPaddingHorizontal";
            case 5:
                return "ButtonMediumPaddingHorizontal";
            case 6:
                return "ButtonLargePaddingHorizontal";
            case 7:
                return "ButtonNoOutlineBorderWidth";
            case 8:
                return "ConsentSecondaryButtonOutlineBorderWidth";
            case 9:
                return "TextInputCornerRadius";
            case 10:
                return "TextInputMinHeight";
            case 11:
                return "TextInputMediumPadding";
            case 12:
                return "TextInputEndPadding";
            case 13:
                return "TextInputVerticalPadding";
            case 14:
                return "TextInputAddOnToInputSpacing";
            case 15:
                return "TextInputIconButtonEndAddOnCornerRadius";
            case 16:
                return "TextInputIconButtonEndAddOnHeight";
            case 17:
                return "TextInputIconButtonEndAddOnWidth";
            case 18:
                return "MoreInputIconButtonEndAddOnCornerRadius";
            case 19:
                return "MoreInputIconButtonEndAddOnHeight";
            case 20:
                return "MoreInputIconButtonEndAddOnWidth";
            case 21:
                return "MoreInputIconButtonEndAddOnPaddingHorizontal";
            default:
                return "TextInputIconButtonEndAddOnPaddingHorizontal";
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C94z)) {
                return false;
            }
            C94z c94z = (C94z) obj;
            if (this.A00 != c94z.A00 || !11T.A0O(this.A07, c94z.A07) || !11T.A0O(this.A06, c94z.A06) || this.A01 != c94z.A01 || this.A02 != c94z.A02 || this.A03 != c94z.A03 || this.A0B != c94z.A0B || this.A0A != c94z.A0A || this.A0C != c94z.A0C || this.A09 != c94z.A09 || this.A05 != c94z.A05 || this.A08 != c94z.A08 || this.A04 != c94z.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A06, AnonymousClass002.A05(this.A07, 1BL.A03(this.A00)))));
        Integer num = this.A03;
        int A03 = 7zV.A03(num, A01(num), A05);
        Integer num2 = this.A0B;
        int A032 = 7zV.A03(num2, A01(num2), A03);
        Integer num3 = this.A0A;
        int A033 = 7zV.A03(num3, A01(num3), A032);
        Integer num4 = this.A0C;
        int A034 = 7zV.A03(num4, A01(num4), A033);
        Integer num5 = this.A09;
        int A035 = (7zV.A03(num5, A01(num5), A034) - 1468332762) * 31;
        Integer num6 = this.A05;
        return ((7zV.A03(num6, 9En.A00(num6), A035) + AnonymousClass002.A00(this.A08 ? 1 : 0)) * 31) + F2b.A00(this.A04);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAIIconButtonTextInputAddOnModel(iconName=");
        A0k.append(this.A00);
        A0k.append(", onClick=");
        A0k.append(this.A07);
        A0k.append(", accessibilityLabel=");
        A0k.append(this.A06);
        A0k.append(", buttonBackgroundColor=");
        A0k.append(this.A01);
        A0k.append(", iconTintColor=");
        A0k.append(this.A02);
        A0k.append(4YT.A00(82));
        A0k.append(A01(this.A03));
        A0k.append(", paddingStart=");
        A0k.append(A01(this.A0B));
        A0k.append(", paddingEnd=");
        A0k.append(A01(this.A0A));
        A0k.append(4YT.A00(208));
        A0k.append(A01(this.A0C));
        A0k.append(4YT.A00(204));
        A0k.append(A01(this.A09));
        A0k.append(", isContainedInTextInput=");
        A0k.append("TextInputIconButtonEndAddOnContained");
        A0k.append(", visibilityRule=");
        A0k.append(9En.A00(this.A05));
        A0k.append(", isEnabled=");
        A0k.append(this.A08);
        A0k.append(", verticalAlignment=");
        A0k.append(F2b.A01(this.A04));
        return 4YV.A0x(A0k);
    }
}
