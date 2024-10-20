package X;

/* loaded from: Io3.class */
public final class Io3 implements Cloneable {
    public Integer A00;
    public boolean A01;

    public Io3 A00() {
        try {
            return (Io3) super.clone();
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
            Io3 io3 = (Io3) obj;
            if (this.A00 != io3.A00 || this.A01 != io3.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int i = (this.A01 ? 1 : 0) * 31;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "BGRA";
                break;
            case 2:
                str = "YUV_GL3";
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return i + str.hashCode() + intValue;
    }
}
