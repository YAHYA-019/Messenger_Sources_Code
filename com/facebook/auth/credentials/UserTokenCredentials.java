package com.facebook.auth.credentials;

import X.0Pz;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: UserTokenCredentials.class */
public final class UserTokenCredentials implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(1);
    public final String A00;
    public final String A01;

    public UserTokenCredentials(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserTokenCredentials)) {
                return false;
            }
            UserTokenCredentials userTokenCredentials = (UserTokenCredentials) obj;
            if (!Objects.equal(this.A00, userTokenCredentials.A00) || !Objects.equal(this.A01, userTokenCredentials.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public String toString() {
        return 0Pz.A0j("UserTokenCredentials{userId='", this.A00, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
