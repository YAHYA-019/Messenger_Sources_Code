package X;

/* loaded from: I3k.class */
public final class I3k {
    public final Idf A00;
    public final I95 A01;
    public final JNk A02;
    public final JNZ A03;
    public final String A04;
    public final boolean A05;

    public I3k(Idf idf, I95 i95, JNk jNk, JNZ jnz, String str, boolean z) {
        this.A04 = str;
        this.A01 = i95;
        this.A00 = idf;
        this.A02 = jNk;
        this.A05 = z;
        this.A03 = jnz == null ? new IeS(null) : jnz;
    }

    public static boolean A00(I3k i3k) {
        return i3k.A00.A02();
    }

    public I1R A01() {
        if (!A00(this)) {
            return null;
        }
        try {
            return this.A02.Abc();
        } catch (J77 unused) {
            return null;
        }
    }

    public void A02(Ht4 ht4, Hqp hqp) {
        if (!A00(this)) {
            Ht4.A02(ht4);
            return;
        }
        try {
            this.A02.BeT(ht4, hqp);
        } catch (J77 unused) {
            Ht4.A02(ht4);
        }
    }
}
