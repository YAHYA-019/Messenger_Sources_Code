package X;

import com.facebook.addresstypeahead.simpleaddresstypeahead.AddressTypeAheadTextView;
import com.facebook.common.locale.Country;
import com.facebook.payments.ui.PaymentFormEditTextView;

/* loaded from: Fly.class */
public final class Fly implements GFT {
    public final /* synthetic */ DZy A00;

    public Fly(DZy dZy) {
        this.A00 = dZy;
    }

    public void Brk(Country country) {
        AddressTypeAheadTextView addressTypeAheadTextView;
        int i;
        DZy dZy = this.A00;
        dZy.A02 = country;
        boolean equals = Country.A01.equals(country);
        PaymentFormEditTextView paymentFormEditTextView = dZy.A0D;
        if (equals) {
            paymentFormEditTextView.setVisibility(8);
            addressTypeAheadTextView = dZy.A01;
            i = 0;
        } else {
            paymentFormEditTextView.setVisibility(0);
            addressTypeAheadTextView = dZy.A01;
            i = 8;
        }
        addressTypeAheadTextView.setVisibility(i);
        DZy.A08(dZy, dZy.A08.A1Z());
    }
}
