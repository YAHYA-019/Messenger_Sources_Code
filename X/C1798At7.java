package X;

/* renamed from: X.At7, reason: case insensitive filesystem */
/* loaded from: At7.class */
public final class C1798At7 extends C04v implements DHK {
    public final String A00;
    public final boolean A01;

    public C1798At7() {
        this(false, null);
    }

    public C1798At7(boolean z, String str) {
        this.A01 = z;
        this.A00 = str;
    }

    public boolean AbU() {
        return this.A01;
    }

    public String B8C() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1798At7)) {
                return false;
            }
            C1798At7 c1798At7 = (C1798At7) obj;
            if (this.A01 != c1798At7.A01 || !11T.A0O(this.A00, c1798At7.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass002.A00(this.A01 ? 1 : 0) * 31) + 1BL.A05(this.A00);
    }
}
