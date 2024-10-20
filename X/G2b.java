package X;

import com.facebook.payments.logging.PaymentsFlowStep;

/* loaded from: G2b.class */
public final class G2b implements Runnable {
    public static final String __redex_internal_original_name = "SimplePaymentsPollingGraphQLMutator$7$1";
    public final /* synthetic */ C2083Db8 A00;
    public final /* synthetic */ 2JX A01;

    public G2b(C2083Db8 c2083Db8, 2JX r303) {
        this.A00 = c2083Db8;
        this.A01 = r303;
    }

    @Override // java.lang.Runnable
    public void run() {
        FHw fHw = (FHw) this.A00.A01;
        FHw.A02(this.A01, fHw);
        FHw.A03(fHw, PaymentsFlowStep.A1c, "payflows_success");
    }
}
