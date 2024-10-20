package com.facebook.sync.service;

import X.1BL;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.sync.analytics.FullRefreshReason;

/* loaded from: SyncOperationParamsUtil$FullRefreshParams.class */
public final class SyncOperationParamsUtil$FullRefreshParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(76);
    public final FullRefreshReason A00;
    public final String A01;

    public SyncOperationParamsUtil$FullRefreshParams(Parcel parcel) {
        this.A00 = (FullRefreshReason) 1BL.A0C(parcel, FullRefreshReason.class);
        this.A01 = parcel.readString();
    }

    public SyncOperationParamsUtil$FullRefreshParams(FullRefreshReason fullRefreshReason, String str) {
        this.A00 = fullRefreshReason;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
