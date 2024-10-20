package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractSetMultimap;
import com.google.common.collect.ImmutableEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: K9K.class */
public final class K9K extends K9L implements NavigableMap {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9K(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap navigableMap) {
        super(abstractMapBasedMultimap, navigableMap);
        this.A00 = abstractMapBasedMultimap;
    }

    private ImmutableEntry A00(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry A0z = AnonymousClass001.A0z(it);
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        Collection A0F = abstractMapBasedMultimap.A0F();
        A0F.addAll((Collection) A0z.getValue());
        it.remove();
        return new ImmutableEntry(A0z.getKey(), abstractMapBasedMultimap instanceof AbstractSetMultimap ? Collections.unmodifiableSet((Set) A0F) : Collections.unmodifiableList((List) A0F));
    }

    @Override // X.K9L
    /* renamed from: A05 */
    public /* bridge */ /* synthetic */ SortedSet keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) ((4uO) this).A00)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return A04(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((4uO) this).A00)).ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableSet descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap descendingMap() {
        return new K9K(this.A00, ((NavigableMap) ((SortedMap) ((4uO) this).A00)).descendingMap());
    }

    @Override // java.util.NavigableMap
    public Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) ((4uO) this).A00)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return A04(firstEntry);
    }

    @Override // java.util.NavigableMap
    public Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) ((4uO) this).A00)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return A04(floorEntry);
    }

    @Override // java.util.NavigableMap
    public Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((4uO) this).A00)).floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableMap headMap(Object obj, boolean z) {
        return new K9K(this.A00, ((NavigableMap) ((SortedMap) ((4uO) this).A00)).headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) ((4uO) this).A00)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return A04(higherEntry);
    }

    @Override // java.util.NavigableMap
    public Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((4uO) this).A00)).higherKey(obj);
    }

    @Override // X.K9L, java.util.SortedMap, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) ((4uO) this).A00)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return A04(lastEntry);
    }

    @Override // java.util.NavigableMap
    public Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) ((4uO) this).A00)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return A04(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) ((4uO) this).A00)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public Map.Entry pollFirstEntry() {
        return A00(AnonymousClass001.A0x(this));
    }

    @Override // java.util.NavigableMap
    public Map.Entry pollLastEntry() {
        return A00(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new K9K(this.A00, ((NavigableMap) ((SortedMap) ((4uO) this).A00)).subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public NavigableMap tailMap(Object obj, boolean z) {
        return new K9K(this.A00, ((NavigableMap) ((SortedMap) ((4uO) this).A00)).tailMap(obj, z));
    }
}
