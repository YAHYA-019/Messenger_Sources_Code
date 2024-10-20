package com.facebook.messaging.communitymessaging.communitynotificationsettings.threadsummary.model;

import X.11T;
import X.1BL;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: CommunityMutedMetadata.class */
public final class CommunityMutedMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new C2xc(14);
    public final long A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(CommunityMutedMetadata.class, null);
    }

    public CommunityMutedMetadata(long j) {
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CommunityMutedMetadata) && this.A00 == ((CommunityMutedMetadata) obj).A00);
    }

    public int hashCode() {
        return 1BL.A01(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeLong(this.A00);
    }
}
