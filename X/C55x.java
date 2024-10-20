package X;

/* renamed from: X.55x, reason: invalid class name */
/* loaded from: 55x.class */
public final class C55x implements AnonymousClass544 {
    public final C1772As6 A00;
    public final C5ww A01;

    public C55x(C1772As6 c1772As6, C5ww c5ww) {
        this.A00 = c1772As6;
        this.A01 = c5ww;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass544, 0), C55x.class)) {
            return false;
        }
        if (((C55x) anonymousClass544).A00.hashCode() == this.A00.hashCode()) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A00.A05.hashCode();
    }
}
