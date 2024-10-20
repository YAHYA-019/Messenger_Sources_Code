package com.facebook.xapp.messaging.msys.threadsummary.metadata.thread;

import X.11T;
import X.AnonymousClass203;
import X.AnonymousClass207;
import X.C04v;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: MsysThreadTypeMetadata.class */
public final class MsysThreadTypeMetadata extends C04v implements Parcelable, AnonymousClass203 {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new C2xc(68);
    public final int A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(MsysThreadTypeMetadata.class, null);
    }

    public MsysThreadTypeMetadata(int i) {
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MsysThreadTypeMetadata) && this.A00 == ((MsysThreadTypeMetadata) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
    }
}
