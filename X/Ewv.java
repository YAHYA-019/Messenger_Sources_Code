package X;

/* loaded from: Ewv.class */
public final class Ewv {
    public final float A00;
    public final float A01;
    public final int A02;
    public final String A03;

    public Ewv(String str, float f, float f2, int i) {
        this.A00 = f;
        this.A01 = f2;
        C1pq.A08("logTag", str);
        this.A03 = str;
        this.A02 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ewv)) {
                return false;
            }
            Ewv ewv = (Ewv) obj;
            if (this.A00 != ewv.A00 || this.A01 != ewv.A01 || !11T.A0O(this.A03, ewv.A03) || this.A02 != ewv.A02 || !"".equals("")) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03("", ((C1pq.A04(this.A03, AbM.A00(932077 + Float.floatToIntBits(this.A00), this.A01)) * 31) + this.A02) * 31);
    }
}
