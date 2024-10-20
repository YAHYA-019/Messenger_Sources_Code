package X;

import com.google.common.base.Preconditions;
import java.util.Iterator;

/* renamed from: X.3iq, reason: invalid class name */
/* loaded from: 3iq.class */
public final class C3iq implements Iterator {
    public Object A00;
    public boolean A01;
    public final Iterator A02;

    public C3iq(Iterator it) {
        it.getClass();
        this.A02 = it;
    }

    public Object A00() {
        if (!this.A01) {
            this.A00 = this.A02.next();
            this.A01 = true;
        }
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r301.A02.hasNext() != false) goto L6;
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
            boolean r0 = r0.A01
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L19
            r0 = r301
            java.util.Iterator r0 = r0.A02
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
        throw new UnsupportedOperationException("Method not decompiled: X.C3iq.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.A01) {
            return this.A02.next();
        }
        Object obj = this.A00;
        this.A01 = false;
        this.A00 = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        Preconditions.checkState(!this.A01, "Can't remove after you've peeked at next");
        this.A02.remove();
    }
}
