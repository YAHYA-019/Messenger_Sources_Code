package X;

/* loaded from: Kys.class */
public abstract class Kys {
    public static final Kzm A00;
    public static final KiB A01;
    public static final Kzn A02;
    public static final KiC A03;
    public static final L4o A04;

    static {
        L4o A012 = L9b.A01("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        A04 = A012;
        A03 = new KiC(new Lfr(6), KBb.class);
        A02 = Kzn.A00(A012, 6);
        A01 = new KiB(new Lfn(6), KBY.class);
        A00 = Kzm.A00(A012, 6);
    }

    public static KPX A00(L1j l1j) {
        if (L1j.A03.equals(l1j)) {
            return KPX.A04;
        }
        if (L1j.A01.equals(l1j)) {
            return KPX.A01;
        }
        if (L1j.A02.equals(l1j)) {
            return KPX.A03;
        }
        throw JQy.A0y(l1j, "Unable to serialize variant: ", AnonymousClass001.A0k());
    }
}
