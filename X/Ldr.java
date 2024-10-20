package X;

/* loaded from: Ldr.class */
public final /* synthetic */ class Ldr implements C51o {
    public final /* synthetic */ 4FE A00;
    public final /* synthetic */ L8E A01;

    public /* synthetic */ Ldr(4FE r302, L8E l8e) {
        this.A01 = l8e;
        this.A00 = r302;
    }

    @Override // X.C51o
    public final void Bpv(C4Ez c4Ez) {
        L8E l8e = this.A01;
        4FE r0 = this.A00;
        synchronized (l8e.A07) {
            l8e.A0A.remove(r0);
        }
    }
}
