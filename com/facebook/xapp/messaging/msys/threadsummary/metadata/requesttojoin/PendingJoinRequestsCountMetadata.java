package com.facebook.xapp.messaging.msys.threadsummary.metadata.requesttojoin;

import X.11T;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: PendingJoinRequestsCountMetadata.class */
public final class PendingJoinRequestsCountMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new C2xc(67);
    public final long A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(PendingJoinRequestsCountMetadata.class, null);
    }

    public PendingJoinRequestsCountMetadata(long j) {
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PendingJoinRequestsCountMetadata) && this.A00 == ((PendingJoinRequestsCountMetadata) obj).A00);
    }

    public int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
    }
}
