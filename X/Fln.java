package X;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.acra.constants.ActionId;
import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import com.facebook.payments.picker.PickerScreenActivity;
import com.facebook.payments.shipping.model.ShippingOption;
import com.google.common.base.Optional;

/* loaded from: Fln.class */
public final class Fln implements GKH {
    public 1BY A00;
    public final Context A01 = 7zP.A0J();

    public Fln(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public int AcG(CheckoutData checkoutData) {
        return ActionId.DATA_LOAD_START;
    }

    public String AhV(CheckoutData checkoutData) {
        if (!BTl(checkoutData)) {
            return null;
        }
        Optional optional = ((SimpleCheckoutData) checkoutData).A0M;
        optional.getClass();
        return ((ShippingOption) optional.get()).A02;
    }

    public String Ayg(CheckoutData checkoutData) {
        return null;
    }

    public Intent B05(CheckoutData checkoutData) {
        Context context = this.A01;
        Parcelable A06 = ((FFx) 1Hv.A02(context, 99010)).A05(DKF.A0X(checkoutData).A0F).A06(checkoutData);
        context.getClass();
        Intent A0D = C3o5.A0D(context, PickerScreenActivity.class);
        A0D.putExtra("extra_picker_screen_config", A06);
        return A0D;
    }

    public String BG9(CheckoutData checkoutData) {
        return this.A01.getResources().getString(2131965945);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r0.isPresent() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean BTl(com.facebook.payments.checkout.model.CheckoutData r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.payments.checkout.model.SimpleCheckoutData r0 = (com.facebook.payments.checkout.model.SimpleCheckoutData) r0
            r302 = r0
            r0 = r302
            com.google.common.base.Optional r0 = r0.A0M
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1a
            r0 = r303
            boolean r0 = r0.isPresent()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L1f
        L1a:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fln.BTl(com.facebook.payments.checkout.model.CheckoutData):boolean");
    }
}
