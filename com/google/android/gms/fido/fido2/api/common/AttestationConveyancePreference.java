package com.google.android.gms.fido.fido2.api.common;

import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AttestationConveyancePreference.class */
public enum AttestationConveyancePreference implements Parcelable {
    NONE("none"),
    /* JADX INFO: Fake field, exist only in values array */
    INDIRECT("indirect"),
    /* JADX INFO: Fake field, exist only in values array */
    DIRECT("direct");

    public static final Parcelable.Creator CREATOR = LGm.A00(7);
    public final String zzb;

    AttestationConveyancePreference(String str) {
        this.zzb = str;
    }

    public static AttestationConveyancePreference A00(String str) {
        AttestationConveyancePreference[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new Exception(String.format("Attestation conveyance preference %s not supported", str));
            }
            AttestationConveyancePreference attestationConveyancePreference = values[i2];
            if (str.equals(attestationConveyancePreference.zzb)) {
                return attestationConveyancePreference;
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
