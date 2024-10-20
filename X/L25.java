package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: L25.class */
public final class L25 {
    public static final L25 A02 = new L25();
    public final ConcurrentMap A00 = JQx.A13();
    public final KzX A01 = new KzX();

    public ML1 A00(Class cls) {
        KYf kYf;
        KoO koO;
        L1D l1d;
        Kwd kwd;
        Kwe kwe;
        L1D l1d2;
        Kwd kwd2;
        Class cls2;
        Charset charset = KdF.A04;
        if (cls == null) {
            throw AnonymousClass001.A0Q("messageType");
        }
        ConcurrentMap concurrentMap = this.A00;
        ML1 ml1 = (ML1) concurrentMap.get(cls);
        if (ml1 == null) {
            KzX kzX = this.A01;
            L1D l1d3 = Kyg.A01;
            if (!KDF.class.isAssignableFrom(cls) && (cls2 = Kyg.A02) != null && !cls2.isAssignableFrom(cls)) {
                throw AnonymousClass001.A0L("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            KkX BeC = kzX.A00.BeC(cls);
            int i = BeC.A00;
            if ((i & 2) == 2) {
                if (KDF.class.isAssignableFrom(cls)) {
                    l1d2 = Kyg.A01;
                    kwd2 = KcG.A01;
                } else {
                    l1d2 = Kyg.A00;
                    kwd2 = KcG.A00;
                    if (kwd2 == null) {
                        throw AnonymousClass001.A0N("Protobuf runtime is not correctly loaded.");
                    }
                }
                ml1 = new Lg8(kwd2, BeC.A01, l1d2);
            } else {
                boolean isAssignableFrom = KDF.class.isAssignableFrom(cls);
                boolean z = true;
                if (((i & 1) != 0 ? 0S2.A00 : 0S2.A01).intValue() == 1) {
                    z = false;
                }
                if (isAssignableFrom) {
                    kYf = KcI.A01;
                    koO = KoO.A01;
                    l1d = Kyg.A01;
                    if (z) {
                        kwd = KcG.A01;
                        kwe = KcH.A01;
                    } else {
                        kwd = null;
                        kwe = KcH.A01;
                    }
                } else {
                    kYf = KcI.A00;
                    koO = KoO.A00;
                    l1d = Kyg.A00;
                    if (z) {
                        kwd = KcG.A00;
                        if (kwd == null) {
                            throw AnonymousClass001.A0N("Protobuf runtime is not correctly loaded.");
                        }
                        kwe = KcH.A00;
                    } else {
                        kwd = null;
                        kwe = KcH.A00;
                    }
                }
                ml1 = Lg9.A0D(kwd, koO, kwe, kYf, BeC, l1d);
            }
            ML1 ml12 = (ML1) concurrentMap.putIfAbsent(cls, ml1);
            if (ml12 != null) {
                return ml12;
            }
        }
        return ml1;
    }
}
