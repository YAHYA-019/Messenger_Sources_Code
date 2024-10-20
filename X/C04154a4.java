package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.4a4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4a4.class */
public final class C04154a4 implements Iterable {
    public final List A00;
    public final Set A01;

    public C04154a4() {
        ArrayList arrayList = new ArrayList(3);
        this.A00 = arrayList;
        Set A0I = 1Bn.A0I(266);
        this.A01 = A0I;
        Object A03 = 1Bi.A03(49170);
        Object A032 = 1Bi.A03(49171);
        Object A033 = 1Bi.A03(49172);
        arrayList.add(A03);
        arrayList.add(A032);
        arrayList.add(A033);
        Iterator it = A0I.iterator();
        while (it.hasNext()) {
            this.A00.add(it.next());
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.A00.iterator();
    }
}
