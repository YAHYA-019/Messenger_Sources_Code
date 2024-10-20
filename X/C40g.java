package X;

import java.util.Comparator;

/* renamed from: X.40g, reason: invalid class name */
/* loaded from: 40g.class */
public final class C40g implements Comparator {
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int B4q = ((C40b) obj).B4q();
        int B4q2 = ((C40b) obj2).B4q();
        if (B4q < B4q2) {
            i = -1;
        } else {
            i = 1;
            if (B4q == B4q2) {
                return 0;
            }
        }
        return i;
    }
}
