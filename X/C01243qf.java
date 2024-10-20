package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.3qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3qf.class */
public final class C01243qf implements Iterable {
    public final /* synthetic */ Iterable[] A00;

    public C01243qf(Iterable[] iterableArr) {
        this.A00 = iterableArr;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        final Iterable[] iterableArr = this.A00;
        iterableArr.getClass();
        return new Iterator() { // from class: X.3qg
            public int A00 = 0;
            public Iterator A01;

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
            
                if (r0.hasNext() == false) goto L14;
             */
            @Override // java.util.Iterator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean hasNext() {
                /*
                    r301 = this;
                    r0 = r301
                    java.lang.Iterable[] r0 = r302
                    r302 = r0
                    r0 = 2
                    r303 = r0
                L7:
                    r0 = r301
                    int r0 = r0.A00
                    r304 = r0
                    r0 = r304
                    r1 = r303
                    if (r0 >= r1) goto L4c
                    r0 = r301
                    java.util.Iterator r0 = r0.A01
                    r305 = r0
                    r0 = r305
                    if (r0 == 0) goto L28
                    r0 = r305
                    boolean r0 = r0.hasNext()
                    r304 = r0
                    r0 = r304
                    if (r0 != 0) goto L4c
                L28:
                    r0 = r301
                    int r0 = r0.A00
                    r306 = r0
                    r0 = r306
                    r1 = 1
                    int r0 = r0 + r1
                    r304 = r0
                    r0 = r301
                    r1 = r304
                    r0.A00 = r1
                    r0 = r302
                    r1 = r306
                    r0 = r0[r1]
                    java.util.Iterator r0 = r0.iterator()
                    r305 = r0
                    r0 = r301
                    r1 = r305
                    r0.A01 = r1
                    goto L7
                L4c:
                    r0 = r301
                    java.util.Iterator r0 = r0.A01
                    r305 = r0
                    r0 = r305
                    if (r0 == 0) goto L67
                    r0 = r305
                    boolean r0 = r0.hasNext()
                    r306 = r0
                    r0 = 1
                    r304 = r0
                    r0 = r306
                    if (r0 != 0) goto L6c
                L67:
                    r0 = 0
                    r304 = r0
                    r0 = 0
                    r305 = r0
                L6c:
                    r0 = r304
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C01253qg.hasNext():boolean");
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    return this.A01.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw AnonymousClass001.A0p();
            }
        };
    }
}
