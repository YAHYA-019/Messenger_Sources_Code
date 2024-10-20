package X;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.1Jp, reason: invalid class name */
/* loaded from: 1Jp.class */
public abstract class C1Jp {
    public static int A00(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static C3iq A01(Iterator it) {
        return it instanceof C3iq ? (C3iq) it : new C3iq(it);
    }

    public static boolean A02(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return z2;
            }
            z = z2 | collection.add(it.next());
        }
    }
}
