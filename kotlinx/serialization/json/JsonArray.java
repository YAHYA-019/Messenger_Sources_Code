package kotlinx.serialization.json;

import X.0QD;
import X.11T;
import X.5Yu;
import X.AnonymousClass002;
import X.AnonymousClass116;
import X.C0A5;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.functions.Function1;

/* loaded from: JsonArray.class */
public final class JsonArray extends JsonElement implements List, AnonymousClass116 {
    public static final Companion Companion = new Object();
    public final List A00;

    /* loaded from: JsonArray$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return JsonArraySerializer.A01;
        }
    }

    public JsonArray(List list) {
        11T.A0F(list, 1);
        this.A00 = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        11T.A0F(obj, 0);
        return this.A00.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        11T.A0F(collection, 0);
        return this.A00.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return 11T.A0O(this.A00, obj);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A00.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        11T.A0F(obj, 0);
        return this.A00.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.A00.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return -1;
        }
        11T.A0F(obj, 0);
        return this.A00.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.A00.listIterator();
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return this.A00.listIterator(i);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.size();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return this.A00.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return 11T.A0Q(this, objArr);
    }

    public String toString() {
        return 0QD.A0K(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "[", "]", this.A00, (Function1) null, -1);
    }
}
