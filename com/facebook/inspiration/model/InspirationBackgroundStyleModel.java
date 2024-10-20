package com.facebook.inspiration.model;

import X.11T;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.DKI;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;

/* loaded from: InspirationBackgroundStyleModel.class */
public final class InspirationBackgroundStyleModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(46);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final MediaData A05;
    public final boolean A06;
    public final boolean A07;

    public InspirationBackgroundStyleModel(Parcel parcel) {
        this.A06 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A07 = AbJ.A1W(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt() == 0 ? null : DKG.A0Y(parcel);
    }

    public InspirationBackgroundStyleModel(MediaData mediaData, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.A06 = z;
        this.A07 = z2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = mediaData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationBackgroundStyleModel)) {
                return false;
            }
            InspirationBackgroundStyleModel inspirationBackgroundStyleModel = (InspirationBackgroundStyleModel) obj;
            if (this.A06 != inspirationBackgroundStyleModel.A06 || this.A07 != inspirationBackgroundStyleModel.A07 || this.A00 != inspirationBackgroundStyleModel.A00 || this.A01 != inspirationBackgroundStyleModel.A01 || this.A02 != inspirationBackgroundStyleModel.A02 || this.A03 != inspirationBackgroundStyleModel.A03 || this.A04 != inspirationBackgroundStyleModel.A04 || !11T.A0O(this.A05, inspirationBackgroundStyleModel.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, (((((((((C1pq.A02(C1pq.A05(this.A06), this.A07) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A04);
        DKI.A0Q(parcel, this.A05, i);
    }
}
