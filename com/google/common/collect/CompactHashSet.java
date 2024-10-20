package com.google.common.collect;

import X.0Pz;
import X.1BJ;
import X.1FW;
import X.2Iw;
import X.5D2;
import X.AnonymousClass001;
import com.facebook.acra.constants.ActionId;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CompactHashSet.class */
public class CompactHashSet extends AbstractSet implements Serializable {
    public transient int A00;
    public transient Object A01;
    public transient int[] A02;
    public transient Object[] A03;
    public transient int A04;

    public CompactHashSet() {
        A04(3);
    }

    public CompactHashSet(int i) {
        A04(i);
    }

    private Set A00() {
        Object obj = this.A01;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(0Pz.A0T(1BJ.A00(ActionId.MESSENGER_THREAD_LIST_LOADED), readInt));
        }
        A04(readInt);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public int A01() {
        boolean z = false;
        if (this.A01 == null) {
            z = true;
        }
        Preconditions.checkState(z, "Arrays already allocated");
        int i = this.A00;
        int max = Math.max(4, 1FW.A00(i + 1));
        this.A01 = 2Iw.A02(max);
        this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(max - 1)) & 31);
        this.A02 = new int[i];
        this.A03 = new Object[i];
        return i;
    }

    public int A02(int i) {
        int i2;
        if (this instanceof CompactLinkedHashSet) {
            int[] iArr = ((CompactLinkedHashSet) this).A02;
            iArr.getClass();
            i2 = iArr[i] - 1;
        } else {
            i2 = i + 1;
            if (i2 >= this.A04) {
                return -1;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (isEmpty() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Set A03() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r1 = 31
            r0 = r0 & r1
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r303
            r1 = r302
            int r0 = r0 << r1
            r1 = r303
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r303 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r304 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r305 = r0
            r0 = r305
            r1 = r303
            r2 = r304
            r0.<init>(r1, r2)
            r0 = r301
            r306 = r0
            r0 = r301
            boolean r0 = r0 instanceof com.google.common.collect.CompactLinkedHashSet
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L68
            r0 = r301
            com.google.common.collect.CompactLinkedHashSet r0 = (com.google.common.collect.CompactLinkedHashSet) r0
            r306 = r0
            r0 = r306
            int r0 = r0.A00
            r303 = r0
        L39:
            r0 = r303
            if (r0 < 0) goto L76
            r0 = r301
            com.google.common.collect.CompactHashSet r0 = (com.google.common.collect.CompactHashSet) r0
            java.lang.Object[] r0 = r0.A03
            r307 = r0
            r0 = r307
            java.lang.Class r0 = r0.getClass()
            r0 = r307
            r1 = r303
            r0 = r0[r1]
            r307 = r0
            r0 = r305
            r1 = r307
            boolean r0 = r0.add(r1)
            r0 = r301
            com.google.common.collect.CompactHashSet r0 = (com.google.common.collect.CompactHashSet) r0
            r1 = r303
            int r0 = r0.A02(r1)
            r303 = r0
            goto L39
        L68:
            r0 = r301
            boolean r0 = r0.isEmpty()
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
            r0 = r302
            if (r0 == 0) goto L39
        L76:
            r0 = r301
            com.google.common.collect.CompactHashSet r0 = (com.google.common.collect.CompactHashSet) r0
            r1 = r305
            r0.A01 = r1
            r0 = r301
            com.google.common.collect.CompactHashSet r0 = (com.google.common.collect.CompactHashSet) r0
            r1 = 0
            r0.A02 = r1
            r0 = r301
            com.google.common.collect.CompactHashSet r0 = (com.google.common.collect.CompactHashSet) r0
            r1 = 0
            r0.A03 = r1
            r0 = r301
            com.google.common.collect.CompactHashSet r0 = (com.google.common.collect.CompactHashSet) r0
            int r0 = r0.A00
            r1 = 32
            int r0 = r0 + r1
            r302 = r0
            r0 = r301
            com.google.common.collect.CompactHashSet r0 = (com.google.common.collect.CompactHashSet) r0
            r1 = r302
            r0.A00 = r1
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashSet.A03():java.util.Set");
    }

    public void A04(int i) {
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "Expected size must be >= 0");
        this.A00 = Math.min(Math.max(i, 1), (-1) >>> 2);
    }

    public void A05(int i) {
        int[] iArr = this.A02;
        iArr.getClass();
        this.A02 = Arrays.copyOf(iArr, i);
        Object[] objArr = this.A03;
        objArr.getClass();
        this.A03 = Arrays.copyOf(objArr, i);
    }

    public void A06(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.A01;
        obj.getClass();
        int[] iArr = this.A02;
        iArr.getClass();
        Object[] objArr = this.A03;
        objArr.getClass();
        int size = size() - 1;
        if (i >= size) {
            objArr[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i] = obj2;
        objArr[size] = null;
        iArr[i] = iArr[size];
        iArr[size] = 0;
        int A02 = 1FW.A02(obj2) & i2;
        int A00 = 2Iw.A00(obj, A02);
        int i5 = size + 1;
        if (A00 == i5) {
            2Iw.A03(A02, i + 1, obj);
            return;
        }
        do {
            i3 = A00 - 1;
            i4 = iArr[i3];
            A00 = i4 & i2;
        } while (A00 != i5);
        iArr[i3] = (i4 & (i2 ^ (-1))) | ((i + 1) & i2);
    }

    public void A07(Object obj, int i, int i2, int i3) {
        int[] iArr = this.A02;
        iArr.getClass();
        iArr[i] = i2 & (i3 ^ (-1));
        Object[] objArr = this.A03;
        objArr.getClass();
        objArr[i] = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int min;
        if (this.A01 == null) {
            A01();
        }
        Set A00 = A00();
        if (A00 == null) {
            int[] iArr = this.A02;
            iArr.getClass();
            Object[] objArr = this.A03;
            objArr.getClass();
            int i = this.A04;
            int i2 = i + 1;
            int A02 = 1FW.A02(obj);
            int i3 = (1 << (this.A00 & 31)) - 1;
            int i4 = A02 & i3;
            Object obj2 = this.A01;
            obj2.getClass();
            int A002 = 2Iw.A00(obj2, i4);
            if (A002 == 0) {
                if (i2 <= i3) {
                    Object obj3 = this.A01;
                    obj3.getClass();
                    2Iw.A03(i4, i2, obj3);
                }
                int i5 = (i3 < 32 ? 4 : 2) * (i3 + 1);
                Object A022 = 2Iw.A02(i5);
                int i6 = i5 - 1;
                if (i != 0) {
                    2Iw.A03(A02 & i6, i + 1, A022);
                }
                Object obj4 = this.A01;
                obj4.getClass();
                int[] iArr2 = this.A02;
                iArr2.getClass();
                for (int i7 = 0; i7 <= i3; i7++) {
                    int A003 = 2Iw.A00(obj4, i7);
                    while (true) {
                        int i8 = A003;
                        if (i8 != 0) {
                            int i9 = i8 - 1;
                            int i10 = iArr2[i9];
                            int i11 = (i10 & (i3 ^ (-1))) | i7;
                            int i12 = i11 & i6;
                            int A004 = 2Iw.A00(A022, i12);
                            2Iw.A03(i12, i8, A022);
                            iArr2[i9] = (i11 & (i6 ^ (-1))) | (A004 & i6);
                            A003 = i10 & i3;
                        }
                    }
                }
                this.A01 = A022;
                this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(i6)) & 31);
                i3 = i6;
            } else {
                int i13 = i3 ^ (-1);
                int i14 = A02 & i13;
                int i15 = 0;
                while (true) {
                    int i16 = A002 - 1;
                    int i17 = iArr[i16];
                    if ((i17 & i13) == i14 && Objects.equal(obj, objArr[i16])) {
                        return false;
                    }
                    int i18 = i17 & i3;
                    i15++;
                    if (i18 != 0) {
                        A002 = i18;
                    } else if (i15 >= 9) {
                        A00 = A03();
                    } else if (i2 <= i3) {
                        iArr[i16] = (i17 & i13) | (i2 & i3);
                    }
                }
            }
            int[] iArr3 = this.A02;
            iArr3.getClass();
            int length = iArr3.length;
            if (i2 > length && (min = Math.min((-1) >>> 2, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                A05(min);
            }
            A07(obj, i, A02, i3);
            this.A04 = i2;
            this.A00 += 32;
            return true;
        }
        return A00.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (this.A01 != null) {
            this.A00 += 32;
            Set A00 = A00();
            if (A00 != null) {
                this.A00 = Math.min(Math.max(size(), 3), (-1) >>> 2);
                A00.clear();
                this.A01 = null;
            } else {
                Object[] objArr = this.A03;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A04, (Object) null);
                Object obj = this.A01;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.A02;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A04, 0);
            }
            this.A04 = 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        int i;
        boolean z = false;
        if (!AnonymousClass001.A1U(this.A01)) {
            Set A00 = A00();
            if (A00 != null) {
                z = A00.contains(obj);
            } else {
                int A02 = 1FW.A02(obj);
                int i2 = (1 << (this.A00 & 31)) - 1;
                Object obj2 = this.A01;
                obj2.getClass();
                int A002 = 2Iw.A00(obj2, A02 & i2);
                if (A002 != 0) {
                    int i3 = i2 ^ (-1);
                    int i4 = A02 & i3;
                    do {
                        int i5 = A002 - 1;
                        int[] iArr = this.A02;
                        iArr.getClass();
                        int i6 = iArr[i5];
                        if ((i6 & i3) == i4) {
                            Object[] objArr = this.A03;
                            objArr.getClass();
                            if (Objects.equal(obj, objArr[i5])) {
                                return true;
                            }
                        }
                        i = i6 & i2;
                        A002 = i;
                    } while (i != 0);
                    return false;
                }
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        boolean z = false;
        if (size() == 0) {
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        Set A00 = A00();
        return A00 != null ? A00.iterator() : new 5D2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2 = this.A01;
        boolean z = false;
        if (obj2 == null) {
            z = true;
        }
        boolean z2 = false;
        if (!z) {
            Set A00 = A00();
            if (A00 != null) {
                z2 = A00.remove(obj);
            } else {
                int i = (1 << (this.A00 & 31)) - 1;
                obj2.getClass();
                int[] iArr = this.A02;
                iArr.getClass();
                Object[] objArr = this.A03;
                objArr.getClass();
                int A01 = 2Iw.A01(obj, (Object) null, obj2, iArr, objArr, (Object[]) null, i);
                if (A01 != -1) {
                    A06(A01, i);
                    this.A04--;
                    this.A00 += 32;
                    return true;
                }
            }
        }
        return z2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set A00 = A00();
        return A00 != null ? A00.size() : this.A04;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (this.A01 == null) {
            return AnonymousClass001.A1Z();
        }
        Set A00 = A00();
        if (A00 != null) {
            return A00.toArray();
        }
        Object[] objArr = this.A03;
        objArr.getClass();
        return Arrays.copyOf(objArr, this.A04);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (this.A01 == null) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set A00 = A00();
        if (A00 != null) {
            return A00.toArray(objArr);
        }
        Object[] objArr2 = this.A03;
        objArr2.getClass();
        int i = this.A04;
        Preconditions.checkPositionIndexes(0, i, objArr2.length);
        int length = objArr.length;
        if (length < i) {
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return objArr;
    }
}
