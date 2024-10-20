package com.facebook.messaging.msys.thread.componentcreator.threadview.initparams;

import X.11T;
import X.82M;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: ThreadViewDisableTitleParamsMetadata.class */
public final class ThreadViewDisableTitleParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new 82M(69);
    public final boolean A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(ThreadViewDisableTitleParamsMetadata.class, null);
    }

    public ThreadViewDisableTitleParamsMetadata(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadViewDisableTitleParamsMetadata) && this.A00 == ((ThreadViewDisableTitleParamsMetadata) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
