package X;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentMap;

/* loaded from: L26.class */
public final class L26 {
    public static final L26 A02 = new L26();
    public final ConcurrentMap A00 = JQx.A13();
    public final KzY A01 = new KzY();

    public MLr A00(Class cls) {
        KYm kYm;
        KoP koP;
        L1E l1e;
        Kwh kwh;
        L6I l6i;
        L1E l1e2;
        Kwh kwh2;
        Class cls2;
        Charset charset = Kyu.A04;
        if (cls == null) {
            throw AnonymousClass001.A0Q("messageType");
        }
        ConcurrentMap concurrentMap = this.A00;
        MLr mLr = (MLr) concurrentMap.get(cls);
        if (mLr == null) {
            KzY kzY = this.A01;
            L1E l1e3 = LEh.A02;
            if (!KJb.class.isAssignableFrom(cls) && (cls2 = LEh.A03) != null && !cls2.isAssignableFrom(cls)) {
                throw AnonymousClass001.A0L("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            }
            KkZ BeD = kzY.A00.BeD(cls);
            int i = BeD.A00;
            if ((i & 2) == 2) {
                if (KJb.class.isAssignableFrom(cls)) {
                    l1e2 = LEh.A02;
                    kwh2 = KcL.A01;
                } else {
                    l1e2 = LEh.A00;
                    kwh2 = KcL.A00;
                    if (kwh2 == null) {
                        throw AnonymousClass001.A0N("Protobuf runtime is not correctly loaded.");
                    }
                }
                mLr = new Lgg(kwh2, BeD.A01, l1e2);
            } else {
                boolean isAssignableFrom = KJb.class.isAssignableFrom(cls);
                boolean A1W = AnonymousClass001.A1W((i & 1) == 1 ? 0S2.A00 : 0S2.A01, 0S2.A00);
                if (isAssignableFrom) {
                    kYm = KcN.A01;
                    koP = KoP.A01;
                    l1e = LEh.A02;
                    if (A1W) {
                        kwh = KcL.A01;
                        l6i = KcM.A01;
                    } else {
                        kwh = null;
                        l6i = KcM.A01;
                    }
                } else {
                    kYm = KcN.A00;
                    koP = KoP.A00;
                    if (A1W) {
                        l1e = LEh.A00;
                        kwh = KcL.A00;
                        if (kwh == null) {
                            throw AnonymousClass001.A0N("Protobuf runtime is not correctly loaded.");
                        }
                        l6i = KcM.A00;
                    } else {
                        l1e = LEh.A01;
                        kwh = null;
                        l6i = KcM.A00;
                    }
                }
                mLr = Lgh.A0K(kwh, koP, l6i, kYm, BeD, l1e);
            }
            MLr mLr2 = (MLr) concurrentMap.putIfAbsent(cls, mLr);
            if (mLr2 != null) {
                return mLr2;
            }
        }
        return mLr;
    }
}
