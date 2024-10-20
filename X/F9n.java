package X;

/* loaded from: F9n.class */
public final class F9n {
    public final boolean A00;
    public final boolean A01;

    public F9n() {
        this(true, true);
    }

    public F9n(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9n)) {
                return false;
            }
            F9n f9n = (F9n) obj;
            if (this.A01 != f9n.A01 || this.A00 != f9n.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((38347 + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0)) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        4YV.A1Q(A0k, "WriteWithAIUIConfig(forceDarkMode=");
        A0k.append(", isPillVisible=");
        A0k.append(this.A01);
        A0k.append(", isComposerVisible=");
        A0k.append(this.A00);
        A0k.append(", shouldShowNuxIllustration=");
        return DKH.A0q(A0k, false);
    }
}
