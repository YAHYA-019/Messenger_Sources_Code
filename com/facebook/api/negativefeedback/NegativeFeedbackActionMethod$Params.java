package com.facebook.api.negativefeedback;

import X.11T;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: NegativeFeedbackActionMethod$Params.class */
public final class NegativeFeedbackActionMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(3);
    public String A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
