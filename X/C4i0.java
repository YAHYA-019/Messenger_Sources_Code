package X;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: X.4i0, reason: invalid class name */
/* loaded from: 4i0.class */
public final class C4i0 extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    public final int[] array;
    public final int end;
    public final int start;

    public C4i0(int[] iArr, int i, int i2) {
        this.array = iArr;
        this.start = i;
        this.end = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r306 == (-1)) goto L11;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean contains(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3e
            r0 = r301
            int[] r0 = r0.array
            r304 = r0
            r0 = r302
            int r0 = X.AnonymousClass001.A03(r0)
            r305 = r0
            r0 = r301
            int r0 = r0.start
            r306 = r0
            r0 = r301
            int r0 = r0.end
            r307 = r0
        L20:
            r0 = r306
            r1 = r307
            if (r0 >= r1) goto L3e
            r0 = r304
            r1 = r306
            r0 = r0[r1]
            r303 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L42
            r0 = -1
            r307 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L40
        L3e:
            r0 = 0
            r303 = r0
        L40:
            r0 = r303
            return r0
        L42:
            r0 = r306
            r1 = 1
            int r0 = r0 + r1
            r306 = r0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4i0.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        boolean equals;
        if (obj != this) {
            if (obj instanceof C4i0) {
                C4i0 c4i0 = (C4i0) obj;
                int size = size();
                equals = false;
                if (c4i0.size() == size) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= size) {
                            break;
                        }
                        if (this.array[this.start + i2] != c4i0.array[c4i0.start + i2]) {
                            break;
                        }
                        i = i2 + 1;
                    }
                }
            } else {
                equals = super.equals(obj);
            }
            return equals;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        Preconditions.checkElementIndex(i, size());
        return Integer.valueOf(this.array[this.start + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = this.start; i2 < this.end; i2++) {
            i = (i * 31) + this.array[i2];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r308 < 0) goto L11;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int indexOf(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L41
            r0 = r301
            int[] r0 = r0.array
            r304 = r0
            r0 = r302
            int r0 = X.AnonymousClass001.A03(r0)
            r305 = r0
            r0 = r301
            int r0 = r0.start
            r306 = r0
            r0 = r301
            int r0 = r0.end
            r307 = r0
            r0 = r306
            r308 = r0
        L24:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto L41
            r0 = r304
            r1 = r308
            r0 = r0[r1]
            r303 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L45
            r0 = r308
            r1 = r306
            int r0 = r0 - r1
            r303 = r0
            r0 = r308
            if (r0 >= 0) goto L43
        L41:
            r0 = -1
            r303 = r0
        L43:
            r0 = r303
            return r0
        L45:
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4i0.indexOf(java.lang.Object):int");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r307 < 0) goto L11;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int lastIndexOf(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L43
            r0 = r301
            int[] r0 = r0.array
            r304 = r0
            r0 = r302
            int r0 = X.AnonymousClass001.A03(r0)
            r305 = r0
            r0 = r301
            int r0 = r0.start
            r306 = r0
            r0 = r301
            int r0 = r0.end
            r307 = r0
        L20:
            r0 = r307
            r1 = -1
            int r0 = r0 + r1
            r307 = r0
            r0 = r307
            r1 = r306
            if (r0 < r1) goto L43
            r0 = r304
            r1 = r307
            r0 = r0[r1]
            r303 = r0
            r0 = r303
            r1 = r305
            if (r0 != r1) goto L20
            r0 = r307
            r1 = r306
            int r0 = r0 - r1
            r303 = r0
            r0 = r307
            if (r0 >= 0) goto L45
        L43:
            r0 = -1
            r303 = r0
        L45:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4i0.lastIndexOf(java.lang.Object):int");
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Number number = (Number) obj;
        Preconditions.checkElementIndex(i, size());
        int[] iArr = this.array;
        int i2 = this.start + i;
        int i3 = iArr[i2];
        number.getClass();
        iArr[i2] = number.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.end - this.start;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.array;
        int i3 = this.start;
        return new C4i0(iArr, i + i3, i3 + i2);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        StringBuilder A0l = AnonymousClass001.A0l(size() * 5);
        A0l.append('[');
        int[] iArr = this.array;
        int i = this.start;
        while (true) {
            A0l.append(iArr[i]);
            i++;
            if (i >= this.end) {
                return AnonymousClass001.A0g(A0l, ']');
            }
            AnonymousClass001.A1H(A0l);
        }
    }
}
