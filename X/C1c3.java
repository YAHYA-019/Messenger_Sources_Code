package X;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1c3, reason: invalid class name */
/* loaded from: 1c3.class */
public final class C1c3 extends C1c5 {
    public static final C1bj A06 = new C1bj() { // from class: X.1c7
        @Override // X.C1bj
        public Object get() {
            return Collections.emptySet();
        }
    };
    public final List A00;
    public final java.util.Map A01 = new HashMap();
    public final java.util.Map A02 = new HashMap();
    public final java.util.Map A03 = new HashMap();
    public final AtomicReference A04 = new AtomicReference();
    public final C1c9 A05;

    /* JADX WARN: Type inference failed for: r0v169, types: [X.3eB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v184, types: [java.lang.Object, X.1dI] */
    /* JADX WARN: Type inference failed for: r0v217, types: [java.lang.Object, X.1dI] */
    /* JADX WARN: Type inference failed for: r0v332, types: [X.1dD, java.lang.Object] */
    public C1c3(Iterable iterable, Collection collection, Executor executor) {
        java.util.Map map;
        C1c9 c1c9 = new C1c9(executor);
        this.A05 = c1c9;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1bo.A00(C1c9.class, c1c9, C1c9.class, 1cA.class));
        arrayList.add(C1bo.A00(C1c3.class, this, new Class[0]));
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        this.A00 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = this.A00.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C1bj) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(componentRegistrar.getComponents());
                        it2.remove();
                    }
                } catch (2LG e) {
                    it2.remove();
                    android.util.Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            map = this.A01;
            if (map.isEmpty()) {
                A01(arrayList);
            } else {
                ArrayList A17 = 1BK.A17(map.keySet());
                A17.addAll(arrayList);
                A01(A17);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C1bo c1bo = (C1bo) it3.next();
                3eC r0 = new 3eC(c1bo, this, 1);
                ?? obj2 = new Object();
                ((1dD) obj2).A01 = 1dD.A02;
                ((1dD) obj2).A00 = r0;
                map.put(c1bo, obj2);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C1bo c1bo2 = (C1bo) it4.next();
                if (c1bo2.A01 == 0) {
                    C1bj c1bj = (C1bj) map.get(c1bo2);
                    for (Object obj3 : c1bo2.A04) {
                        java.util.Map map2 = this.A02;
                        if (map2.containsKey(obj3)) {
                            arrayList4.add(new 3hU((C1bj) map2.get(obj3), c1bj));
                        } else {
                            map2.put(obj3, c1bj);
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                C1bo c1bo3 = (C1bo) entry.getKey();
                if (c1bo3.A01 != 0) {
                    Object value = entry.getValue();
                    for (Object obj4 : c1bo3.A04) {
                        if (!hashMap.containsKey(obj4)) {
                            hashMap.put(obj4, new HashSet());
                        }
                        ((Set) hashMap.get(obj4)).add(value);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                java.util.Map map3 = this.A03;
                boolean containsKey = map3.containsKey(entry2.getKey());
                Object key = entry2.getKey();
                if (containsKey) {
                    1dI r02 = (1dI) map3.get(key);
                    Iterator it5 = ((Set) entry2.getValue()).iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(new 3hV(r02, (C1bj) it5.next()));
                    }
                } else {
                    Collection collection2 = (Collection) entry2.getValue();
                    ?? obj5 = new Object();
                    ((1dI) obj5).A00 = null;
                    ((1dI) obj5).A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                    ((1dI) obj5).A01.addAll(collection2);
                    map3.put(key, obj5);
                }
            }
            arrayList3.addAll(arrayList5);
            for (C1bo c1bo4 : map.keySet()) {
                for (1cN r03 : c1bo4.A03) {
                    int i = r03.A00;
                    boolean z = false;
                    if (i == 2) {
                        z = true;
                        java.util.Map map4 = this.A03;
                        Class cls = r03.A01;
                        if (!map4.containsKey(cls)) {
                            Set emptySet = Collections.emptySet();
                            ?? obj6 = new Object();
                            ((1dI) obj6).A00 = null;
                            ((1dI) obj6).A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                            ((1dI) obj6).A01.addAll(emptySet);
                            map4.put(cls, obj6);
                        }
                    }
                    java.util.Map map5 = this.A02;
                    Class cls2 = r03.A01;
                    if (map5.containsKey(cls2)) {
                        continue;
                    } else {
                        if (i == 1) {
                            throw new RuntimeException(String.format("Unsatisfied dependency for component %s: %s", c1bo4, cls2));
                        }
                        if (!z) {
                            C3Pg c3Pg = 3eB.A02;
                            C1bj c1bj2 = 3eB.A03;
                            ?? obj7 = new Object();
                            ((3eB) obj7).A00 = c3Pg;
                            ((3eB) obj7).A01 = c1bj2;
                            map5.put(cls2, obj7);
                        }
                    }
                }
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        if (this.A04.get() != null) {
            A00(this, map);
        }
    }

    public static void A00(C1c3 c1c3, java.util.Map map) {
        Queue queue;
        for (Map.Entry entry : map.entrySet()) {
            C1bo c1bo = (C1bo) entry.getKey();
            C1bj c1bj = (C1bj) entry.getValue();
            if (c1bo.A00 == 1) {
                c1bj.get();
            }
        }
        C1c9 c1c9 = c1c3.A05;
        synchronized (c1c9) {
            queue = c1c9.A00;
            if (queue != null) {
                c1c9.A00 = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            if (it.hasNext()) {
                it.next();
                Object obj = null;
                obj.getClass();
                throw 0Q8.createAndThrow();
            }
        }
    }

    public static void A01(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1bo c1bo = (C1bo) it.next();
            C1d4 c1d4 = new C1d4(c1bo);
            for (Class cls : c1bo.A04) {
                C1d5 c1d5 = new C1d5(cls, !(c1bo.A01 == 0));
                if (!hashMap.containsKey(c1d5)) {
                    hashMap.put(c1d5, new HashSet());
                }
                Set set = (Set) hashMap.get(c1d5);
                if (!set.isEmpty() && !c1d5.A00) {
                    throw 1BK.A0f("Multiple components provide %s.", new Object[]{cls});
                }
                set.add(c1d4);
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            for (C1d4 c1d42 : (Set) it2.next()) {
                for (1cN r0 : c1d42.A00.A03) {
                    Set<C1d4> set2 = (Set) hashMap.get(new C1d5(r0.A01, r0.A00 == 2));
                    if (set2 != null) {
                        for (C1d4 c1d43 : set2) {
                            c1d42.A01.add(c1d43);
                            c1d43.A02.add(c1d42);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = hashMap.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Collection) it3.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            C1d4 c1d44 = (C1d4) it4.next();
            if (c1d44.A02.isEmpty()) {
                hashSet2.add(c1d44);
            }
        }
        int i = 0;
        while (!hashSet2.isEmpty()) {
            C1d4 c1d45 = (C1d4) hashSet2.iterator().next();
            hashSet2.remove(c1d45);
            i++;
            for (C1d4 c1d46 : c1d45.A01) {
                Set set3 = c1d46.A02;
                set3.remove(c1d45);
                if (set3.isEmpty()) {
                    hashSet2.add(c1d46);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            C1d4 c1d47 = (C1d4) it5.next();
            if (!c1d47.A02.isEmpty() && !c1d47.A01.isEmpty()) {
                A0s.add(c1d47.A00);
            }
        }
        throw new 3D1(A0s);
    }

    @Override // X.C1c5
    public C1bj A04(Class cls) {
        C1bj c1bj;
        synchronized (this) {
            c1bj = (C1bj) this.A02.get(cls);
        }
        return c1bj;
    }

    @Override // X.C1c5
    public C1bj A05(Class cls) {
        C1bj c1bj;
        synchronized (this) {
            c1bj = (1dI) this.A03.get(cls);
            if (c1bj == null) {
                c1bj = A06;
            }
        }
        return c1bj;
    }
}
