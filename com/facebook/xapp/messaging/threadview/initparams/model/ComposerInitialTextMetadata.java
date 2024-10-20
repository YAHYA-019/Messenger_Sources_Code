package com.facebook.xapp.messaging.threadview.initparams.model;

import X.0Pz;
import X.11T;
import X.1BL;
import X.82N;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: ComposerInitialTextMetadata.class */
public final class ComposerInitialTextMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new 82N(27);
    public final String A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(ComposerInitialTextMetadata.class, null);
    }

    public ComposerInitialTextMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerInitialTextMetadata) && 11T.A0O(this.A00, ((ComposerInitialTextMetadata) obj).A00));
    }

    public int hashCode() {
        return 1BL.A05(this.A00);
    }

    public String toString() {
        return 0Pz.A0X("ComposerInitialTextMetadata(initialText=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
