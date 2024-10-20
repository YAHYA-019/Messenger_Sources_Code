package X;

import com.google.common.base.Objects;

/* renamed from: X.2qg, reason: invalid class name */
/* loaded from: 2qg.class */
public final class C2qg {
    public static final C2qg A0C = new C2qg(new C2qh());
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C1qN A07;
    public final C1qN A08;
    public final 2zP A09;
    public final Integer A0A;
    public final String A0B;

    public C2qg(C2qh c2qh) {
        C1qN c1qN = c2qh.A0B;
        C1qN c1qN2 = new C1qN(c1qN.size());
        c1qN2.putAll(c1qN);
        this.A08 = c1qN2;
        this.A00 = c2qh.A00;
        this.A0A = c2qh.A08;
        this.A09 = c2qh.A07;
        this.A03 = c2qh.A03;
        this.A04 = c2qh.A04;
        this.A01 = c2qh.A01;
        this.A0B = c2qh.A09;
        this.A06 = c2qh.A06;
        this.A02 = c2qh.A02;
        this.A05 = c2qh.A05;
        C1qN c1qN3 = c2qh.A0A;
        C1qN c1qN4 = new C1qN(c1qN3.size());
        c1qN4.putAll(c1qN3);
        this.A07 = c1qN4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C2qg c2qg = (C2qg) obj;
            if (this.A00 != c2qg.A00 || this.A09 != c2qg.A09 || this.A0A != c2qg.A0A || this.A01 != c2qg.A01 || this.A06 != c2qg.A06 || this.A02 != c2qg.A02 || this.A05 != c2qg.A05 || this.A03 != c2qg.A03 || this.A04 != c2qg.A04 || !Objects.equal(this.A0B, c2qg.A0B) || !Objects.equal(this.A08, c2qg.A08) || !Objects.equal(this.A07, c2qg.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A07, AnonymousClass002.A05(this.A08, (((((((((((((((AnonymousClass002.A05(this.A09, (527 + this.A00) * 31) + 3HK.A00(this.A0A)) * 31) + this.A01) * 31) + this.A06) * 31) + this.A02) * 31) + this.A05) * 31) + this.A03) * 31) + this.A04) * 31) + 1BL.A05(this.A0B)) * 31));
    }
}
