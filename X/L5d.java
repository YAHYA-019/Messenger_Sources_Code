package X;

import kotlin.jvm.functions.Function2;

/* loaded from: L5d.class */
public abstract class L5d {
    public static void A00(MLv mLv, Object obj) {
        A02(mLv, obj, Kyy.A03);
    }

    public static void A01(MLv mLv, Object obj, Object obj2) {
        A02(mLv, obj, Kyy.A02);
        A02(mLv, obj2, Kyy.A04);
    }

    public static final void A02(MLv mLv, Object obj, Function2 function2) {
        if (((LNS) mLv).A0K || !11T.A0O(mLv.CdA(), obj)) {
            mLv.D7k(obj);
            mLv.A8e(obj, function2);
        }
    }
}
