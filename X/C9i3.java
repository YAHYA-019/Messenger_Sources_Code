package X;

/* renamed from: X.9i3, reason: invalid class name */
/* loaded from: 9i3.class */
public final class C9i3 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C9i3() {
        this(null, null, false, false, true);
    }

    public C9i3(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = str2;
        this.A04 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9i3)) {
                return false;
            }
            C9i3 c9i3 = (C9i3) obj;
            if (!11T.A0O(this.A01, c9i3.A01) || this.A03 != c9i3.A03 || this.A02 != c9i3.A02 || !11T.A0O(this.A00, c9i3.A00) || this.A04 != c9i3.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((1BL.A05(this.A01) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + 7zN.A05(this.A00)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PromptParams(inputPrompt=");
        A0k.append(this.A01);
        A0k.append(", isTextInputDisabled=");
        A0k.append(this.A03);
        A0k.append(", alwaysShowAddOn=");
        A0k.append(this.A02);
        A0k.append(", displayPrompt=");
        A0k.append(this.A00);
        A0k.append(", shouldAutoFocusTextInput=");
        A0k.append(this.A04);
        return 4YV.A0x(A0k);
    }
}
