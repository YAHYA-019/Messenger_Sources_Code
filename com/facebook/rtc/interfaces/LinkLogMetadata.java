package com.facebook.rtc.interfaces;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LinkLogMetadata.class */
public final class LinkLogMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(91);
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public LinkLogMetadata(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
        this.A00 = parcel.readLong();
    }

    public LinkLogMetadata(String str, long j, String str2, String str3, String str4, String str5) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LinkLogMetadata)) {
                return false;
            }
            LinkLogMetadata linkLogMetadata = (LinkLogMetadata) obj;
            if (!11T.A0O(this.A01, linkLogMetadata.A01) || !11T.A0O(this.A02, linkLogMetadata.A02) || !11T.A0O(this.A03, linkLogMetadata.A03) || !11T.A0O(this.A04, linkLogMetadata.A04) || !11T.A0O(this.A05, linkLogMetadata.A05) || this.A00 != linkLogMetadata.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))))), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeLong(this.A00);
    }
}
