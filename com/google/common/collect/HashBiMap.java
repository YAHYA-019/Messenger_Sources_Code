package com.google.common.collect;

import X.0Q8;
import X.1FW;
import X.1Fj;
import X.4YV;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C5f2;
import X.JQz;
import X.KA5;
import X.KA6;
import X.KA7;
import X.LyN;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: HashBiMap.class */
public final class HashBiMap extends AbstractMap implements C5f2, Serializable {
    public transient int A00;
    public transient int A01;
    public transient int A02;
    public transient C5f2 A03;
    public transient Set A04;
    public transient int[] A05;
    public transient int[] A06;
    public transient int[] A07;
    public transient int[] A08;
    public transient int[] A09;
    public transient int[] A0A;
    public transient Object[] A0B;
    public transient Object[] A0C;
    public transient int A0D;
    public transient Set A0E;
    public transient Set A0F;

    /* loaded from: HashBiMap$Inverse.class */
    public class Inverse extends AbstractMap implements C5f2, Serializable {
        public transient Set A00;
        public final HashBiMap forward;

        public Inverse(HashBiMap hashBiMap) {
            this.forward = hashBiMap;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.forward.A03 = this;
        }

        @Override // X.C5f2
        public C5f2 BPy() {
            throw 0Q8.createAndThrow();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.forward.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.forward.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(Object obj) {
            return this.forward.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            LyN lyN = this.A00;
            if (lyN == null) {
                lyN = new LyN(this.forward);
                this.A00 = lyN;
            }
            return lyN;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object get(Object obj) {
            HashBiMap hashBiMap = this.forward;
            int A0D = hashBiMap.A0D(obj, 1FW.A02(obj));
            if (A0D == -1) {
                return null;
            }
            return hashBiMap.A0B[A0D];
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            HashBiMap hashBiMap = this.forward;
            KA7 ka7 = hashBiMap.A04;
            if (ka7 == null) {
                ka7 = new KA7(hashBiMap);
                hashBiMap.A04 = ka7;
            }
            return ka7;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(Object obj, Object obj2) {
            return this.forward.A0E(obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object remove(Object obj) {
            HashBiMap hashBiMap = this.forward;
            int A02 = 1FW.A02(obj);
            int A0D = hashBiMap.A0D(obj, A02);
            if (A0D == -1) {
                return null;
            }
            Object obj2 = hashBiMap.A0B[A0D];
            hashBiMap.A0F(A0D, A02);
            return obj2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.forward.A02;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return this.forward.keySet();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, com.google.common.collect.HashBiMap] */
    public static HashBiMap A00() {
        ?? abstractMap = new AbstractMap();
        abstractMap.A02();
        return abstractMap;
    }

    public static Object A01(HashBiMap hashBiMap, Object obj, Object obj2, boolean z) {
        int A02 = 1FW.A02(obj);
        int A0C = hashBiMap.A0C(obj, A02);
        if (A0C != -1) {
            Object obj3 = hashBiMap.A0C[A0C];
            if (Objects.equal(obj3, obj2)) {
                return obj2;
            }
            A0B(hashBiMap, obj2, A0C, z);
            return obj3;
        }
        int A022 = 1FW.A02(obj2);
        int A0D = hashBiMap.A0D(obj2, A022);
        if (!z) {
            Preconditions.checkArgument(AnonymousClass001.A1Q(A0D, -1), "Value already present: %s", obj2);
        } else if (A0D != -1) {
            hashBiMap.A0F(A0D, A022);
        }
        hashBiMap.A03(hashBiMap.A02 + 1);
        Object[] objArr = hashBiMap.A0B;
        int i = hashBiMap.A02;
        objArr[i] = obj;
        hashBiMap.A0C[i] = obj2;
        hashBiMap.A06(i, A02);
        hashBiMap.A07(hashBiMap.A02, A022);
        int i2 = hashBiMap.A0D;
        int i3 = hashBiMap.A02;
        hashBiMap.A08(i2, i3);
        hashBiMap.A08(i3, -2);
        hashBiMap.A02 = i3 + 1;
        hashBiMap.A01++;
        return null;
    }

    private void A02() {
        int A00 = 1FW.A00(16);
        this.A02 = 0;
        this.A0B = new Object[16];
        this.A0C = new Object[16];
        int[] iArr = new int[A00];
        Arrays.fill(iArr, -1);
        this.A05 = iArr;
        int[] iArr2 = new int[A00];
        Arrays.fill(iArr2, -1);
        this.A06 = iArr2;
        int[] iArr3 = new int[16];
        Arrays.fill(iArr3, -1);
        this.A07 = iArr3;
        int[] iArr4 = new int[16];
        Arrays.fill(iArr4, -1);
        this.A08 = iArr4;
        this.A00 = -2;
        this.A0D = -2;
        int[] iArr5 = new int[16];
        Arrays.fill(iArr5, -1);
        this.A0A = iArr5;
        int[] iArr6 = new int[16];
        Arrays.fill(iArr6, -1);
        this.A09 = iArr6;
    }

    private void A03(int i) {
        int length = this.A07.length;
        if (length < i) {
            int A00 = 1Fj.A00(length, i);
            this.A0B = Arrays.copyOf(this.A0B, A00);
            this.A0C = Arrays.copyOf(this.A0C, A00);
            int[] iArr = this.A07;
            int length2 = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, A00);
            Arrays.fill(copyOf, length2, A00, -1);
            this.A07 = copyOf;
            int[] iArr2 = this.A08;
            int length3 = iArr2.length;
            int[] copyOf2 = Arrays.copyOf(iArr2, A00);
            Arrays.fill(copyOf2, length3, A00, -1);
            this.A08 = copyOf2;
            int[] iArr3 = this.A0A;
            int length4 = iArr3.length;
            int[] copyOf3 = Arrays.copyOf(iArr3, A00);
            Arrays.fill(copyOf3, length4, A00, -1);
            this.A0A = copyOf3;
            int[] iArr4 = this.A09;
            int length5 = iArr4.length;
            int[] copyOf4 = Arrays.copyOf(iArr4, A00);
            Arrays.fill(copyOf4, length5, A00, -1);
            this.A09 = copyOf4;
        }
        if (this.A05.length >= i) {
            return;
        }
        int A002 = 1FW.A00(i);
        int[] iArr5 = new int[A002];
        Arrays.fill(iArr5, -1);
        this.A05 = iArr5;
        int[] iArr6 = new int[A002];
        Arrays.fill(iArr6, -1);
        this.A06 = iArr6;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.A02) {
                return;
            }
            int A02 = 1FW.A02(this.A0B[i3]);
            int[] iArr7 = this.A05;
            int length6 = A02 & (iArr7.length - 1);
            this.A07[i3] = iArr7[length6];
            iArr7[length6] = i3;
            int A022 = 1FW.A02(this.A0C[i3]) & (this.A05.length - 1);
            int[] iArr8 = this.A08;
            int[] iArr9 = this.A06;
            iArr8[i3] = iArr9[A022];
            iArr9[A022] = i3;
            i2 = i3 + 1;
        }
    }

    private void A04(int i, int i2) {
        Preconditions.checkArgument(4YV.A1W(i, -1));
        int[] iArr = this.A05;
        int length = i2 & (iArr.length - 1);
        int i3 = iArr[length];
        if (i3 == i) {
            int[] iArr2 = this.A07;
            iArr[length] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int[] iArr3 = this.A07;
        int i4 = iArr3[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i5 == -1) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Expected to find entry with key ");
                throw AnonymousClass001.A0J(AnonymousClass001.A0a(this.A0B[i], A0k));
            }
            if (i5 == i) {
                JQz.A1U(iArr3, i, i6, -1);
                return;
            }
            i4 = iArr3[i5];
        }
    }

    private void A05(int i, int i2) {
        Preconditions.checkArgument(4YV.A1W(i, -1));
        int length = i2 & (this.A05.length - 1);
        int[] iArr = this.A06;
        int i3 = iArr[length];
        if (i3 == i) {
            int[] iArr2 = this.A08;
            iArr[length] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int[] iArr3 = this.A08;
        int i4 = iArr3[i3];
        while (true) {
            int i5 = i4;
            int i6 = i3;
            i3 = i5;
            if (i5 == -1) {
                StringBuilder A0k = AnonymousClass001.A0k();
                A0k.append("Expected to find entry with value ");
                throw AnonymousClass001.A0J(AnonymousClass001.A0a(this.A0C[i], A0k));
            }
            if (i5 == i) {
                JQz.A1U(iArr3, i, i6, -1);
                return;
            }
            i4 = iArr3[i5];
        }
    }

    private void A06(int i, int i2) {
        Preconditions.checkArgument(4YV.A1W(i, -1));
        int[] iArr = this.A05;
        int length = i2 & (iArr.length - 1);
        this.A07[i] = iArr[length];
        iArr[length] = i;
    }

    private void A07(int i, int i2) {
        Preconditions.checkArgument(4YV.A1W(i, -1));
        int length = i2 & (this.A05.length - 1);
        int[] iArr = this.A08;
        int[] iArr2 = this.A06;
        iArr[i] = iArr2[length];
        iArr2[length] = i;
    }

    private void A08(int i, int i2) {
        if (i == -2) {
            this.A00 = i2;
        } else {
            this.A09[i] = i2;
        }
        if (i2 == -2) {
            this.A0D = i;
        } else {
            this.A0A[i2] = i;
        }
    }

    public static void A09(HashBiMap hashBiMap, int i, int i2, int i3) {
        int i4;
        int i5;
        Preconditions.checkArgument(4YV.A1W(i, -1));
        hashBiMap.A04(i, i2);
        hashBiMap.A05(i, i3);
        int[] iArr = hashBiMap.A0A;
        int i6 = iArr[i];
        int[] iArr2 = hashBiMap.A09;
        hashBiMap.A08(i6, iArr2[i]);
        int i7 = hashBiMap.A02 - 1;
        if (i7 != i) {
            int i8 = iArr[i7];
            int i9 = iArr2[i7];
            hashBiMap.A08(i8, i);
            hashBiMap.A08(i, i9);
            Object[] objArr = hashBiMap.A0B;
            Object obj = objArr[i7];
            Object[] objArr2 = hashBiMap.A0C;
            Object obj2 = objArr2[i7];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int A02 = 1FW.A02(obj);
            int[] iArr3 = hashBiMap.A05;
            int length = A02 & (iArr3.length - 1);
            int i10 = iArr3[length];
            if (i10 == i7) {
                iArr3[length] = i;
            } else {
                int[] iArr4 = hashBiMap.A07;
                int i11 = iArr4[i10];
                while (true) {
                    int i12 = i11;
                    i4 = i10;
                    i10 = i12;
                    if (i12 == i7) {
                        break;
                    } else {
                        i11 = iArr4[i12];
                    }
                }
                iArr4[i4] = i;
            }
            JQz.A1U(hashBiMap.A07, i7, i, -1);
            int A022 = 1FW.A02(obj2) & (hashBiMap.A05.length - 1);
            int[] iArr5 = hashBiMap.A06;
            int i13 = iArr5[A022];
            if (i13 == i7) {
                iArr5[A022] = i;
            } else {
                int[] iArr6 = hashBiMap.A08;
                int i14 = iArr6[i13];
                while (true) {
                    int i15 = i14;
                    i5 = i13;
                    i13 = i15;
                    if (i15 == i7) {
                        break;
                    } else {
                        i14 = iArr6[i15];
                    }
                }
                iArr6[i5] = i;
            }
            JQz.A1U(hashBiMap.A08, i7, i, -1);
        }
        Object[] objArr3 = hashBiMap.A0B;
        int i16 = hashBiMap.A02;
        int i17 = i16 - 1;
        objArr3[i17] = null;
        hashBiMap.A0C[i17] = null;
        hashBiMap.A02 = i16 - 1;
        hashBiMap.A01++;
    }

    public static void A0A(HashBiMap hashBiMap, Object obj, int i) {
        Preconditions.checkArgument(4YV.A1W(i, -1));
        int A0C = hashBiMap.A0C(obj, 1FW.A02(obj));
        int i2 = hashBiMap.A0D;
        if (A0C != -1) {
            throw AnonymousClass002.A0C(obj, "Key already present in map: ", AnonymousClass001.A0k());
        }
        if (i2 == i) {
            i2 = hashBiMap.A0A[i];
        } else if (i2 == hashBiMap.A02) {
            i2 = -1;
        }
        if (-2 == i) {
            A0C = hashBiMap.A09[i];
        } else if (-2 != hashBiMap.A02) {
            A0C = -2;
        }
        hashBiMap.A08(hashBiMap.A0A[i], hashBiMap.A09[i]);
        hashBiMap.A04(i, 1FW.A02(hashBiMap.A0B[i]));
        hashBiMap.A0B[i] = obj;
        hashBiMap.A06(i, 1FW.A02(obj));
        hashBiMap.A08(i2, i);
        hashBiMap.A08(i, A0C);
    }

    public static void A0B(HashBiMap hashBiMap, Object obj, int i, boolean z) {
        Preconditions.checkArgument(4YV.A1W(i, -1));
        int A02 = 1FW.A02(obj);
        int A0D = hashBiMap.A0D(obj, A02);
        if (A0D != -1) {
            if (!z) {
                throw AnonymousClass002.A0C(obj, "Value already present in map: ", AnonymousClass001.A0k());
            }
            hashBiMap.A0F(A0D, A02);
            if (i == hashBiMap.A02) {
                i = A0D;
            }
        }
        hashBiMap.A05(i, 1FW.A02(hashBiMap.A0C[i]));
        hashBiMap.A0C[i] = obj;
        hashBiMap.A07(i, A02);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        A02();
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
        Iterator A0x = AnonymousClass001.A0x(this);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            objectOutputStream.writeObject(A0z.getKey());
            objectOutputStream.writeObject(A0z.getValue());
        }
    }

    public int A0C(Object obj, int i) {
        int i2;
        int[] iArr = this.A05;
        int[] iArr2 = this.A07;
        Object[] objArr = this.A0B;
        int i3 = iArr[i & (iArr.length - 1)];
        while (true) {
            i2 = i3;
            if (i2 == -1) {
                i2 = -1;
                break;
            }
            if (Objects.equal(objArr[i2], obj)) {
                break;
            }
            i3 = iArr2[i2];
        }
        return i2;
    }

    public int A0D(Object obj, int i) {
        int i2;
        int[] iArr = this.A06;
        int[] iArr2 = this.A08;
        Object[] objArr = this.A0C;
        int i3 = iArr[i & (this.A05.length - 1)];
        while (true) {
            i2 = i3;
            if (i2 == -1) {
                i2 = -1;
                break;
            }
            if (Objects.equal(objArr[i2], obj)) {
                break;
            }
            i3 = iArr2[i2];
        }
        return i2;
    }

    public Object A0E(Object obj, Object obj2) {
        int A02 = 1FW.A02(obj);
        int A0D = A0D(obj, A02);
        if (A0D != -1) {
            Object obj3 = this.A0B[A0D];
            if (Objects.equal(obj3, obj2)) {
                return obj2;
            }
            A0A(this, obj2, A0D);
            return obj3;
        }
        int i = this.A0D;
        int A022 = 1FW.A02(obj2);
        Preconditions.checkArgument(AnonymousClass001.A1Q(A0C(obj2, A022), -1), "Key already present: %s", obj2);
        A03(this.A02 + 1);
        Object[] objArr = this.A0B;
        int i2 = this.A02;
        objArr[i2] = obj2;
        this.A0C[i2] = obj;
        A06(i2, A022);
        A07(this.A02, A02);
        int i3 = i == -2 ? this.A00 : this.A09[i];
        int i4 = this.A02;
        A08(i, i4);
        A08(i4, i3);
        this.A02 = i4 + 1;
        this.A01++;
        return null;
    }

    public void A0F(int i, int i2) {
        A09(this, i, 1FW.A02(this.A0B[i]), i2);
    }

    @Override // X.C5f2
    public C5f2 BPy() {
        C5f2 c5f2 = this.A03;
        if (c5f2 == null) {
            c5f2 = new Inverse(this);
            this.A03 = c5f2;
        }
        return c5f2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.A0B, 0, this.A02, (Object) null);
        Arrays.fill(this.A0C, 0, this.A02, (Object) null);
        Arrays.fill(this.A05, -1);
        Arrays.fill(this.A06, -1);
        Arrays.fill(this.A07, 0, this.A02, -1);
        Arrays.fill(this.A08, 0, this.A02, -1);
        Arrays.fill(this.A0A, 0, this.A02, -1);
        Arrays.fill(this.A09, 0, this.A02, -1);
        this.A02 = 0;
        this.A00 = -2;
        this.A0D = -2;
        this.A01++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return 4YV.A1W(A0C(obj, 1FW.A02(obj)), -1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        return 4YV.A1W(A0D(obj, 1FW.A02(obj)), -1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        KA5 ka5 = this.A0E;
        if (ka5 == null) {
            ka5 = new KA5(this);
            this.A0E = ka5;
        }
        return ka5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int A0C = A0C(obj, 1FW.A02(obj));
        if (A0C == -1) {
            return null;
        }
        return this.A0C[A0C];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        KA6 ka6 = this.A0F;
        if (ka6 == null) {
            ka6 = new KA6(this);
            this.A0F = ka6;
        }
        return ka6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        return A01(this, obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        int A02 = 1FW.A02(obj);
        int A0C = A0C(obj, A02);
        if (A0C == -1) {
            return null;
        }
        Object obj2 = this.A0C[A0C];
        A09(this, A0C, A02, 1FW.A02(obj2));
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.A02;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        KA7 ka7 = this.A04;
        if (ka7 == null) {
            ka7 = new KA7(this);
            this.A04 = ka7;
        }
        return ka7;
    }
}
