package X;

import com.google.crypto.tink.BinaryKeysetReader;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: L8N.class */
public final class L8N {
    public final L3q A00 = L3q.A01;
    public final KCs A01;
    public final List A02;

    public L8N(KCs kCs, List list) {
        this.A01 = kCs;
        this.A02 = list;
    }

    public static final L8N A00(MIz mIz, BinaryKeysetReader binaryKeysetReader) {
        byte[] bArr = new byte[0];
        try {
            InputStream inputStream = binaryKeysetReader.A00;
            KD0 A02 = KDF.A02(new KC1(inputStream), L9k.A00(), KD0.DEFAULT_INSTANCE);
            KDF.A06(A02);
            KD0 kd0 = A02;
            inputStream.close();
            if (kd0 != null) {
                Lj4 lj4 = kd0.encryptedKeyset_;
                if (lj4.A02() != 0) {
                    try {
                        KCs A03 = KDF.A03(L9k.A00(), KCs.DEFAULT_INSTANCE, mIz.AMO(lj4.A04(), bArr));
                        if (A03 == null || A03.key_.size() <= 0) {
                            throw JQx.A10("empty keyset");
                        }
                        return A01(A03);
                    } catch (KLr unused) {
                        throw JQx.A10("invalid keyset, corrupted key material");
                    }
                }
            }
            throw JQx.A10("empty keyset");
        } catch (Throwable th) {
            binaryKeysetReader.A00.close();
            throw th;
        }
    }

    public static final L8N A01(KCs kCs) {
        KRu A04;
        int ordinal;
        L1e l1e;
        if (kCs == null || kCs.key_.size() <= 0) {
            throw JQx.A10("empty keyset");
        }
        ArrayList A1B = AbJ.A1B(kCs.key_);
        for (KDE kde : kCs.key_) {
            int i = kde.keyId_;
            try {
                KPX A00 = KPX.A00(kde.outputPrefixType_);
                if (A00 == null) {
                    A00 = KPX.A06;
                }
                Integer valueOf = A00 == KPX.A03 ? null : Integer.valueOf(i);
                try {
                    KDC kdc = kde.keyData_;
                    KDC kdc2 = kdc;
                    if (kdc == null) {
                        kdc = KDC.DEFAULT_INSTANCE;
                    }
                    String str = kdc.typeUrl_;
                    KDC kdc3 = kdc2;
                    if (kdc2 == null) {
                        kdc3 = KDC.DEFAULT_INSTANCE;
                    }
                    Lj4 lj4 = kdc3.value_;
                    if (kdc2 == null) {
                        kdc2 = KDC.DEFAULT_INSTANCE;
                    }
                    Lfu A002 = Lfu.A00(kdc2.A0I(), A00, lj4, valueOf, str);
                    LCx lCx = LCx.A01;
                    if (((KkW) lCx.A00.get()).A00.containsKey(new Kt3(A002.A03, A002.getClass()))) {
                        A04 = lCx.A04(A002);
                    } else {
                        new KBM(A002);
                    }
                    ordinal = kde.A0I().ordinal();
                } catch (GeneralSecurityException e) {
                    new RuntimeException("Creating a protokey serialization failed", e);
                }
                if (ordinal == 1) {
                    l1e = L1e.A03;
                } else if (ordinal == 2) {
                    l1e = L1e.A02;
                } else {
                    if (ordinal != 3) {
                        GeneralSecurityException generalSecurityException = JQx.A10("Unknown key status");
                        throw generalSecurityException;
                        break;
                    }
                    l1e = L1e.A01;
                }
                A1B.add(new Ki9(A04, l1e));
            } catch (GeneralSecurityException unused) {
                A1B.add(null);
            }
        }
        return new L8N(kCs, Collections.unmodifiableList(A1B));
    }

