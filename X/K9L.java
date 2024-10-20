package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: K9L.class */
public class K9L extends 4uO implements SortedMap {
    public SortedSet A00;
    public final /* synthetic */ AbstractMapBasedMultimap A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K9L(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap sortedMap) {
        super(abstractMapBasedMultimap, sortedMap);
        this.A01 = abstractMapBasedMultimap;
    }

    public /* bridge */ /* synthetic */ Set A02() {
        if (!(this instanceof K9K)) {
            return new K9N(this.A01, (SortedMap) ((4uO) this).A00);
        }
        K9K k9k = (K9K) this;
        return new K9M(k9k.A00, (NavigableMap) ((SortedMap) ((4uO) k9k).A00));
    }

    @Override // java.util.SortedMap, java.util.Map
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        K9M k9m = this.A00;
        if (k9m == null) {
            if (this instanceof K9K) {
                K9K k9k = (K9K) this;
                k9m = new K9M(k9k.A00, (NavigableMap) ((SortedMap) ((4uO) k9k).A00));
            } else {
                k9m = new K9N(this.A01, (SortedMap) ((4uO) this).A00);
            }
            this.A00 = k9m;
        }
        return k9m;
    }

    @Override // java.util.SortedMap
    public Comparator comparator() {
        return ((SortedMap) ((4uO) this).A00).comparator();
    }

    @Override // java.util.SortedMap
    public Object firstKey() {
        return ((SortedMap) ((4uO) this).A00).firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return this instanceof K9K ? ((K9K) this).headMap(obj, false) : new K9L(this.A01, ((SortedMap) ((4uO) this).A00).headMap(obj));
    }

    @Override // java.util.SortedMap
    public Object lastKey() {
        return ((SortedMap) ((4uO) this).A00).lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return this instanceof K9K ? ((K9K) this).subMap(obj, true, obj2, false) : new K9L(this.A01, ((SortedMap) ((4uO) this).A00).subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return this instanceof K9K ? ((K9K) this).tailMap(obj, true) : new K9L(this.A01, ((SortedMap) ((4uO) this).A00).tailMap(obj));
    }
}
