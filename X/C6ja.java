package X;

/* renamed from: X.6ja, reason: invalid class name */
/* loaded from: 6ja.class */
public final class C6ja extends 62R implements AnonymousClass624 {
    public final int A00;
    public final C62b A01;

    public C6ja() {
        this.A00 = -1;
        this.A01 = C62b.A0D;
    }

    public C6ja(int i) {
        this.A00 = i;
        this.A01 = C62b.A0D;
    }

    public C6ja(int i, boolean z) {
        this.A00 = i;
        this.A01 = C62b.A0O;
    }

    @Override // X.AnonymousClass626
    public long AsR() {
        return Long.MIN_VALUE;
    }

    @Override // X.AnonymousClass624
    public C62b B8O() {
        return this.A01;
    }

    @Override // X.AnonymousClass624
    public boolean BVc(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (anonymousClass624.getClass() == C6ja.class && this.A00 == ((C6ja) anonymousClass624).A00) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass624
    public boolean BVk(AnonymousClass624 anonymousClass624) {
        boolean z = false;
        if (this.A01 == anonymousClass624.B8O()) {
            z = true;
        }
        return z;
    }

    public String toString() {
        return "RowSpacerItem";
    }
}
