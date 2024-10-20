package X;

import androidx.lifecycle.MutableLiveData;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;

/* loaded from: Flx.class */
public final class Flx implements GFR {
    public final /* synthetic */ DS7 A00;

    public Flx(DS7 ds7) {
        this.A00 = ds7;
    }

    public void CPq(String str) {
        DS7 ds7 = this.A00;
        ds7.A01 = str;
        C1x1 A0J = DKF.A0J(ds7.A09);
        MutableLiveData mutableLiveData = ds7.A03;
        int A05 = 7zQ.A05(ds7.A01);
        int i = 3;
        if (ds7.A0H.mFbPaymentCardType == FbPaymentCardType.A01) {
            i = 4;
        }
        A0J.A00(mutableLiveData, Boolean.valueOf(AnonymousClass001.A1Q(A05, i)));
    }
}
