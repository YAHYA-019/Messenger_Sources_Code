package X;

import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: KyN.class */
public final class KyN {
    public static final HashMap A00;
    public static final HashMap A01;

    static {
        HashMap A0u = AnonymousClass001.A0u();
        JQx.A1K(Collection.class, ArrayList.class, A0u);
        JQx.A1K(List.class, ArrayList.class, A0u);
        JQx.A1K(Set.class, HashSet.class, A0u);
        A0u.put(SortedSet.class.getName(), TreeSet.class);
        A0u.put(Queue.class.getName(), LinkedList.class);
        JQx.A1K(AbstractList.class, ArrayList.class, A0u);
        JQx.A1K(AbstractSet.class, HashSet.class, A0u);
        JQx.A1K(Deque.class, LinkedList.class, A0u);
        JQx.A1K(NavigableSet.class, TreeSet.class, A0u);
        A00 = A0u;
        HashMap A0u2 = AnonymousClass001.A0u();
        JQx.A1K(java.util.Map.class, LinkedHashMap.class, A0u2);
        JQx.A1K(AbstractMap.class, LinkedHashMap.class, A0u2);
        A0u2.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
        A0u2.put(SortedMap.class.getName(), TreeMap.class);
        JQx.A1K(NavigableMap.class, TreeMap.class, A0u2);
        A0u2.put(ConcurrentNavigableMap.class.getName(), ConcurrentSkipListMap.class);
        A01 = A0u2;
    }
}
