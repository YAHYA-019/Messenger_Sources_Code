package com.facebook.messaging.platform.utilities;

import X.11T;
import X.1BL;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareItem;

/* loaded from: LinkShareMessageBatchOperation$Params.class */
public final class LinkShareMessageBatchOperation$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(14);
    public final ShareItem A00;

    public LinkShareMessageBatchOperation$Params(Parcel parcel) {
        this.A00 = (ShareItem) 1BL.A0C(parcel, ShareItem.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
