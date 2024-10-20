package X;

import java.util.List;

/* loaded from: Fx2.class */
public final class Fx2 implements GJ3 {
    public final /* synthetic */ Eys A00;
    public final /* synthetic */ DLQ A01;
    public final /* synthetic */ EzT A02;
    public final /* synthetic */ List A03;

    public Fx2(Eys eys, DLQ dlq, EzT ezT, List list) {
        this.A02 = ezT;
        this.A01 = dlq;
        this.A03 = list;
        this.A00 = eys;
    }

    @Override // X.GJ3
    public DLQ A8g(GJy gJy, DLQ dlq) {
        GJy gJy2;
        Eta eta = this.A02.A01;
        DLQ dlq2 = this.A01;
        List list = this.A03;
        String str = this.A00.A01;
        GJy gJy3 = dlq.A01;
        if (gJy3 != null) {
            if (gJy == null) {
                gJy = dlq2.A01;
            }
            gJy2 = gJy3.BcB(gJy);
        } else {
            gJy2 = null;
        }
        return new DLQ(gJy2, dlq2.A02, dlq, dlq, list, eta.A00(dlq2, dlq, str));
    }

    @Override // X.GJ3
    public void CSn(DLQ dlq) {
    }
}
