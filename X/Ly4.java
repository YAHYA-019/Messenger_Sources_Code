package X;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: Ly4.class */
public abstract class Ly4 extends AbstractCollection implements Serializable {
    public static final Object[] A00 = AnonymousClass001.A1Z();

    private int A03() {
        if (this instanceof K6A) {
            return ((K6A) this).A01.A03();
        }
        if (this instanceof K69) {
            return ((K69) this).A00;
        }
        if (this instanceof K64) {
            return ((K64) this).A00;
        }
        if (!(this instanceof K62)) {
            throw AnonymousClass001.A0p();
        }
        K62 k62 = (K62) this;
        return k62.zzc.A04() + k62.A00 + k62.A01;
    }

    private int A04() {
        if (this instanceof K6A) {
            return ((K6A) this).A01.A04();
        }
        if ((this instanceof K69) || (this instanceof K64)) {
            return 0;
        }
        if (!(this instanceof K62)) {
            throw AnonymousClass001.A0p();
        }
        K62 k62 = (K62) this;
        return k62.zzc.A04() + k62.A00;
    }

    private int A05(Object[] objArr) {
        int i;
        Object[] objArr2;
        int i2;
        if (!(this instanceof K67)) {
            if (this instanceof K6A) {
                return ((K6A) this).A01.A05(objArr);
            }
            if (this instanceof K69) {
                K69 k69 = (K69) this;
                objArr2 = k69.A01;
                i2 = k69.A00;
            } else if (!(this instanceof K65)) {
                LsO A06 = A06();
                int i3 = 0;
                while (true) {
                    i = i3;
                    if (!A06.hasNext()) {
                        break;
                    }
                    objArr[i] = A06.next();
                    i3 = i + 1;
                }
            } else {
                K65 k65 = (K65) this;
                if (k65 instanceof K64) {
                    K64 k64 = (K64) k65;
                    objArr2 = k64.A01;
                    i2 = k64.A00;
                } else {
                    i = k65.size();
                    for (int i4 = 0; i4 < i; i4++) {
                        objArr[i4] = k65.get(i4);
                    }
                }
            }
            System.arraycopy(objArr2, 0, objArr, 0, i2);
            return i2;
        }
        objArr[0] = ((K67) this).A00;
        i = 1;
        return i;
    }

    private Object[] A07() {
        if (this instanceof K6A) {
            return ((K6A) this).A01.A07();
        }
        if (this instanceof K69) {
            return ((K69) this).A01;
        }
        if (this instanceof K64) {
            return ((K64) this).A01;
        }
        if (this instanceof K62) {
            return ((K62) this).zzc.A07();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, X.K6F, X.LsO] */
    public LsO A06() {
        if (!(this instanceof K67)) {
            return (this instanceof K6A ? ((K6A) this).A01 : ((this instanceof K69) || (this instanceof K68)) ? ((K60) this).A08() : (K65) this).listIterator(0);
        }
        Object obj = ((K67) this).A00;
        ?? obj2 = new Object();
        ((K6F) obj2).A00 = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public abstract boolean contains(Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] A07 = A07();
            if (A07 != null) {
                return Arrays.copyOfRange(A07, A04(), A03(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        A05(objArr);
        return objArr;
    }
}
