package com.google.common.collect;

import X.0Pz;
import X.1FW;
import X.2Iw;
import X.4eF;
import X.4eG;
import X.6mW;
import X.AnonymousClass001;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.CompactHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: CompactHashMap.class */
public class CompactHashMap extends AbstractMap implements Serializable {
    public static final Object A09 = new Object();
    public transient int A00;
    public transient int A01;
    public transient Object A02;
    public transient int[] A03;
    public transient Object[] A04;
    public transient Object[] A05;
    public transient Collection A06;
    public transient Set A07;
    public transient Set A08;

    public CompactHashMap() {
        A0B(3);
    }

    public CompactHashMap(int i) {
        A0B(i);
    }

    public static int A00(CompactHashMap compactHashMap, Object obj) {
        boolean z = false;
        if (compactHashMap.A02 == null) {
            z = true;
        }
        if (!z) {
            int A02 = 1FW.A02(obj);
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            Object obj2 = compactHashMap.A02;
            obj2.getClass();
            int A00 = 2Iw.A00(obj2, A02 & i);
            if (A00 != 0) {
                int i2 = i ^ (-1);
                int i3 = A02 & i2;
                do {
                    int i4 = A00 - 1;
                    int[] iArr = compactHashMap.A03;
                    iArr.getClass();
                    int i5 = iArr[i4];
                    if ((i5 & i2) == i3) {
                        Object[] objArr = compactHashMap.A04;
                        objArr.getClass();
                        if (Objects.equal(obj, objArr[i4])) {
                            return i4;
                        }
                    }
                    A00 = i5 & i;
                } while (A00 != 0);
            }
        }
        return -1;
    }

