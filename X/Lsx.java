package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* loaded from: Lsx.class */
public final class Lsx implements List, AnonymousClass116 {
    public int A01;
    public Object[] A04 = new Object[16];
    public long[] A03 = new long[16];
    public int A00 = -1;
    public boolean A02 = true;

    public static final long A00(Lsx lsx) {
        long floatToIntBits = Float.floatToIntBits(1.0f / 0.0f) << 32;
        int i = lsx.A00 + 1;
        int size = lsx.size() - 1;
        if (i <= size) {
            while (true) {
                long j = lsx.A03[i];
                if (KUf.A00(j, floatToIntBits) < 0) {
                    floatToIntBits = j;
                }
                if ((DKF.A00(floatToIntBits) < 0.0f && JR0.A0I(floatToIntBits) != 0) || i == size) {
                    break;
                }
                i++;
            }
        }
        return floatToIntBits;
    }

    public static final void A01(Lsx lsx) {
        int i = lsx.A00 + 1;
        int size = lsx.size() - 1;
        if (i <= size) {
            while (true) {
                lsx.A04[i] = null;
                if (i == size) {
                    break;
                } else {
                    i++;
                }
            }
        }
        lsx.A01 = i;
    }

    public final void A02(LPR lpr, C00m c00m, float f, boolean z) {
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        Object[] objArr = this.A04;
        int length = objArr.length;
        if (i2 >= length) {
            int i3 = length + 16;
            this.A04 = JQz.A1b(objArr, i3);
            long[] copyOf = Arrays.copyOf(this.A03, i3);
            11T.A0A(copyOf);
            this.A03 = copyOf;
        }
        Object[] objArr2 = this.A04;
        int i4 = this.A00;
        objArr2[i4] = lpr;
        this.A03[i4] = (4YV.A03(z ? 1 : 0) & 4294967295L) | (Float.floatToIntBits(f) << 32);
        A01(this);
        c00m.invoke();
        this.A00 = i;
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
    public final void clear() {
        this.A00 = -1;
        A01(this);
        this.A02 = true;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof LPR) {
            return 4YV.A1W(indexOf(obj), -1);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        Object obj = this.A04[i];
        11T.A0I(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0 < 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (X.JQz.A1Z(r302, r301.A04, r305) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        r0 = r305;
        r305 = r305 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
    
        if (r0 != r0) goto L16;
     */
    @Override // java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ int indexOf(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.LPR
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L19
            r0 = r301
            int r0 = r0.size()
            r303 = r0
            r0 = r303
            r1 = -1
            int r0 = r0 + r1
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 >= 0) goto L1f
        L19:
            r0 = -1
            r305 = r0
        L1c:
            r0 = r305
            return r0
        L1f:
            r0 = r301
            java.lang.Object[] r0 = r0.A04
            r306 = r0
            r0 = r302
            r1 = r306
            r2 = r305
            boolean r0 = X.JQz.A1Z(r0, r1, r2)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1c
            r0 = r305
            r303 = r0
            r0 = r305
            r1 = 1
            int r0 = r0 + r1
            r305 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L1f
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lsx.indexOf(java.lang.Object):int");
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(size());
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new LtB(this, 0, 0, size());
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof LPR) {
            int size = size();
            while (true) {
                i = size - 1;
                if (-1 >= i) {
                    break;
                }
                if (JQz.A1Z(obj, this.A04, i)) {
                    break;
                }
                size = i;
            }
            return i;
        }
        i = -1;
        return i;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new LtB(this, 0, 0, size());
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return new LtB(this, i, 0, size());
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
        return this.A01;
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw AnonymousClass002.A0O();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return new Lsw(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return C0A5.A01(this, objArr);
    }
}
