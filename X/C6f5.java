package X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6f5, reason: invalid class name */
/* loaded from: 6f5.class */
public final class C6f5 extends AbstractSet {
    public final /* synthetic */ C6ex A00;

    public C6f5(C6ex c6ex) {
        this.A00 = c6ex;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.A00.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
    
        if (X.2Go.A00(r307.A06, r0.getValue()) == false) goto L12;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.util.Map.Entry
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L58
            r0 = r301
            X.6ex r0 = r0.A00
            r304 = r0
            r0 = r302
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.getKey()
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L58
            r0 = 0
            r303 = r0
            r0 = 0
            r308 = r0
            r0 = r304
            r1 = r305
            r2 = 0
            X.6ey r0 = X.C6ex.A00(r0, r1, r2)     // Catch: java.lang.ClassCastException -> L5f
            r307 = r0
        L34:
            r0 = r307
            if (r0 == 0) goto L58
            r0 = r307
            java.lang.Object r0 = r0.A06
            r307 = r0
            r0 = r302
            java.lang.Object r0 = r0.getValue()
            r308 = r0
            r0 = r307
            r1 = r308
            boolean r0 = X.2Go.A00(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L5d
        L58:
            r0 = 0
            r303 = r0
            r0 = 0
            r308 = r0
        L5d:
            r0 = r303
            return r0
        L5f:
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6f5.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new C6f7() { // from class: X.6f6
            {
                super(C6f5.this.A00);
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ Object next() {
                return A00();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        boolean z = false;
        if (obj instanceof Map.Entry) {
            C6ex c6ex = this.A00;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            C6ey c6ey = null;
            if (key != null) {
                try {
                    c6ey = C6ex.A00(c6ex, key, false);
                } catch (ClassCastException unused) {
                }
                if (c6ey != null && 2Go.A00(c6ey.A06, entry.getValue())) {
                    z = true;
                    c6ex.A05(c6ey, true);
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.A00.size;
    }
}
