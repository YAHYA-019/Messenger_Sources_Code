package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.acra.constants.ActionId;
import com.facebook.payments.p2p.phases.PaymentPhaseWrapper;
import com.facebook.smartcapture.logging.MC;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: Fn5.class */
public final class Fn5 implements GJt {
    public 1BY A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public static final ImmutableList A09 = ImmutableList.of((Object) "NUX_INTRO", (Object) "IDV", (Object) "CREATE_PIN", (Object) "SETUP_COMPLETE", (Object) "ENTER_AMOUNT", (Object) "ADD_PAYMENT_METHOD", (Object) "FORM", (Object) "DECISION", (Object) "IDV_PENDING", (Object) "PSD_AGREEMENT");
    public static final ImmutableList A08 = ImmutableList.of((Object) "IDV", (Object) "CREATE_PIN", (Object) "SETUP_COMPLETE");
    public final Ely A06 = (Ely) 1Bn.A0B(98895);
    public final C00i A05 = 1BQ.A00();
    public final C00i A07 = AbH.A0F();

    public Fn5(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.GJt
    public void BYc(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            this.A04 = FJ8.A05(bundle2, "onboarding_fetched_phases_key");
        }
        this.A02 = DKD.A0p(bundle, "origin_key");
        this.A03 = bundle.getString("transfer_id_key");
        this.A01 = (String) bundle.getSerializable("decision_type_key");
    }

    @Override // X.GJt
    public ListenableFuture CBP(ImmutableList immutableList) {
        List list = this.A04;
        if (list != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.addAll(list.subList(1, list.size()));
            immutableList = AbG.A0y(builder, immutableList);
        }
        return 1Kd.A0A(immutableList);
    }

    @Override // X.GJt
    public ListenableFuture CYB(PaymentPhaseWrapper paymentPhaseWrapper) {
        if (paymentPhaseWrapper != null) {
            return C3o5.A0J(paymentPhaseWrapper);
        }
        1BY r0 = this.A00;
        FcF fcF = (FcF) 1Lo.A04((Context) null, 1Fw.A05(r0), r0, 98378);
        Ely ely = this.A06;
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A01;
        if (!4DQ.A03(fcF.A00)) {
            C30G A0H = AbF.A0H(ActionId.ON_VIEW_CREATED_END);
            A0H.A03("origin", str);
            A0H.A03("transfer_id", str2);
            if (str3 == null) {
                str3 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
            }
            A0H.A03("decision_type", str3);
            C3sa A00 = C3sa.A00(A0H);
            ((C3sb) A00).A03 = 0L;
            A00.A0B = false;
            AbstractC05414dq A082 = 1VX.A08(1BK.A04(fcF.A02), fcF.A01);
            A00.A05 = new 1iF(1EK.A01(), 0L);
            fcF.A00 = A082.A03(A00);
        }
        return AbJ.A0t(this.A07, new Fvf(this, 24), 2FP.A00(new S5U(ely, TimeUnit.SECONDS.toMillis(C1Ur.A00(C3o5.A0F(this.A05), 2, MC.android_payment.forced_wait_time)), 1BL.A08(ely.A01)), Fvf.A00(fcF.A00, fcF, 25), 1BK.A1E(ely.A02)));
    }

    @Override // X.GJt
    public void CjT(Bundle bundle) {
        FJ8.A09(bundle, "onboarding_fetched_phases_key", this.A04);
    }
}
