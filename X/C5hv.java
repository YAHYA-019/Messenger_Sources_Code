package X;

/* renamed from: X.5hv, reason: invalid class name */
/* loaded from: 5hv.class */
public final class C5hv {
    public final float A00;
    public final C5ht A01;

    public C5hv(C5ht c5ht, float f) {
        this.A01 = c5ht;
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5hv c5hv = (C5hv) obj;
            if (Float.compare(c5hv.A00, this.A00) != 0 || !this.A01.equals(c5hv.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = 1BL.A03(this.A01);
        float f = this.A00;
        return A03 + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PropertyAnimation{ PropertyHandle=");
        A0k.append(this.A01);
        A0k.append(", TargetValue=");
        A0k.append(this.A00);
        return 1BL.A0v(A0k);
    }
}
