package com.facebook.messaging.msys.thread.componentcreator.threadview.initparams;

import X.11T;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: ThreadViewDisableProfileImgParamsMetadata.class */
public final class ThreadViewDisableProfileImgParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new CST(37);
    public final boolean A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(ThreadViewDisableProfileImgParamsMetadata.class, null);
    }

    public ThreadViewDisableProfileImgParamsMetadata(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ThreadViewDisableProfileImgParamsMetadata) && this.A00 == ((ThreadViewDisableProfileImgParamsMetadata) obj).A00);
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
