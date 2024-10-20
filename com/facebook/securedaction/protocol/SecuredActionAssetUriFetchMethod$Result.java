package com.facebook.securedaction.protocol;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: SecuredActionAssetUriFetchMethod$Result.class */
public final class SecuredActionAssetUriFetchMethod$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(9);
    public Map A00 = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }
}
