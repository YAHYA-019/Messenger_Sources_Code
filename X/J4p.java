package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: J4p.class */
public final class J4p implements Comparator {
    public static final J4p A00 = new Object();

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        I9V i9v = ((Rau) obj).A01;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long A02 = i9v.A02(timeUnit);
        long A03 = ((Rau) obj2).A01.A03(timeUnit);
        if (A02 < A03) {
            return -1;
        }
        return AnonymousClass001.A1P((A02 > A03 ? 1 : (A02 == A03 ? 0 : -1))) ? 1 : 0;
    }
}
