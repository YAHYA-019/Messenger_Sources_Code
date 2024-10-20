package X;

import java.util.Comparator;

/* loaded from: DAn.class */
public final class DAn implements Comparator {
    public static final DAn A00 = new DAn();

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        03Y r0 = (03Y) obj;
        03Y r02 = (03Y) obj2;
        if (AnonymousClass001.A05(r0.first) == AnonymousClass001.A05(r02.first)) {
            ((Number) r0.second).longValue();
            ((Number) r02.second).longValue();
        }
        int i = -1;
        if (AnonymousClass001.A05(r0.first) > AnonymousClass001.A05(r02.first)) {
            i = 1;
        }
        return i;
    }
}
