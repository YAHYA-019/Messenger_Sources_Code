package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EventsShareMetadataParam.class */
public final class EventsShareMetadataParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(83);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public EventsShareMetadataParam(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public EventsShareMetadataParam(String str, String str2, String str3, String str4, String str5) {
        C1pq.A08("eventId", str);
        this.A00 = str;
        C1pq.A08("mechanism", str2);
        this.A01 = str2;
        C1pq.A08("refMechanism", str3);
        this.A02 = str3;
        C1pq.A08("refSurface", str4);
        this.A03 = str4;
        C1pq.A08("surface", str5);
        this.A04 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventsShareMetadataParam)) {
                return false;
            }
            EventsShareMetadataParam eventsShareMetadataParam = (EventsShareMetadataParam) obj;
            if (!11T.A0O(this.A00, eventsShareMetadataParam.A00) || !11T.A0O(this.A01, eventsShareMetadataParam.A01) || !11T.A0O(this.A02, eventsShareMetadataParam.A02) || !11T.A0O(this.A03, eventsShareMetadataParam.A03) || !11T.A0O(this.A04, eventsShareMetadataParam.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }
}
