package X;

/* loaded from: Kyr.class */
public abstract class Kyr {
    public static final Kzm A00;
    public static final KiB A01;
    public static final Kzn A02;
    public static final KiC A03;
    public static final L4o A04;

    static {
        L4o A012 = L9b.A01("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        A04 = A012;
        A03 = new KiC(new Lfr(5), KBd.class);
        A02 = Kzn.A00(A012, 5);
        A01 = new KiB(new Lfn(5), KBU.class);
        A00 = Kzm.A00(A012, 5);
    }

    public static KPX A00(L1i l1i) {
        if (L1i.A03.equals(l1i)) {
            return KPX.A04;
        }
        if (L1i.A01.equals(l1i)) {
            return KPX.A01;
        }
        if (L1i.A02.equals(l1i)) {
            return KPX.A03;
        }
        throw JQy.A0y(l1i, "Unable to serialize variant: ", AnonymousClass001.A0k());
    }
}
