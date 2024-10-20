package com.facebook.payments.confirmation;

import X.1BL;
import X.FKZ;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ConfirmationCommonParams.class */
public final class ConfirmationCommonParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(23);
    public final Intent A00;
    public final Parcelable A01;
    public final ConfirmationCommonParamsCore A02;
    public final String A03;
    public final String A04;

    public ConfirmationCommonParams(Intent intent, Parcelable parcelable, ConfirmationCommonParamsCore confirmationCommonParamsCore, String str, String str2) {
        this.A01 = parcelable;
        this.A00 = intent;
        this.A02 = confirmationCommonParamsCore;
        this.A04 = str;
        this.A03 = str2;
    }

    public ConfirmationCommonParams(Parcel parcel) {
        Class<?> cls = getClass();
        this.A01 = 1BL.A0C(parcel, cls);
        this.A00 = (Intent) 1BL.A0C(parcel, cls);
        this.A02 = (ConfirmationCommonParamsCore) 1BL.A0C(parcel, ConfirmationCommonParamsCore.class);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }
}
