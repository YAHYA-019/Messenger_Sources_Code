package com.facebook.locationsharing.core.models;

import X.11T;
import X.1BL;
import X.4YV;
import X.4YW;
import X.AbE;
import X.AnonymousClass001;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LiveLocationSession.class */
public final class LiveLocationSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(66);
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public LiveLocationSession(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() == 0 ? null : parcel.readString();
        this.A06 = 4YV.A1U(parcel.readInt());
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A05 = parcel.readString();
    }

    public LiveLocationSession(String str, String str2, String str3, String str4, long j, long j2, boolean z) {
        this.A00 = j;
        C1pq.A08("groupishId", str);
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z;
        C1pq.A08("sessionId", str3);
        this.A04 = str3;
        this.A01 = j2;
        C1pq.A08("userAliasId", str4);
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveLocationSession)) {
                return false;
            }
            LiveLocationSession liveLocationSession = (LiveLocationSession) obj;
            if (this.A00 != liveLocationSession.A00 || !11T.A0O(this.A02, liveLocationSession.A02) || !11T.A0O(this.A03, liveLocationSession.A03) || this.A06 != liveLocationSession.A06 || !11T.A0O(this.A04, liveLocationSession.A04) || this.A01 != liveLocationSession.A01 || !11T.A0O(this.A05, liveLocationSession.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A01(C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, 1BL.A01(this.A00) + 31)), this.A06)), this.A01));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LiveLocationSession{expirationTimeMillis=");
        A0k.append(this.A00);
        A0k.append(", groupishId=");
        A0k.append(this.A02);
        A0k.append(AbE.A00(31));
        A0k.append(this.A03);
        A0k.append(", optimisticSessionId=");
        A0k.append(this.A06);
        A0k.append(", sessionId=");
        A0k.append(this.A04);
        A0k.append(", startTimeMillis=");
        A0k.append(this.A01);
        A0k.append(", userAliasId=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A02);
        4YW.A0E(parcel, this.A03);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
    }
}
