package X;

/* renamed from: X.9i4, reason: invalid class name */
/* loaded from: 9i4.class */
public final class C9i4 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public C9i4() {
        this(null, null, false, false, false, true);
    }

    public C9i4(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A01 = str;
        this.A00 = str2;
        this.A04 = z2;
        this.A02 = z3;
        this.A05 = z4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9i4)) {
                return false;
            }
            C9i4 c9i4 = (C9i4) obj;
            if (this.A03 != c9i4.A03 || !11T.A0O(this.A01, c9i4.A01) || !11T.A0O(this.A00, c9i4.A00) || this.A04 != c9i4.A04 || this.A02 != c9i4.A02 || this.A05 != c9i4.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((AnonymousClass002.A00(this.A03 ? 1 : 0) * 31) + 1BL.A05(this.A01)) * 31) + 7zN.A05(this.A00)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineFooterUiState(isDisabled=");
        A0k.append(this.A03);
        A0k.append(", prompt=");
        A0k.append(this.A01);
        A0k.append(", displayPrompt=");
        A0k.append(this.A00);
        A0k.append(", isTypedText=");
        A0k.append(this.A04);
        A0k.append(", alwaysShowAddOn=");
        A0k.append(this.A02);
        A0k.append(", shouldAutoFocusTextInput=");
        A0k.append(this.A05);
        return 4YV.A0x(A0k);
    }
}
