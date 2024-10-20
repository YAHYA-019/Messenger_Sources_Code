package X;

import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: J4i.class */
public final class J4i implements Comparator {
    public final boolean A00;

    public J4i(boolean z) {
        this.A00 = z;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        I9V i9v = ((QyL) obj).A00;
        I9V i9v2 = ((QyL) obj2).A00;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long A03 = i9v.A03(timeUnit);
        long A02 = i9v.A02(timeUnit);
        long A032 = i9v2.A03(timeUnit);
        long A022 = i9v2.A02(timeUnit);
        if (this.A00) {
            i = (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
            if (i == 0) {
                i = (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
            }
        } else {
            i = (A02 > A022 ? 1 : (A02 == A022 ? 0 : -1));
            if (i == 0) {
                return (A03 > A032 ? 1 : (A03 == A032 ? 0 : -1));
            }
        }
        return i;
    }
}
