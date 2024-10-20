package com.facebook.businessextension.jscalls;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InitJSBridgeCallData.class */
public final class InitJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(70);
    public final String A00;

    public InitJSBridgeCallData(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public InitJSBridgeCallData(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
