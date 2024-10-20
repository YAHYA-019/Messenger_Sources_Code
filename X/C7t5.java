package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.7t5, reason: invalid class name */
/* loaded from: 7t5.class */
public abstract class C7t5 {
    public static boolean A00(AnonymousClass556 anonymousClass556, AnonymousClass556 anonymousClass5562) {
        if (anonymousClass556 != anonymousClass5562) {
            return (anonymousClass556 == null || anonymousClass5562 == null || !anonymousClass556.BVf(anonymousClass5562)) ? false : true;
        }
        return true;
    }

    public static boolean A01(ImmutableList immutableList, ImmutableList immutableList2) {
        boolean z = false;
        if ((immutableList != null ? immutableList.size() : 0) == (immutableList2 != null ? immutableList2.size() : 0)) {
            int size = immutableList.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    z = true;
                    break;
                }
                if (!A00((AnonymousClass556) immutableList.get(i2), (AnonymousClass556) immutableList2.get(i2))) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }
}
