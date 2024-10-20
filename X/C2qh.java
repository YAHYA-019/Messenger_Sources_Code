package X;

import com.google.common.base.Objects;

/* renamed from: X.2qh, reason: invalid class name */
/* loaded from: 2qh.class */
public final class C2qh {
    public int A02;
    public int A06;
    public String A09;
    public final C1qN A0B = new C1qN(4);
    public int A00 = 0;
    public Integer A08 = 0S2.A00;
    public 2zP A07 = 2zP.A01;
    public int A03 = 0;
    public int A04 = 0;
    public int A01 = -1;
    public int A05 = 0;
    public final C1qN A0A = new C1qN(4);

    public void A00(C2fd c2fd, int i) {
        A01(c2fd, i, 0, this.A01);
    }

    public void A01(C2fd c2fd, int i, int i2, int i3) {
        this.A0B.put(c2fd, new 47R(i, i2, i3));
    }

    public void A02(C2qg c2qg) {
        C1qN c1qN = this.A0B;
        C2qg c2qg2 = C2qg.A0C;
        c1qN.putAll(c2qg.A08);
        this.A00 = c2qg.A00;
        this.A08 = c2qg.A0A;
        this.A03 = c2qg.A03;
        this.A04 = c2qg.A04;
        this.A01 = c2qg.A01;
        this.A09 = c2qg.A0B;
        this.A06 = c2qg.A06;
        this.A02 = c2qg.A02;
        this.A05 = c2qg.A05;
        this.A0A.putAll(c2qg.A07);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2qh c2qh = (C2qh) obj;
            if (this.A00 != c2qh.A00 || this.A07 != c2qh.A07 || this.A08 != c2qh.A08 || this.A01 != c2qh.A01 || this.A06 != c2qh.A06 || this.A02 != c2qh.A02 || this.A05 != c2qh.A05 || this.A03 != c2qh.A03 || this.A04 != c2qh.A04 || !Objects.equal(this.A09, c2qh.A09) || !Objects.equal(this.A0B, c2qh.A0B) || !Objects.equal(this.A0A, c2qh.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A0A, AnonymousClass002.A05(this.A0B, (((((((((((((((AnonymousClass002.A05(this.A07, (527 + this.A00) * 31) + 3HK.A00(this.A08)) * 31) + this.A01) * 31) + this.A06) * 31) + this.A02) * 31) + this.A05) * 31) + this.A03) * 31) + this.A04) * 31) + 1BL.A05(this.A09)) * 31));
    }
}
