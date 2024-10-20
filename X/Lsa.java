package X;

import com.google.common.collect.Iterators$EmptyModifiableIterator;
import com.google.common.collect.StandardTable;
import com.google.common.collect.Tables$ImmutableCell;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Lsa.class */
public final class Lsa implements Iterator {
    public Iterator A00 = Iterators$EmptyModifiableIterator.A01;
    public Map.Entry A01;
    public final Iterator A02;
    public final /* synthetic */ StandardTable A03;

    public Lsa(StandardTable standardTable) {
        this.A03 = standardTable;
        this.A02 = AnonymousClass001.A0y(standardTable.backingMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r301.A00.hasNext() != false) goto L6;
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
            java.util.Iterator r0 = r0.A02
            r302 = r0
            r0 = r302
            boolean r0 = r0.hasNext()
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L22
            r0 = r301
            java.util.Iterator r0 = r0.A00
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L24
        L22:
            r0 = 1
            r303 = r0
        L24:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lsa.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        if (!this.A00.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(this.A02);
            this.A01 = A0z;
            this.A00 = AnonymousClass001.A0y((java.util.Map) A0z.getValue());
        }
        this.A01.getClass();
        Map.Entry A0z2 = AnonymousClass001.A0z(this.A00);
        return new Tables$ImmutableCell(this.A01.getKey(), A0z2.getKey(), A0z2.getValue());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.A00.remove();
        Map.Entry entry = this.A01;
        entry.getClass();
        if (((java.util.Map) entry.getValue()).isEmpty()) {
            this.A02.remove();
            this.A01 = null;
        }
    }
}
