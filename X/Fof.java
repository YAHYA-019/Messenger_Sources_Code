package X;

import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;
import com.facebook.payments.simplescreen.model.SimpleScreenExtraData;
import com.facebook.widget.titlebar.TitleBarButtonSpec;
import com.mapbox.mapboxsdk.R;

/* loaded from: Fof.class */
public final class Fof implements GKO, CallerContextable {
    public static final CallerContext A02 = CallerContext.A08(Fof.class, "unknown");
    public static final String __redex_internal_original_name = "PayoutSetupCompleteScreenManager";
    public ETu A00;
    public final C00i A01 = FbInjector.A00;

    public void AE4() {
    }

    public String BG6() {
        return 1BL.A0B(this.A01).getString(2131963167);
    }

    public TitleBarButtonSpec BGA() {
        Parcelable.Creator creator = TitleBarButtonSpec.CREATOR;
        F6h f6h = new F6h();
        f6h.A08 = 1BL.A0B(this.A01).getString(2131954798);
        return new TitleBarButtonSpec(f6h);
    }

    public /* bridge */ /* synthetic */ void BOd(ViewStub viewStub, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, SimpleScreenExtraData simpleScreenExtraData) {
        View A0C = DKF.A0C(viewStub, 2132543086);
        C09s.A01(A0C, R.id.image);
        C09s.A01(A0C, 2131362484);
        C09s.A01(A0C, 2131363599);
        throw AnonymousClass001.A0Q("getImageUrl");
    }

    public void CQj() {
        FHd.A03(this.A00);
    }

    public void CsR(ETu eTu) {
        this.A00 = eTu;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }
}
