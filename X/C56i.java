package X;

/* renamed from: X.56i, reason: invalid class name */
/* loaded from: 56i.class */
public final class C56i implements AnonymousClass544 {
    public final I9O A00;
    public final boolean A01;

    public C56i(I9O i9o, boolean z) {
        this.A00 = i9o;
        this.A01 = z;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (anonymousClass544 instanceof C56i) {
            C56i c56i = (C56i) anonymousClass544;
            if (c56i.getId() == getId() && c56i.A01 == this.A01) {
                z = true;
            }
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return Long.parseLong(this.A00.A03.A03);
    }
}
