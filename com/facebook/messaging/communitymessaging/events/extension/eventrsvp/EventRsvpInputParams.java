package com.facebook.messaging.communitymessaging.events.extension.eventrsvp;

import X.11T;
import X.4YW;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: EventRsvpInputParams.class */
public final class EventRsvpInputParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(74);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public EventRsvpInputParams(Parcel parcel) {
        this.A02 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A00 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
    }

    public EventRsvpInputParams(String str, String str2, String str3, long j, long j2) {
        this.A02 = str;
        this.A00 = j;
        C1pq.A08("parentSurface", str2);
        this.A03 = str2;
        C1pq.A08(Property.SYMBOL_Z_ORDER_SOURCE, str3);
        this.A04 = str3;
        this.A01 = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventRsvpInputParams)) {
                return false;
            }
            EventRsvpInputParams eventRsvpInputParams = (EventRsvpInputParams) obj;
            if (!11T.A0O(this.A02, eventRsvpInputParams.A02) || this.A00 != eventRsvpInputParams.A00 || !11T.A0O(this.A03, eventRsvpInputParams.A03) || !11T.A0O(this.A04, eventRsvpInputParams.A04) || this.A01 != eventRsvpInputParams.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A01(C1pq.A03(this.A02), this.A00))), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A02);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
    }
}
