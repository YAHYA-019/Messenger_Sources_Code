package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.AbN;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InteractiveOverlayStickerData.class */
public final class InteractiveOverlayStickerData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(93);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final boolean A06;

    public InteractiveOverlayStickerData(Parcel parcel) {
        this.A05 = 7zU.A0l(parcel, this);
        this.A06 = AbN.A1U(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
    }

    public InteractiveOverlayStickerData(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        C1pq.A08("imageString", str);
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InteractiveOverlayStickerData)) {
                return false;
            }
            InteractiveOverlayStickerData interactiveOverlayStickerData = (InteractiveOverlayStickerData) obj;
            if (!11T.A0O(this.A05, interactiveOverlayStickerData.A05) || this.A06 != interactiveOverlayStickerData.A06 || this.A00 != interactiveOverlayStickerData.A00 || this.A01 != interactiveOverlayStickerData.A01 || this.A02 != interactiveOverlayStickerData.A02 || this.A03 != interactiveOverlayStickerData.A03 || this.A04 != interactiveOverlayStickerData.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((C1pq.A02(C1pq.A03(this.A05), this.A06) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
    }
}