    public static Object A01(CompactHashMap compactHashMap, Object obj) {
        Object obj2 = compactHashMap.A02;
        if (obj2 != null) {
            int i = (1 << (compactHashMap.A00 & 31)) - 1;
            int[] iArr = compactHashMap.A03;
            iArr.getClass();
            Object[] objArr = compactHashMap.A04;
            objArr.getClass();
            int A01 = 2Iw.A01(obj, (Object) null, obj2, iArr, objArr, (Object[]) null, i);
            if (A01 != -1) {
                Object[] objArr2 = compactHashMap.A05;
                objArr2.getClass();
                Object obj3 = objArr2[A01];
                compactHashMap.A0D(A01, i);
                compactHashMap.A01--;
                compactHashMap.A00 += 32;
                return obj3;
            }
        }
        return A09;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(0Pz.A0T("Invalid size: ", readInt));
        }
        A0B(readInt);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                return;
            }
            put(objectInputStream.readObject(), objectInputStream.readObject());
            i = i2 + 1;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map A03 = A03();
        4eG A0y = A03 != null ? AnonymousClass001.A0y(A03) : new 4eG(this);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            objectOutputStream.writeObject(A0z.getKey());
            objectOutputStream.writeObject(A0z.getValue());
        }
    }

    public Map A03() {
        Object obj = this.A02;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public int A04() {
        boolean z = false;
        if (this.A02 == null) {
            z = true;
        }
        Preconditions.checkState(z, "Arrays already allocated");
        int i = this.A00;
        int max = Math.max(4, 1FW.A00(i + 1));
        this.A02 = 2Iw.A02(max);
        this.A00 = (this.A00 & (-32)) | ((32 - Integer.numberOfLeadingZeros(max - 1)) & 31);
        this.A03 = new int[i];
        this.A04 = new Object[i];
        this.A05 = new Object[i];
        return i;
    }

    public int A05() {
        int i = 0;
        if (isEmpty()) {
            i = -1;
        }
        return i;
    }

    public int A06(int i) {
        int i2 = i + 1;
        if (i2 >= this.A01) {
            i2 = -1;
        }
        return i2;
    }

    public int A07(int i, int i2) {
        return i - 1;
    }

    public LinkedHashMap A08(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public Map A09() {
        LinkedHashMap A08 = A08(((1 << (this.A00 & 31)) - 1) + 1);
        int A05 = A05();
        while (true) {
            int i = A05;
            if (i < 0) {
                this.A02 = A08;
                this.A03 = null;
                this.A04 = null;
                this.A05 = null;
                this.A00 += 32;
                return A08;
            }
            Object[] objArr = this.A04;
            objArr.getClass();
            Object obj = objArr[i];
            Object[] objArr2 = this.A05;
            objArr2.getClass();
            A08.put(obj, objArr2[i]);
            A05 = A06(i);
        }
    }

    public void A0A(int i) {
    }

    public void A0B(int i) {
        boolean z = false;
        if (i >= 0) {
            z = true;
        }
        Preconditions.checkArgument(z, "Expected size must be >= 0");
        this.A00 = Math.min(Math.max(i, 1), (-1) >>> 2);
    }

    public void A0C(int i) {
        int[] iArr = this.A03;
        iArr.getClass();
        this.A03 = Arrays.copyOf(iArr, i);
        Object[] objArr = this.A04;
        objArr.getClass();
        this.A04 = Arrays.copyOf(objArr, i);
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        this.A05 = Arrays.copyOf(objArr2, i);
    }

    public void A0D(int i, int i2) {
        int i3;
        int i4;
        Object obj = this.A02;
        obj.getClass();
        int[] iArr = this.A03;
        iArr.getClass();
        Object[] objArr = this.A04;
        objArr.getClass();
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        int size = size() - 1;
        if (i >= size) {
            objArr[i] = null;
            objArr2[i] = null;
            iArr[i] = 0;
            return;
        }
        Object obj2 = objArr[size];
        objArr[i] = obj2;
        objArr2[i] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
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

    public void A0E(Object obj, int i, Object obj2, int i2, int i3) {
        int[] iArr = this.A03;
        iArr.getClass();
        iArr[i] = i2 & (i3 ^ (-1));
        Object[] objArr = this.A04;
        objArr.getClass();
        objArr[i] = obj;
        Object[] objArr2 = this.A05;
        objArr2.getClass();
        objArr2[i] = obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (this.A02 != null) {
            this.A00 += 32;
            Map A03 = A03();
            if (A03 != null) {
                this.A00 = Math.min(Math.max(size(), 3), (-1) >>> 2);
                A03.clear();
                this.A02 = null;
            } else {
                Object[] objArr = this.A04;
                objArr.getClass();
                Arrays.fill(objArr, 0, this.A01, (Object) null);
                Object[] objArr2 = this.A05;
                objArr2.getClass();
                Arrays.fill(objArr2, 0, this.A01, (Object) null);
                Object obj = this.A02;
                obj.getClass();
                if (obj instanceof byte[]) {
                    Arrays.fill((byte[]) obj, (byte) 0);
                } else if (obj instanceof short[]) {
                    Arrays.fill((short[]) obj, (short) 0);
                } else {
                    Arrays.fill((int[]) obj, 0);
                }
                int[] iArr = this.A03;
                iArr.getClass();
                Arrays.fill(iArr, 0, this.A01, 0);
            }
            this.A01 = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        boolean z;
        Map A03 = A03();
        if (A03 != null) {
            z = A03.containsKey(obj);
        } else {
            z = false;
            if (A00(this, obj) != -1) {
                return true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        boolean z;
        Map A03 = A03();
        if (A03 == null) {
            z = false;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.A01) {
                    break;
                }
                Object[] objArr = this.A05;
                objArr.getClass();
                if (Objects.equal(obj, objArr[i2])) {
                    return true;
                }
                i = i2 + 1;
            }
        } else {
            z = A03.containsValue(obj);
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        4eF r302 = this.A07;
        if (r302 == null) {
            r302 = new 4eF(this);
            this.A07 = r302;
        }
        return r302;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map A03 = A03();
        if (A03 != null) {
            return A03.get(obj);
        }
        int A00 = A00(this, obj);
        if (A00 == -1) {
            return null;
        }
        A0A(A00);
        Object[] objArr = this.A05;
        objArr.getClass();
        return objArr[A00];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        boolean z = false;
        if (size() == 0) {
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.A08;
        if (set == null) {
            set = new AbstractSet() { // from class: X.3k1
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
                    CompactHashMap.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    return CompactHashMap.this.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    CompactHashMap compactHashMap = CompactHashMap.this;
                    java.util.Map A03 = compactHashMap.A03();
                    return A03 != null ? 1BK.A1B(A03) : new 3CW(compactHashMap);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    CompactHashMap compactHashMap = CompactHashMap.this;
                    java.util.Map A03 = compactHashMap.A03();
                    return A03 != null ? A03.keySet().remove(obj) : 1BK.A1V(CompactHashMap.A01(compactHashMap, obj), CompactHashMap.A09);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return CompactHashMap.this.size();
                }
            };
            this.A08 = set;
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02ac A[EDGE_INSN: B:34:0x02ac->B:35:0x02ac BREAK  A[LOOP:0: B:26:0x0228->B:33:0x02a3], SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object put(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object A01;
        Map A03 = A03();
        if (A03 != null) {
            A01 = A03.remove(obj);
        } else {
            A01 = A01(this, obj);
            if (A01 == A09) {
                return null;
            }
        }
        return A01;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map A03 = A03();
        return A03 != null ? A03.size() : this.A01;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        6mW r302 = this.A06;
        if (r302 == null) {
            r302 = new 6mW(this);
            this.A06 = r302;
        }
        return r302;
    }
}
