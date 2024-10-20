package com.google.common.collect;

import X.1Du;
import X.1FW;
import X.7Kb;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: RegularImmutableMap.class */
public final class RegularImmutableMap extends ImmutableMap {
    public static final ImmutableMap A03 = new RegularImmutableMap(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;
    public final transient Object A02;

    /* loaded from: RegularImmutableMap$EntrySet.class */
    public class EntrySet extends ImmutableSet {
        public final transient int A00;
        public final transient int A01;
        public final transient Object[] A02;
        public final transient ImmutableMap A03;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i, int i2) {
            this.A03 = immutableMap;
            this.A02 = objArr;
            this.A00 = i;
            this.A01 = i2;
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList A0J() {
            return new ImmutableList() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.List
                /* renamed from: A00, reason: merged with bridge method [inline-methods] */
                public AbstractMap.SimpleImmutableEntry get(int i) {
                    Preconditions.checkElementIndex(i, EntrySet.this.A01);
                    EntrySet entrySet = EntrySet.this;
                    Object[] objArr = entrySet.A02;
                    int i2 = i * 2;
                    Object obj = objArr[entrySet.A00 + i2];
                    obj.getClass();
                    EntrySet entrySet2 = EntrySet.this;
                    Object obj2 = entrySet2.A02[i2 + (entrySet2.A00 ^ 1)];
                    obj2.getClass();
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean A0H() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.A01;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean z = false;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.A03.get(key))) {
                    z = true;
                }
            }
            return z;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public 1Du iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.A01;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: RegularImmutableMap$KeySet.class */
    public final class KeySet extends ImmutableSet {
        public final transient ImmutableList A00;
        public final transient ImmutableMap A01;

        public KeySet(ImmutableList immutableList, ImmutableMap immutableMap) {
            this.A01 = immutableMap;
            this.A00 = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList asList() {
            return this.A00;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean z = false;
            if (this.A01.get(obj) != null) {
                z = true;
            }
            return z;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i) {
            return this.A00.copyIntoArray(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public 1Du iterator() {
            return this.A00.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return this.A00.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.A01.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: RegularImmutableMap$KeysOrValuesAsList.class */
    public final class KeysOrValuesAsList extends ImmutableList {
        public final transient int A00;
        public final transient int A01;
        public final transient Object[] A02;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.A02 = objArr;
            this.A00 = i;
            this.A01 = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.A01);
            Object obj = this.A02[(i * 2) + this.A00];
            obj.getClass();
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.A01;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.A02 = obj;
        this.A00 = objArr;
        this.A01 = i;
    }

    public static RegularImmutableMap A00(ImmutableMap.Builder builder, Object[] objArr, int i) {
        if (i == 0) {
            return (RegularImmutableMap) A03;
        }
        if (i == 1) {
            objArr[0].getClass();
            objArr[1].getClass();
            return new RegularImmutableMap(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i, objArr.length >> 1);
        Object A02 = A02(objArr, i, ImmutableSet.A00(i), 0);
        if (A02 instanceof Object[]) {
            Object[] objArr2 = A02;
            7Kb r0 = (7Kb) objArr2[2];
            if (builder == null) {
                throw r0.A00();
            }
            builder.duplicateKey = r0;
            Object obj = objArr2[0];
            i = ((Number) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, i * 2);
            A02 = obj;
        }
        return new RegularImmutableMap(A02, objArr, i);
    }

    public static Object A01(Object obj, Object obj2, Object[] objArr, int i, int i2) {
        int i3;
        Object obj3 = null;
        if (obj2 != null) {
            if (i == 1) {
                Object obj4 = objArr[i2];
                obj4.getClass();
                if (obj4.equals(obj2)) {
                    obj3 = objArr[i2 ^ 1];
                    obj3.getClass();
                }
            } else if (obj != null) {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length - 1;
                    int A01 = 1FW.A01(obj2.hashCode());
                    while (true) {
                        int i4 = A01 & length;
                        i3 = bArr[i4] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        A01 = i4 + 1;
                    }
                    return objArr[i3 ^ 1];
                }
                if (!(obj instanceof short[])) {
                    int[] iArr = (int[]) obj;
                    int length2 = iArr.length - 1;
                    int A012 = 1FW.A01(obj2.hashCode());
                    while (true) {
                        int i5 = A012 & length2;
                        i3 = iArr[i5];
                        if (i3 == -1) {
                            break;
                        }
                        if (obj2.equals(objArr[i3])) {
                            break;
                        }
                        A012 = i5 + 1;
                    }
                    return objArr[i3 ^ 1];
                }
                short[] sArr = (short[]) obj;
                int length3 = sArr.length - 1;
                int A013 = 1FW.A01(obj2.hashCode());
                while (true) {
                    int i6 = A013 & length3;
                    short s = sArr[i6];
                    char c = (char) (-1);
                    i3 = s & c;
                    if (i3 == c) {
                        break;
                    }
                    if (obj2.equals(objArr[i3])) {
                        break;
                    }
                    A013 = i6 + 1;
                }
                return objArr[i3 ^ 1];
            }
        }
        return obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object A02(Object[] objArr, int i, int i2, int i3) {
        7Kb r305 = null;
        if (i == 1) {
            objArr[i3].getClass();
            objArr[i3 ^ 1].getClass();
            return null;
        }
        int i4 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = (i6 * 2) + i3;
                int i8 = (i5 * 2) + i3;
                Object obj = objArr[i7];
                obj.getClass();
                Object obj2 = objArr[i7 ^ 1];
                obj2.getClass();
                int A01 = 1FW.A01(obj.hashCode());
                while (true) {
                    int i9 = A01 & i4;
                    int i10 = bArr[i9] & 255;
                    if (i10 == 255) {
                        bArr[i9] = (byte) i8;
                        if (i5 < i6) {
                            objArr[i8] = obj;
                            objArr[i8 ^ 1] = obj2;
                        }
                        i5++;
                    } else {
                        if (obj.equals(objArr[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj3 = objArr[i11];
                            obj3.getClass();
                            r305 = new 7Kb(obj, obj2, obj3);
                            objArr[i11] = obj2;
                            break;
                        }
                        A01 = i9 + 1;
                    }
                }
            }
            if (i5 != i) {
                bArr = new Object[]{bArr, Integer.valueOf(i5), r305};
            }
            return bArr;
        }
        if (i2 > 32768) {
            int[] iArr = new int[i2];
            Arrays.fill(iArr, -1);
            int i12 = 0;
            for (int i13 = 0; i13 < i; i13++) {
                int i14 = (i13 * 2) + i3;
                int i15 = (i12 * 2) + i3;
                Object obj4 = objArr[i14];
                obj4.getClass();
                Object obj5 = objArr[i14 ^ 1];
                obj5.getClass();
                int A012 = 1FW.A01(obj4.hashCode());
                while (true) {
                    int i16 = A012 & i4;
                    int i17 = iArr[i16];
                    if (i17 == -1) {
                        iArr[i16] = i15;
                        if (i12 < i13) {
                            objArr[i15] = obj4;
                            objArr[i15 ^ 1] = obj5;
                        }
                        i12++;
                    } else {
                        if (obj4.equals(objArr[i17])) {
                            int i18 = i17 ^ 1;
                            Object obj6 = objArr[i18];
                            obj6.getClass();
                            r305 = new 7Kb(obj4, obj5, obj6);
                            objArr[i18] = obj5;
                            break;
                        }
                        A012 = i16 + 1;
                    }
                }
            }
            if (i12 != i) {
                iArr = new Object[]{iArr, Integer.valueOf(i12), r305};
            }
            return iArr;
        }
        short[] sArr = new short[i2];
        Arrays.fill(sArr, (short) -1);
        int i19 = 0;
        for (int i20 = 0; i20 < i; i20++) {
            int i21 = (i20 * 2) + i3;
            int i22 = (i19 * 2) + i3;
            Object obj7 = objArr[i21];
            obj7.getClass();
            Object obj8 = objArr[i21 ^ 1];
            obj8.getClass();
            int A013 = 1FW.A01(obj7.hashCode());
            while (true) {
                int i23 = A013 & i4;
                short s = sArr[i23];
                char c = (char) (-1);
                int i24 = s & c;
                if (i24 == c) {
                    sArr[i23] = (short) i22;
                    if (i19 < i20) {
                        objArr[i22] = obj7;
                        objArr[i22 ^ 1] = obj8;
                    }
                    i19++;
                } else {
                    if (obj7.equals(objArr[i24])) {
                        int i25 = i24 ^ 1;
                        Object obj9 = objArr[i25];
                        obj9.getClass();
                        r305 = new 7Kb(obj7, obj8, obj9);
                        objArr[i25] = obj8;
                        break;
                    }
                    A013 = i23 + 1;
                }
            }
        }
        if (i19 != i) {
            sArr = new Object[]{sArr, Integer.valueOf(i19), r305};
        }
        return sArr;
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet createEntrySet() {
        return new EntrySet(this, this.A00, 0, this.A01);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet createKeySet() {
        return new KeySet(new KeysOrValuesAsList(this.A00, 0, this.A01), this);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection createValues() {
        return new KeysOrValuesAsList(this.A00, 1, this.A01);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Object get(Object obj) {
        Object A01 = A01(this.A02, obj, this.A00, this.A01, 0);
        if (A01 == null) {
            A01 = null;
        }
        return A01;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.A01;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new ImmutableMap.SerializedForm(this);
    }
}
