package com.facebook.messaging.service.model;

import X.AnonymousClass001;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: FetchUnreadMessageResult.class */
public final class FetchUnreadMessageResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(1);
    public final ImmutableMap A00;

    public FetchUnreadMessageResult(Parcel parcel) {
        HashMap A0u = AnonymousClass001.A0u();
        parcel.readMap(A0u, Map.class.getClassLoader());
        this.A00 = ImmutableMap.copyOf((Map) A0u);
    }

    public FetchUnreadMessageResult(ImmutableMap immutableMap) {
        this.A00 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.A00);
    }
}
