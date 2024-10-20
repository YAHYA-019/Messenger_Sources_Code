package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.04w, reason: invalid class name */
/* loaded from: 04w.class */
public final class C04w extends AbstractSet implements Set, Serializable, Cloneable {
    public static final Object A03 = new Object() { // from class: X.04x
        public boolean equals(Object obj) {
            return AnonymousClass001.A1W(obj, this);
        }

        public int hashCode() {
            return 0;
        }
    };
    public static final Object[] A04 = new Object[0];
    public static final long serialVersionUID = 0;
    public transient Object[] A02;
    public int mSize = 0;
    public transient int A00 = 0;
    public transient int A01 = 0;

    public C04w() {
        float f = 0.0f / 0.75f;
        int i = (int) f;
        if (i < 0) {
            throw AnonymousClass001.A0T(StringFormatUtil.formatStrLocaleSafe("adjustedCapacity = %d, capacity = %d, LOAD_FACTOR = %s, (capacity / LOAD_FACTOR) = %s", Integer.valueOf(i), 0, Float.toString(0.75f), Float.toString(f)));
        }
        this.A02 = i == 0 ? A04 : new Object[i];
    }

    public static int A00(Object obj, int i) {
        int hashCode = obj.hashCode();
        int i2 = hashCode + ((hashCode << 15) ^ (-12931));
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return ((i6 ^ (i6 >>> 16)) & ((-1) >>> 1)) % i;
    }

    public static int A01(Object[] objArr, Object obj) {
        int length = objArr.length;
        int A00 = A00(obj, length);
        int i = A00;
        do {
            Object obj2 = objArr[i];
            if (obj2 == null || obj2 == obj || obj2.equals(obj)) {
                break;
            }
            i++;
            if (i == length) {
                i = 0;
            }
        } while (i != A00);
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        objectInputStream.readFloat();
        this.A02 = new Object[readInt];
        this.mSize = 0;
        int readInt2 = objectInputStream.readInt();
        for (int i = 0; i < readInt2; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.A02.length);
        objectOutputStream.writeFloat(0.75f);
        objectOutputStream.writeInt(size());
        int A02 = A02(-1);
        while (true) {
            int i = A02;
            if (i < 0) {
                return;
            }
            Object obj = this.A02[i];
            if (obj == A03) {
                obj = null;
            }
            objectOutputStream.writeObject(obj);
            A02 = A02(i);
        }
    }

    public int A02(int i) {
        Object[] objArr;
        do {
            i++;
            objArr = this.A02;
            if (i >= objArr.length) {
                return (-1) << (-1);
            }
        } while (objArr[i] == null);
        return i;
    }

