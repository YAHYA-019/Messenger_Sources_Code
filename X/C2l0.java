package X;

/* renamed from: X.2l0, reason: invalid class name */
/* loaded from: 2l0.class */
public final class C2l0 implements C2l1 {
    public C2l1 A00;
    public C2l2 A01;
    public final 1Iw A02;
    public final C2ky A03;
    public final boolean A04;

    public C2l0() {
    }

    public C2l0(1Iw r302, C2ky c2ky, boolean z) {
        this.A01 = C2l2.LOADING;
        this.A02 = r302;
        this.A03 = c2ky;
        this.A04 = z;
    }

    private void A00(C2l2 c2l2) {
        synchronized (this) {
            if (!this.A04 && this.A01 != c2l2) {
                this.A01 = c2l2;
                1Iw r0 = this.A02;
                if (r0.A02 != null) {
                    r0.A0G(new C2l4(new Object[]{c2l2}, 0), "updateState:RecyclerCollectionComponent.updateLoadingState");
                }
            }
        }
    }

    @Override // X.C2l1
    public void C1c() {
        C2l1 c2l1 = this.A00;
        if (c2l1 != null) {
            c2l1.C1c();
        }
    }

    @Override // X.C2l1
    public void C4A(boolean z) {
        A00(z ? C2l2.ERROR : C2l2.LOADED);
        this.A03.A03();
        C2l1 c2l1 = this.A00;
        if (c2l1 != null) {
            c2l1.C4A(z);
        }
    }

    @Override // X.C2l1
    public void C4Q(boolean z) {
        A00(z ? C2l2.LOADING : C2l2.LOADED);
        C2l1 c2l1 = this.A00;
        if (c2l1 != null) {
            c2l1.C4Q(z);
        }
    }

    @Override // X.C2l1
    public void C4Y(boolean z) {
        A00(z ? C2l2.EMPTY : C2l2.LOADED);
        this.A03.A03();
        C2l1 c2l1 = this.A00;
        if (c2l1 != null) {
            c2l1.C4Y(z);
        }
    }
}
