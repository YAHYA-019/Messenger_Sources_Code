package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.HashBiMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: Lsd.class */
public final class Lsd implements Iterator {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ LyN A04;

    public Lsd(LyN lyN) {
        this.A04 = lyN;
        HashBiMap hashBiMap = lyN.A00;
        this.A01 = hashBiMap.A00;
        this.A02 = -1;
        this.A00 = hashBiMap.A01;
        this.A03 = hashBiMap.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r301.A03 <= 0) goto L8;
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
            X.LyN r0 = r0.A04
            com.google.common.collect.HashBiMap r0 = r0.A00
            r302 = r0
            r0 = r302
            int r0 = r0.A01
            r303 = r0
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L35
            r0 = r301
            int r0 = r0.A01
            r303 = r0
            r0 = -2
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L2f
            r0 = r301
            int r0 = r0.A03
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 > 0) goto L33
        L2f:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L33:
            r0 = r304
            return r0
        L35:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r302 = r0
            r0 = r302
            r0.<init>()
            r0 = r302
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lsd.hasNext():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object[]] */
    @Override // java.util.Iterator
    public Object next() {
        K9U k9v;
        K9U[] k9uArr;
        if (!hasNext()) {
            throw AnonymousClass001.A10();
        }
        KA7 ka7 = this.A04;
        int i = this.A01;
        if (ka7 instanceof KA7) {
            k9uArr = ka7.A00.A0C;
        } else {
            if (!(ka7 instanceof KA6)) {
                k9v = ka7 instanceof KA4 ? new K9V(((LyN) ka7).A00, i) : new K9U(((KA5) ka7).A00, i);
                this.A02 = i;
                this.A01 = ((LyN) ka7).A00.A09[i];
                this.A03--;
                return k9v;
            }
            k9uArr = ((KA6) ka7).A00.A0B;
        }
        k9v = k9uArr[i];
        this.A02 = i;
        this.A01 = ((LyN) ka7).A00.A09[i];
        this.A03--;
        return k9v;
    }

    @Override // java.util.Iterator
    public void remove() {
        HashBiMap hashBiMap = this.A04.A00;
        if (hashBiMap.A01 != this.A00) {
            throw new ConcurrentModificationException();
        }
        Preconditions.checkState(4YV.A1W(this.A02, -1), "no calls to next() since the last call to remove()");
        int i = this.A02;
        HashBiMap.A09(hashBiMap, i, 1FW.A02(hashBiMap.A0B[i]), 1FW.A02(hashBiMap.A0C[i]));
        if (this.A01 == hashBiMap.A02) {
            this.A01 = this.A02;
        }
        this.A02 = -1;
        this.A00 = hashBiMap.A01;
    }
}
