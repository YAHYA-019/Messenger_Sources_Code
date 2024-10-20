package com.facebook.webrtc.common;

import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: RtcUserCapabilitiesField.class */
public final class RtcUserCapabilitiesField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(32);
    public final Boolean A00;
    public final Double A01;
    public final Long A02;
    public final String A03;

    public RtcUserCapabilitiesField(Parcel parcel) {
        int readInt = parcel.readInt();
        boolean z = true;
        if (readInt == 1) {
            this.A00 = Boolean.valueOf(parcel.readInt() == 0 ? false : z);
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            return;
        }
        if (readInt == 2) {
            this.A00 = null;
            this.A02 = Long.valueOf(parcel.readLong());
            this.A01 = null;
            this.A03 = null;
            return;
        }
        if (readInt == 3) {
            this.A00 = null;
            this.A02 = null;
            this.A01 = Double.valueOf(parcel.readDouble());
            this.A03 = null;
            return;
        }
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        if (readInt != 4) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
    }

    public RtcUserCapabilitiesField(boolean z) {
        this.A00 = Boolean.valueOf(z);
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        Object obj = this.A00;
        if (obj == null) {
            obj = this.A01;
            if (obj == null) {
                obj = this.A02;
                if (obj == null) {
                    obj = this.A03;
                    if (obj == null) {
                        obj = null;
                    }
                }
            }
        }
        return String.format("RtcUserCapabilitiesField: {%s}", obj);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Boolean bool = this.A00;
        if (bool != null) {
            i2 = 1;
        } else if (this.A01 != null) {
            i2 = 3;
        } else if (this.A02 != null) {
            i2 = 2;
        } else {
            i2 = 0;
            if (this.A03 != null) {
                i2 = 4;
            }
        }
        parcel.writeInt(i2);
        if (i2 == 1) {
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
            return;
        }
        if (i2 == 2) {
            parcel.writeLong(this.A02.longValue());
        } else if (i2 == 3) {
            parcel.writeDouble(this.A01.doubleValue());
        } else if (i2 == 4) {
            parcel.writeString(this.A03);
        }
    }
}
