package X;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableEntry;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1mz, reason: invalid class name */
/* loaded from: 1mz.class */
public abstract class C1mz extends C1n0 {
    public final Predicate A00;
    public final java.util.Map A01;

    public C1mz(Predicate predicate, java.util.Map map) {
        this.A01 = map;
        this.A00 = predicate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r301.A00.apply(new com.google.common.collect.ImmutableEntry(r302, r0.get(r302))) == false) goto L6;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsKey(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            java.util.Map r0 = r0.A01
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.containsKey(r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L3d
            r0 = r303
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            r305 = r0
            r0 = r301
            com.google.common.base.Predicate r0 = r0.A00
            r303 = r0
            com.google.common.collect.ImmutableEntry r0 = new com.google.common.collect.ImmutableEntry
            r306 = r0
            r0 = r306
            r1 = r302
            r2 = r305
            r0.<init>(r1, r2)
            r0 = r303
            r1 = r306
            boolean r0 = r0.apply(r1)
            r307 = r0
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L42
        L3d:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L42:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1mz.containsKey(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Object obj2 = this.A01.get(obj);
        if (obj2 == null || !this.A00.apply(new ImmutableEntry(obj, obj2))) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        Preconditions.checkArgument(this.A00.apply(new ImmutableEntry(obj, obj2)));
        return this.A01.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(java.util.Map map) {
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            Preconditions.checkArgument(this.A00.apply(new ImmutableEntry(A0z.getKey(), A0z.getValue())));
        }
        this.A01.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        if (containsKey(obj)) {
            return this.A01.remove(obj);
        }
        return null;
    }
}
