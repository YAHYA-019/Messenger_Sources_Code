package com.google.android.gms.fido.fido2.api.common;

import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Attachment.class */
public enum Attachment implements Parcelable {
    PLATFORM("platform"),
    /* JADX INFO: Fake field, exist only in values array */
    CROSS_PLATFORM("cross-platform");

    public static final Parcelable.Creator CREATOR = LGn.A00(87);
    public final String zzb;

    Attachment(String str) {
        this.zzb = str;
    }

    public static Attachment A00(String str) {
        Attachment[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                throw new Exception(String.format("Attachment %s not supported", str));
            }
            Attachment attachment = values[i2];
            if (str.equals(attachment.zzb)) {
                return attachment;
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
