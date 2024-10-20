package com.facebook.messaging.model.platformmetadata.types.persona;

import X.4YU;
import X.4YV;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: MessagePlatformPersona.class */
public final class MessagePlatformPersona implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(54);
    public final String A00;
    public final String A01;
    public final String A02;

    public MessagePlatformPersona(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof MessagePlatformPersona)) {
            MessagePlatformPersona messagePlatformPersona = (MessagePlatformPersona) obj;
            if (Objects.equal(this.A00, messagePlatformPersona.A00) && Objects.equal(this.A01, messagePlatformPersona.A01)) {
                z = 4YV.A1Z(this.A02, messagePlatformPersona.A02);
            }
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(this.A00, this.A01, this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
