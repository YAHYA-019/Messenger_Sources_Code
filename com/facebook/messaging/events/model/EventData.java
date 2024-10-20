package com.facebook.messaging.events.model;

import X.C1pq;
import X.C4Ny;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EventData.class */
public final class EventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(8);
    public final long A00;
    public final long A01;

    public EventData(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }

    public EventData(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventData)) {
                return false;
            }
            EventData eventData = (EventData) obj;
            if (this.A00 != eventData.A00 || this.A01 != eventData.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return C1pq.A01(((int) (j ^ (j >>> 32))) + 31, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }
}
