package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: X.1qN, reason: invalid class name */
/* loaded from: 1qN.class */
public final class C1qN implements java.util.Map, Serializable, Cloneable {
    public static final Object A07 = new 1qO();
    public static final long serialVersionUID = 5491530837953731070L;
    public transient int A00;
    public transient int A01;
    public transient int A02;
    public transient Object[] A03;
    public transient Collection A04;
    public transient Set A05;
    public transient Set A06;

    public C1qN() {
        this(4);
    }

    public C1qN(int i) {
        if (i < 0) {
            throw 0Pz.A06("Invalid capacity: ", " (must not be less than zero).", i);
        }
        int i2 = 268435456;
        if (i < 4) {
            i2 = 4;
        } else if (i <= 268435456) {
            int i3 = i - 1;
            int i4 = i3 | (i3 >>> 1);
            int i5 = i4 | (i4 >>> 2);
            int i6 = i5 | (i5 >>> 4);
            int i7 = i6 | (i6 >>> 8);
            i2 = (i7 | (i7 >>> 16)) + 1;
        }
        A03(i2);
    }

    public static int A00(C1qN c1qN, Object obj) {
        int i;
        if (c1qN.A01 != 0) {
            if (obj == null) {
                obj = A07;
            }
            int A01 = c1qN.A01(obj);
            while (true) {
                i = A01;
                Object obj2 = c1qN.A03[i << 1];
                if (obj2 == null) {
                    break;
                }
                if (obj2 == obj || obj2.equals(obj)) {
                    break;
                }
                A01 = (i + 1) & ((c1qN.A03.length >>> 1) - 1);
            }
            return i;
        }
        return -1;
    }

