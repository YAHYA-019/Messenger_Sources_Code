package com.facebook.messaging.msys.thread.componentcreator.threadview.initparams;

import X.11T;
import X.7zV;
import X.AnonymousClass001;
import X.AnonymousClass207;
import X.C04v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: MinPrimarySortKeyParamsMetadata.class */
public final class MinPrimarySortKeyParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new CST(36);
    public final Long A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(MinPrimarySortKeyParamsMetadata.class, null);
    }

    public MinPrimarySortKeyParamsMetadata() {
        this(null);
    }

    public MinPrimarySortKeyParamsMetadata(Long l) {
        this.A00 = l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof MinPrimarySortKeyParamsMetadata) && 11T.A0O(this.A00, ((MinPrimarySortKeyParamsMetadata) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A02(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        7zV.A0m(parcel, this.A00);
    }
}
