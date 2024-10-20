package X;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* loaded from: Lsf.class */
public final class Lsf implements Iterator {
    public int A00;
    public int A01;
    public C5ps A02;
    public boolean A03;
    public final C4u1 A04;
    public final Iterator A05;

    public Lsf(C4u1 c4u1, Iterator it) {
        this.A04 = c4u1;
        this.A05 = it;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301.A05.hasNext() != false) goto L6;
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
            int r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 > 0) goto L19
            r0 = r301
            java.util.Iterator r0 = r0.A05
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1b
        L19:
            r0 = 1
            r302 = r0
        L1b:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lsf.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        int i = this.A00;
        if (i == 0) {
            C5ps c5ps = (C5ps) this.A05.next();
            this.A02 = c5ps;
            i = c5ps.A00();
            this.A00 = i;
            this.A01 = i;
        }
        this.A00 = i - 1;
        this.A03 = true;
        C5ps c5ps2 = this.A02;
        c5ps2.getClass();
        return c5ps2.A01();
    }

    @Override // java.util.Iterator
    public void remove() {
        Preconditions.checkState(this.A03, "no calls to next() since the last call to remove()");
        if (this.A01 == 1) {
            this.A05.remove();
        } else {
            C4u1 c4u1 = this.A04;
            C5ps c5ps = this.A02;
            c5ps.getClass();
            c4u1.remove(c5ps.A01());
        }
        this.A01--;
        this.A03 = false;
    }
}
