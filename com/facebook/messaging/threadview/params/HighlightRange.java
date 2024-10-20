package com.facebook.messaging.threadview.params;

import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: HighlightRange.class */
public final class HighlightRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(81);
    public final int A00;
    public final int A01;

    public HighlightRange(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public HighlightRange(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HighlightRange)) {
                return false;
            }
            HighlightRange highlightRange = (HighlightRange) obj;
            if (this.A00 != highlightRange.A00 || this.A01 != highlightRange.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A00 + 31) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
