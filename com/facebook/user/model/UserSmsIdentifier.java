package com.facebook.user.model;

import X.AbM;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: UserSmsIdentifier.class */
public final class UserSmsIdentifier implements Parcelable, UserIdentifier {
    public static final Parcelable.Creator CREATOR = new FKe(99);
    public final String A00;
    public final String A01;

    public UserSmsIdentifier(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public UserSmsIdentifier(String str) {
        this.A00 = str;
        this.A01 = str;
    }

    public UserSmsIdentifier(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
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
            UserSmsIdentifier userSmsIdentifier = (UserSmsIdentifier) obj;
            if (!Objects.equal(this.A00, userSmsIdentifier.A00) || !Objects.equal(this.A01, userSmsIdentifier.A01)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.facebook.user.model.UserIdentifier
    public String getId() {
        return this.A00;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
