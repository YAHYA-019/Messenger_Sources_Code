package com.facebook.platform.server.protocol;

import X.11T;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: GetCanonicalProfileIdsMethod$Params.class */
public final class GetCanonicalProfileIdsMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(43);
    public final ArrayList A00;

    public GetCanonicalProfileIdsMethod$Params(Parcel parcel) {
        this.A00 = parcel.createStringArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeStringList(this.A00);
    }
}