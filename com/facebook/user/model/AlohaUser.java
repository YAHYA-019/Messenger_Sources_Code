package com.facebook.user.model;

import X.0J6;
import X.1BL;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: AlohaUser.class */
public class AlohaUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(93);
    public final String fbId;
    public final Name name;

    public AlohaUser() {
        this.fbId = "";
        this.name = new Name(null, null, null);
    }

    public AlohaUser(Parcel parcel) {
        this.fbId = parcel.readString();
        this.name = (Name) 1BL.A0C(parcel, Name.class);
    }

    public AlohaUser(Name name, String str) {
        this.fbId = str;
        this.name = name;
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
            AlohaUser alohaUser = (AlohaUser) obj;
            if (!Objects.equal(this.fbId, alohaUser.fbId) || !Objects.equal(this.name, alohaUser.name)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0J6.A00(this.fbId, this.name);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fbId);
        parcel.writeParcelable(this.name, i);
    }
}
