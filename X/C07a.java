package X;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.07a, reason: invalid class name */
/* loaded from: 07a.class */
public final class C07a extends C07b {
    public static final Object[] A03 = new Object[0];
    public int A00;
    public Object[] A01;
    public int A02;

    public C07a() {
        this.A01 = A03;
    }

    public C07a(Collection collection) {
        11T.A0F(collection, 1);
        Object[] array = collection.toArray(AnonymousClass001.A1Z());
        this.A01 = array;
        int length = array.length;
        this.A02 = length;
        if (length == 0) {
            this.A01 = A03;
        }
    }

    public static int A00(C07a c07a) {
        return c07a.A00 + c07a.size();
    }

    private final void A01(int i) {
        Object[] objArr;
        if (i < 0) {
            throw AnonymousClass001.A0N("Deque is too big.");
        }
        Object[] objArr2 = this.A01;
        int length = objArr2.length;
        if (i > length) {
            if (objArr2 == A03) {
                if (i < 10) {
                    i = 10;
                }
                objArr = new Object[i];
            } else {
                objArr = new Object[C0A7.A00(length, i)];
                C1A9.A0I(objArr2, objArr, 0, this.A00, length);
                Object[] objArr3 = this.A01;
                int length2 = objArr3.length;
                int i2 = this.A00;
                C1A9.A0I(objArr3, objArr, length2 - i2, 0, i2);
                this.A00 = 0;
            }
            this.A01 = objArr;
        }
    }

    private final void A02(int i, int i2) {
        Object[] objArr = this.A01;
        if (i < i2) {
            C1A9.A0H(objArr, i, i2);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            C1A9.A0H(this.A01, 0, i2);
        }
    }

