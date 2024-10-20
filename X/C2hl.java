package X;

/* renamed from: X.2hl, reason: invalid class name */
/* loaded from: 2hl.class */
public final class C2hl extends C2hm {
    public final 1LI A00;
    public final 1Im A01;

    public C2hl(C2hj c2hj) {
        super.A00 = ((C2hk) c2hj).A00;
        1LI r0 = c2hj.A00;
        if (r0 == null) {
            throw AnonymousClass001.A0N("Component must be provided.");
        }
        this.A00 = r0;
        this.A01 = c2hj.A01;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2hj, java.lang.Object] */
    public static C2hl A00() {
        ?? obj = new Object();
        obj.A00 = new 1LI();
        return new C2hl(obj);
    }

    @Override // X.C2hm, X.C2hn
    public 1LI AdB() {
        return this.A00;
    }

    @Override // X.C2hm, X.C2hn
    public 1JB AdK() {
        return null;
    }

    @Override // X.C2hm, X.C2hn
    public String AuZ() {
        return null;
    }

    @Override // X.C2hm, X.C2hn
    public 1Im B6u() {
        return this.A01;
    }

    @Override // X.C2hm, X.C2hn
    public boolean Cfi() {
        return true;
    }

    @Override // X.C2hn
    public String getName() {
        return this.A00.A0a();
    }
}
