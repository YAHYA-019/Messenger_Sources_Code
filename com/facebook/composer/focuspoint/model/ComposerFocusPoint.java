package com.facebook.composer.focuspoint.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.DKf;
import X.MRl;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerFocusPoint.class */
public final class ComposerFocusPoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(98);
    public final Float A00;
    public final Float A01;

    public ComposerFocusPoint(Parcel parcel) {
        Float f = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = MRl.A0I(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? MRl.A0I(parcel) : f;
    }

    public ComposerFocusPoint(Float f, Float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerFocusPoint)) {
                return false;
            }
            ComposerFocusPoint composerFocusPoint = (ComposerFocusPoint) obj;
            if (!11T.A0O(this.A00, composerFocusPoint.A00) || !11T.A0O(this.A01, composerFocusPoint.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A12(parcel, this.A00);
        DKH.A12(parcel, this.A01);
    }
}
