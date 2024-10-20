package X;

import java.util.Iterator;

/* renamed from: X.0rp, reason: invalid class name */
/* loaded from: 0rp.class */
public abstract class C0rp implements Iterator, AnonymousClass116 {
    public int A00;
    public Object A01;

    public abstract void A00();

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i = this.A00;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0L("hasNext called when the iterator is in the FAILED state.");
                }
                z = false;
            }
            return z;
        }
        this.A00 = 3;
        A00();
        boolean z2 = true;
        if (this.A00 != 1) {
            z2 = false;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r301.A00 == 1) goto L8;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object next() {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L26
            r0 = 2
            r304 = r0
            r0 = r302
            r1 = r304
            if (r0 == r1) goto L30
            r0 = r301
            r1 = 3
            r0.A00 = r1
            r0 = r301
            r0.A00()
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L30
        L26:
            r0 = r301
            r1 = 0
            r0.A00 = r1
            r0 = r301
            java.lang.Object r0 = r0.A01
            return r0
        L30:
            java.util.NoSuchElementException r0 = X.AnonymousClass001.A10()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0rp.next():java.lang.Object");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw AnonymousClass002.A0O();
    }
}