    public Object A02(Class cls) {
        Class cls2;
        java.util.Map map;
        try {
            map = ((KiD) L3p.A01.A00.get()).A01;
        } catch (GeneralSecurityException unused) {
            cls2 = null;
        }
        if (!map.containsKey(cls)) {
            throw JQy.A0x(cls, "No input primitive class for ", AnonymousClass001.A0k());
        }
        cls2 = ((MJg) map.get(cls)).Aqu();
        if (cls2 == null) {
            throw JQx.A10(JQx.A0v(cls, "No wrapper found for "));
        }
        KCs kCs = this.A01;
        int i = kCs.primaryKeyId_;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (KDE kde : kCs.key_) {
            KPU A0I = kde.A0I();
            if (A0I == KPU.A03) {
                if (!((kde.bitField0_ & 1) != 0)) {
                    throw JQy.A10("key %d has no key data", AnonymousClass001.A1a(kde.keyId_));
                }
                KPX A00 = KPX.A00(kde.outputPrefixType_);
                if (A00 == null) {
                    A00 = KPX.A06;
                }
                if (A00 == KPX.A05) {
                    throw JQy.A10("key %d has unknown prefix", AnonymousClass001.A1a(kde.keyId_));
                }
                if (A0I == KPU.A04) {
                    throw JQy.A10("key %d has unknown status", AnonymousClass001.A1a(kde.keyId_));
                }
                if (kde.keyId_ == i) {
                    if (z) {
                        throw JQx.A10("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                KDC kdc = kde.keyData_;
                if (kdc == null) {
                    kdc = KDC.DEFAULT_INSTANCE;
                }
                if (kdc.A0I() != KPV.A02) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw JQx.A10("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw JQx.A10("keyset doesn't contain a valid primary key");
        }
        Klv klv = null;
        HashMap A0u = AnonymousClass001.A0u();
        ArrayList A0s = AnonymousClass001.A0s();
        L3q l3q = this.A00;
        int i3 = 0;
        while (true) {
            List list = this.A02;
            if (i3 >= list.size()) {
                L0X l0x = new L0X(klv, l3q, cls2, A0s, A0u);
                java.util.Map map2 = ((KiD) L3p.A01.A00.get()).A01;
                if (!map2.containsKey(cls)) {
                    throw JQy.A0y(cls, "No wrapper found for ", AnonymousClass001.A0k());
                }
                MJg mJg = (MJg) map2.get(cls);
                Class cls3 = l0x.A02;
                Class Aqu = mJg.Aqu();
                if (cls3.equals(Aqu) && Aqu.equals(cls3)) {
                    return mJg.DAn(l0x);
                }
                throw JQx.A10("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
            }
            KDE kde2 = (KDE) kCs.key_.get(i3);
            KPU A0I2 = kde2.A0I();
            KPU kpu = KPU.A03;
            if (A0I2.equals(kpu)) {
                Ki9 ki9 = (Ki9) list.get(i3);
                if (ki9 == null) {
                    KDC kdc2 = kde2.keyData_;
                    if (kdc2 == null) {
                        kdc2 = KDC.DEFAULT_INSTANCE;
                    }
                    throw JQx.A10(0Pz.A0G(i3, "Key parsing of key with index ", " and type_url ", kdc2.typeUrl_, " failed, unable to get primitive"));
                }
                KRu kRu = ki9.A00;
                try {
                    Object A002 = L3p.A01.A00(kRu, cls2);
                    if (kde2.keyId_ == kCs.primaryKeyId_) {
                        if (A002 == null) {
                            throw AnonymousClass001.A0Q("`fullPrimitive` must not be null");
                        }
                        if (kde2.A0I() != kpu) {
                            throw JQx.A10("only ENABLED key is allowed");
                        }
                        L4o A003 = L4o.A00(Kxk.A00(kde2));
                        KPU A0I3 = kde2.A0I();
                        KPX A004 = KPX.A00(kde2.outputPrefixType_);
                        if (A004 == null) {
                            A004 = KPX.A06;
                        }
                        int i4 = kde2.keyId_;
                        KDC kdc3 = kde2.keyData_;
                        if (kdc3 == null) {
                            kdc3 = KDC.DEFAULT_INSTANCE;
                        }
                        Klv klv2 = new Klv(kRu, A0I3, A004, A003, A002, kdc3.typeUrl_, i4);
                        L0X.A00(klv2, A0s, A0u);
                        if (klv != null) {
                            throw AnonymousClass001.A0N("you cannot set two primary primitives");
                        }
                        klv = klv2;
                    } else {
                        if (A002 == null) {
                            throw AnonymousClass001.A0Q("`fullPrimitive` must not be null");
                        }
                        if (kde2.A0I() != kpu) {
                            throw JQx.A10("only ENABLED key is allowed");
                        }
                        L4o A005 = L4o.A00(Kxk.A00(kde2));
                        KPU A0I4 = kde2.A0I();
                        KPX A006 = KPX.A00(kde2.outputPrefixType_);
                        if (A006 == null) {
                            A006 = KPX.A06;
                        }
                        int i5 = kde2.keyId_;
                        KDC kdc4 = kde2.keyData_;
                        if (kdc4 == null) {
                            kdc4 = KDC.DEFAULT_INSTANCE;
                        }
                        L0X.A00(new Klv(kRu, A0I4, A006, A005, A002, kdc4.typeUrl_, i5), A0s, A0u);
                    }
                } catch (GeneralSecurityException e) {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Unable to get primitive ");
                    A0k.append(cls2);
                    A0k.append(" for key of type ");
                    KDC kdc5 = kde2.keyData_;
                    if (kdc5 == null) {
                        kdc5 = KDC.DEFAULT_INSTANCE;
                    }
                    A0k.append(kdc5.typeUrl_);
                    throw new GeneralSecurityException(AnonymousClass001.A0d(", see https://developers.google.com/tink/faq/registration_errors", A0k), e);
                }
            }
            i3++;
        }
    }

    public String toString() {
        return Kxm.A00(this.A01).toString();
    }
}
