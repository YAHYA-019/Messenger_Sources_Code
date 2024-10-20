package com.facebook.messaging.service.model;

import X.1BL;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.UserKey;
import com.facebook.user.profilepic.ProfilePicUriWithFilePath;

/* loaded from: UpdateProfilePicUriWithFilePathParams.class */
public final class UpdateProfilePicUriWithFilePathParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(22);
    public final UserKey A00;
    public final ProfilePicUriWithFilePath A01;

    public UpdateProfilePicUriWithFilePathParams(Parcel parcel) {
        this.A00 = UserKey.A02(parcel.readString());
        this.A01 = (ProfilePicUriWithFilePath) 1BL.A0C(parcel, ProfilePicUriWithFilePath.class);
    }

    public UpdateProfilePicUriWithFilePathParams(UserKey userKey, ProfilePicUriWithFilePath profilePicUriWithFilePath) {
        this.A00 = userKey;
        this.A01 = profilePicUriWithFilePath;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.A05());
        parcel.writeParcelable(this.A01, i);
    }
}
