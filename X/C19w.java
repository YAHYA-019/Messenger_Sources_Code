package X;

import java.util.Iterator;

/* renamed from: X.19w, reason: invalid class name */
/* loaded from: 19w.class */
public final class C19w extends 0PS implements Iterator, AnonymousClass116 {
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
        Object obj = r0.keysArray[i];
        A01();
        return obj;
    }
}
