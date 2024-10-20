package com.instagram.common.clips.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BLJ;
import X.DKH;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: LayoutTransform.class */
public final class LayoutTransform implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(87);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final BLJ A06;
    public final boolean A07;

    public LayoutTransform() {
        this(BLJ.A03, 1.0f, 0.0f, 0.0f, 0.0f, 0, 0, false);
    }

    public LayoutTransform(BLJ blj, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        11T.A0F(blj, 6);
        this.A07 = z;
        this.A02 = f;
        this.A00 = f2;
        this.A03 = f3;
        this.A01 = f4;
        this.A06 = blj;
        this.A04 = i;
        this.A05 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LayoutTransform)) {
                return false;
            }
            LayoutTransform layoutTransform = (LayoutTransform) obj;
            if (this.A07 != layoutTransform.A07 || Float.compare(this.A02, layoutTransform.A02) != 0 || Float.compare(this.A00, layoutTransform.A00) != 0 || Float.compare(this.A03, layoutTransform.A03) != 0 || Float.compare(this.A01, layoutTransform.A01) != 0 || this.A06 != layoutTransform.A06 || this.A04 != layoutTransform.A04 || this.A05 != layoutTransform.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A06, 1BL.A00(1BL.A00(1BL.A00(1BL.A00(AnonymousClass002.A00(this.A07 ? 1 : 0) * 31, this.A02), this.A00), this.A03), this.A01)) + this.A04) * 31) + this.A05;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LayoutTransform(hflip=");
        A0k.append(this.A07);
        A0k.append(", scale=");
        A0k.append(this.A02);
        A0k.append(", leftPercentage=");
        A0k.append(this.A00);
        A0k.append(", topPercentage=");
        A0k.append(this.A03);
        A0k.append(", rotationDegrees=");
        A0k.append(this.A01);
        A0k.append(", cropType=");
        A0k.append(this.A06);
        A0k.append(", underlayGradientBottomColor=");
        A0k.append(this.A04);
        A0k.append(", underlayGradientTopColor=");
        return DKH.A0p(A0k, this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A01);
        1BL.A12(parcel, this.A06);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
    }
}