    private final void A03(Collection collection, int i) {
        Iterator it = collection.iterator();
        int length = this.A01.length;
        while (i < length && it.hasNext()) {
            this.A01[i] = it.next();
            i++;
        }
        int i2 = this.A00;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.A01[i3] = it.next();
        }
        this.A02 = size() + collection.size();
    }

    @Override // X.C07b
    public int A0M() {
        return this.A02;
    }

    @Override // X.C07b
    public Object A0N(int i) {
        C0A7.A01(i, size());
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        ((AbstractList) this).modCount++;
        int i2 = this.A00 + i;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj = objArr[i2];
        int size = size() >> 1;
        int i3 = this.A00;
        if (i < size) {
            if (i2 >= i3) {
                Object[] objArr2 = this.A01;
                C1A9.A0I(objArr2, objArr2, i3 + 1, i3, i2);
            } else {
                Object[] objArr3 = this.A01;
                C1A9.A0I(objArr3, objArr3, 1, 0, i2);
                Object[] objArr4 = this.A01;
                int length2 = objArr4.length - 1;
                objArr4[0] = objArr4[length2];
                int i4 = this.A00;
                System.arraycopy(objArr4, i4, objArr4, i4 + 1, length2 - i4);
            }
            Object[] objArr5 = this.A01;
            int i5 = this.A00;
            objArr5[i5] = null;
            int i6 = i5 + 1;
            if (i5 == objArr5.length - 1) {
                i6 = 0;
            }
            this.A00 = i6;
        } else {
            int size2 = i3 + (size() - 1);
            Object[] objArr6 = this.A01;
            int length3 = objArr6.length;
            if (size2 >= length3) {
                size2 -= length3;
            }
            int i7 = i2 + 1;
            if (i2 <= size2) {
                System.arraycopy(objArr6, i7, objArr6, i2, (size2 + 1) - i7);
            } else {
                System.arraycopy(objArr6, i7, objArr6, i2, length3 - i7);
                Object[] objArr7 = this.A01;
                objArr7[objArr7.length - 1] = objArr7[0];
                System.arraycopy(objArr7, 1, objArr7, 0, (size2 + 1) - 1);
            }
            this.A01[size2] = null;
        }
        this.A02 = size() - 1;
        return obj;
    }

    public final Object A0O() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.A01[this.A00];
    }

    public final Object A0P() {
        if (isEmpty()) {
            return null;
        }
        return this.A01[this.A00];
    }

    public final Object A0Q() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.A01;
        int A04 = this.A00 + AnonymousClass001.A04(this);
        int length = this.A01.length;
        if (A04 >= length) {
            A04 -= length;
        }
        return objArr[A04];
    }

    public final Object A0R() {
        if (isEmpty()) {
            return null;
        }
        Object[] objArr = this.A01;
        int size = this.A00 + (size() - 1);
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        return objArr[size];
    }

    @Override // X.C07b, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int i2;
        C0A7.A02(i, size());
        if (i == size()) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        A01(size() + 1);
        int i3 = this.A00 + i;
        int length = this.A01.length;
        if (i3 >= length) {
            i3 -= length;
        }
        if (i < ((size() + 1) >> 1)) {
            if (i3 == 0) {
                Object[] objArr = this.A01;
                11T.A0F(objArr, 0);
                i2 = objArr.length - 1;
            } else {
                i2 = i3 - 1;
            }
            int i4 = this.A00;
            if (i4 == 0) {
                Object[] objArr2 = this.A01;
                11T.A0F(objArr2, 0);
                i4 = objArr2.length;
            }
            int i5 = i4 - 1;
            int i6 = this.A00;
            Object[] objArr3 = this.A01;
            if (i2 >= i6) {
                objArr3[i5] = objArr3[i6];
                int i7 = i6 + 1;
                System.arraycopy(objArr3, i7, objArr3, i6, (i2 + 1) - i7);
            } else {
                System.arraycopy(objArr3, i6, objArr3, i6 - 1, objArr3.length - i6);
                Object[] objArr4 = this.A01;
                objArr4[objArr4.length - 1] = objArr4[0];
                System.arraycopy(objArr4, 1, objArr4, 0, (i2 + 1) - 1);
            }
            this.A01[i2] = obj;
            this.A00 = i5;
        } else {
            int A00 = A00(this);
            Object[] objArr5 = this.A01;
            int length2 = objArr5.length;
            if (A00 >= length2) {
                A00 -= length2;
            }
            if (i3 < A00) {
                System.arraycopy(objArr5, i3, objArr5, i3 + 1, A00 - i3);
            } else {
                System.arraycopy(objArr5, 0, objArr5, 1, A00);
                Object[] objArr6 = this.A01;
                int length3 = objArr6.length - 1;
                objArr6[0] = objArr6[length3];
                System.arraycopy(objArr6, i3, objArr6, i3 + 1, length3 - i3);
            }
            this.A01[i3] = obj;
        }
        this.A02 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        Object[] objArr;
        11T.A0F(collection, 1);
        C0A7.A02(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        ((AbstractList) this).modCount++;
        A01(size() + collection.size());
        int A00 = A00(this);
        int length = this.A01.length;
        if (A00 >= length) {
            A00 -= length;
        }
        int i2 = this.A00 + i;
        if (i2 >= length) {
            i2 -= length;
        }
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i3 = this.A00;
            int i4 = i3 - size;
            if (i2 < i3) {
                Object[] objArr2 = this.A01;
                System.arraycopy(objArr2, i3, objArr2, i4, objArr2.length - i3);
                Object[] objArr3 = this.A01;
                int length2 = objArr3.length - size;
                if (size >= i2) {
                    System.arraycopy(objArr3, 0, objArr3, length2, i2);
                } else {
                    System.arraycopy(objArr3, 0, objArr3, length2, size);
                    Object[] objArr4 = this.A01;
                    C1A9.A0I(objArr4, objArr4, 0, size, i2);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.A01;
                C1A9.A0I(objArr5, objArr5, i4, i3, i2);
            } else {
                Object[] objArr6 = this.A01;
                int length3 = objArr6.length;
                i4 += length3;
                int i5 = i2 - i3;
                int i6 = length3 - i4;
                if (i6 >= i5) {
                    System.arraycopy(objArr6, i3, objArr6, i4, i5);
                } else {
                    System.arraycopy(objArr6, i3, objArr6, i4, (i3 + i6) - i3);
                    Object[] objArr7 = this.A01;
                    C1A9.A0I(objArr7, objArr7, 0, this.A00 + i6, i2);
                }
            }
            this.A00 = i4;
            i2 -= size;
            if (i2 < 0) {
                i2 += this.A01.length;
            }
        } else {
            int i7 = i2 + size;
            if (i2 < A00) {
                int i8 = size + A00;
                objArr = this.A01;
                int length4 = objArr.length;
                if (i8 > length4) {
                    if (i7 >= length4) {
                        i7 -= length4;
                    } else {
                        int i9 = A00 - (i8 - length4);
                        System.arraycopy(objArr, i9, objArr, 0, A00 - i9);
                        Object[] objArr8 = this.A01;
                        C1A9.A0I(objArr8, objArr8, i7, i2, i9);
                    }
                }
                System.arraycopy(objArr, i2, objArr, i7, A00 - i2);
            } else {
                Object[] objArr9 = this.A01;
                C1A9.A0I(objArr9, objArr9, size, 0, A00);
                Object[] objArr10 = this.A01;
                int length5 = objArr10.length;
                if (i7 >= length5) {
                    System.arraycopy(objArr10, i2, objArr10, i7 - length5, length5 - i2);
                } else {
                    int i10 = length5 - size;
                    System.arraycopy(objArr10, i10, objArr10, 0, length5 - i10);
                    objArr = this.A01;
                    A00 = objArr.length - size;
                    System.arraycopy(objArr, i2, objArr, i7, A00 - i2);
                }
            }
        }
        A03(collection, i2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        boolean z = false;
        11T.A0F(collection, 0);
        if (!collection.isEmpty()) {
            ((AbstractList) this).modCount++;
            A01(size() + collection.size());
            int A00 = A00(this);
            int length = this.A01.length;
            if (A00 >= length) {
                A00 -= length;
            }
            A03(collection, A00);
            z = true;
        }
        return z;
    }

    public final void addFirst(Object obj) {
        ((AbstractList) this).modCount++;
        A01(size() + 1);
        int i = this.A00;
        if (i == 0) {
            Object[] objArr = this.A01;
            11T.A0F(objArr, 0);
            i = objArr.length;
        }
        int i2 = i - 1;
        this.A00 = i2;
        this.A01[i2] = obj;
        this.A02 = size() + 1;
    }

    public final void addLast(Object obj) {
        ((AbstractList) this).modCount++;
        A01(size() + 1);
        Object[] objArr = this.A01;
        int size = this.A00 + size();
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        objArr[size] = obj;
        this.A02 = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            ((AbstractList) this).modCount++;
            int A00 = A00(this);
            int length = this.A01.length;
            if (A00 >= length) {
                A00 -= length;
            }
            A02(this.A00, A00);
        }
        this.A00 = 0;
        this.A02 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        boolean z = false;
        if (indexOf(obj) != -1) {
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        C0A7.A01(i, size());
        Object[] objArr = this.A01;
        int i2 = this.A00 + i;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        return objArr[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int size = this.A00 + size();
        int length = this.A01.length;
        if (size >= length) {
            size -= length;
        }
        int i = this.A00;
        if (i < size) {
            while (i < size) {
                if (!11T.A0O(obj, this.A01[i])) {
                    i++;
                }
            }
            return -1;
        }
        while (true) {
            if (i >= length) {
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= size) {
                        return -1;
                    }
                    if (11T.A0O(obj, this.A01[i3])) {
                        i = i3 + this.A01.length;
                        break;
                    }
                    i2 = i3 + 1;
                }
            } else {
                if (11T.A0O(obj, this.A01[i])) {
                    break;
                }
                i++;
            }
        }
        return i - this.A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        boolean z = false;
        if (size() == 0) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r0 > r303) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r303 = r303 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if ((-1) >= r303) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (X.11T.A0O(r302, r301.A01[r303]) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        r303 = r303 + r301.A01.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        r0 = r301.A01;
        X.11T.A0F(r0, 0);
        r303 = r0.length - 1;
        r0 = r301.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        if (r0 > r303) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        if (X.11T.A0O(r302, r301.A01[r303]) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c8, code lost:
    
        if (r303 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
    
        r303 = r303 - 1;
     */
    @Override // java.util.AbstractList, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int lastIndexOf(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07a.lastIndexOf(java.lang.Object):int");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v81, types: [int] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        Object[] objArr;
        11T.A0F(collection, 0);
        boolean z = false;
        if (!isEmpty() && this.A01.length != 0) {
            int A00 = A00(this);
            int length = this.A01.length;
            if (A00 >= length) {
                A00 -= length;
            }
            int i = this.A00;
            int i2 = i;
            if (i >= A00) {
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.A01;
                    Object obj = objArr2[i];
                    objArr2[i] = null;
                    if (!collection.contains(obj)) {
                        this.A01[i2] = obj;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                int i3 = i2;
                int length2 = this.A01.length;
                if (i2 >= length2) {
                    i3 = i2 - length2;
                }
                i2 = i3;
                while (z < A00) {
                    Object[] objArr3 = this.A01;
                    Object obj2 = objArr3[z ? 1 : 0];
                    objArr3[z ? 1 : 0] = null;
                    if (!collection.contains(obj2)) {
                        this.A01[i3] = obj2;
                        i3++;
                        if (i2 == r0.length - 1) {
                            i3 = 0;
                        }
                        i2 = i3;
                    } else {
                        z2 = true;
                    }
                    z = (z ? 1 : 0) + 1;
                }
                z = z2;
            } else {
                while (true) {
                    objArr = this.A01;
                    if (i >= A00) {
                        break;
                    }
                    Object obj3 = objArr[i];
                    if (!collection.contains(obj3)) {
                        this.A01[i2] = obj3;
                        i2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C1A9.A0H(objArr, i2, A00);
            }
            if (z) {
                ((AbstractList) this).modCount++;
                int i4 = i2 - this.A00;
                if (i4 < 0) {
                    i4 += this.A01.length;
                }
                this.A02 = i4;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        Object[] objArr = this.A01;
        int i = this.A00;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = i + 1;
        if (i == objArr.length - 1) {
            i2 = 0;
        }
        this.A00 = i2;
        this.A02 = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        ((AbstractList) this).modCount++;
        int size = this.A00 + (size() - 1);
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (size >= length) {
            size -= length;
        }
        Object obj = objArr[size];
        objArr[size] = null;
        this.A02 = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        C0A7.A03(i, i2, size());
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == size()) {
                clear();
                return;
            }
            if (i3 == 1) {
                remove(i);
                return;
            }
            ((AbstractList) this).modCount++;
            int size = size() - i2;
            int i4 = this.A00;
            if (i < size) {
                int i5 = i4 + (i - 1);
                int length = this.A01.length;
                if (i5 >= length) {
                    i5 -= length;
                }
                int i6 = i4 + (i2 - 1);
                if (i6 >= length) {
                    i6 -= length;
                }
                while (i > 0) {
                    int i7 = i5 + 1;
                    int min = Math.min(i, Math.min(i7, i6 + 1));
                    Object[] objArr = this.A01;
                    i6 -= min;
                    i5 -= min;
                    C1A9.A0I(objArr, objArr, i6 + 1, i5 + 1, i7);
                    if (i5 < 0) {
                        i5 += this.A01.length;
                    }
                    if (i6 < 0) {
                        i6 += this.A01.length;
                    }
                    i -= min;
                }
                int i8 = this.A00;
                int i9 = i8 + i3;
                int length2 = this.A01.length;
                if (i9 >= length2) {
                    i9 -= length2;
                }
                A02(i8, i9);
                this.A00 = i9;
            } else {
                int i10 = i4 + i2;
                int length3 = this.A01.length;
                if (i10 >= length3) {
                    i10 -= length3;
                }
                int i11 = i4 + i;
                if (i11 >= length3) {
                    i11 -= length3;
                }
                int size2 = size();
                while (true) {
                    size2 -= i2;
                    if (size2 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.A01;
                    int length4 = objArr2.length;
                    i2 = Math.min(size2, Math.min(length4 - i10, length4 - i11));
                    int i12 = i10 + i2;
                    System.arraycopy(objArr2, i10, objArr2, i11, i12 - i10);
                    i10 = i12;
                    int length5 = this.A01.length;
                    if (i12 >= length5) {
                        i10 = i12 - length5;
                    }
                    i11 += i2;
                    if (i11 >= length5) {
                        i11 -= length5;
                    }
                }
                int A00 = A00(this);
                int length6 = this.A01.length;
                if (A00 >= length6) {
                    A00 -= length6;
                }
                int i13 = A00 - i3;
                if (i13 < 0) {
                    i13 += length6;
                }
                A02(i13, A00);
            }
            this.A02 = size() - i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v79, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        Object[] objArr;
        11T.A0F(collection, 0);
        boolean z = false;
        if (!isEmpty() && this.A01.length != 0) {
            int A00 = A00(this);
            int length = this.A01.length;
            if (A00 >= length) {
                A00 -= length;
            }
            int i = this.A00;
            int i2 = i;
            if (i >= A00) {
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr2 = this.A01;
                    Object obj = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj)) {
                        this.A01[i2] = obj;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                int i3 = i2;
                int length2 = this.A01.length;
                if (i2 >= length2) {
                    i3 = i2 - length2;
                }
                i2 = i3;
                while (z < A00) {
                    Object[] objArr3 = this.A01;
                    Object obj2 = objArr3[z ? 1 : 0];
                    objArr3[z ? 1 : 0] = null;
                    if (collection.contains(obj2)) {
                        this.A01[i3] = obj2;
                        i3++;
                        if (i2 == r0.length - 1) {
                            i3 = 0;
                        }
                        i2 = i3;
                    } else {
                        z2 = true;
                    }
                    z = (z ? 1 : 0) + 1;
                }
                z = z2;
            } else {
                while (true) {
                    objArr = this.A01;
                    if (i >= A00) {
                        break;
                    }
                    Object obj3 = objArr[i];
                    if (collection.contains(obj3)) {
                        this.A01[i2] = obj3;
                        i2++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                C1A9.A0H(objArr, i2, A00);
            }
            if (z) {
                ((AbstractList) this).modCount++;
                int i4 = i2 - this.A00;
                if (i4 < 0) {
                    i4 += this.A01.length;
                }
                this.A02 = i4;
            }
        }
        return z;
    }

    @Override // X.C07b, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        C0A7.A01(i, size());
        int i2 = this.A00 + i;
        Object[] objArr = this.A01;
        int length = objArr.length;
        if (i2 >= length) {
            i2 -= length;
        }
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        11T.A0F(objArr, 0);
        if (objArr.length < size()) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size());
            11T.A0I(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int A00 = A00(this);
        Object[] objArr2 = this.A01;
        int length = objArr2.length;
        if (A00 >= length) {
            A00 -= length;
        }
        int i = this.A00;
        if (i < A00) {
            C1A9.A0I(objArr2, objArr, 0, i, A00);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.A01;
            C1A9.A0I(objArr3, objArr, 0, this.A00, objArr3.length);
            Object[] objArr4 = this.A01;
            C1A9.A0I(objArr4, objArr, objArr4.length - this.A00, 0, A00);
        }
        int size = size();
        11T.A0F(objArr, 1);
        if (size < objArr.length) {
            objArr[size] = null;
        }
        return objArr;
    }
}
