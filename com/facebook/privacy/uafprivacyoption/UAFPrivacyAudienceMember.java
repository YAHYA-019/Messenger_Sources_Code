package com.facebook.privacy.uafprivacyoption;

import X.0Pz;
import X.11T;
import X.1BL;
import X.7zN;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UAFPrivacyAudienceMember.class */
public final class UAFPrivacyAudienceMember extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(63);
    public final String id;
    public final String name;
    public final String typeName;

    public UAFPrivacyAudienceMember() {
        this(null, null, null);
    }

    public UAFPrivacyAudienceMember(String str, String str2, String str3) {
        this.typeName = str;
        this.id = str2;
        this.name = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UAFPrivacyAudienceMember)) {
                return false;
            }
            UAFPrivacyAudienceMember uAFPrivacyAudienceMember = (UAFPrivacyAudienceMember) obj;
            if (!11T.A0O(this.typeName, uAFPrivacyAudienceMember.typeName) || !11T.A0O(this.id, uAFPrivacyAudienceMember.id) || !11T.A0O(this.name, uAFPrivacyAudienceMember.name)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((1BL.A05(this.typeName) * 31) + 1BL.A05(this.id)) * 31) + 7zN.A05(this.name);
    }

    public String toString() {
        return 0Pz.A11("UAFPrivacyAudienceMember(typeName=", this.typeName, ", id=", this.id, ", name=", this.name);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.typeName);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
    }
}
