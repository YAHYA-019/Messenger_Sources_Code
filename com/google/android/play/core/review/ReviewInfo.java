package com.google.android.play.core.review;

import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ReviewInfo.class */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(82);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza zzaVar = (zza) this;
        parcel.writeParcelable(zzaVar.A00, 0);
        parcel.writeInt(zzaVar.A01 ? 1 : 0);
    }
}
