package com.facebook.smartcapture.camera.sizesetter;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FixedSizes.class */
public final class FixedSizes implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(20);
    public final Size A00;
    public final Size A01;
    public final boolean A02;

    public FixedSizes(Size size, Size size2, boolean z) {
        1BL.A1F(size, size2);
        this.A00 = size;
        this.A01 = size2;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FixedSizes)) {
                return false;
            }
            FixedSizes fixedSizes = (FixedSizes) obj;
            if (!11T.A0O(this.A00, fixedSizes.A00) || !11T.A0O(this.A01, fixedSizes.A01) || this.A02 != fixedSizes.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, 1BL.A03(this.A00)) + AnonymousClass002.A00(this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FixedSizes(photoSize=");
        A0k.append(this.A00);
        A0k.append(", previewSize=");
        A0k.append(this.A01);
        A0k.append(", autoCapture=");
        return DKH.A0q(A0k, this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        this.A00.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
