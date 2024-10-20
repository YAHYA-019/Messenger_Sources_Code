package X;

import java.math.BigInteger;

/* loaded from: Lir.class */
public final class Lir implements Comparable {
    public static final Lir A06;
    public static final Lir A08;
    public final int A00;
    public final int A01;
    public final int A02;
    public final C01i A03 = JR4.A01(this, 24);
    public final String A04;
    public static final Lir A07 = new Lir(0, 0, 0, "");
    public static final Lir A05 = new Lir(0, 1, 0, "");

    static {
        Lir lir = new Lir(1, 0, 0, "");
        A08 = lir;
        A06 = lir;
    }

    public Lir(int i, int i2, int i3, String str) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A04 = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public int compareTo(Lir lir) {
        11T.A0F(lir, 0);
        return ((BigInteger) 7zM.A1B(this.A03)).compareTo((BigInteger) 7zM.A1B(lir.A03));
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof Lir) {
            Lir lir = (Lir) obj;
            if (this.A00 == lir.A00 && this.A01 == lir.A01 && this.A02 == lir.A02) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A03(this.A00) + this.A01) * 31) + this.A02;
    }

    public String toString() {
        String str = this.A04;
        String A0K = 7zL.A1V(str) ? 0Pz.A0K(str, '-') : "";
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A00);
        A0k.append('.');
        A0k.append(this.A01);
        A0k.append('.');
        A0k.append(this.A02);
        return AnonymousClass001.A0d(A0K, A0k);
    }
}
