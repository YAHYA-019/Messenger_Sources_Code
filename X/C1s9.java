package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1s9, reason: invalid class name */
/* loaded from: 1s9.class */
public final class C1s9 {
    public static final 1sA A0A = new Object();
    public C2yq A00;
    public java.util.Map A02;
    public final java.util.Map A07 = new HashMap(4);
    public final java.util.Map A05 = new HashMap(4);
    public final java.util.Map A06 = new HashMap();
    public final java.util.Map A04 = new HashMap(4);
    public final java.util.Map A08 = new HashMap();
    public final HashSet A03 = new HashSet();
    public final java.util.Map A09 = new HashMap();
    public java.util.Map A01 = new HashMap();

    public C1s9(C2yq c2yq, C1s9 c1s9) {
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        java.util.Map map4;
        this.A00 = c2yq;
        if (c1s9 != null) {
            synchronized (c1s9) {
                map = c1s9.A07;
            }
            java.util.Map map5 = c1s9.A09;
            synchronized (c1s9) {
                map2 = c1s9.A05;
            }
            synchronized (c1s9) {
                map3 = c1s9.A04;
            }
            java.util.Map map6 = c1s9.A01;
            if (!map.isEmpty() || !map3.isEmpty() || !map5.isEmpty() || !map6.isEmpty()) {
                synchronized (this) {
                    for (String str : map.keySet()) {
                        java.util.Map map7 = this.A07;
                        List list = (List) map.get(str);
                        ArrayList arrayList = new ArrayList(list != null ? list.size() : 4);
                        if (list != null) {
                            arrayList.addAll(list);
                        }
                        map7.put(str, arrayList);
                    }
                    Iterator it = map3.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(it);
                        String A0j = AnonymousClass001.A0j(A0z);
                        List list2 = (List) A0z.getValue();
                        java.util.Map map8 = this.A04;
                        ArrayList A0t = AnonymousClass001.A0t(list2 != null ? list2.size() : 4);
                        if (list2 != null) {
                            A0t.addAll(list2);
                        }
                        map8.put(A0j, A0t);
                    }
                    for (Map.Entry entry : map5.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list3 = (List) entry.getValue();
                        java.util.Map map9 = this.A09;
                        ArrayList arrayList2 = new ArrayList(list3 != null ? list3.size() : 4);
                        if (list3 != null) {
                            arrayList2.addAll(list3);
                        }
                        map9.put(str2, arrayList2);
                    }
                    Iterator it2 = map6.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(it2);
                        String A0j2 = AnonymousClass001.A0j(A0z2);
                        List list4 = (List) A0z2.getValue();
                        java.util.Map map10 = this.A01;
                        ArrayList A0t2 = AnonymousClass001.A0t(list4 != null ? list4.size() : 4);
                        if (list4 != null) {
                            A0t2.addAll(list4);
                        }
                        map10.put(A0j2, A0t2);
                    }
                    if (!map2.isEmpty()) {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            Object key = entry2.getKey();
                            List list5 = (List) entry2.getValue();
                            java.util.Map map11 = this.A05;
                            ArrayList arrayList3 = new ArrayList(list5 != null ? list5.size() : 4);
                            if (list5 != null) {
                                arrayList3.addAll(list5);
                            }
                            map11.put(key, arrayList3);
                        }
                    }
                }
            }
            synchronized (c1s9) {
                map4 = c1s9.A08;
            }
            synchronized (this) {
                java.util.Map map12 = this.A08;
                map12.clear();
                map12.putAll(map4);
            }
            java.util.Map A04 = c1s9.A04();
            if (!A04.isEmpty()) {
                synchronized (this) {
                    this.A06.putAll(A04);
                }
            }
            java.util.Map map13 = c1s9.A02;
            if (map13 != null) {
                this.A02 = new HashMap(map13);
            }
        }
    }

    private final void A00(java.util.Map map) {
        java.util.Map map2;
        boolean isEmpty;
        Object obj;
        java.util.Map map3;
        Object obj2;
        synchronized (this) {
            map2 = this.A07;
            isEmpty = map2.isEmpty();
        }
        if (isEmpty) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            synchronized (this) {
                obj = map2.get(key);
                map3 = this.A05;
                obj2 = map3.get(key);
            }
            List list2 = (List) obj;
            List list3 = (List) obj2;
            if (list2 != null) {
                if (list2.size() == list.size()) {
                    synchronized (this) {
                        map2.remove(key);
                        map3.remove(key);
                    }
                } else {
                    list2.removeAll(list);
                    if (list3 != null) {
                        list3.removeAll(list);
                    }
                }
            }
        }
    }

    private final void A01(java.util.Map map) {
        if (map.isEmpty()) {
            return;
        }
        java.util.Map map2 = this.A09;
        if (map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Collection<?> collection = (Collection) entry.getValue();
            synchronized (this) {
                Object obj = map2.get(key);
                Collection collection2 = (Collection) obj;
                if (collection2 != null && !collection2.isEmpty()) {
                    List list = (List) obj;
                    list.removeAll(collection);
                    if (list.isEmpty()) {
                        map2.remove(key);
                    }
                }
            }
        }
    }

    public final HashSet A02() {
        HashSet A0v;
        synchronized (this) {
            A0v = AnonymousClass001.A0v();
            A0v.addAll(this.A04.keySet());
            A0v.addAll(this.A01.keySet());
        }
        return A0v;
    }

    public final HashSet A03() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet();
            hashSet.addAll(this.A04.keySet());
            hashSet.addAll(this.A07.keySet());
            hashSet.addAll(this.A09.keySet());
            hashSet.addAll(this.A01.keySet());
        }
        return hashSet;
    }

    public final java.util.Map A04() {
        java.util.Map map;
        synchronized (this) {
            map = this.A06;
        }
        return map;
    }

    public final void A05() {
        synchronized (this) {
            java.util.Map map = this.A04;
            A00(map);
            1sA.A01(this);
            java.util.Map map2 = this.A01;
            A01(map2);
            map.clear();
            map2.clear();
        }
    }

    public final void A06(C1s9 c1s9) {
        java.util.Map map;
        java.util.Map map2;
        11T.A0F(c1s9, 0);
        synchronized (c1s9) {
            map = c1s9.A04;
        }
        A00(map);
        1sA.A01(c1s9);
        synchronized (c1s9) {
            map2 = c1s9.A08;
        }
        synchronized (this) {
            java.util.Map map3 = this.A08;
            map3.clear();
            map3.putAll(map2);
        }
        java.util.Map A04 = c1s9.A04();
        if (!A04.isEmpty()) {
            synchronized (this) {
                this.A06.putAll(A04);
            }
        }
        A01(c1s9.A01);
    }

    public final boolean A07() {
        boolean z;
        synchronized (this) {
            z = true;
            if (!(!this.A07.isEmpty()) && !(!this.A09.isEmpty())) {
                if (!(!this.A01.isEmpty())) {
                    z = false;
                }
            }
        }
        return z;
    }
}
