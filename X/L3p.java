package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: L3p.class */
public final class L3p {
    public static L3p A01 = new L3p();
    public final AtomicReference A00 = GOn.A1L(new KiD(AnonymousClass001.A0u(), AnonymousClass001.A0u()));

    public Object A00(KRu kRu, Class cls) {
        byte[] bArr;
        ByteBuffer allocate;
        LfY A012;
        L4o l4o;
        byte[] bArr2;
        ByteBuffer allocate2;
        byte[] bArr3;
        ByteBuffer allocate3;
        KiD kiD = (KiD) this.A00.get();
        Kt2 kt2 = new Kt2(kRu.getClass(), cls);
        java.util.Map map = kiD.A00;
        if (!map.containsKey(kt2)) {
            throw JQy.A0x(kt2, "No PrimitiveConstructor for ", AnonymousClass001.A0k());
        }
        switch (((Lfs) ((Kjk) map.get(kt2)).A02).A00) {
            case 0:
                return new Lfh((KBr) kRu);
            case 1:
                return new Lfx((KBr) kRu);
            case 2:
                KBV kbv = (KBV) kRu;
                ThreadLocal threadLocal = L7d.A04;
                byte[] A013 = kbv.A02.A00.A01();
                KBi kBi = kbv.A00;
                L7d l7d = new L7d(A013, kBi.A02);
                KMC kmc = Lfz.A04;
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("HMAC");
                Lfz lfz = new Lfz(AnonymousClass001.A0a(kBi.A04, A0k), new SecretKeySpec(kbv.A03.A00.A01(), "HMAC"));
                int i = kBi.A03;
                return new LfU(new Lfh(lfz, i), l7d, kbv.A01.A01(), i);
            case 3:
                KBT kbt = (KBT) kRu;
                KMC kmc2 = LfV.A02;
                KBg kBg = kbt.A00;
                int i2 = kBg.A00;
                if (i2 != 12) {
                    throw JQy.A0z("Expected IV Size 12, got ", i2);
                }
                int i3 = kBg.A02;
                if (i3 == 16) {
                    return new LfV(kbt.A01, kbt.A02.A00.A01());
                }
                throw JQy.A0z("Expected tag Size 16, got ", i3);
            case 4:
                KBS kbs = (KBS) kRu;
                if (!Lfb.A05.A00()) {
                    throw JQx.A10("Can not use AES-EAX in FIPS-mode.");
                }
                KBf kBf = kbs.A00;
                int i4 = kBf.A02;
                if (i4 == 16) {
                    return new Lfb(kbs.A02.A00.A01(), kbs.A01.A01(), kBf.A00);
                }
                throw JQy.A0z("AesEaxJce only supports 16 byte tag size, not ", i4);
            case 5:
                KBU kbu = (KBU) kRu;
                ThreadLocal threadLocal2 = LfX.A02;
                return new LfX(kbu.A02.A00.A01(), kbu.A01.A01());
            case 6:
                Lfu lfu = ((KBM) kRu).A00;
                MIz mIz = (MIz) L75.A00(Lg5.A09(lfu), MIz.class);
                KPX kpx = lfu.A01;
                int ordinal = kpx.ordinal();
                if (ordinal != 3) {
                    if (ordinal == 2 || ordinal == 4) {
                        allocate = ByteBuffer.allocate(5);
                        allocate.put((byte) 0);
                    } else {
                        if (ordinal != 1) {
                            throw JQy.A0y(kpx, "unknown output prefix type ", AnonymousClass001.A0k());
                        }
                        allocate = ByteBuffer.allocate(5);
                        allocate.put((byte) 1);
                    }
                    allocate.putInt(lfu.A04.intValue());
                    bArr = allocate.array();
                } else {
                    bArr = new byte[0];
                }
                return new LfQ(mIz, bArr);
            case 7:
                KBY kby = (KBY) kRu;
                Kjk kjk = Kcg.A02;
                Object obj = LfW.A02.get();
                L4o l4o2 = kby.A02.A00;
                return obj != null ? new LfW(l4o2.A01(), kby.A01.A01()) : new LfR(l4o2.A01(), kby.A01.A01());
            case 8:
                KBW kbw = (KBW) kRu;
                MDW mdw = Kch.A01;
                String str = kbw.A00.A01;
                A012 = Kxl.A00(str).A01(str);
                l4o = kbw.A01;
                break;
            case 9:
                KBX kbx = (KBX) kRu;
                MDW mdw2 = Kci.A01;
                KBh kBh = kbx.A00;
                String str2 = kBh.A02;
                try {
                    A012 = new LfY(Kxl.A00(str2).A01(str2), KDF.A03(L9k.A00(), KDD.DEFAULT_INSTANCE, Kwc.A01(kBh.A00)));
                    l4o = kbx.A01;
                    break;
                } catch (KLr e) {
                    throw new GeneralSecurityException((Throwable) e);
                }
            case 10:
                KBZ kbz = (KBZ) kRu;
                MDW mdw3 = Kct.A01;
                KMC kmc3 = Lfa.A02;
                Object obj2 = LfW.A02.get();
                L4o l4o3 = kbz.A02.A00;
                return obj2 != null ? new Lfa(l4o3.A01(), kbz.A01.A01()) : new LfS(l4o3.A01(), kbz.A01.A01());
            case 11:
                KBN kbn = (KBN) kRu;
                KBp kBp = kbn.A00;
                Kjk kjk2 = Kcu.A03;
                int i5 = kBp.A00;
                if (i5 != 64) {
                    throw new InvalidAlgorithmParameterException(0Pz.A0o("invalid key size: ", ". Valid keys must have ", " bytes.", i5, 64));
                }
                Collection collection = Lfe.A04;
                return new Lfe(kbn.A01, kbn.A02.A00.A01());
            case 12:
                Lfu lfu2 = ((KBM) kRu).A00;
                MJ0 mj0 = (MJ0) L75.A00(Lg5.A09(lfu2), MJ0.class);
                KPX kpx2 = lfu2.A01;
                int ordinal2 = kpx2.ordinal();
                if (ordinal2 != 3) {
                    if (ordinal2 == 2 || ordinal2 == 4) {
                        allocate2 = ByteBuffer.allocate(5);
                        allocate2.put((byte) 0);
                    } else {
                        if (ordinal2 != 1) {
                            throw JQy.A0z("unknown output prefix type ", kpx2.A01());
                        }
                        allocate2 = ByteBuffer.allocate(5);
                        allocate2.put((byte) 1);
                    }
                    allocate2.putInt(lfu2.A04.intValue());
                    bArr2 = allocate2.array();
                } else {
                    bArr2 = new byte[0];
                }
                return new Lfd(mj0, kpx2, bArr2);
            case 13:
                KBq kBq = (KBq) kRu;
                Kjk kjk3 = Kcv.A02;
                if (kBq.A00.A00 == 32) {
                    return new Lfw(kBq);
                }
                throw JQx.A10("AesCmacKey size wrong, must be 32 bytes");
            case 14:
                KBq kBq2 = (KBq) kRu;
                Kjk kjk4 = Kcv.A02;
                if (kBq2.A00.A00 == 32) {
                    return new Lfh(kBq2);
                }
                throw JQx.A10("AesCmacKey size wrong, must be 32 bytes");
            case 15:
                Lfu lfu3 = ((KBM) kRu).A00;
                MGU mgu = (MGU) L75.A00(Lg5.A09(lfu3), MGU.class);
                int ordinal3 = lfu3.A01.ordinal();
                if (ordinal3 != 3) {
                    if (ordinal3 == 2 || ordinal3 == 4) {
                        allocate3 = ByteBuffer.allocate(5);
                        allocate3.put((byte) 0);
                    } else {
                        if (ordinal3 != 1) {
                            throw JQx.A10("unknown output prefix type");
                        }
                        allocate3 = ByteBuffer.allocate(5);
                        allocate3.put((byte) 1);
                    }
                    allocate3.putInt(lfu3.A04.intValue());
                    bArr3 = allocate3.array();
                } else {
                    bArr3 = new byte[0];
                }
                return new Lff(mgu, bArr3);
            default:
                return null;
        }
        return new LfQ(A012, l4o.A01());
    }

