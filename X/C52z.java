package X;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.52z, reason: invalid class name */
/* loaded from: 52z.class */
public abstract class C52z {
    public static C1n5 A00(Predicate predicate, Collection collection) {
        if (collection instanceof C1n5) {
            C1n5 c1n5 = (C1n5) collection;
            return new C1n5(Predicates.and(c1n5.A00, predicate), c1n5.A01);
        }
        collection.getClass();
        predicate.getClass();
        return new C1n5(predicate, collection);
    }

    public static boolean A01(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }
}