    public Object A03(int i) {
        Object obj = this.A02[i];
        if (obj == null) {
            throw AnonymousClass001.A10();
        }
        if (obj == A03) {
            obj = null;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.mSize >= this.A01) {
            this.A00++;
            Object[] objArr = this.A02;
            int length = objArr.length;
            int i = 2;
            int i2 = length * 2;
            if (i2 != 0) {
                i = i2;
            }
            Object[] objArr2 = new Object[i];
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= length) {
                    break;
                }
                Object obj2 = objArr[i4];
                if (obj2 != null) {
                    objArr2[A01(objArr2, obj2)] = obj2;
                }
                i3 = i4 + 1;
            }
            this.A02 = objArr2;
            this.A01 = (int) (i * 0.75f);
        }
        if (obj == null) {
            obj = A03;
        }
        int length2 = this.A02.length;
        int A00 = A00(obj, length2);
        while (true) {
            Object[] objArr3 = this.A02;
            Object obj3 = objArr3[A00];
            if (obj3 == null) {
                this.mSize++;
                this.A00++;
                objArr3[A00] = obj;
                return true;
            }
            if (obj3 == obj || obj3.equals(obj)) {
                return false;
            }
            A00++;
            if (A00 == length2) {
                A00 = 0;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.mSize = 0;
        Arrays.fill(this.A02, (Object) null);
        this.A00++;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: PHI empty after try-catch fix!
        	at jadx.core.dex.visitors.ssa.SSATransform.fixPhiInTryCatch(SSATransform.java:228)
        	at jadx.core.dex.visitors.ssa.SSATransform.fixLastAssignInTry(SSATransform.java:208)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:64)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:44)
        */
    public java.lang.Object clone() {
        /*
            r301 = this;
            r0 = r301
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L3a
            r302 = r0
            r0 = r302
            X.04w r0 = (X.C04w) r0     // Catch: java.lang.CloneNotSupportedException -> L3a
            r302 = r0
            r0 = r301
            java.lang.Object[] r0 = r0.A02     // Catch: java.lang.CloneNotSupportedException -> L3a
            r303 = r0
            r0 = r303
            int r0 = r0.length     // Catch: java.lang.CloneNotSupportedException -> L3a
            r304 = r0
            r0 = r304
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.CloneNotSupportedException -> L3a
            r305 = r0
            r0 = r302
            r1 = r305
            r0.A02 = r1     // Catch: java.lang.CloneNotSupportedException -> L3a
            r0 = r301
            java.lang.Object[] r0 = r0.A02     // Catch: java.lang.CloneNotSupportedException -> L3a
            r306 = r0
            r0 = r306
            int r0 = r0.length     // Catch: java.lang.CloneNotSupportedException -> L3a
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r306
            r1 = 0
            r2 = r305
            r3 = 0
            r4 = r307
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)     // Catch: java.lang.CloneNotSupportedException -> L3a
            r0 = r302
            return r0
        L3a:
            java.lang.AssertionError r0 = X.AnonymousClass001.A0J(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04w.clone():java.lang.Object");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.A02;
        boolean z = false;
        if (objArr.length != 0) {
            if (obj == null) {
                obj = A03;
            }
            if (objArr[A01(objArr, obj)] != null) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            Object[] objArr = this.A02;
            int length = objArr.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= length) {
                    break;
                }
                Object obj2 = objArr[i2];
                if (obj2 != null && !set.contains(obj2)) {
                    return false;
                }
                i = i2 + 1;
            }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        int A02 = A02(-1);
        int i = 0;
        while (A02 >= 0) {
            i += this.A02[A02].hashCode();
            A02 = A02(A02);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        boolean z = false;
        if (this.mSize == 0) {
            z = true;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new Iterator(this) { // from class: X.0Al
            public int A00;
            public int A01;
            public int A02;
            public boolean A03;
            public final C04w A04;
            public final Object[] A05;

            {
                this.A04 = this;
                this.A05 = this.A02;
                this.A01 = this.A00;
                int A02 = this.A02(-1);
                this.A00 = A02;
                this.A02 = A02;
                this.A03 = false;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                boolean z = false;
                if (this.A00 >= 0) {
                    z = true;
                }
                return z;
            }

            @Override // java.util.Iterator
            public final Object next() {
                if (this.A01 != this.A04.A00) {
                    throw new ConcurrentModificationException();
                }
                int i = this.A00;
                if (i < 0) {
                    throw AnonymousClass001.A10();
                }
                Object[] objArr = this.A05;
                Object obj = objArr[i];
                if (obj == C04w.A03) {
                    obj = null;
                }
                this.A02 = i;
                this.A03 = true;
                while (true) {
                    i++;
                    if (i >= objArr.length) {
                        i = -1;
                        break;
                    }
                    if (objArr[i] != null) {
                        break;
                    }
                }
                this.A00 = i;
                return obj;
            }

            @Override // java.util.Iterator
            public final void remove() {
                int i;
                int i2 = this.A01;
                C04w c04w = this.A04;
                if (i2 != c04w.A00) {
                    throw new ConcurrentModificationException();
                }
                if (!this.A03) {
                    throw new IllegalStateException();
                }
                this.A03 = false;
                Object[] objArr = this.A05;
                c04w.remove(objArr[this.A02]);
                this.A01++;
                int i3 = this.A02;
                while (true) {
                    i = i3;
                    if (i >= objArr.length) {
                        i = -1;
                        break;
                    } else if (objArr[i] != null) {
                        break;
                    } else {
                        i3 = i + 1;
                    }
                }
                this.A00 = i;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2;
        Object[] objArr = this.A02;
        if (objArr.length == 0) {
            return false;
        }
        if (obj == null) {
            obj = A03;
        }
        int A01 = A01(objArr, obj);
        Object[] objArr2 = this.A02;
        if (objArr2[A01] == null) {
            return false;
        }
        int length = objArr2.length;
        while (true) {
            int i = A01;
            while (true) {
                A01++;
                if (A01 >= length) {
                    A01 = 0;
                }
                Object[] objArr3 = this.A02;
                obj2 = objArr3[A01];
                if (obj2 == null) {
                    this.A00++;
                    this.mSize--;
                    objArr3[i] = null;
                    return true;
                }
                int A00 = A00(obj2, length);
                boolean z = false;
                if (A00 > i) {
                    z = true;
                }
                if (A01 >= i) {
                    if (!z) {
                        break;
                    }
                } else if (z) {
                    continue;
                }
                if (A00 <= A01) {
                }
            }
            this.A02[i] = obj2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.mSize;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        Object[] objArr;
        int size = size();
        if (size == 0) {
            objArr = A04;
        } else {
            objArr = new Object[size];
            int i = 0;
            int A02 = A02(-1);
            while (A02 >= 0) {
                int i2 = i + 1;
                Object obj = this.A02[A02];
                if (obj == A03) {
                    obj = null;
                }
                objArr[i] = obj;
                A02 = A02(A02);
                i = i2;
            }
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int i = 0;
        int A02 = A02(-1);
        while (A02 >= 0) {
            int i2 = i + 1;
            Object obj = this.A02[A02];
            if (obj == A03) {
                obj = null;
            }
            objArr[i] = obj;
            A02 = A02(A02);
            i = i2;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append('{');
        boolean z = true;
        int A02 = A02(-1);
        while (true) {
            int i = A02;
            if (i < 0) {
                return AnonymousClass001.A0f(A0k);
            }
            Object obj = this.A02[i];
            if (!z) {
                AnonymousClass001.A1H(A0k);
            }
            if (obj == A03) {
                obj = "null";
            }
            A0k.append(obj);
            z = false;
            A02 = A02(i);
        }
    }
}
