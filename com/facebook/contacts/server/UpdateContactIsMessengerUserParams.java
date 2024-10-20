package com.facebook.contacts.server;

import X.AnonymousClass001;
import X.C53v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UpdateContactIsMessengerUserParams.class */
public final class UpdateContactIsMessengerUserParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(52);
    public final String A00;
    public final boolean A01;

    public UpdateContactIsMessengerUserParams(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = C53v.A0S(parcel);
    }

    public UpdateContactIsMessengerUserParams(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UpdateContactIsMessengerUserParams {contactRepresentedProfileFbId = '");
        A0k.append(this.A00);
        A0k.append('\'');
        A0k.append(", isMessengerUser = ");
        A0k.append(this.A01);
        return AnonymousClass001.A0f(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
