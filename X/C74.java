package X;

import com.google.common.base.Objects;

/* loaded from: C74.class */
public final class C74 {
    public final 81I A00;
    public final String A01;

    public C74(81I r302, String str) {
        this.A00 = r302;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C74 c74 = (C74) obj;
            if (!Objects.equal(this.A00, c74.A00) || !Objects.equal(this.A01, c74.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }
}
