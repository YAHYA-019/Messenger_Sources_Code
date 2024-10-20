package com.facebook.messaging.data.repository.user;

import X.11T;
import X.4YV;
import X.4YW;
import X.7zL;
import X.C1pq;
import X.C5xo;
import X.C5xp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.User;

/* loaded from: UserDataModel.class */
public final class UserDataModel implements Parcelable, C5xo {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(34);
    public final User A00;
    public final String A01;
    public final String A02;

    public UserDataModel(Parcel parcel) {
        this.A00 = parcel.readInt() == 0 ? null : (User) parcel.readParcelable(4YV.A0e(this));
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public UserDataModel(User user, String str) {
        this.A00 = user;
        this.A01 = "";
        this.A02 = str;
        C5xp.A00(this);
    }

    @Override // X.C5xo
    public String AlZ() {
        return this.A01;
    }

    @Override // X.C5xo
    public String BCK() {
        return this.A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserDataModel)) {
                return false;
            }
            UserDataModel userDataModel = (UserDataModel) obj;
            if (!11T.A0O(this.A00, userDataModel.A00) || !11T.A0O(this.A01, userDataModel.A01) || !11T.A0O(this.A02, userDataModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0D(parcel, this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
