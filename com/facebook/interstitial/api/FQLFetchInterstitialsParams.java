package com.facebook.interstitial.api;

import X.11T;
import X.1BL;
import X.4YV;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: FQLFetchInterstitialsParams.class */
public final class FQLFetchInterstitialsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(73);
    public final ImmutableList A00;

    public FQLFetchInterstitialsParams(Parcel parcel) {
        ArrayList A0y = 4YV.A0y(parcel, String.class);
        11T.A0I(A0y, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        this.A00 = 1BL.A0a(A0y);
    }

    public FQLFetchInterstitialsParams(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeList(this.A00);
    }
}
