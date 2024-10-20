package com.facebook.xapp.messaging.polls.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PollVoter.class */
public final class PollVoter implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(56);
    public final long A00;
    public final String A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final String A05;

    public PollVoter(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A02 = parcel.readLong();
        this.A03 = parcel.readLong();
        this.A05 = C3o5.A0O(parcel);
        this.A04 = parcel.readLong();
    }

    public PollVoter(String str, String str2, long j, long j2, long j3, long j4) {
        this.A00 = j;
        this.A01 = str;
        this.A02 = j2;
        this.A03 = j3;
        this.A05 = str2;
        this.A04 = j4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollVoter)) {
                return false;
            }
            PollVoter pollVoter = (PollVoter) obj;
            if (this.A00 != pollVoter.A00 || !11T.A0O(this.A01, pollVoter.A01) || this.A02 != pollVoter.A02 || this.A03 != pollVoter.A03 || !11T.A0O(this.A05, pollVoter.A05) || this.A04 != pollVoter.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A05, C1pq.A01(C1pq.A01(C1pq.A04(this.A01, 1BL.A01(this.A00) + 31), this.A02), this.A03)), this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        1BL.A13(parcel, this.A01);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A03);
        1BL.A13(parcel, this.A05);
        parcel.writeLong(this.A04);
    }
}
