package com.facebook.locationsharing.core.models;

import X.11T;
import X.1BL;
import X.4YV;
import X.4YW;
import X.C1pq;
import X.CSR;
import X.DKH;
import X.HiA;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LiveLocationSharer.class */
public final class LiveLocationSharer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(67);
    public final long A00;
    public final Location A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public LiveLocationSharer(HiA hiA) {
        this.A00 = hiA.A00;
        String str = hiA.A02;
        C1pq.A08("fullAddress", str);
        this.A02 = str;
        Location location = hiA.A01;
        C1pq.A08("location", location);
        this.A01 = location;
        this.A03 = hiA.A03;
        String str2 = hiA.A04;
        C1pq.A08("userId", str2);
        this.A04 = str2;
        String str3 = hiA.A05;
        C1pq.A08("userName", str3);
        this.A05 = str3;
    }

    public LiveLocationSharer(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A01 = (Location) parcel.readParcelable(A0e);
        this.A03 = DKH.A0l(parcel);
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveLocationSharer)) {
                return false;
            }
            LiveLocationSharer liveLocationSharer = (LiveLocationSharer) obj;
            if (this.A00 != liveLocationSharer.A00 || !11T.A0O(this.A02, liveLocationSharer.A02) || !11T.A0O(this.A01, liveLocationSharer.A01) || !11T.A0O(this.A03, liveLocationSharer.A03) || !11T.A0O(this.A04, liveLocationSharer.A04) || !11T.A0O(this.A05, liveLocationSharer.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A04(this.A02, 1BL.A01(this.A00) + 31)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        4YW.A0E(parcel, this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }
}
