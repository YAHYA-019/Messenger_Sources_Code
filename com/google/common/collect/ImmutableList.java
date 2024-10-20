package com.google.common.collect;

import X.1Dr;
import X.1Dt;
import X.1Du;
import X.1Dz;
import X.1Fg;
import X.1Fj;
import X.1I0;
import X.AnonymousClass001;
import X.C1Jp;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: ImmutableList.class */
public abstract class ImmutableList extends ImmutableCollection implements List, RandomAccess {
    public static final 1Dt EMPTY_ITR = new 1Dr(RegularImmutableList.A02, 0);
    public static final long serialVersionUID = 3405691582L;

    /* loaded from: ImmutableList$Builder.class */
    public final class Builder extends 1I0 {
        public Builder() {
            this(4);
        }

        public Builder(int i) {
            super(i);
        }

        public /* bridge */ /* synthetic */ 1Fj add(Object obj) {
            m11011add(obj);
            return this;
        }

        public /* bridge */ /* synthetic */ 1Fj add(Object[] objArr) {
            m11012add(objArr);
            return this;
        }

        /* renamed from: add, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ 1I0 m11010add(Object obj) {
            m11011add(obj);
            return this;
        }

        /* renamed from: add, reason: collision with other method in class */
        public Builder m11011add(Object obj) {
            super.add(obj);
            return this;
        }

        /* renamed from: add, reason: collision with other method in class */
        public Builder m11012add(Object... objArr) {
            super.add(objArr);
            return this;
        }

        public Builder addAll(Iterable iterable) {
            super.A04(iterable);
            return this;
        }

        public Builder addAll(Iterator it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public ImmutableList build() {
            ((1I0) this).A01 = true;
            return ImmutableList.asImmutableList(((1I0) this).A02, ((1I0) this).A00);
        }
    }

    /* loaded from: ImmutableList$ReverseImmutableList.class */
    public class ReverseImmutableList extends ImmutableList {
        public final transient ImmutableList A00;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.A00 = immutableList;
        }

        private int A00(int i) {
            return (size() - 1) - i;
        }

        private int A01(int i) {
            return size() - i;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return this.A00.A0H();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.A00.contains(obj);
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, size());
            return this.A00.get(A00(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.A00.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return A00(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.A00.indexOf(obj);
            if (indexOf >= 0) {
                return A00(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList reverse() {
            return this.A00;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.A00.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return this.A00.subList(A01(i2), A01(i)).reverse();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* loaded from: ImmutableList$SerializedForm.class */
    public class SerializedForm implements Serializable {
        public static final long serialVersionUID = 0;
        public final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        public Object readResolve() {
            return ImmutableList.copyOf(this.elements);
        }
    }

    /* loaded from: ImmutableList$SubList.class */
    public class SubList extends ImmutableList {
        public final transient int A00;
        public final transient int A01;

        public SubList(int i, int i2) {
            this.A01 = i;
            this.A00 = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int A0F() {
            return ImmutableList.this.A0G() + this.A01 + this.A00;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int A0G() {
            return ImmutableList.this.A0G() + this.A01;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean A0H() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object[] A0I() {
            return ImmutableList.this.A0I();
        }

        @Override // java.util.List
        public Object get(int i) {
            Preconditions.checkElementIndex(i, this.A00);
            return ImmutableList.this.get(i + this.A01);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return super.listIterator(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.A00;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.A00);
            ImmutableList immutableList = ImmutableList.this;
            int i3 = this.A01;
            return immutableList.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static ImmutableList asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static ImmutableList asImmutableList(Object[] objArr, int i) {
        return i == 0 ? of() : new RegularImmutableList(objArr, i);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builderWithExpectedSize(int i) {
        1Fg.A00(i, "expectedSize");
        return new Builder(i);
    }

    public static ImmutableList construct(Object... objArr) {
        1Dz.A00(objArr, objArr.length);
        return asImmutableList(objArr);
    }

    public static ImmutableList copyOf(Iterable iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    public static ImmutableList copyOf(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return construct(collection.toArray());
        }
        ImmutableList asList = ((ImmutableCollection) collection).asList();
        if (asList.A0H()) {
            asList = asImmutableList(asList.toArray());
        }
        return asList;
    }

    public static ImmutableList copyOf(Iterator it) {
        if (!it.hasNext()) {
            return of();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return of(next);
        }
        Builder builder = new Builder();
        builder.m11011add(next);
        builder.addAll(it);
        return builder.build();
    }

    public static ImmutableList copyOf(Object[] objArr) {
        return objArr.length == 0 ? of() : construct((Object[]) objArr.clone());
    }

    public static ImmutableList of() {
        return RegularImmutableList.A02;
    }

    public static ImmutableList of(Object obj) {
        return construct(obj);
    }

    public static ImmutableList of(Object obj, Object obj2) {
        return construct(obj, obj2);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3) {
        return construct(obj, obj2, obj3);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4) {
        return construct(obj, obj2, obj3, obj4);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return construct(obj, obj2, obj3, obj4, obj5);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        return construct(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public static ImmutableList of(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        return construct(objArr2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Collection] */
    public static ImmutableList sortedCopyOf(Comparator comparator, Iterable iterable) {
        ArrayList arrayList;
        comparator.getClass();
        if (iterable instanceof Collection) {
            arrayList = (Collection) iterable;
        } else {
            Iterator it = iterable.iterator();
            arrayList = new ArrayList();
            C1Jp.A02(arrayList, it);
        }
        Object[] array = arrayList.toArray();
        1Dz.A00(array, array.length);
        Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw AnonymousClass001.A0p();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        boolean z = false;
        if (indexOf(obj) >= 0) {
            z = true;
        }
        return z;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return i + size;
            }
            objArr[i + i3] = get(i3);
            i2 = i3 + 1;
        }
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        boolean z;
        if (obj != this) {
            z = false;
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(this instanceof RandomAccess) || !(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext()) {
                                if (!Objects.equal(it.next(), it2.next())) {
                                    return false;
                                }
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (!Objects.equal(get(i), list.get(i))) {
                            break;
                        }
                    }
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= size) {
                return i;
            }
            i = (((i * 31) + get(i3).hashCode()) ^ (-1)) ^ (-1);
            i2 = i3 + 1;
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int i;
        if (obj != null) {
            if (this instanceof RandomAccess) {
                int size = size();
                i = 0;
                while (i < size) {
                    if (obj.equals(get(i))) {
                        break;
                    }
                    i++;
                }
            } else {
                ListIterator listIterator = listIterator();
                while (listIterator.hasNext()) {
                    if (Objects.equal(obj, listIterator.next())) {
                        return listIterator.previousIndex();
                    }
                }
            }
        }
        i = -1;
        return i;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public 1Du iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof RandomAccess)) {
            ListIterator listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (Objects.equal(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        }
        int size = size();
        do {
            size--;
            if (size < 0) {
                return -1;
            }
        } while (!obj.equals(get(size)));
        return size;
    }

    @Override // java.util.List
    public 1Dt listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public 1Dt listIterator(int i) {
        Preconditions.checkPositionIndex(i, size());
        return isEmpty() ? EMPTY_ITR : new 1Dr(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw AnonymousClass001.A0p();
    }

    public ImmutableList reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw AnonymousClass001.A0p();
    }

    @Override // java.util.List
    public ImmutableList subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? of() : subListUnchecked(i, i2);
    }

    public ImmutableList subListUnchecked(int i, int i2) {
        return new SubList(i, i2 - i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
