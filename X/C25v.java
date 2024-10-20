package X;

/* renamed from: X.25v, reason: invalid class name */
/* loaded from: 25v.class */
public final class C25v {
    public static final C25v A02 = new C25v(0, 0);
    public final int A00;
    public final int A01;

    public C25v(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C25v c25v = (C25v) obj;
            if (c25v.A01 != this.A01 || c25v.A00 != this.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.A00 + this.A01;
    }

    public String toString() {
        return this == A02 ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", AnonymousClass001.A1b(Integer.valueOf(this.A01), this.A00));
    }
}
