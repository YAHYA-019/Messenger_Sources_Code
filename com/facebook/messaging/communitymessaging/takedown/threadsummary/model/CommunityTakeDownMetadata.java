package com.facebook.messaging.communitymessaging.takedown.threadsummary.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import X.C20M;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: CommunityTakeDownMetadata.class */
public final class CommunityTakeDownMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A02;
    public static final Parcelable.Creator CREATOR = new C2xc(17);
    public final boolean A00;
    public final C20M A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(CommunityTakeDownMetadata.class, null);
    }

    public CommunityTakeDownMetadata(C20M c20m) {
        11T.A0F(c20m, 1);
        this.A01 = c20m;
        this.A00 = AnonymousClass001.A1W(c20m, C20M.A03);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CommunityTakeDownMetadata) && this.A01 == ((CommunityTakeDownMetadata) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A01);
    }
}
