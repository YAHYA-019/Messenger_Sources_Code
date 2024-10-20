package X;

/* loaded from: FdM.class */
public final class FdM implements C0fq {
    public final /* synthetic */ 4fI A00;

    public FdM(4fI r302) {
        this.A00 = r302;
    }

    @Override // X.C0fq
    public void BjC() {
        4fI r0 = this.A00;
        if (true != r0.A02.getAndSet(true)) {
            4fI.A02(r0);
        }
    }

    @Override // X.C0fq
    public void BjH() {
        4fI r0 = this.A00;
        if (false != r0.A02.getAndSet(false)) {
            4fI.A01(r0);
        }
    }
}
