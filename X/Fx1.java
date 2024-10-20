package X;

import java.util.List;

/* loaded from: Fx1.class */
public final class Fx1 implements GJ3 {
    public final /* synthetic */ Eta A00;
    public final /* synthetic */ DLQ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ List A03;

    public Fx1(Eta eta, DLQ dlq, String str, List list) {
        this.A00 = eta;
        this.A01 = dlq;
        this.A03 = list;
        this.A02 = str;
    }

    @Override // X.GJ3
    public DLQ A8g(GJy gJy, DLQ dlq) {
        GJy gJy2;
        Eta eta = this.A00;
        DLQ dlq2 = this.A01;
        List list = this.A03;
        String str = this.A02;
        GJy gJy3 = dlq.A01;
        if (gJy3 != null) {
            if (gJy == null) {
                gJy = dlq2.A01;
            }
            gJy2 = gJy3.BcB(gJy);
        } else {
            gJy2 = null;
        }
        return new DLQ(gJy2, (Egb) null, dlq, dlq, list, eta.A00(dlq2, dlq, str));
    }

    @Override // X.GJ3
    public void CSn(DLQ dlq) {
    }
}
