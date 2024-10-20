package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.facebook.payments.checkout.model.CheckoutCommonParams;
import com.facebook.payments.checkout.model.CheckoutCommonParamsCore;
import com.facebook.payments.logging.PaymentsFlowStep;

/* loaded from: ExE.class */
public final class ExE {
    public 1BY A01;
    public Context A00 = DKC.A08();
    public final C15h A03 = G7K.A01(this, 86);
    public final Context A04 = DKC.A08();
    public final FIQ A05 = DKG.A0i();
    public final C00i A02 = 1BQ.A02(99106);

    public ExE(1BO r302) {
        this.A01 = 7zL.A0Q(r302);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    public void A00(Activity activity, CheckoutCommonParams checkoutCommonParams) {
        C2121Dea A03 = C2121Dea.A03(this.A04);
        A03.A06(2131954159);
        A03.A05(2131954158);
        A03.A0E((DialogInterface.OnClickListener) new Object(), 2131955717);
        A03.A0D(new FJv(4, activity, this, checkoutCommonParams), 2131955746);
        A03.A04();
    }

    public void A01(CheckoutCommonParams checkoutCommonParams) {
        FFx fFx = (FFx) this.A03.get();
        CheckoutCommonParamsCore checkoutCommonParamsCore = checkoutCommonParams.A02;
        ((Eqh) FFx.A01(fFx, checkoutCommonParamsCore.A0F)).A02.get();
        Intent intent = checkoutCommonParamsCore.A00;
        if (intent != null) {
            this.A04.sendBroadcast(intent);
        }
        this.A05.A07(PaymentsFlowStep.A0L, checkoutCommonParamsCore.A0D.A00, "payflows_cancel");
    }
}
