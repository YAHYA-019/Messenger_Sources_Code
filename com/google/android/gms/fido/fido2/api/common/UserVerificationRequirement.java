package com.google.android.gms.fido.fido2.api.common;

import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: UserVerificationRequirement.class */
public enum UserVerificationRequirement implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator CREATOR = LGm.A00(9);
    public final String zze;

    UserVerificationRequirement(String str) {
        this.zze = str;
    }

    public static UserVerificationRequirement A00(String str) {
        UserVerificationRequirement[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new Exception(String.format("User verification requirement %s not supported", str));
            }
            UserVerificationRequirement userVerificationRequirement = values[i2];
            if (str.equals(userVerificationRequirement.zze)) {
                return userVerificationRequirement;
            }
            i = i2 + 1;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zze);
    }
}
