package X;

/* loaded from: Kyt.class */
public abstract class Kyt {
    public static final Kzm A00;
    public static final KiB A01;
    public static final Kzn A02;
    public static final KiC A03;
    public static final L4o A04;

    static {
        L4o A012 = L9b.A01("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        A04 = A012;
        A03 = new KiC(new Lfr(7), KBc.class);
        A02 = Kzn.A00(A012, 7);
        A01 = new KiB(new Lfn(7), KBZ.class);
        A00 = Kzm.A00(A012, 7);
    }

    public static KPX A00(L1k l1k) {
        if (L1k.A03.equals(l1k)) {
            return KPX.A04;
        }
        if (L1k.A01.equals(l1k)) {
            return KPX.A01;
        }
        if (L1k.A02.equals(l1k)) {
            return KPX.A03;
        }
        throw JQy.A0y(l1k, "Unable to serialize variant: ", AnonymousClass001.A0k());
    }
}
