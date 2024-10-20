package X;

import java.util.concurrent.ConcurrentMap;

/* loaded from: L84.class */
public final class L84 {
    public static final L84 A02 = new L84();
    public final ConcurrentMap A01 = JQx.A13();
    public final MGL A00 = new Lde();

    public static L84 A00() {
        return A02;
    }

    public final MKz A01(Class cls) {
        LC1.A03(cls);
        ConcurrentMap concurrentMap = this.A01;
        MKz mKz = (MKz) concurrentMap.get(cls);
        if (mKz == null) {
            mKz = this.A00.DC9(cls);
            LC1.A03(cls);
            MKz mKz2 = (MKz) concurrentMap.putIfAbsent(cls, mKz);
            if (mKz2 != null) {
                return mKz2;
            }
        }
        return mKz;
    }
}
