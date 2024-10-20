package com.facebook.ipc.media.data;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKG;
import X.DKH;
import X.EKy;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.rect.PersistableRect;

/* loaded from: OriginalMediaData.class */
public final class OriginalMediaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(50);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final EKy A06;
    public final PersistableRect A07;
    public final String A08;

    public OriginalMediaData(EKy eKy, PersistableRect persistableRect, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A07 = persistableRect;
        this.A00 = i;
        C1pq.A08("mediaId", str);
        this.A08 = str;
        this.A06 = eKy;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
    }

    public OriginalMediaData(Parcel parcel) {
        EKy eKy = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A07 = null;
        } else {
            this.A07 = DKG.A0o(parcel);
        }
        this.A00 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A06 = parcel.readInt() != 0 ? EKy.values()[parcel.readInt()] : eKy;
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OriginalMediaData)) {
                return false;
            }
            OriginalMediaData originalMediaData = (OriginalMediaData) obj;
            if (!11T.A0O(this.A07, originalMediaData.A07) || this.A00 != originalMediaData.A00 || !11T.A0O(this.A08, originalMediaData.A08) || this.A06 != originalMediaData.A06 || this.A01 != originalMediaData.A01 || this.A02 != originalMediaData.A02 || this.A03 != originalMediaData.A03 || this.A04 != originalMediaData.A04 || this.A05 != originalMediaData.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A08, (C1pq.A03(this.A07) * 31) + this.A00);
        return (((((((((((A04 * 31) + C3o5.A03(this.A06)) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04) * 31) + this.A05;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("OriginalMediaData{cropBoxPercentage=");
        A0k.append(this.A07);
        A0k.append(", height=");
        A0k.append(this.A00);
        A0k.append(", mediaId=");
        A0k.append(this.A08);
        A0k.append(", mediaType=");
        A0k.append(this.A06);
        A0k.append(", orientation=");
        A0k.append(this.A01);
        A0k.append(", postCaptureSnapshotHeight=");
        A0k.append(this.A02);
        A0k.append(", postCaptureSnapshotWidth=");
        A0k.append(this.A03);
        A0k.append(", rotationDegree=");
        A0k.append(this.A04);
        A0k.append(", width=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A11(parcel, this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        C3o5.A0e(parcel, this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
    }
}
