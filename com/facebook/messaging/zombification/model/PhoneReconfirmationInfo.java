package com.facebook.messaging.zombification.model;

import X.1BL;
import X.C53v;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.profilepic.PicSquare;

/* loaded from: PhoneReconfirmationInfo.class */
public class PhoneReconfirmationInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(3);
    public final boolean isDeactivatedUser;
    public final String matchingFacebookUserDisplayName;
    public final String matchingFacebookUserId;
    public final PicSquare matchingFacebookUserPicSquare;
    public final String viewerUserId;

    public PhoneReconfirmationInfo() {
        this.isDeactivatedUser = false;
        this.viewerUserId = "";
        this.matchingFacebookUserId = null;
        this.matchingFacebookUserDisplayName = null;
        this.matchingFacebookUserPicSquare = null;
    }

    public PhoneReconfirmationInfo(Parcel parcel) {
        this.isDeactivatedUser = C53v.A0S(parcel);
        this.viewerUserId = parcel.readString();
        this.matchingFacebookUserId = parcel.readString();
        this.matchingFacebookUserDisplayName = parcel.readString();
        this.matchingFacebookUserPicSquare = (PicSquare) 1BL.A0C(parcel, PicSquare.class);
    }

    public PhoneReconfirmationInfo(PicSquare picSquare, String str, String str2, String str3, boolean z) {
        this.isDeactivatedUser = z;
        this.viewerUserId = str;
        this.matchingFacebookUserId = str2;
        this.matchingFacebookUserDisplayName = str3;
        this.matchingFacebookUserPicSquare = picSquare;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isDeactivatedUser ? 1 : 0);
        parcel.writeString(this.viewerUserId);
        parcel.writeString(this.matchingFacebookUserId);
        parcel.writeString(this.matchingFacebookUserDisplayName);
        parcel.writeParcelable(this.matchingFacebookUserPicSquare, i);
    }
}
