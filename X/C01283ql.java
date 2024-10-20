package X;

import java.net.Inet4Address;
import java.util.Comparator;

/* renamed from: X.3ql, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3ql.class */
public final class C01283ql implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        11T.A0F(obj, 0);
        11T.A0F(obj2, 1);
        int i = 0;
        boolean z = obj2 instanceof Inet4Address;
        if (obj instanceof Inet4Address) {
            if (!z) {
                i = -1;
            }
        } else if (z) {
            return 1;
        }
        return i;
    }
}
