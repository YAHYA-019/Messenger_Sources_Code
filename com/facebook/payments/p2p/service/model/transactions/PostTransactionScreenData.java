package com.facebook.payments.p2p.service.model.transactions;

import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PostTransactionScreenData.class */
public class PostTransactionScreenData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(33);
    public final String body;
    public final String confirmButtonText;
    public final String title;

    public PostTransactionScreenData() {
        this.title = null;
        this.body = null;
        this.confirmButtonText = null;
    }

    public PostTransactionScreenData(Parcel parcel) {
        this.title = parcel.readString();
        this.body = parcel.readString();
        this.confirmButtonText = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeString(this.confirmButtonText);
    }
}
