package com.facebook.common.locale;

import X.07S;
import X.0Pz;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.shipping.model.ShippingAddressFormInput;
import com.facebook.payments.shipping.model.SimpleMailingAddress;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import java.util.Locale;

/* loaded from: LocaleMember.class */
public abstract class LocaleMember implements Parcelable {
    public final Locale A00;

    public LocaleMember(Locale locale) {
        this.A00 = locale;
    }

    public static String A01(LocaleMember localeMember) {
        return localeMember.A00.getCountry();
    }

    public static String A02(SimpleMailingAddress simpleMailingAddress, Object obj, String str, String str2) {
        return StringFormatUtil.formatStrLocaleSafe("%s, %s, %s, %s, %s, %s", obj, 0Pz.A0W(str, str2), simpleMailingAddress.mCityName, simpleMailingAddress.mRegionName, simpleMailingAddress.mPostalCode, simpleMailingAddress.A00.A00.getCountry());
    }

    public static void A03(07S r301, PaymentsLoggingSessionData paymentsLoggingSessionData, ShippingAddressFormInput shippingAddressFormInput) {
        07S.A00(r301, shippingAddressFormInput.A03, ServerW3CShippingAddressConstants.CITY);
        07S.A00(r301, shippingAddressFormInput.A00().A00.getCountry(), "country");
        07S.A00(r301, shippingAddressFormInput.A04, "label");
        07S.A00(r301, shippingAddressFormInput.A02, "postal_code");
        07S.A00(r301, paymentsLoggingSessionData.sessionId, "logging_id");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return A01(this).equals(A01((LocaleMember) obj));
    }

    public int hashCode() {
        return A01(this).hashCode();
    }

    public String toString() {
        Locale locale = Locale.US;
        Locale locale2 = this.A00;
        return StringFormatUtil.formatStrLocaleSafe("%s (%s/%s)", locale2.getDisplayCountry(locale), locale2.getCountry(), locale2.getISO3Country());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(A01(this));
    }
}
