package com.facebook.messaging.profilepicture.protocol;

import X.1BL;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.TriState;
import com.facebook.user.profilepic.PicSquare;

/* loaded from: GetLoggedInUserProfilePicGraphQlResult.class */
public final class GetLoggedInUserProfilePicGraphQlResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(28);
    public final TriState A00;
    public final PicSquare A01;

    public GetLoggedInUserProfilePicGraphQlResult(Parcel parcel) {
        this.A01 = (PicSquare) 1BL.A0C(parcel, PicSquare.class);
        this.A00 = TriState.fromDbValue(parcel.readInt());
    }

    public GetLoggedInUserProfilePicGraphQlResult(TriState triState, PicSquare picSquare) {
        this.A01 = picSquare;
        this.A00 = triState;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00.getDbValue());
    }
}
