package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: Ls2.class */
public final class Ls2 implements Collection, C18t {
    public final /* synthetic */ C2818Jaa A00;

    public Ls2(C2818Jaa c2818Jaa) {
        this.A00 = c2818Jaa;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Collection
    public void clear() {
        this.A00.A08();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.A00.A04(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        11T.A0F(collection, 0);
        C2818Jaa c2818Jaa = this.A00;
        boolean z = true;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!c2818Jaa.A04(it.next())) {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A00.A01);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new Lsq(this.A00, 2);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        C2818Jaa c2818Jaa = this.A00;
        long[] jArr = c2818Jaa.A02;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            int i2 = i;
            long j = jArr[i2];
            if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int A08 = 8 - JQx.A08(i2, length);
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    if (i4 < A08) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (JQz.A1Z(obj, c2818Jaa.A04, i5)) {
                                c2818Jaa.A06(i5);
                                return true;
                            }
                        }
                        j >>= 8;
                        i3 = i4 + 1;
                    } else if (A08 != 8) {
                        return false;
                    }
                }
            }
            if (i2 == length) {
                return false;
            }
            i = i2 + 1;
        }
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        11T.A0F(collection, 0);
        C2818Jaa c2818Jaa = this.A00;
        long[] jArr = c2818Jaa.A02;
        int length = jArr.length - 2;
        boolean z = false;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                long j = jArr[i2];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A08 = 8 - JQx.A08(i2, length);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= A08) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (0QD.A0k(collection, c2818Jaa.A04[i5])) {
                                c2818Jaa.A06(i5);
                                z = true;
                            }
                        }
                        j >>= 8;
                        i3 = i4 + 1;
                    }
                    if (A08 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        11T.A0F(collection, 0);
        C2818Jaa c2818Jaa = this.A00;
        long[] jArr = c2818Jaa.A02;
        int length = jArr.length - 2;
        boolean z = false;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i;
                long j = jArr[i2];
                if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                    int A08 = 8 - JQx.A08(i2, length);
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 >= A08) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!0QD.A0k(collection, c2818Jaa.A04[i5])) {
                                c2818Jaa.A06(i5);
                                z = true;
                            }
                        }
                        j >>= 8;
                        i3 = i4 + 1;
                    }
                    if (A08 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i = i2 + 1;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return this.A00.A01;
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C0A5.A00(this);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return 11T.A0Q(this, objArr);
    }
}
