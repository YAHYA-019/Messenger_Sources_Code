package X;

/* loaded from: Ez7.class */
public final class Ez7 {
    public final C9i5 A00;
    public final GJC A01;
    public final String A02;
    public final boolean A03;
    public final 3lI A04;

    public Ez7(C9i5 c9i5, GJC gjc, 3lI r304, String str, boolean z) {
        this.A01 = gjc;
        this.A04 = r304;
        this.A00 = c9i5;
        this.A02 = str;
        this.A03 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez7)) {
                return false;
            }
            Ez7 ez7 = (Ez7) obj;
            if (!11T.A0O(this.A01, ez7.A01) || !11T.A0O(this.A04, ez7.A04) || !11T.A0O(this.A00, ez7.A00) || !11T.A0O(this.A02, ez7.A02) || this.A03 != ez7.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        int A07 = (AnonymousClass002.A07(this.A02, AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A04, 1BL.A03(this.A01)))) + 1237) * 31;
        if (this.A03) {
            i = 1231;
        }
        return ((A07 + i) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MetaAiConfiguration(iconResolver=");
        A0k.append(this.A01);
        A0k.append(", appTheme=");
        A0k.append(this.A04);
        A0k.append(", metaAiLinks=");
        A0k.append(this.A00);
        A0k.append(", appName=");
        A0k.append(this.A02);
        4YV.A1Q(A0k, ", shouldShowCloseButton=");
        A0k.append(", shouldShowFeedbackInPopover=");
        A0k.append(this.A03);
        A0k.append(", shouldLockBottomSheetHeight=");
        return DKH.A0q(A0k, false);
    }
}
