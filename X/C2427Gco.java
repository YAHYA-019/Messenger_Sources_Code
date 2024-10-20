package X;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.Gco, reason: case insensitive filesystem */
/* loaded from: Gco.class */
public final class C2427Gco extends Ic7 implements JPt {
    public JNk A00;
    public final HP9 A01;
    public final I4V A02;
    public final Object A03;
    public volatile HnX A04;
    public volatile Integer A05;

    public C2427Gco(JOW jow) {
        super.A00 = jow;
        this.A03 = AnonymousClass001.A0R();
        this.A02 = I4V.A00();
        this.A05 = 0S2.A00;
        this.A01 = new HP9(this);
    }

    public static void A00(C2427Gco c2427Gco) {
        List list = c2427Gco.A02.A00;
        if (0 < list.size()) {
            list.get(0);
            throw AnonymousClass001.A0Q("onVideoCaptureError");
        }
    }

    @Override // X.JPt
    public void D2z(boolean z) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.A03) {
            if (this.A05 == 0S2.A01) {
                this.A00.D30(new Gua(countDownLatch, this, 1), false);
            }
        }
    }
}
