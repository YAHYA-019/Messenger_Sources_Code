package com.facebook.messaging.platform.utilities;

import X.11T;
import X.1BL;
import X.CSS;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareItem;

/* loaded from: OpenGraphMessageBatchOperation$Params.class */
public final class OpenGraphMessageBatchOperation$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(15);
    public final Bundle A00;
    public final ShareItem A01;
    public final String A02;

    public OpenGraphMessageBatchOperation$Params(Parcel parcel) {
        this.A01 = (ShareItem) 1BL.A0C(parcel, ShareItem.class);
        this.A00 = parcel.readBundle();
        this.A02 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeBundle(this.A00);
        parcel.writeString(this.A02);
    }
}
