package X;

/* renamed from: X.791, reason: invalid class name */
/* loaded from: 791.class */
public final class AnonymousClass791 extends C04v {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass791() {
        this(0, false, false, false, false, false, false);
    }

    public AnonymousClass791(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = z;
        this.A06 = z2;
        this.A03 = z3;
        this.A02 = z4;
        this.A00 = i;
        this.A05 = z5;
        this.A01 = z6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass791)) {
                return false;
            }
            AnonymousClass791 anonymousClass791 = (AnonymousClass791) obj;
            if (this.A04 != anonymousClass791.A04 || this.A06 != anonymousClass791.A06 || this.A03 != anonymousClass791.A03 || this.A02 != anonymousClass791.A02 || this.A00 != anonymousClass791.A00 || this.A05 != anonymousClass791.A05 || this.A01 != anonymousClass791.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass002.A00(this.A04 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A05 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0);
    }
}
