package com.facebook.messaging.inboxfolders.model;

import X.7zL;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FoldersEmptyStateDecorImage.class */
public final class FoldersEmptyStateDecorImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(83);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public FoldersEmptyStateDecorImage(int i, int i2, int i3, int i4) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public FoldersEmptyStateDecorImage(Parcel parcel) {
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
            if (!(obj instanceof FoldersEmptyStateDecorImage)) {
                return false;
            }
            FoldersEmptyStateDecorImage foldersEmptyStateDecorImage = (FoldersEmptyStateDecorImage) obj;
            if (this.A00 != foldersEmptyStateDecorImage.A00 || this.A01 != foldersEmptyStateDecorImage.A01 || this.A02 != foldersEmptyStateDecorImage.A02 || this.A03 != foldersEmptyStateDecorImage.A03) {
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
