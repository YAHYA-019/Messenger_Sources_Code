package X;

import java.util.Comparator;

/* loaded from: Ls5.class */
public abstract class Ls5 implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (this instanceof K6C) {
            return ((K6C) this).zza.compare(obj2, obj);
        }
        if (this instanceof K6E) {
            Comparable comparable = (Comparable) obj2;
            obj.getClass();
            if (obj == comparable) {
                return 0;
            }
            return comparable.compareTo(obj);
        }
        if (!(this instanceof K6D)) {
            return ((K6B) this).zza.compare(obj, obj2);
        }
        Comparable comparable2 = (Comparable) obj;
        comparable2.getClass();
        obj2.getClass();
        return comparable2.compareTo(obj2);
    }
}
