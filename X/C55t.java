package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.55t, reason: invalid class name */
/* loaded from: 55t.class */
public final class C55t implements AnonymousClass544 {
    public final int A00;
    public final long A01;
    public final 2YJ A02;
    public final ImmutableList A03;

    public C55t(2YJ r302, ImmutableList immutableList, long j) {
        this.A01 = j;
        this.A03 = immutableList;
        this.A02 = r302;
        this.A00 = immutableList.size();
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        if (!11T.A0O(anonymousClass544.getClass(), C55t.class)) {
            return false;
        }
        C55t c55t = (C55t) anonymousClass544;
        int i = this.A00;
        int i2 = c55t.A00;
        if (i != i2) {
            return false;
        }
        Collection A07 = 07C.A07(0, i2);
        if ((A07 instanceof Collection) && A07.isEmpty()) {
            return true;
        }
        07I it = A07.iterator();
        while (it.hasNext()) {
            int A00 = it.A00();
            ImmutableList immutableList = c55t.A03;
            if (!((8B3) immutableList.get(A00)).A00((8B3) immutableList.get(A00))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A01;
    }
}
