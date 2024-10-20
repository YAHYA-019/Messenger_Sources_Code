package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.55v, reason: invalid class name */
/* loaded from: 55v.class */
public final class C55v implements AnonymousClass544 {
    public int A00;
    public final long A01;
    public final 2YJ A02;
    public final ImmutableList A03;

    public C55v(2YJ r302, ImmutableList immutableList, long j) {
        this.A01 = j;
        this.A03 = immutableList;
        this.A02 = r302;
        this.A00 = immutableList.size();
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (11T.A0O(4YV.A0d(anonymousClass544, 0), C55v.class)) {
            C55v c55v = (C55v) anonymousClass544;
            if (this.A00 == c55v.A00) {
                Iterator it = this.A03.iterator();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        if (!((8B3) c55v.A03.get(i2)).A00((8B3) next)) {
                            break;
                        }
                        i = i3;
                    } else {
                        C0s8.A18();
                        throw 0Q8.createAndThrow();
                    }
                }
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A01;
    }
}
