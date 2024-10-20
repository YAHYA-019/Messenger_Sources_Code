package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: J4o.class */
public final class J4o implements Comparator {
    public static final J4o A00 = new Object();

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        I9V BBm = ((JLS) obj).BBm();
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        long A03 = BBm.A03(timeUnit);
        long A02 = BBm.A02(timeUnit);
        I9V BBm2 = ((JLS) obj2).BBm();
        long A032 = BBm2.A03(timeUnit);
        long A022 = BBm2.A02(timeUnit);
        if (A02 < A032) {
            return -1;
        }
        return AnonymousClass001.A1P((A03 > A022 ? 1 : (A03 == A022 ? 0 : -1))) ? 1 : 0;
    }
}
