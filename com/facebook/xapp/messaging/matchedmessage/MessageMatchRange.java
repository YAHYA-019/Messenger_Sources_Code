package com.facebook.xapp.messaging.matchedmessage;

import X.0Pz;
import X.3LG;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MessageMatchRange.class */
public final class MessageMatchRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(53);
    public final int A00;
    public final int A01;

    public MessageMatchRange(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public MessageMatchRange(3LG r302) {
        this.A00 = r302.A00;
        this.A01 = r302.A01;
    }

    public MessageMatchRange(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MessageMatchRange)) {
                return false;
            }
            MessageMatchRange messageMatchRange = (MessageMatchRange) obj;
            if (this.A00 != messageMatchRange.A00 || this.A01 != messageMatchRange.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }

    public String toString() {
        return 0Pz.A0o("MessageMatchRange{length=", ", offset=", "}", this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
