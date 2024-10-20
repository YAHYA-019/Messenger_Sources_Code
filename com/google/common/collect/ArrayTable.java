package com.google.common.collect;

import X.AnonymousClass001;
import X.GOn;
import X.K9n;
import X.L5M;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: ArrayTable.class */
public final class ArrayTable extends L5M implements Serializable {
    public static final long serialVersionUID = 0;
    public transient K9n A00;
    public final Object[][] array;
    public final ImmutableMap columnKeyToIndex;
    public final ImmutableList columnList;
    public final ImmutableMap rowKeyToIndex;
    public final ImmutableList rowList;

    public ArrayTable(Iterable iterable, Iterable iterable2) {
        ImmutableList copyOf = ImmutableList.copyOf(iterable);
        this.rowList = copyOf;
        ImmutableList copyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = copyOf2;
        Preconditions.checkArgument(AnonymousClass001.A1Q(copyOf.isEmpty() ? 1 : 0, copyOf2.isEmpty() ? 1 : 0));
        ImmutableMap.Builder builder = new ImmutableMap.Builder(copyOf.size());
        Iterator<E> it = copyOf.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                break;
            }
            builder.put(it.next(), Integer.valueOf(i2));
            i = i2 + 1;
        }
        this.rowKeyToIndex = builder.buildOrThrow();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(copyOf2.size());
        Iterator<E> it2 = copyOf2.iterator();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (!it2.hasNext()) {
                break;
            }
            builder2.put(it2.next(), Integer.valueOf(i4));
            i3 = i4 + 1;
        }
        this.columnKeyToIndex = builder2.buildOrThrow();
        int size = copyOf.size();
        int size2 = copyOf2.size();
        int[] A1b = GOn.A1b();
        A1b[1] = size2;
        A1b[0] = size;
        Object[][] objArr = (Object[][]) Array.newInstance((Class<?>) Object.class, A1b);
        this.array = objArr;
        for (Object[] objArr2 : objArr) {
            Arrays.fill(objArr2, (Object) null);
        }
    }

    @Override // X.L5M
    public Object A02(Object obj, Object obj2) {
        Number number = (Number) this.rowKeyToIndex.get(obj);
        Number number2 = (Number) this.columnKeyToIndex.get(obj2);
        if (number == null || number2 == null) {
            return null;
        }
        int intValue = number.intValue();
        int intValue2 = number2.intValue();
        return L5M.A00(this, intValue, intValue2)[intValue2];
    }
}
