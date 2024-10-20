package X;

import com.google.common.base.Objects;

/* loaded from: Krl.class */
public final class Krl {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public Krl(String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof Krl)) {
                return false;
            }
            Krl krl = (Krl) obj;
            if (this.A00 == krl.A00 && this.A01 == krl.A01 && Objects.equal(this.A03, krl.A03) && Objects.equal(this.A02, krl.A02)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0N(this.A03, this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01));
    }
}
