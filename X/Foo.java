package X;

import android.content.res.Resources;
import com.facebook.inject.FbInjector;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;

/* loaded from: Foo.class */
public final class Foo implements GIM {
    public final Resources A00 = FbInjector.A00().getResources();

    public String AkS(GFy gFy) {
        FbPaymentCardType fbPaymentCardType = ((RvS) gFy).A00;
        FbPaymentCardType fbPaymentCardType2 = FbPaymentCardType.A01;
        Resources resources = this.A00;
        int i = 2131952362;
        if (fbPaymentCardType == fbPaymentCardType2) {
            i = 2131952361;
        }
        return resources.getString(i);
    }

    public boolean BTX(GFy gFy) {
        RvS rvS = (RvS) gFy;
        String str = rvS.A01;
        boolean z = false;
        if (!1JF.A0B(str) && str.matches("\\d{3,4}")) {
            FbPaymentCardType fbPaymentCardType = rvS.A00;
            int length = str.length();
            int ordinal = fbPaymentCardType.ordinal();
            if (ordinal == 1 ? length == 4 : !((ordinal != 0 || length != 4) && length != 3)) {
                z = true;
            }
        }
        return z;
    }
}
