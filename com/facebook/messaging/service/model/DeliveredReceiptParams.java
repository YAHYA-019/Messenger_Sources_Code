package com.facebook.messaging.service.model;

import X.AbK;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;

/* loaded from: DeliveredReceiptParams.class */
public final class DeliveredReceiptParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(81);
    public final long A00;
    public final long A01;
    public final ThreadKey A02;
    public final UserKey A03;
    public final String A04;

    public DeliveredReceiptParams(Parcel parcel) {
        this.A02 = AbK.A0X(parcel);
        this.A03 = UserKey.A02(parcel.readString());
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03.A05());
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
