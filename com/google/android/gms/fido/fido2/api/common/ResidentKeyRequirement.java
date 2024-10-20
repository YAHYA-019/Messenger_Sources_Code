package com.google.android.gms.fido.fido2.api.common;

import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ResidentKeyRequirement.class */
public enum ResidentKeyRequirement implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("discouraged"),
    /* JADX INFO: Fake field, exist only in values array */
    RESIDENT_KEY_PREFERRED("preferred"),
    RESIDENT_KEY_REQUIRED("required");

    public static final Parcelable.Creator CREATOR = LGm.A00(3);
    public final String zzb;

    ResidentKeyRequirement(String str) {
        this.zzb = str;
    }

    public static ResidentKeyRequirement A00(String str) {
        ResidentKeyRequirement[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new Exception(String.format("Resident key requirement %s not supported", str));
            }
            ResidentKeyRequirement residentKeyRequirement = values[i2];
            if (str.equals(residentKeyRequirement.zzb)) {
                return residentKeyRequirement;
            }
            i = i2 + 1;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }
}
