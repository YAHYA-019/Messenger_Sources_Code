package com.facebook.dbllite.data;

import X.1BK;
import X.C53v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: DblLiteCredentials.class */
public class DblLiteCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(59);
    public final Boolean isPinSet;
    public final String nonce;
    public final String userId;

    public DblLiteCredentials() {
        this.userId = null;
        this.nonce = null;
        this.isPinSet = 1BK.A0d();
    }

    public DblLiteCredentials(Parcel parcel) {
        this.userId = parcel.readString();
        this.nonce = parcel.readString();
        this.isPinSet = Boolean.valueOf(C53v.A0S(parcel));
    }

    public DblLiteCredentials(String str, String str2) {
        this.userId = str;
        this.nonce = str2;
        this.isPinSet = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.nonce);
        parcel.writeInt(this.isPinSet.booleanValue() ? 1 : 0);
    }
}
