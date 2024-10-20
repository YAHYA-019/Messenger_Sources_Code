package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: L81.class */
public final class L81 {
    public static final MDW A01;
    public static final L81 A02;
    public final java.util.Map A00 = AnonymousClass001.A0u();

    static {
        Lfo lfo = new Lfo(9);
        A01 = lfo;
        L81 l81 = new L81();
        try {
            l81.A01(lfo, KBR.class);
            A02 = l81;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0037. Please report as an issue. */
    public static KRu A00(KT4 kt4, L81 l81) {
        GeneralSecurityException A10;
        KRu kRu;
        synchronized (l81) {
            MDW mdw = (MDW) l81.A00.get(kt4.getClass());
            if (mdw != null) {
                switch (((Lfo) mdw).A00) {
                    case 0:
                        KBi kBi = (KBi) kt4;
                        Kjk kjk = Kd6.A04;
                        int i = kBi.A00;
                        if (i != 16 && i != 32) {
                            A10 = JQx.A10("AES key size must be 16 or 32 bytes");
                            break;
                        } else {
                            KzL A00 = KzL.A00(i);
                            int i2 = kBi.A01;
                            KzL A002 = KzL.A00(i2);
                            if (i != A00.A00.A00.length) {
                                A10 = JQx.A10("AES key size mismatch");
                                break;
                            } else if (i2 != A002.A00.A00.length) {
                                A10 = JQx.A10("HMAC key size mismatch");
                                break;
                            } else if (!kBi.A01()) {
                                new KBV(kBi, KYR.A00(kBi, (Integer) null), A00, A002, (Integer) null);
                                break;
                            } else {
                                A10 = JQx.A0z();
                                break;
                            }
                        }
                        break;
                    case 1:
                        KBf kBf = (KBf) kt4;
                        Kjk kjk2 = Kcf.A02;
                        int i3 = kBf.A01;
                        if (i3 == 24) {
                            A10 = JQx.A10("192 bit AES GCM Parameters are not valid");
                            break;
                        } else {
                            KzL A003 = KzL.A00(i3);
                            if (i3 != A003.A00.A00.length) {
                                A10 = JQx.A10("Key size mismatch");
                                break;
                            } else if (!kBf.A01()) {
                                new KBS(kBf, KYT.A00(kBf, (Integer) null), A003, (Integer) null);
                                break;
                            } else {
                                A10 = JQx.A0z();
                                break;
                            }
                        }
                    case 2:
                        KBg kBg = (KBg) kt4;
                        Kjk kjk3 = Kd7.A04;
                        int i4 = kBg.A01;
                        if (i4 == 24) {
                            A10 = JQx.A10("192 bit AES GCM Parameters are not valid");
                            break;
                        } else {
                            KzL A004 = KzL.A00(i4);
                            if (i4 != A004.A00.A00.length) {
                                A10 = JQx.A10("Key size mismatch");
                                break;
                            } else if (!kBg.A01()) {
                                new KBT(kBg, KYV.A00(kBg, (Integer) null), A004, (Integer) null);
                                break;
                            } else {
                                A10 = JQx.A0z();
                                break;
                            }
                        }
                    case 3:
                        KBd kBd = (KBd) kt4;
                        Kjk kjk4 = Kcs.A03;
                        int i5 = kBd.A00;
                        KzL A005 = KzL.A00(i5);
                        if (i5 != A005.A00.A00.length) {
                            A10 = JQx.A10("Key size mismatch");
                            break;
                        } else if (!kBd.A01()) {
                            new KBU(kBd, KYW.A00(kBd, (Integer) null), A005, (Integer) null);
                            break;
                        } else {
                            A10 = JQx.A0z();
                            break;
                        }
                    case 4:
                        KBb kBb = (KBb) kt4;
                        Kjk kjk5 = Kcg.A02;
                        kRu = KBY.A00(kBb.A00, KzL.A00(32), (Integer) null);
                        break;
                    case 5:
                        KBe kBe = (KBe) kt4;
                        MDW mdw2 = Kch.A01;
                        kRu = KBW.A00(kBe, (Integer) null);
                        break;
                    case 6:
                        KBh kBh = (KBh) kt4;
                        MDW mdw3 = Kci.A01;
                        kRu = KBX.A00(kBh, (Integer) null);
                        break;
                    case 7:
                        KBc kBc = (KBc) kt4;
                        MDW mdw4 = Kct.A01;
                        kRu = KBZ.A00(kBc.A00, KzL.A00(32), (Integer) null);
                        break;
                    case 8:
                        KBp kBp = (KBp) kt4;
                        Kjk kjk6 = Kcu.A03;
                        int i6 = kBp.A00;
                        if (i6 != 64) {
                            new InvalidAlgorithmParameterException(0Pz.A0o("invalid key size: ", ". Valid keys must have ", " bytes.", i6, 64));
                            break;
                        } else {
                            KzL A006 = KzL.A00(i6);
                            if (i6 != A006.A00.A00.length) {
                                A10 = JQx.A10("Key size mismatch");
                                break;
                            } else if (!kBp.A01()) {
                                new KBN(kBp, KYX.A00(kBp, (Integer) null), A006, (Integer) null);
                                break;
                            } else {
                                A10 = JQx.A0z();
                                break;
                            }
                        }
                    case 9:
                        KDD kdd = ((KBR) kt4).A00.A00;
                        L8M l8m = L8M.A02;
                        Kq9 A007 = L8M.A00(l8m, kdd.typeUrl_);
                        if (!AnonymousClass001.A1V(l8m.A01.get(kdd.typeUrl_))) {
                            A10 = JQx.A10("Creating new keys is not allowed.");
                            break;
                        } else {
                            KDC A008 = A007.A00(kdd.value_);
                            new KBM(Lfu.A00(A008.A0I(), kdd.A0I(), A008.value_, null, A008.typeUrl_));
                            break;
                        }
                    case 10:
                        KBs kBs = (KBs) kt4;
                        Kjk kjk7 = Kcv.A02;
                        int i7 = kBs.A00;
                        if (i7 != 32) {
                            A10 = JQx.A10("AesCmacKey size wrong, must be 32 bytes");
                            break;
                        } else {
                            KzL A009 = KzL.A00(i7);
                            if (i7 != A009.A00.A00.length) {
                                A10 = JQx.A10("Key size mismatch");
                                break;
                            } else if (!kBs.A01()) {
                                new KBq(kBs, KYZ.A00(kBs, (Integer) null), A009, (Integer) null);
                                break;
                            } else {
                                A10 = JQx.A0z();
                                break;
                            }
                        }
                    case 11:
                        KBt kBt = (KBt) kt4;
                        Kjk kjk8 = KdE.A04;
                        int i8 = kBt.A00;
                        KzL A0010 = KzL.A00(i8);
                        if (i8 != A0010.A00.A00.length) {
                            A10 = JQx.A10("Key size mismatch");
                            break;
                        } else if (!kBt.A01()) {
                            new KBr(kBt, KYb.A00(kBt, (Integer) null), A0010, (Integer) null);
                            break;
                        } else {
                            A10 = JQx.A0z();
                            break;
                        }
                    default:
                        kRu = null;
                        break;
                }
            } else {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Cannot create a new key for parameters ");
                A0k.append(kt4);
                A10 = JQx.A10(AnonymousClass001.A0d(": no key creator for this class was registered.", A0k));
            }
            throw A10;
        }
        return kRu;
    }

    public void A01(MDW mdw, Class cls) {
        synchronized (this) {
            java.util.Map map = this.A00;
            MDW mdw2 = (MDW) map.get(cls);
            if (mdw2 != null && !mdw2.equals(mdw)) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Different key creator for parameters class ");
                A0k.append(cls);
                throw JQx.A10(AnonymousClass001.A0d(" already inserted", A0k));
            }
            map.put(cls, mdw);
        }
    }
}
