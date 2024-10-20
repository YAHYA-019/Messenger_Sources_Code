package com.facebook.messaging.threadview.initparams.metadataprovider.threadviewsource.model;

import X.11T;
import X.5SW;
import X.82M;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: ThreadViewSourceMetadata.class */
public final class ThreadViewSourceMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new 82M(90);
    public final 5SW A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(ThreadViewSourceMetadata.class, null);
    }

    public ThreadViewSourceMetadata(5SW r302) {
        11T.A0F(r302, 1);
        this.A00 = r302;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadViewSourceMetadata) && this.A00 == ((ThreadViewSourceMetadata) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00.name());
    }
}
