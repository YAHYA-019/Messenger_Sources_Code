package com.facebook.privacy.uafprivacyoption;

import X.0Pz;
import X.11T;
import X.1BL;
import X.7zN;
import X.C04v;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UAFPrivacyRowInputTargetingFields.class */
public final class UAFPrivacyRowInputTargetingFields extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(67);
    public final String targetedPublishingFields;
    public final String targetedPublishingId;

    public UAFPrivacyRowInputTargetingFields() {
        this(null, null);
    }

    public UAFPrivacyRowInputTargetingFields(String str, String str2) {
        this.targetedPublishingFields = str;
        this.targetedPublishingId = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UAFPrivacyRowInputTargetingFields)) {
                return false;
            }
            UAFPrivacyRowInputTargetingFields uAFPrivacyRowInputTargetingFields = (UAFPrivacyRowInputTargetingFields) obj;
            if (!11T.A0O(this.targetedPublishingFields, uAFPrivacyRowInputTargetingFields.targetedPublishingFields) || !11T.A0O(this.targetedPublishingId, uAFPrivacyRowInputTargetingFields.targetedPublishingId)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A05(this.targetedPublishingFields) * 31) + 7zN.A05(this.targetedPublishingId);
    }

    public String toString() {
        return 0Pz.A0w("UAFPrivacyRowInputTargetingFields(targetedPublishingFields=", this.targetedPublishingFields, ", targetedPublishingId=", this.targetedPublishingId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.targetedPublishingFields);
        parcel.writeString(this.targetedPublishingId);
    }
}
