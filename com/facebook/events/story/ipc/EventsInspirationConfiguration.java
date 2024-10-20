package com.facebook.events.story.ipc;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EventsInspirationConfiguration.class */
public final class EventsInspirationConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(65);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;

    public EventsInspirationConfiguration(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        this.A0B = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A0C = C3o5.A0O(parcel);
        this.A0D = AbN.A1U(parcel);
    }

    public EventsInspirationConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, boolean z) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A09 = str8;
        this.A0A = str9;
        this.A0B = str10;
        this.A0C = str11;
        this.A0D = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventsInspirationConfiguration)) {
                return false;
            }
            EventsInspirationConfiguration eventsInspirationConfiguration = (EventsInspirationConfiguration) obj;
            if (this.A00 != eventsInspirationConfiguration.A00 || !11T.A0O(this.A02, eventsInspirationConfiguration.A02) || this.A01 != eventsInspirationConfiguration.A01 || !11T.A0O(this.A03, eventsInspirationConfiguration.A03) || !11T.A0O(this.A04, eventsInspirationConfiguration.A04) || !11T.A0O(this.A05, eventsInspirationConfiguration.A05) || !11T.A0O(this.A06, eventsInspirationConfiguration.A06) || !11T.A0O(this.A07, eventsInspirationConfiguration.A07) || !11T.A0O(this.A08, eventsInspirationConfiguration.A08) || !11T.A0O(this.A09, eventsInspirationConfiguration.A09) || !11T.A0O(this.A0A, eventsInspirationConfiguration.A0A) || !11T.A0O(this.A0B, eventsInspirationConfiguration.A0B) || !11T.A0O(this.A0C, eventsInspirationConfiguration.A0C) || this.A0D != eventsInspirationConfiguration.A0D) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, (C1pq.A04(this.A02, this.A00 + 31) * 31) + this.A01)))))))))), this.A0D);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A01);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        1BL.A13(parcel, this.A06);
        1BL.A13(parcel, this.A07);
        1BL.A13(parcel, this.A08);
        1BL.A13(parcel, this.A09);
        1BL.A13(parcel, this.A0A);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        parcel.writeInt(this.A0D ? 1 : 0);
    }
}
