package com.facebook.messaging.groups.members.model;

import X.7zL;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: EmptyStateDecorImage.class */
public final class EmptyStateDecorImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(73);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public EmptyStateDecorImage() {
        this.A00 = 2132345665;
        this.A01 = 2132345666;
        this.A02 = 2132475991;
        this.A03 = 2132475992;
    }

    public EmptyStateDecorImage(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EmptyStateDecorImage)) {
                return false;
            }
            EmptyStateDecorImage emptyStateDecorImage = (EmptyStateDecorImage) obj;
            if (this.A00 != emptyStateDecorImage.A00 || this.A01 != emptyStateDecorImage.A01 || this.A02 != emptyStateDecorImage.A02 || this.A03 != emptyStateDecorImage.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.A00 + 31) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
    }
}
