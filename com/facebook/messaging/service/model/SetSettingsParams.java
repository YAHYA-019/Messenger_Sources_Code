package com.facebook.messaging.service.model;

import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threads.NotificationSetting;

/* loaded from: SetSettingsParams.class */
public final class SetSettingsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(19);
    public NotificationSetting A00;
    public boolean A01;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
    }
}
