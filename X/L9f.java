package X;

/* loaded from: L9f.class */
public abstract class L9f {
    public static final Kzm A00;
    public static final KiB A01;
    public static final Kzn A02;
    public static final KiC A03;
    public static final L4o A04;

    static {
        L4o A012 = L9b.A01("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        A04 = A012;
        A03 = new KiC(new Lfr(2), KBi.class);
        A02 = Kzn.A00(A012, 2);
        A01 = new KiB(new Lfn(2), KBV.class);
        A00 = Kzm.A00(A012, 2);
    }

    public static L1p A00(KPW kpw) {
        int ordinal = kpw.ordinal();
        if (ordinal == 1) {
            return L1p.A01;
        }
        if (ordinal == 5) {
            return L1p.A02;
        }
        if (ordinal == 3) {
            return L1p.A03;
        }
        if (ordinal == 2) {
            return L1p.A04;
        }
        if (ordinal == 4) {
            return L1p.A05;
        }
        if (kpw != KPW.A07) {
            throw JQy.A0z("Unable to parse HashType: ", kpw.value);
        }
        throw JQz.A0f();
    }

    public static KCr A01(KBi kBi) {
        KPW kpw;
        KCd A0F = KCr.DEFAULT_INSTANCE.A0F();
        KCd.A00(A0F).tagSize_ = kBi.A03;
        L1p l1p = kBi.A04;
        if (L1p.A01.equals(l1p)) {
            kpw = KPW.A01;
        } else if (L1p.A02.equals(l1p)) {
            kpw = KPW.A02;
        } else if (L1p.A03.equals(l1p)) {
            kpw = KPW.A03;
        } else if (L1p.A04.equals(l1p)) {
            kpw = KPW.A04;
        } else {
            if (!L1p.A05.equals(l1p)) {
                throw JQy.A0y(l1p, "Unable to serialize HashType ", AnonymousClass001.A0k());
            }
            kpw = KPW.A05;
        }
        KCd.A00(A0F).hash_ = kpw.value;
        return A0F.A04();
    }

    public static KPX A02(L1f l1f) {
        if (L1f.A03.equals(l1f)) {
            return KPX.A04;
        }
        if (L1f.A01.equals(l1f)) {
            return KPX.A01;
        }
        if (L1f.A02.equals(l1f)) {
            return KPX.A03;
        }
        throw JQy.A0y(l1f, "Unable to serialize variant: ", AnonymousClass001.A0k());
    }
}
