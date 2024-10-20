package com.facebook.securedaction.protocol;

import X.AnonymousClass001;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: SecuredActionValidateChallengeParams.class */
public final class SecuredActionValidateChallengeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(10);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public SecuredActionValidateChallengeParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        HashMap A0u = AnonymousClass001.A0u();
        this.A04 = A0u;
        parcel.readMap(A0u, Map.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeMap(this.A04);
    }
}
