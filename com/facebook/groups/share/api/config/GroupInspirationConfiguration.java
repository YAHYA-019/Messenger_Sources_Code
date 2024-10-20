package com.facebook.groups.share.api.config;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GroupInspirationConfiguration.class */
public final class GroupInspirationConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(88);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public GroupInspirationConfiguration(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = parcel.readString();
        this.A03 = C3o5.A0O(parcel);
    }

    public GroupInspirationConfiguration(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        C1pq.A08("groupId", str3);
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GroupInspirationConfiguration)) {
                return false;
            }
            GroupInspirationConfiguration groupInspirationConfiguration = (GroupInspirationConfiguration) obj;
            if (!11T.A0O(this.A00, groupInspirationConfiguration.A00) || !11T.A0O(this.A01, groupInspirationConfiguration.A01) || !11T.A0O(this.A02, groupInspirationConfiguration.A02) || !11T.A0O(this.A03, groupInspirationConfiguration.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
    }
}
