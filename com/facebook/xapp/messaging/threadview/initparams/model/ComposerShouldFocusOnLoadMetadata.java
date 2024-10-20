package com.facebook.xapp.messaging.threadview.initparams.model;

import X.0Pz;
import X.11T;
import X.82N;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;

/* loaded from: ComposerShouldFocusOnLoadMetadata.class */
public final class ComposerShouldFocusOnLoadMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A01;
    public static final Parcelable.Creator CREATOR = new 82N(28);
    public final boolean A00;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A01 = new AnonymousClass207(ComposerShouldFocusOnLoadMetadata.class, null);
    }

    public ComposerShouldFocusOnLoadMetadata() {
        this(false);
    }

    public ComposerShouldFocusOnLoadMetadata(boolean z) {
        this.A00 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ComposerShouldFocusOnLoadMetadata) && this.A00 == ((ComposerShouldFocusOnLoadMetadata) obj).A00);
    }

    public int hashCode() {
        return AnonymousClass002.A00(this.A00 ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A0R("ComposerShouldFocusOnLoadMetadata(shouldFocusOnLoad=", ')', this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
