package com.facebook.user.profilepic;

import X.1BL;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import com.google.common.base.Platform;

/* loaded from: ProfilePicUriWithFilePath.class */
public class ProfilePicUriWithFilePath implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(62);
    public final String filePath;
    public final String profilePicUri;

    public ProfilePicUriWithFilePath(Parcel parcel) {
        this.profilePicUri = parcel.readString();
        this.filePath = parcel.readString();
    }

    public ProfilePicUriWithFilePath(String str, String str2) {
        this.profilePicUri = Platform.stringIsNullOrEmpty(str) ? null : str;
        this.filePath = Platform.stringIsNullOrEmpty(str2) ? null : str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProfilePicUriWithFilePath profilePicUriWithFilePath = (ProfilePicUriWithFilePath) obj;
            if (!Objects.equal(this.profilePicUri, profilePicUriWithFilePath.profilePicUri) || !Objects.equal(this.filePath, profilePicUriWithFilePath.filePath)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A06 = 1BL.A06(this.profilePicUri) * 31;
        String str = this.filePath;
        if (str != null) {
            i = str.hashCode();
        }
        return A06 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.profilePicUri);
        parcel.writeString(this.filePath);
    }
}
