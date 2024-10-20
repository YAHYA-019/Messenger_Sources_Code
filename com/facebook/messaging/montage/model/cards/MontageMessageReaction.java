package com.facebook.messaging.montage.model.cards;

import X.4YU;
import X.82M;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* loaded from: MontageMessageReaction.class */
public final class MontageMessageReaction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(59);
    public final long A00;
    public final long A01;
    public final String A02;

    public MontageMessageReaction(Parcel parcel) {
        String readString = parcel.readString();
        this.A02 = readString == null ? "" : readString;
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
    }

    public MontageMessageReaction(String str, long j, long j2) {
        str.getClass();
        this.A02 = str;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MontageMessageReaction montageMessageReaction = (MontageMessageReaction) obj;
            if (this.A00 != montageMessageReaction.A00 || this.A01 != montageMessageReaction.A01 || !Objects.equal(this.A02, montageMessageReaction.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.A02, Long.valueOf(this.A00), Long.valueOf(this.A01));
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("emoji", this.A02);
        stringHelper.add("offset", this.A00);
        stringHelper.add("timestamp", this.A01);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
