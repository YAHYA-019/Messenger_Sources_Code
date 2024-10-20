package com.facebook.businessextension.jscalls;

import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

/* loaded from: SaveAutofillDataJSBridgeCallData.class */
public final class SaveAutofillDataJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(72);
    public final ImmutableMap A00;

    public SaveAutofillDataJSBridgeCallData(Parcel parcel) {
        this.A00 = ImmutableMap.copyOf((Map) parcel.readHashMap(SaveAutofillDataJSBridgeCallData.class.getClassLoader()));
    }

    public SaveAutofillDataJSBridgeCallData(ImmutableMap immutableMap) {
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
