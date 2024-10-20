package com.facebook.messaging.pinnedmessages.model;

import X.82M;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PinnedMessageMetadata.class */
public final class PinnedMessageMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(77);
    public final long A00;
    public final PinnedMessageLocation A01;

    public PinnedMessageMetadata(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : PinnedMessageLocation.values()[parcel.readInt()];
        this.A00 = parcel.readLong();
    }

    public PinnedMessageMetadata(PinnedMessageLocation pinnedMessageLocation, long j) {
        this.A01 = pinnedMessageLocation;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PinnedMessageMetadata)) {
                return false;
            }
            PinnedMessageMetadata pinnedMessageMetadata = (PinnedMessageMetadata) obj;
            if (this.A01 != pinnedMessageMetadata.A01 || this.A00 != pinnedMessageMetadata.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        PinnedMessageLocation pinnedMessageLocation = this.A01;
        return C1pq.A01((pinnedMessageLocation == null ? -1 : pinnedMessageLocation.ordinal()) + 31, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        PinnedMessageLocation pinnedMessageLocation = this.A01;
        if (pinnedMessageLocation == null) {
            ordinal = 0;
        } else {
            parcel.writeInt(1);
            ordinal = pinnedMessageLocation.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeLong(this.A00);
    }
}
