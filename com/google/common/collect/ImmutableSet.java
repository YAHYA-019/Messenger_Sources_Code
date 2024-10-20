package com.google.common.collect;

import X.0Pz;
import X.1FW;
import X.1I0;
import X.AnonymousClass001;
import X.C1n3;
import X.JQw;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: ImmutableSet.class */
public abstract class ImmutableSet extends ImmutableCollection implements Set {
    public static final long serialVersionUID = 912559;
    public transient ImmutableList A00;

    /* loaded from: ImmutableSet$SerializedForm.class */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.A08(this.elements);
        }
    }

    public static int A00(int i) {
        int i2;
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            while (true) {
                i2 = highestOneBit << 1;
                if (i2 * 0.7d >= max) {
                    break;
                }
                highestOneBit = i2;
            }
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                z = false;
            }
            Preconditions.checkArgument(z, JQw.A00(259));
        }
        return i2;
    }

    public static ImmutableSet A01(Iterable iterable) {
        if (iterable instanceof Collection) {
            return A07((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return RegularImmutableSet.A05;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return new SingletonImmutableSet(next);
        }
        1I0 r0 = new 1I0(4);
        r0.A05(next);
        while (it.hasNext()) {
            r0.A05(it.next());
        }
        return r0.A07();
    }

    public static ImmutableSet A02(Object obj, Object obj2) {
        return A09(new Object[]{obj, obj2}, 2);
    }

    public static ImmutableSet A03(Object obj, Object obj2, Object obj3) {
        return A09(new Object[]{obj, obj2, obj3}, 3);
    }

    public static ImmutableSet A04(Object obj, Object obj2, Object obj3, Object obj4) {
        return A09(new Object[]{obj, obj2, obj3, obj4}, 4);
    }

    public static ImmutableSet A05(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return A09(new Object[]{obj, obj2, obj3, obj4, obj5}, 5);
    }

    public static ImmutableSet A06(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return A09(objArr2, i);
    }

    public static ImmutableSet A07(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.A0H()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return A09(array, array.length);
    }

    public static ImmutableSet A08(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? A09((Object[]) objArr.clone(), length) : new SingletonImmutableSet(objArr[0]) : RegularImmutableSet.A05;
    }

    public static ImmutableSet A09(Object[] objArr, int i) {
        Object obj;
        Object[] objArr2 = objArr;
        if (i == 0) {
            return RegularImmutableSet.A05;
        }
        if (i != 1) {
            int A00 = A00(i);
            Object[] objArr3 = new Object[A00];
            int i2 = A00 - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object obj2 = objArr2[i5];
                if (obj2 == null) {
                    throw AnonymousClass001.A0Q(0Pz.A0T("at index ", i5));
                }
                int hashCode = obj2.hashCode();
                int A01 = 1FW.A01(hashCode);
                while (true) {
                    int i6 = A01;
                    int i7 = i6 & i2;
                    Object obj3 = objArr3[i7];
                    if (obj3 == null) {
                        objArr2[i4] = obj2;
                        objArr3[i7] = obj2;
                        i3 += hashCode;
                        i4++;
                        break;
                    }
                    if (!obj3.equals(obj2)) {
                        A01 = i6 + 1;
                    }
                }
            }
            Arrays.fill(objArr2, i4, i, (Object) null);
            if (i4 != 1) {
                if (A00(i4) < A00 / 2) {
                    return A09(objArr2, i4);
                }
                int length = objArr2.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr2 = Arrays.copyOf(objArr2, i4);
                }
                return new RegularImmutableSet(objArr2, objArr3, i3, i2, i4);
            }
            obj = objArr2[0];
        } else {
            obj = objArr[0];
        }
        obj.getClass();
        return new SingletonImmutableSet(obj);
    }

    public static SingletonImmutableSet A0A(Object obj) {
        return new SingletonImmutableSet(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public ImmutableList A0J() {
        return ImmutableList.asImmutableList(toArray());
    }

    public boolean A0K() {
        return this instanceof RegularImmutableSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList asList() {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            immutableList = A0J();
            this.A00 = immutableList;
        }
        return immutableList;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && A0K() && ((ImmutableSet) obj).A0K() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C1n3.A08(obj, this);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C1n3.A00(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
