package X;

/* loaded from: Ktf.class */
public final class Ktf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final boolean A05;

    public Ktf(int i, int i2, int i3, long j, long j2, boolean z) {
        this.A04 = j;
        this.A03 = j2;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = z;
        this.A00 = i3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Ktf ktf = (Ktf) obj;
            if (this.A04 != ktf.A04 || this.A03 != ktf.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((int) this.A04) * 31) + ((int) this.A03);
    }

    public String toString() {
        String format = String.format("<S t=\"%d\" d=\"%d\"/>", GOo.A1b(Long.valueOf(this.A04), this.A03));
        if (this.A05) {
            format = 0Pz.A0W(format, " (p) ");
        }
        return format;
    }
}
