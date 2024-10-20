package com.facebook.quicksilver.common.sharing;

import X.DKF;
import X.FKW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: InstantGameVideoShareMedia.class */
public final class InstantGameVideoShareMedia extends InstantGameShareMedia implements CallerContextable {
    public static final Parcelable.Creator CREATOR = FKW.A00(81);
    public Uri A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKF.A1E(parcel, this.A00);
    }
}
