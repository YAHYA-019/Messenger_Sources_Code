package X;

import com.google.common.base.Objects;

/* loaded from: C7o.class */
public final class C7o {
    public final String A00;
    public final String A01;
    public final String A02;
    public final long A03;

    public C7o(long j, String str, String str2, String str3) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C7o c7o = (C7o) obj;
            if (this.A03 != c7o.A03 || !Objects.equal(this.A00, c7o.A00) || !Objects.equal(this.A01, c7o.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.A00, this.A01, Long.valueOf(this.A03));
    }
}
