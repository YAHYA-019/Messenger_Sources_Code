package X;

import java.util.Comparator;

/* renamed from: X.7Rc, reason: invalid class name */
/* loaded from: 7Rc.class */
public final class C7Rc implements Comparator {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ Comparator A01;

    public C7Rc(Comparator comparator, Comparator comparator2) {
        this.A01 = comparator;
        this.A00 = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.A01.compare(obj, obj2);
        if (compare == 0) {
            compare = this.A00.compare(((C5fu) ((C5fv) obj)).A08, ((C5fu) ((C5fv) obj2)).A08);
        }
        return compare;
    }
}
