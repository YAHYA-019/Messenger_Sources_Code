package X;

/* loaded from: Io2.class */
public final class Io2 implements Cloneable {
    public Integer A00;
    public boolean A01;

    public Io2 A00() {
        try {
            return (Io2) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Io2 io2 = (Io2) obj;
            if (this.A00 != io2.A00 || this.A01 != io2.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (this.A01 ? 1 : 0) * 31;
        int intValue = this.A00.intValue();
        return i + (1 != intValue ? "DEFAULT" : "BGRA").hashCode() + intValue;
    }
}
