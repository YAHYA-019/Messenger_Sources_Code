package com.facebook.messaging.business.ads.adcontext;

import X.AbK;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: MessengerAdsContextExtensionInputParams.class */
public final class MessengerAdsContextExtensionInputParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(4);
    public final ThreadKey A00;
    public final String A01;

    public MessengerAdsContextExtensionInputParams(Parcel parcel) {
        this.A00 = AbK.A0X(parcel);
        this.A01 = parcel.readString();
    }

    public MessengerAdsContextExtensionInputParams(ThreadKey threadKey, String str) {
        this.A00 = threadKey;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
