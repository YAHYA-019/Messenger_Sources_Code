package X;

/* loaded from: Fx0.class */
public final class Fx0 implements GJ3 {
    public final /* synthetic */ Egb A00;
    public final /* synthetic */ DLQ A01;

    public Fx0(Egb egb, DLQ dlq) {
        this.A01 = dlq;
        this.A00 = egb;
    }

    @Override // X.GJ3
    public DLQ A8g(GJy gJy, DLQ dlq) {
        GJy gJy2 = dlq.A01;
        if (gJy2 == null && this.A00 == null) {
            return dlq;
        }
        GJy gJy3 = null;
        if (gJy2 != null) {
            gJy3 = gJy2.BcB(gJy);
        }
        return new DLQ(gJy3, this.A00, dlq, dlq.A08, dlq.A0A, dlq.A04);
    }

    @Override // X.GJ3
    public void CSn(DLQ dlq) {
    }
}
