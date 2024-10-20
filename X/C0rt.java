package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0rt, reason: invalid class name */
/* loaded from: 0rt.class */
public abstract class C0rt implements java.util.Map, AnonymousClass116 {
    public abstract int A00();

    public abstract Collection A01();

    public abstract Set A02();

    public abstract Set A03();

    @Override // java.util.Map
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public abstract boolean containsKey(Object obj);

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        boolean z = false;
        if (!entrySet.isEmpty()) {
            Iterator it = entrySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (11T.A0O(AnonymousClass001.A0z(it).getValue(), obj)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return A02();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof java.util.Map)) {
                return false;
            }
            java.util.Map map = (java.util.Map) obj;
            if (size() != map.size()) {
                return false;
            }
            Set entrySet = map.entrySet();
            if (!(entrySet instanceof Collection) || !entrySet.isEmpty()) {
                Iterator it = entrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(it);
                    if (A0z == null) {
                        return false;
                    }
                    Object key = A0z.getKey();
                    Object value = A0z.getValue();
                    Object obj2 = get(key);
                    if (!11T.A0O(value, obj2)) {
                        return false;
                    }
                    if (obj2 == null && !containsKey(key)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return AnonymousClass001.A1O(size());
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return A03();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return A00();
    }

    public String toString() {
        return 0QD.A0K(", ", "{", "}", entrySet(), new C0fx(this), -1);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return A01();
    }
}
