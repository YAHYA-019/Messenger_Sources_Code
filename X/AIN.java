package X;

import java.util.Iterator;

/* loaded from: AIN.class */
public final class AIN extends 1AA implements MRU {
    public static final AIN A03;
    public final Lz8 A00;
    public final Object A01;
    public final Object A02;

    static {
        C9du c9du = C9du.A00;
        Lz8 lz8 = Lz8.A02;
        11T.A0I(lz8, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        A03 = new AIN(lz8, c9du, c9du);
    }

    public AIN(Lz8 lz8, Object obj, Object obj2) {
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = lz8;
    }

    public int A08() {
        return this.A00.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new AHY(this.A01, this.A00);
    }
}
