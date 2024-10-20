package X;

import java.util.Comparator;

/* loaded from: J4m.class */
public final class J4m implements Comparator {
    public static final J4m A00 = new J4m();

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        2JX A1I;
        2JY r0 = (2JY) obj2;
        2JX A0T = ((2JY) obj).A0T(2JX.class, 792689627);
        2JX r307 = null;
        if (A0T != null) {
            r307 = A0T.A1I();
        }
        if (r307 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        2JX A0T2 = r0.A0T(2JX.class, 792689627);
        if (A0T2 == null || (A1I = A0T2.A1I()) == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        return Double.compare(A1I.getDoubleValue(1581128895), r307.getDoubleValue(1581128895));
    }
}
