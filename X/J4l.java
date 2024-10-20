package X;

import java.util.Comparator;

/* loaded from: J4l.class */
public final class J4l implements Comparator {
    public static int A00(J4Y j4y, J4Y j4y2) {
        int ordinal = j4y.A01.ordinal() - j4y2.A01.ordinal();
        if (ordinal == 0) {
            ordinal = j4y.A00 - j4y2.A00;
        }
        return ordinal;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((J4Y) obj, (J4Y) obj2);
    }
}
