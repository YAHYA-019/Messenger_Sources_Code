package com.facebook.iorg.common.zero;

import X.7zN;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IorgDialogDisplayContext.class */
public enum IorgDialogDisplayContext implements Parcelable {
    IORG_APP,
    EXTERNAL_REQUEST,
    /* JADX INFO: Fake field, exist only in values array */
    FROM_BACKGROUND;

    public static final Parcelable.Creator CREATOR = FKc.A00(85);

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this);
    }
}
