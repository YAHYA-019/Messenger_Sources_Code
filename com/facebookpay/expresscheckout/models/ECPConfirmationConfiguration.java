package com.facebookpay.expresscheckout.models;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.confirmation.model.ECPConfirmationUpsellSection;

/* loaded from: ECPConfirmationConfiguration.class */
public final class ECPConfirmationConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(39);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;

    public ECPConfirmationConfiguration() {
        this(null, "CLOSE");
    }

    public ECPConfirmationConfiguration(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str) {
        11T.A0F(str, 2);
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
