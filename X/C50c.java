package X;

import java.util.Arrays;

/* renamed from: X.50c, reason: invalid class name */
/* loaded from: 50c.class */
public class C50c {
    public long A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public void A01() {
        if (!(this instanceof C50b)) {
            this.A02 = true;
            return;
        }
        C50b c50b = (C50b) this;
        ((C50c) c50b).A02 = true;
        long j = c50b.A00 | 1;
        c50b.A00 = j;
        C50b.A00(c50b, "/val", j);
    }

    public void A02() {
        if (!(this instanceof C50b)) {
            this.A05 = true;
            return;
        }
        C50b c50b = (C50b) this;
        c50b.A05 = true;
        long j = c50b.A00 | 8;
        c50b.A00 = j;
        C50b.A00(c50b, "/val", j);
    }

    public void A03() {
        if (!(this instanceof C50b)) {
            this.A06 = true;
            return;
        }
        C50b c50b = (C50b) this;
        c50b.A06 = true;
        long j = c50b.A00 | 2;
        c50b.A00 = j;
        C50b.A00(c50b, "/val", j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C50c c50c = (C50c) obj;
            if (this.A00 != c50c.A00 || this.A02 != c50c.A02 || this.A06 != c50c.A06 || this.A01 != c50c.A01 || this.A04 != c50c.A04 || this.A05 != c50c.A05 || this.A03 != c50c.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A00), Boolean.valueOf(this.A02), Boolean.valueOf(this.A06), Boolean.valueOf(this.A01), Boolean.valueOf(this.A04), Boolean.valueOf(this.A05), Boolean.valueOf(this.A03), 1BK.A0d()});
    }
}
