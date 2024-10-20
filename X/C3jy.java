package X;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.List;

/* renamed from: X.3jy, reason: invalid class name */
/* loaded from: 3jy.class */
public class C3jy extends AbstractList {
    public final int A00;
    public final List A01;

    public C3jy(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        Preconditions.checkElementIndex(i, size());
        int i2 = this.A00;
        int i3 = i * i2;
        int i4 = i2 + i3;
        List list = this.A01;
        return list.subList(i3, Math.min(i4, list.size()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return 1PP.A02(RoundingMode.CEILING, this.A01.size(), this.A00);
    }
}
