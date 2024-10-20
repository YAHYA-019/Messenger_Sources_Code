package X;

/* loaded from: F9l.class */
public final class F9l {
    public final boolean A00;
    public final boolean A01;

    public F9l() {
        this(true, true);
    }

    public F9l(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9l)) {
                return false;
            }
            F9l f9l = (F9l) obj;
            if (this.A01 != f9l.A01 || this.A00 != f9l.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InputComposerState(isVisible=");
        A0k.append(this.A01);
        A0k.append(", isDisabled=");
        return DKH.A0q(A0k, this.A00);
    }
}