    private int A01(Object obj) {
        int hashCode = obj.hashCode();
        int i = hashCode + ((hashCode << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = i4 + (i4 << 2) + (i4 << 14);
        return (i5 ^ (i5 >>> 16)) & ((this.A03.length >>> 1) - 1);
    }

    private void A02(int i) {
        if (((i - 1) & i) != 0) {
            throw AnonymousClass001.A0L("New capacity must be a power of two.");
        }
        Object[] objArr = this.A03;
        int length = objArr.length >>> 1;
        if (i <= length) {
            throw AnonymousClass001.A0L("New capacity must be greater than current capacity.");
        }
        if (i > 268435456) {
            throw AnonymousClass001.A0L("New capacity is greater than maximum capacity.");
        }
        int i2 = this.A01;
        A03(i);
        if (i2 > 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < length && i3 < i2; i4++) {
                Object obj = objArr[i4 << 1];
                if (obj != null) {
                    put(obj, objArr[(i4 << 1) + 1]);
                    i3++;
                }
            }
        }
    }

    private void A03(int i) {
        if (((i - 1) & i) != 0) {
            throw AnonymousClass001.A0L("Capacity must be a power of two.");
        }
        this.A02 = (i >> 1) + (i >> 2);
        this.A01 = 0;
        this.A03 = new Object[i * 2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r0 > r302) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A04(X.C1qN r301, int r302) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1qN.A04(X.1qN, int):void");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        objectInputStream.readFloat();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw 0Pz.A04("Invalid capacity: ", readInt);
        }
        int i = 268435456;
        if (readInt < 4) {
            i = 4;
        } else if (readInt <= 268435456) {
            int i2 = readInt - 1;
            int i3 = i2 | (i2 >>> 1);
            int i4 = i3 | (i3 >>> 2);
            int i5 = i4 | (i4 >>> 4);
            int i6 = i5 | (i5 >>> 8);
            i = (i6 | (i6 >>> 16)) + 1;
        }
        A03(i);
        int readInt2 = objectInputStream.readInt();
        if (readInt2 < 0) {
            throw new InvalidObjectException(0Pz.A0T("Invalid size: ", readInt2));
        }
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 >= readInt2) {
                return;
            }
            put(objectInputStream.readObject(), objectInputStream.readObject());
            i7 = i8 + 1;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeFloat(0.75f);
        objectOutputStream.writeInt(this.A03.length >>> 1);
        objectOutputStream.writeInt(this.A01);
        int A05 = A05(-1);
        while (true) {
            int i = A05;
            if (i < 0) {
                return;
            }
            objectOutputStream.writeObject(A06(i));
            objectOutputStream.writeObject(A07(i));
            A05 = A05(i);
        }
    }

    public int A05(int i) {
        if (this.A01 <= 0) {
            return -1;
        }
        Object[] objArr = this.A03;
        int length = objArr.length >>> 1;
        do {
            i++;
            if (i >= length) {
                return -1;
            }
        } while (objArr[i << 1] == null);
        return i;
    }

    public Object A06(int i) {
        Object obj = this.A03[i << 1];
        if (obj == null) {
            throw new NoSuchElementException();
        }
        if (obj == A07) {
            obj = null;
        }
        return obj;
    }

    public Object A07(int i) {
        Object[] objArr = this.A03;
        int i2 = i << 1;
        if (objArr[i2] != null) {
            return objArr[i2 + 1];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Map
    public void clear() {
        this.A01 = 0;
        Arrays.fill(this.A03, (Object) null);
        this.A00++;
    }

    public Object clone() {
        C1qN c1qN;
        try {
            c1qN = (C1qN) super.clone();
            Object[] objArr = new Object[this.A03.length];
            c1qN.A03 = objArr;
            Object[] objArr2 = this.A03;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            return c1qN;
        } catch (CloneNotSupportedException unused) {
            throw AnonymousClass001.A0J(c1qN);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        boolean z = false;
        if (A00(this, obj) >= 0) {
            z = true;
        }
        return z;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        boolean z;
        if (obj != null) {
            int length = this.A03.length >>> 1;
            z = false;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Object obj2 = this.A03[(i2 << 1) + 1];
                if (obj2 != null && (obj2 == obj || obj2.equals(obj))) {
                    break;
                }
                i = i2 + 1;
            }
        } else {
            Object[] objArr = this.A03;
            int length2 = objArr.length >>> 1;
            z = false;
            for (int i3 = 0; i3 < length2; i3++) {
                if (objArr[(i3 << 1) + 1] == null && objArr[i3 << 1] != null) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    @Override // java.util.Map
    public Set entrySet() {
        47S r302 = this.A05;
        if (r302 == null) {
            r302 = new 47S(this);
            this.A05 = r302;
        }
        return r302;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof java.util.Map)) {
                return false;
            }
            java.util.Map map = (java.util.Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int A05 = A05(-1);
            while (true) {
                int i = A05;
                if (i < 0) {
                    break;
                }
                Object A06 = A06(i);
                Object A072 = A07(i);
                if (!map.containsKey(A06)) {
                    return false;
                }
                Object obj2 = map.get(A06);
                if (obj2 == null) {
                    if (A072 != null) {
                        return false;
                    }
                } else if (!obj2.equals(A072)) {
                    return false;
                }
                A05 = A05(i);
            }
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int A00 = A00(this, obj);
        if (A00 >= 0) {
            return this.A03[(A00 << 1) + 1];
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        int A05 = A05(-1);
        int i = 0;
        while (A05 >= 0) {
            i += AnonymousClass001.A02(A06(A05)) ^ AnonymousClass001.A02(A07(A05));
            A05 = A05(A05);
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A01);
    }

    @Override // java.util.Map
    public Set keySet() {
        Set set = this.A06;
        if (set == null) {
            set = new AbstractSet() { // from class: X.3k2
                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public void clear() {
                    C1qN.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(Object obj) {
                    return C1qN.this.containsKey(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean isEmpty() {
                    return C1qN.this.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator iterator() {
                    return new AnonymousClass351(C1qN.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    int size = size();
                    C1qN.this.remove(obj);
                    boolean z = false;
                    if (size() != size) {
                        z = true;
                    }
                    return z;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return C1qN.this.size();
                }
            };
            this.A06 = set;
        }
        return set;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        int i;
        if (obj == null) {
            obj = A07;
        }
        int A01 = A01(obj);
        while (true) {
            i = A01;
            Object[] objArr = this.A03;
            Object obj3 = objArr[i << 1];
            if (obj3 == null) {
                int i2 = this.A01;
                if (i2 == 268435456) {
                    throw AnonymousClass001.A0N("Maximum capacity reached, cannot add new item.");
                }
                if (i2 >= this.A02) {
                    A02((objArr.length >>> 1) * 2);
                    i = A01(obj);
                }
                while (true) {
                    Object[] objArr2 = this.A03;
                    int i3 = i << 1;
                    if (objArr2[i3] == null) {
                        objArr2[i3] = obj;
                        objArr2[i3 + 1] = obj2;
                        this.A01++;
                        this.A00++;
                        return null;
                    }
                    i = (i + 1) & ((objArr2.length >>> 1) - 1);
                }
            } else {
                if (obj3 == obj || obj3.equals(obj)) {
                    break;
                }
                A01 = (i + 1) & ((this.A03.length >>> 1) - 1);
            }
        }
        int i4 = (i << 1) + 1;
        Object[] objArr3 = this.A03;
        Object obj4 = objArr3[i4];
        objArr3[i4] = obj2;
        return obj4;
    }

    @Override // java.util.Map
    public void putAll(java.util.Map map) {
        if (map.size() != 0) {
            if (map.size() > size() && map.size() > (this.A03.length >>> 1)) {
                int size = map.size() - 1;
                int i = size | (size >>> 1);
                int i2 = i | (i >>> 2);
                int i3 = i2 | (i2 >>> 4);
                int i4 = i3 | (i3 >>> 8);
                A02((i4 | (i4 >>> 16)) + 1);
            }
            for (Map.Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        int A00 = A00(this, obj);
        if (A00 < 0) {
            return null;
        }
        Object A072 = A07(A00);
        A04(this, A00);
        return A072;
    }

    @Override // java.util.Map
    public int size() {
        return this.A01;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("{");
        boolean z = true;
        int A05 = A05(-1);
        while (true) {
            int i = A05;
            if (i < 0) {
                return 1BL.A0v(A0k);
            }
            if (!z) {
                AnonymousClass001.A1H(A0k);
            }
            Object A06 = A06(i);
            if (A06 == null) {
                A06 = "null";
            }
            A0k.append(A06);
            A0k.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
            A0k.append(A07(i));
            z = false;
            A05 = A05(i);
        }
    }

    @Override // java.util.Map
    public Collection values() {
        Collection collection = this.A04;
        if (collection == null) {
            collection = new AbstractCollection() { // from class: X.2gj
                @Override // java.util.AbstractCollection, java.util.Collection
                public void clear() {
                    C1qN.this.clear();
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean contains(Object obj) {
                    return C1qN.this.containsValue(obj);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public boolean isEmpty() {
                    return C1qN.this.isEmpty();
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
                public Iterator iterator() {
                    return new C2gk(C1qN.this);
                }

                @Override // java.util.AbstractCollection, java.util.Collection
                public int size() {
                    return C1qN.this.size();
                }
            };
            this.A04 = collection;
        }
        return collection;
    }
}
