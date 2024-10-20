package X;

/* loaded from: F9m.class */
public final class F9m {
    public final String A00;
    public final boolean A01;

    public F9m() {
        this(null, true);
    }

    public F9m(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof F9m)) {
                return false;
            }
            F9m f9m = (F9m) obj;
            if (!11T.A0O(this.A00, f9m.A00) || this.A01 != f9m.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A05(this.A00) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ErrorInfo(errorMessage=");
        A0k.append(this.A00);
        A0k.append(", canRetry=");
        return DKH.A0q(A0k, this.A01);
    }
}
