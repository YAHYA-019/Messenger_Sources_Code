package com.facebook.user.model;

import X.0J6;
import X.4YV;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* loaded from: AlohaProxyUser.class */
public class AlohaProxyUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(92);
    public final String alohaUserName;
    public final String fbId;

    public AlohaProxyUser() {
        this.fbId = "";
        this.alohaUserName = "";
    }

    public AlohaProxyUser(Parcel parcel) {
        this.fbId = parcel.readString();
        this.alohaUserName = parcel.readString();
    }

    public AlohaProxyUser(String str, String str2) {
        this.fbId = str;
        this.alohaUserName = str2;
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
            AlohaProxyUser alohaProxyUser = (AlohaProxyUser) obj;
            if (!Objects.equal(this.fbId, alohaProxyUser.fbId) || !Objects.equal(this.alohaUserName, alohaProxyUser.alohaUserName)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 0J6.A00(this.fbId, this.alohaUserName);
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("fbId", this.fbId);
        return 4YV.A0s(stringHelper, this.alohaUserName, "alohaUserName");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.fbId);
        parcel.writeString(this.alohaUserName);
    }
}