    public void A01(MJg mJg) {
        synchronized (this) {
            AtomicReference atomicReference = this.A00;
            KiD kiD = (KiD) atomicReference.get();
            HashMap A1C = DKC.A1C(kiD.A00);
            HashMap A1C2 = DKC.A1C(kiD.A01);
            Class B4p = mJg.B4p();
            if (A1C2.containsKey(B4p)) {
                Object obj = A1C2.get(B4p);
                if (!obj.equals(mJg) || !mJg.equals(obj)) {
                    throw JQy.A0y(B4p, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type", AnonymousClass001.A0k());
                }
            } else {
                A1C2.put(B4p, mJg);
            }
            atomicReference.set(new KiD(A1C, A1C2));
        }
    }

    public void A02(Kjk kjk) {
        synchronized (this) {
            AtomicReference atomicReference = this.A00;
            KiD kiD = (KiD) atomicReference.get();
            HashMap A1C = DKC.A1C(kiD.A00);
            HashMap A1C2 = DKC.A1C(kiD.A01);
            Kt2 kt2 = new Kt2(kjk.A00, kjk.A01);
            if (A1C.containsKey(kt2)) {
                Object obj = A1C.get(kt2);
                if (!obj.equals(kjk) || !kjk.equals(obj)) {
                    throw JQy.A0y(kt2, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ", AnonymousClass001.A0k());
                }
            } else {
                A1C.put(kt2, kjk);
            }
            atomicReference.set(new KiD(A1C, A1C2));
        }
    }
}
