package com.facebook.payments.p2m.buyershipping;

import X.1BK;
import X.1Br;
import X.1Bu;
import X.1G1;
import X.1Lm;
import X.1pK;
import X.7zR;
import X.7zU;
import X.AbH;
import X.AbN;
import X.C06c;
import X.C2125Dee;
import X.DKF;
import X.DKH;
import X.DKy;
import X.FX0;
import X.GFZ;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.base.activity.FbFragmentActivity;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.payments.p2m.buyershipping.ui.BuyerShippingEditTextView;
import com.facebook.payments.ui.PaymentFormEditTextView;
import java.util.TreeMap;

/* loaded from: AddShippingAddressActivity.class */
public final class AddShippingAddressActivity extends FbFragmentActivity implements GFZ {
    public C2125Dee A00;
    public MigColorScheme A01;
    public TreeMap A02;
    public final 1Br A03 = 1Bu.A01(this, 99376);

    public static final void A12(AddShippingAddressActivity addShippingAddressActivity) {
        BuyerShippingEditTextView buyerShippingEditTextView = (BuyerShippingEditTextView) addShippingAddressActivity.findViewById(2131368514);
        View findViewById = addShippingAddressActivity.findViewById(2131368515);
        if (buyerShippingEditTextView != null) {
            buyerShippingEditTextView.A0r();
            buyerShippingEditTextView.A0s();
            buyerShippingEditTextView.A0o("");
        }
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
    }

    @Override // com.facebook.base.activity.FbFragmentActivity
    public void A2y(Bundle bundle) {
        super.A2y(bundle);
        1G1 A0H = DKH.A0H(this);
        setContentView(2132541487);
        ((DKy) 1Lm.A05(this, A0H, 99445)).A01(this);
        View findViewById = findViewById(2131365419);
        if (findViewById != null) {
            MigColorScheme migColorScheme = this.A01;
            if (migColorScheme == null) {
                migColorScheme = 7zR.A0c(this);
            }
            this.A01 = migColorScheme;
            MigColorScheme.A00(findViewById, migColorScheme);
        }
        TextView A0D = DKF.A0D(this, 2131368067);
        if (A0D != null) {
            MigColorScheme migColorScheme2 = this.A01;
            if (migColorScheme2 == null) {
                migColorScheme2 = 7zR.A0c(this);
            }
            this.A01 = migColorScheme2;
            AbH.A1M(A0D, migColorScheme2);
        }
        TextView A0D2 = DKF.A0D(this, 2131363664);
        if (A0D2 != null) {
            MigColorScheme migColorScheme3 = this.A01;
            if (migColorScheme3 == null) {
                migColorScheme3 = 7zR.A0c(this);
            }
            this.A01 = migColorScheme3;
            A0D2.setTextColor(migColorScheme3.B36());
        }
        PaymentFormEditTextView paymentFormEditTextView = (PaymentFormEditTextView) findViewById(2131368514);
        if (paymentFormEditTextView != null) {
            DKF.A1S(paymentFormEditTextView, 2);
            AbN.A0v(paymentFormEditTextView.A03, 5);
        }
        PaymentFormEditTextView paymentFormEditTextView2 = (PaymentFormEditTextView) findViewById(2131366429);
        if (paymentFormEditTextView2 != null) {
            DKF.A1S(paymentFormEditTextView2, 3);
        }
        BuyerShippingEditTextView buyerShippingEditTextView = (BuyerShippingEditTextView) findViewById(2131368514);
        if (buyerShippingEditTextView != null) {
            DKF.A1G(new FX0(A0H, this, buyerShippingEditTextView, A0H.A02), buyerShippingEditTextView);
        }
        String stringExtra = getIntent().getStringExtra("invoice_id");
        if (stringExtra == null || stringExtra.length() == 0) {
            finish();
            return;
        }
        Fragment fragment = new 1pK();
        Bundle A05 = 1BK.A05();
        A05.putString("invoice_id", stringExtra);
        fragment.setArguments(A05);
        C06c A0D3 = 7zU.A0D(this);
        A0D3.A0Q(fragment, "buyer_shipping_title_fragment", 2131368077);
        A0D3.A04();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r303 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String Aqs(int r302) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            android.view.View r0 = r0.findViewById(r1)
            com.facebook.payments.ui.PaymentFormEditTextView r0 = (com.facebook.payments.ui.PaymentFormEditTextView) r0
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L19
            r0 = r303
            com.facebook.resources.ui.FbAutoCompleteTextView r0 = r0.A03
            java.lang.String r0 = X.AbM.A0u(r0)
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L1c
        L19:
            java.lang.String r0 = ""
            r303 = r0
        L1c:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.p2m.buyershipping.AddShippingAddressActivity.Aqs(int):java.lang.String");
    }
}
