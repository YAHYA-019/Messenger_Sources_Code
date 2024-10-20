package X;

import com.google.common.base.Objects;

/* renamed from: X.55p, reason: invalid class name */
/* loaded from: 55p.class */
public final class C55p implements AnonymousClass544 {
    public final 8KN A00;

    public C55p(8KN r302) {
        this.A00 = r302;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        11T.A0F(anonymousClass544, 0);
        if (anonymousClass544 instanceof C55p) {
            z = Objects.equal(this.A00, ((C55p) anonymousClass544).A00);
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return 8KN.class.hashCode() + 31;
    }
}
