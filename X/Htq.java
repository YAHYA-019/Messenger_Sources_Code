package X;

import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;

/* loaded from: Htq.class */
public final class Htq {
    public long A00;
    public long A01;
    public MontageProgressIndicatorView A02;
    public boolean A03;
    public long A04;
    public final 1Br A05 = 7zM.A0d();

    public final void A00() {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A01 += 1Br.A00(this.A05) - this.A04;
        MontageProgressIndicatorView montageProgressIndicatorView = this.A02;
        if (montageProgressIndicatorView != null) {
            GOo.A1H(montageProgressIndicatorView);
        }
    }

    public final void A01() {
        long j = this.A00 - this.A01;
        if (j >= 0) {
            this.A04 = 1Br.A00(this.A05);
            MontageProgressIndicatorView montageProgressIndicatorView = this.A02;
            if (montageProgressIndicatorView != null) {
                montageProgressIndicatorView.A05(j);
            }
        }
    }

    public final void A02(int i, int i2, long j) {
        MontageProgressIndicatorView montageProgressIndicatorView = this.A02;
        if (montageProgressIndicatorView != null) {
            montageProgressIndicatorView.setPosition(i, i2);
        }
        MontageProgressIndicatorView montageProgressIndicatorView2 = this.A02;
        if (montageProgressIndicatorView2 != null) {
            montageProgressIndicatorView2.A04(j);
        }
        this.A00 = j;
        MontageProgressIndicatorView montageProgressIndicatorView3 = this.A02;
        if (montageProgressIndicatorView3 != null) {
            montageProgressIndicatorView3.A01();
        }
        this.A01 = 0L;
        this.A04 = 0L;
        this.A03 = false;
    }
}
