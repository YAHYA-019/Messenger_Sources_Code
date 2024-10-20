package X;

import com.google.common.base.Objects;
import java.util.List;

/* renamed from: X.55n, reason: invalid class name */
/* loaded from: 55n.class */
public final class C55n implements AnonymousClass544 {
    public final List A00;

    public C55n(List list) {
        11T.A0F(list, 1);
        this.A00 = list;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        11T.A0F(anonymousClass544, 0);
        boolean z = false;
        if (!(anonymousClass544 instanceof C55n)) {
            return false;
        }
        List list = this.A00;
        int size = list.size();
        List list2 = ((C55n) anonymousClass544).A00;
        if (size == list2.size() && Objects.equal(list, list2)) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return C55n.class.hashCode() + 31;
    }
}
