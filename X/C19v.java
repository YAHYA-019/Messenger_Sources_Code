package X;

import java.util.Iterator;

/* renamed from: X.19v, reason: invalid class name */
/* loaded from: 19v.class */
public final class C19v extends 0PS implements Iterator, AnonymousClass116 {
    @Override // java.util.Iterator
    public Object next() {
        A00();
        int i = ((0PS) this).A00;
        0GA r0 = ((0PS) this).A03;
        0GA r02 = 0GA.A00;
        if (i >= r0.length) {
            throw AnonymousClass001.A10();
        }
        ((0PS) this).A00 = i + 1;
        ((0PS) this).A01 = i;
        Object[] objArr = r0.valuesArray;
        11T.A0D(objArr);
        Object obj = objArr[((0PS) this).A01];
        A01();
        return obj;
    }
}
