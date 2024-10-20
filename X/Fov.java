package X;

import android.content.Intent;
import com.facebook.payments.webview.PaymentsWebViewActivity;

/* loaded from: Fov.class */
public final class Fov implements GJc {
    public final /* synthetic */ PaymentsWebViewActivity A00;

    public Fov(PaymentsWebViewActivity paymentsWebViewActivity) {
        this.A00 = paymentsWebViewActivity;
    }

    @Override // X.GJc
    public void BxV() {
        PaymentsWebViewActivity paymentsWebViewActivity = this.A00;
        paymentsWebViewActivity.setResult(700);
        paymentsWebViewActivity.finish();
    }

    @Override // X.GJc
    public void CFg(String str) {
        Intent A05 = AbF.A05();
        A05.putExtra("auth_data", str);
        PaymentsWebViewActivity paymentsWebViewActivity = this.A00;
        paymentsWebViewActivity.setResult(710, A05);
        paymentsWebViewActivity.finish();
    }

    @Override // X.GJc
    public void onSuccess(String str) {
        Intent A05 = AbF.A05();
        A05.putExtra("success_uri", str);
        PaymentsWebViewActivity paymentsWebViewActivity = this.A00;
        paymentsWebViewActivity.setResult(-1, A05);
        paymentsWebViewActivity.finish();
    }
}
