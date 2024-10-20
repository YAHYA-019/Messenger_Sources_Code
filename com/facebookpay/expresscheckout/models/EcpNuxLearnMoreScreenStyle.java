package com.facebookpay.expresscheckout.models;

import X.11T;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: EcpNuxLearnMoreScreenStyle.class */
public final class EcpNuxLearnMoreScreenStyle implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(45);
    public final CharSequence A00;

    public EcpNuxLearnMoreScreenStyle() {
        this(null);
    }

    public EcpNuxLearnMoreScreenStyle(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        TextUtils.writeToParcel(this.A00, parcel, i);
    }
}
