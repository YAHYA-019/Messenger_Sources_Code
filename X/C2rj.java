package X;

/* renamed from: X.2rj, reason: invalid class name */
/* loaded from: 2rj.class */
public final class C2rj implements C2rk {
    public final /* synthetic */ 2CP A00;

    public C2rj(2CP r302) {
        this.A00 = r302;
    }

    @Override // X.C2rk
    public final void Bfx(1IG r302) {
        2CP r0 = this.A00;
        11T.A0D(r302);
        synchronized (r0) {
            if (!r0.A01) {
                0WH r02 = r0.A00;
                11T.A0D(r02);
                r02.remove(r302);
            }
        }
    }
}
