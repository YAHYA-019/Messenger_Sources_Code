package X;

import com.facebook.payments.dcp.sample.PaymentsDcpSampleActivity;

/* loaded from: G2d.class */
public final class G2d implements Runnable {
    public static final String __redex_internal_original_name = "PaymentsDcpSampleActivity$5";
    public final /* synthetic */ PaymentsDcpSampleActivity A00;
    public final /* synthetic */ String A01;

    public G2d(PaymentsDcpSampleActivity paymentsDcpSampleActivity, String str) {
        this.A00 = paymentsDcpSampleActivity;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        DKC.A1I(this.A00, this.A01, 1);
    }
}
