package com.facebook.api.growth.contactimporter;

import X.AnonymousClass001;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: UsersInviteResults.class */
public class UsersInviteResults implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(2);
    public final ArrayList result;

    public UsersInviteResults() {
        this.result = AnonymousClass001.A0s();
    }

    public UsersInviteResults(Parcel parcel) {
        ArrayList createTypedArrayList = parcel.createTypedArrayList(UsersInviteResult.CREATOR);
        this.result = createTypedArrayList == null ? AnonymousClass001.A0s() : createTypedArrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.result);
    }
}
