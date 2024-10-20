package X;

import java.util.Comparator;

/* renamed from: X.13p, reason: invalid class name */
/* loaded from: 13p.class */
public final class C13p implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2 = ((0WM) obj).A00.versionNumber;
        int i3 = ((0WM) obj2).A00.versionNumber;
        if (i2 < i3) {
            i = -1;
        } else {
            i = 0;
            if (i2 > i3) {
                return 1;
            }
        }
        return i;
    }
}
