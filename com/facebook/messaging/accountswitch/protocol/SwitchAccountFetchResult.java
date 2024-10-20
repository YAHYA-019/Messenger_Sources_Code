package com.facebook.messaging.accountswitch.protocol;

import X.4YV;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: SwitchAccountFetchResult.class */
public final class SwitchAccountFetchResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(87);
    public final int A00;
    public final ArrayList A01;

    public SwitchAccountFetchResult(int i, ArrayList arrayList) {
        this.A00 = i;
        this.A01 = arrayList;
    }

    public SwitchAccountFetchResult(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = 4YV.A0y(parcel, GetUnseenCountsNotificationResult.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeTypedList(this.A01);
    }
}
