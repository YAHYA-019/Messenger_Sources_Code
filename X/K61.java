package X;

import java.util.AbstractMap;
import java.util.Comparator;

/* loaded from: K61.class */
public final class K61 extends K65 {
    public final /* synthetic */ K68 zza;

    public K61(K68 k68) {
        this.zza = k68;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        K66 k66 = this.zza.zza;
        Comparator comparator = K66.A03;
        return new AbstractMap.SimpleImmutableEntry(k66.A01.A01.get(i), this.zza.zza.A00.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
