package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: K68.class */
public final class K68 extends K60 {
    public final /* synthetic */ K66 zza;

    public K68() {
    }

    public K68(K66 k66) {
        this.zza = k66;
    }

    @Override // X.Ly4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zza.get(entry.getKey());
            if (obj2 != null) {
                z = JQy.A1Z(obj2, entry.getValue());
            }
        }
        return z;
    }

    @Override // X.K60, java.util.Collection, java.util.Set
    public final int hashCode() {
        Iterator it = this.zza.A04().iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return i2;
            }
            i = i2 + AnonymousClass002.A04(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return A08().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
