package X;

import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultimap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.5s4, reason: invalid class name */
/* loaded from: 5s4.class */
public class C5s4 {
    public final java.util.Map A00 = new CompactHashMap();

    public ImmutableMultimap A00() {
        return ImmutableListMultimap.A04(this.A00.entrySet());
    }

    public void A01(1Mu r302) {
        for (Map.Entry entry : r302.AAK().entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            if (key == null) {
                throw AnonymousClass001.A0Q(0Pz.A0W(JQw.A00(94), 2Ri.A0E(iterable)));
            }
            java.util.Map map = this.A00;
            Collection collection = (Collection) map.get(key);
            Iterator it = iterable.iterator();
            if (collection != null) {
                while (it.hasNext()) {
                    Object next = it.next();
                    1Fg.A01(key, next);
                    collection.add(next);
                }
            } else if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    1Fg.A01(key, next2);
                    arrayList.add(next2);
                }
                map.put(key, arrayList);
            }
        }
    }

    public void A02(Object obj, Object obj2) {
        1Fg.A01(obj, obj2);
        java.util.Map map = this.A00;
        Collection collection = (Collection) map.get(obj);
        if (collection == null) {
            collection = new ArrayList();
            map.put(obj, collection);
        }
        collection.add(obj2);
    }
}
