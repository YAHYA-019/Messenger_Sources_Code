package com.facebook.messaging.service.model;

import X.1BL;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.folders.FolderCounts;

/* loaded from: UpdateFolderCountsResult.class */
public final class UpdateFolderCountsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(21);
    public final FolderCounts A00;

    public UpdateFolderCountsResult(Parcel parcel) {
        this.A00 = (FolderCounts) 1BL.A0C(parcel, FolderCounts.class);
    }

    public UpdateFolderCountsResult(FolderCounts folderCounts) {
        this.A00 = folderCounts;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
