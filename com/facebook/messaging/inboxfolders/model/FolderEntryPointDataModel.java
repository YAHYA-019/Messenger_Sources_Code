package com.facebook.messaging.inboxfolders.model;

import X.11T;
import X.1BL;
import X.7zL;
import X.C04v;
import X.C4Mg;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FolderEntryPointDataModel.class */
public final class FolderEntryPointDataModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(82);
    public final C4Mg A00;

    public FolderEntryPointDataModel(C4Mg c4Mg) {
        11T.A0F(c4Mg, 1);
        this.A00 = c4Mg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FolderEntryPointDataModel) && this.A00 == ((FolderEntryPointDataModel) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A00);
    }
}
