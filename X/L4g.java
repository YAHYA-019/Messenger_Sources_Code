package X;

/* loaded from: L4g.class */
public final class L4g {
    public static final L4g A08 = KvI.A00(0.0f, 0.0f, 0.0f, 0.0f, Kwy.A00);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public L4g(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
        this.A00 = f4;
        this.A06 = j;
        this.A07 = j2;
        this.A05 = j3;
        this.A04 = j4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof L4g)) {
                return false;
            }
            L4g l4g = (L4g) obj;
            if (Float.compare(this.A01, l4g.A01) != 0 || Float.compare(this.A03, l4g.A03) != 0 || Float.compare(this.A02, l4g.A02) != 0 || Float.compare(this.A00, l4g.A00) != 0) {
                return false;
            }
            long j = this.A06;
            long j2 = l4g.A06;
            long j3 = Kwy.A00;
            if (j != j2 || this.A07 != l4g.A07 || this.A05 != l4g.A05 || this.A04 != l4g.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A00 = 1BL.A00(1BL.A00(1BL.A00(JQz.A04(this.A01), this.A03), this.A02), this.A00);
        long j = this.A06;
        long j2 = Kwy.A00;
        return AnonymousClass002.A03(this.A04, AnonymousClass002.A02(this.A05, AnonymousClass002.A02(this.A07, AnonymousClass002.A02(j, A00))));
    }

    public String toString() {
        StringBuilder A0n;
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A05;
        long j4 = this.A04;
        String A12 = 0Pz.A12(KUS.A00(this.A01), ", ", KUS.A00(this.A03), ", ", KUS.A00(this.A02), ", ", KUS.A00(this.A00));
        long j5 = Kwy.A00;
        if (AnonymousClass001.A1O((j > j2 ? 1 : (j == j2 ? 0 : -1))) && j2 == j3 && j3 == j4) {
            float A00 = DKH.A00(j);
            float A02 = JR1.A02(j);
            A0n = AnonymousClass001.A0n("RoundRect(rect=");
            if (A00 == A02) {
                A0n.append(A12);
                A0n.append(GOm.A00(33));
            } else {
                A0n.append(A12);
                A0n.append(", x=");
                A0n.append(KUS.A00(A00));
                A0n.append(", y=");
                A00 = A02;
            }
            A0n.append(KUS.A00(A00));
        } else {
            A0n = AnonymousClass001.A0n("RoundRect(rect=");
            A0n.append(A12);
            A0n.append(", topLeft=");
            A0n.append((Object) Kwy.A00(j));
            A0n.append(", topRight=");
            A0n.append((Object) Kwy.A00(j2));
            A0n.append(", bottomRight=");
            A0n.append((Object) Kwy.A00(j3));
            A0n.append(", bottomLeft=");
            A0n.append((Object) Kwy.A00(j4));
        }
        return AnonymousClass001.A0g(A0n, ')');
    }
}
