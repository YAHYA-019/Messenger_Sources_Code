package com.facebook.growth.model;

import X.1BL;
import X.4YU;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.Objects;

/* loaded from: Contactpoint.class */
public class Contactpoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(90);
    public final String isoCountryCode;
    public final String normalized;
    public final ContactpointType type;

    public Contactpoint() {
        this.normalized = null;
        this.type = ContactpointType.A03;
        this.isoCountryCode = null;
    }

    public Contactpoint(Parcel parcel) {
        this.normalized = parcel.readString();
        this.type = ContactpointType.valueOf(parcel.readString());
        this.isoCountryCode = parcel.readString();
    }

    public Contactpoint(ContactpointType contactpointType, String str) {
        this.normalized = str;
        this.type = contactpointType;
        this.isoCountryCode = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !(obj instanceof Contactpoint)) {
                return false;
            }
            Contactpoint contactpoint = (Contactpoint) obj;
            if (!Objects.equal(this.type, contactpoint.type) || !Objects.equal(this.isoCountryCode, contactpoint.isoCountryCode) || !Objects.equal(this.normalized, contactpoint.normalized)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.type, this.normalized, this.isoCountryCode);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.normalized);
        1BL.A12(parcel, this.type);
        parcel.writeString(this.isoCountryCode);
    }
}
