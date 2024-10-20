package com.facebook.payments.invoice.creation.v2.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SourcedImagesData.class */
public final class SourcedImagesData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(58);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;

    public SourcedImagesData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        ImageData[] imageDataArr = new ImageData[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, imageDataArr, i2);
        }
        this.A00 = ImmutableList.copyOf(imageDataArr);
        int readInt2 = parcel.readInt();
        ImageData[] imageDataArr2 = new ImageData[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, imageDataArr2, i3);
        }
        this.A01 = ImmutableList.copyOf(imageDataArr2);
        int readInt3 = parcel.readInt();
        ImageData[] imageDataArr3 = new ImageData[readInt3];
        while (i < readInt3) {
            i = AbI.A01(parcel, A0e, imageDataArr3, i);
        }
        this.A02 = ImmutableList.copyOf(imageDataArr3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SourcedImagesData)) {
                return false;
            }
            SourcedImagesData sourcedImagesData = (SourcedImagesData) obj;
            if (!11T.A0O(this.A00, sourcedImagesData.A00) || !11T.A0O(this.A01, sourcedImagesData.A01) || !11T.A0O(this.A02, sourcedImagesData.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ImageData) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((ImageData) A0b2.next(), i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A02);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((ImageData) A0b3.next(), i);
        }
    }
}
