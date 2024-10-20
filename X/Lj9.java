package X;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: Lj9.class */
public final class Lj9 implements Iterable, AnonymousClass116 {
    public final int A00;
    public final LjA A01;
    public final int A02;

    public Lj9(LjA ljA, int i, int i2) {
        this.A01 = ljA;
        this.A02 = i;
        this.A00 = i2;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        int i;
        ArrayList arrayList;
        int A02;
        Object obj;
        LjA ljA = this.A01;
        if (ljA.A03 != this.A00) {
            throw new ConcurrentModificationException();
        }
        int i2 = this.A02;
        HashMap hashMap = ljA.A06;
        if (hashMap != null) {
            if (!(!ljA.A07)) {
                LDN.A03("use active SlotWriter to crate an anchor for location instead");
                throw 0Q8.createAndThrow();
            }
            if (i2 >= 0 && i2 < (i = ljA.A00) && (A02 = L99.A02((arrayList = ljA.A05), i2, i)) >= 0 && (obj = arrayList.get(A02)) != null) {
                hashMap.get(obj);
            }
        }
        return new Lsp(ljA, i2 + 1, i2 + ljA.A08[(i2 * 5) + 3]);
    }
}
