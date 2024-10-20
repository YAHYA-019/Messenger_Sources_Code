package X;

/* loaded from: Ldp.class */
public final /* synthetic */ class Ldp implements C51o {
    public final /* synthetic */ 4FE A00;
    public final /* synthetic */ L8R A01;

    public /* synthetic */ Ldp(4FE r302, L8R l8r) {
        this.A01 = l8r;
        this.A00 = r302;
    }

    @Override // X.C51o
    public final void Bpv(C4Ez c4Ez) {
        L8R l8r = this.A01;
        4FE r0 = this.A00;
        synchronized (l8r.A07) {
            l8r.A0A.remove(r0);
        }
    }
}
