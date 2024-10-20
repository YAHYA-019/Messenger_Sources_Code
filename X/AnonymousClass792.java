package X;

/* renamed from: X.792, reason: invalid class name */
/* loaded from: 792.class */
public final class AnonymousClass792 extends C04v {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public AnonymousClass792() {
        this(0, false, false, false);
    }

    public AnonymousClass792(int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass792)) {
                return false;
            }
            AnonymousClass792 anonymousClass792 = (AnonymousClass792) obj;
            if (this.A00 != anonymousClass792.A00 || this.A01 != anonymousClass792.A01 || this.A02 != anonymousClass792.A02 || this.A03 != anonymousClass792.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A00 * 31) + AnonymousClass002.A00(this.A01 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0);
    }
}
