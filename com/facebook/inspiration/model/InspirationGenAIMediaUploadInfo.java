package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.DKF;
import X.DKG;
import X.DKH;
import X.EMG;
import X.FKf;
import X.QoW;
import X.RMS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;

/* loaded from: InspirationGenAIMediaUploadInfo.class */
public final class InspirationGenAIMediaUploadInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(56);
    public final QoW A00;
    public final EMG A01;
    public final MediaData A02;
    public final String A03;

    public InspirationGenAIMediaUploadInfo(RMS rms) {
        this.A02 = rms.A02;
        this.A03 = rms.A03;
        this.A01 = rms.A01;
        this.A00 = rms.A00;
    }

    public InspirationGenAIMediaUploadInfo(Parcel parcel) {
        QoW qoW = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = DKG.A0Y(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = EMG.values()[parcel.readInt()];
        }
        this.A00 = parcel.readInt() != 0 ? QoW.values()[parcel.readInt()] : qoW;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationGenAIMediaUploadInfo)) {
                return false;
            }
            InspirationGenAIMediaUploadInfo inspirationGenAIMediaUploadInfo = (InspirationGenAIMediaUploadInfo) obj;
            if (!11T.A0O(this.A02, inspirationGenAIMediaUploadInfo.A02) || !11T.A0O(this.A03, inspirationGenAIMediaUploadInfo.A03) || this.A01 != inspirationGenAIMediaUploadInfo.A01 || this.A00 != inspirationGenAIMediaUploadInfo.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A03(this.A02));
        int A03 = (A04 * 31) + C3o5.A03(this.A01);
        return (A03 * 31) + DKF.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKH.A10(parcel, this.A02, i);
        1BL.A13(parcel, this.A03);
        C3o5.A0e(parcel, this.A01);
        C3o5.A0e(parcel, this.A00);
    }
}
