package com.facebook.inspiration.magicmontage.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.FKf;
import X.QoD;
import X.RMR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.MusicTrackParams;

/* loaded from: InspirationMagicMontageData.class */
public final class InspirationMagicMontageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(39);
    public final int A00;
    public final QoD A01;
    public final MusicTrackParams A02;
    public final String A03;

    public InspirationMagicMontageData(RMR rmr) {
        this.A02 = rmr.A02;
        this.A01 = rmr.A01;
        this.A00 = rmr.A00;
        String str = rmr.A03;
        C1pq.A08("uniqueId", str);
        this.A03 = str;
    }

    public InspirationMagicMontageData(Parcel parcel) {
        QoD qoD = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? QoD.values()[parcel.readInt()] : qoD;
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationMagicMontageData)) {
                return false;
            }
            InspirationMagicMontageData inspirationMagicMontageData = (InspirationMagicMontageData) obj;
            if (!11T.A0O(this.A02, inspirationMagicMontageData.A02) || this.A01 != inspirationMagicMontageData.A01 || this.A00 != inspirationMagicMontageData.A00 || !11T.A0O(this.A03, inspirationMagicMontageData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A02);
        return C1pq.A04(this.A03, (((A03 * 31) + C3o5.A03(this.A01)) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        MusicTrackParams musicTrackParams = this.A02;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        C3o5.A0e(parcel, this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
    }
}
