package X;

import android.content.Intent;
import com.facebook.payments.p2p.paypal.P2pPaypalFundingOptionsActivity;
import com.facebook.payments.p2p.paypal.PaypalFundingOptionData;

/* loaded from: Fn2.class */
public final class Fn2 implements GIE {
    public final /* synthetic */ P2pPaypalFundingOptionsActivity A00;

    public Fn2(P2pPaypalFundingOptionsActivity p2pPaypalFundingOptionsActivity) {
        this.A00 = p2pPaypalFundingOptionsActivity;
    }

    public void COd(PaypalFundingOptionData paypalFundingOptionData) {
        Intent A05 = AbF.A05();
        A05.putExtra("funding_option_id", paypalFundingOptionData);
        P2pPaypalFundingOptionsActivity p2pPaypalFundingOptionsActivity = this.A00;
        p2pPaypalFundingOptionsActivity.setResult(-1, A05);
        p2pPaypalFundingOptionsActivity.finish();
    }

    public void onCancel() {
        Intent A05 = AbF.A05();
        P2pPaypalFundingOptionsActivity p2pPaypalFundingOptionsActivity = this.A00;
        p2pPaypalFundingOptionsActivity.setResult(0, A05);
        p2pPaypalFundingOptionsActivity.finish();
    }
}
