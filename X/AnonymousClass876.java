package X;

/* renamed from: X.876, reason: invalid class name */
/* loaded from: 876.class */
public final class AnonymousClass876 {
    public final int A00;
    public final int A01;

    public AnonymousClass876(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnonymousClass876)) {
                return false;
            }
            AnonymousClass876 anonymousClass876 = (AnonymousClass876) obj;
            if (this.A00 != anonymousClass876.A00 || this.A01 != anonymousClass876.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }
}
