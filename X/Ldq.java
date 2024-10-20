package X;

/* loaded from: Ldq.class */
public final /* synthetic */ class Ldq implements C51o {
    public final /* synthetic */ 4FE A00;
    public final /* synthetic */ L8D A01;

    public /* synthetic */ Ldq(4FE r302, L8D l8d) {
        this.A01 = l8d;
        this.A00 = r302;
    }

    @Override // X.C51o
    public final void Bpv(C4Ez c4Ez) {
        L8D l8d = this.A01;
        4FE r0 = this.A00;
        synchronized (l8d.A07) {
            l8d.A0A.remove(r0);
        }
    }
}
