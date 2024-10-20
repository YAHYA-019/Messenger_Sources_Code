package X;

import android.content.Context;
import android.os.CountDownTimer;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CountdownRingContainer;

/* loaded from: H2o.class */
public final class H2o extends C6d6 {
    public CountDownTimer A00;
    public FbTextView A01;
    public CountdownRingContainer A02;
    public boolean A03;
    public final JIf A04;

    /* JADX WARN: Multi-variable type inference failed */
    public H2o(Context context) {
        super(context, null, 0);
        this.A03 = false;
        this.A04 = new Gpp(this, 2);
        A0C(2132541790);
        this.A02 = (CountdownRingContainer) C09s.A01(this, 2131363431);
        this.A01 = GOo.A0X(this, 2131363433);
        GPl.A02(this, 15);
    }

    @Override // X.C6d6
    public String A0H() {
        return "CoWatchCountDownRingPlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0M() {
        CountdownRingContainer countdownRingContainer = this.A02;
        if (countdownRingContainer.A0D) {
            countdownRingContainer.A01();
        }
        CountDownTimer countDownTimer = this.A00;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A00 = null;
        }
        Context context = getContext();
        ((I99) 1Lo.A04(context, 4YV.A0C(context), (1BY) null, 99500)).A04(this.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C6d6
    public void A0e(6TI r302, boolean z) {
        this.A03 = R0a.A00(r302);
        this.A02.setVisibility(8);
        Context context = getContext();
        ((I99) 1Lo.A04(context, 4YV.A0C(context), (1BY) null, 99500)).A03(this.A04);
    }
}
