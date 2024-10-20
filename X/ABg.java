package X;

/* loaded from: ABg.class */
public final class ABg implements 1K9 {
    public final /* synthetic */ C9kf A00;

    public ABg(C9kf c9kf) {
        this.A00 = c9kf;
    }

    public void onFailure(Throwable th) {
        11T.A0F(th, 0);
        9mC r0 = (9mC) 1Br.A0B(this.A00.A03);
        String message = th.getMessage();
        if (!9mC.A02(r0) || r0.A00 == 0) {
            return;
        }
        4YV.A0Z(r0.A09).flowEndFail(r0.A00, "msys_optimistic_send_failed", message);
    }

    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        9mC r0 = (9mC) 1Br.A0B(this.A00.A03);
        if (!9mC.A02(r0) || r0.A00 == 0) {
            return;
        }
        4YV.A0Z(r0.A09).flowMarkPoint(r0.A00, "msys_optimistic_send_success");
    }
}
