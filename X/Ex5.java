package X;

import com.facebookpay.form.model.AddressFormFieldsConfig;
import com.fbpay.hub.paymentmethods.api.FbPayNewCreditCardOption;
import com.fbpay.hub.paymentmethods.api.FbPayNewPayPalOption;
import com.google.common.collect.ImmutableList;

/* loaded from: Ex5.class */
public final class Ex5 {
    public final ImmutableList A00;
    public final AddressFormFieldsConfig A01;
    public final FbPayNewCreditCardOption A02;
    public final FbPayNewPayPalOption A03;

    public Ex5(AddressFormFieldsConfig addressFormFieldsConfig, FbPayNewCreditCardOption fbPayNewCreditCardOption, FbPayNewPayPalOption fbPayNewPayPalOption, ImmutableList immutableList) {
        this.A01 = addressFormFieldsConfig;
        this.A02 = fbPayNewCreditCardOption;
        this.A03 = fbPayNewPayPalOption;
        C1pq.A08("paymentMethods", immutableList);
        this.A00 = immutableList;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ex5)) {
                return false;
            }
            Ex5 ex5 = (Ex5) obj;
            if (!11T.A0O(this.A01, ex5.A01) || !11T.A0O(this.A02, ex5.A02) || !11T.A0O(this.A03, ex5.A03) || !11T.A0O(this.A00, ex5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))) * 31);
    }
}
