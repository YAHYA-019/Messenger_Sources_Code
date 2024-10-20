package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0rg, reason: invalid class name */
/* loaded from: 0rg.class */
public final class C0rg implements Collection, AnonymousClass116 {
    public final byte[] A00;

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public void clear() {
        throw AnonymousClass002.A0O();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r307 < 0) goto L11;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ boolean contains(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.14E
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3a
            r0 = r302
            X.14E r0 = (X.14E) r0
            r302 = r0
            r0 = r302
            byte r0 = r0.A00
            r304 = r0
            r0 = r301
            byte[] r0 = r0.A00
            r305 = r0
            r0 = r305
            int r0 = r0.length
            r306 = r0
            r0 = 0
            r307 = r0
        L21:
            r0 = r307
            r1 = r306
            if (r0 >= r1) goto L3a
            r0 = r305
            r1 = r307
            r0 = r0[r1]
            r303 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L3e
            r0 = 1
            r303 = r0
            r0 = r307
            if (r0 >= 0) goto L3c
        L3a:
            r0 = 0
            r303 = r0
        L3c:
            r0 = r303
            return r0
        L3e:
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0rg.contains(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r310 < 0) goto L21;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean containsAll(java.util.Collection r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            byte[] r0 = r0.A00
            r303 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L76
            r0 = r302
            java.util.Iterator r0 = r0.iterator()
            r306 = r0
        L20:
            r0 = r306
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L76
            r0 = r306
            java.lang.Object r0 = r0.next()
            r307 = r0
            r0 = r307
            boolean r0 = r0 instanceof X.14E
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L79
            r0 = r307
            X.14E r0 = (X.14E) r0
            byte r0 = r0.A00
            r308 = r0
            r0 = r303
            int r0 = r0.length
            r309 = r0
            r0 = 0
            r310 = r0
            r0 = 0
            r307 = r0
        L53:
            r0 = r310
            r1 = r309
            if (r0 >= r1) goto L79
            r0 = r303
            r1 = r310
            r0 = r0[r1]
            r304 = r0
            r0 = r308
            r1 = r304
            if (r0 != r1) goto L6d
            r0 = r310
            if (r0 < 0) goto L79
            goto L20
        L6d:
            r0 = r310
            r1 = 1
            int r0 = r0 + r1
            r310 = r0
            goto L53
        L76:
            r0 = 1
            r305 = r0
        L79:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0rg.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        byte[] bArr = this.A00;
        boolean z = false;
        if ((obj instanceof C0rg) && 11T.A0O(bArr, ((C0rg) obj).A00)) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A00.length);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C0re(this.A00);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ int size() {
        return this.A00.length;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return 11T.A0Q(this, objArr);
    }

    public String toString() {
        return 0Pz.A0X("UByteArray(storage=", Arrays.toString(this.A00), ')');
    }
}
