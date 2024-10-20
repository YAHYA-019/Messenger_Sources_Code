package com.facebook.ipc.inspiration.model;

import X.11T;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CSR;
import X.DKG;
import X.DKH;
import X.MRl;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.facebook.photos.creativeediting.model.VideoTrimParams;

/* loaded from: InspirationProcessedMediaData.class */
public final class InspirationProcessedMediaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(42);
    public final MediaData A00;
    public final VideoTrimParams A01;
    public final Boolean A02;

    public InspirationProcessedMediaData(Parcel parcel) {
        VideoTrimParams videoTrimParams = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A02 = null;
        } else {
            this.A02 = Boolean.valueOf(AbN.A1U(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = DKG.A0Y(parcel);
        }
        this.A01 = parcel.readInt() != 0 ? (VideoTrimParams) VideoTrimParams.CREATOR.createFromParcel(parcel) : videoTrimParams;
    }

    public InspirationProcessedMediaData(MediaData mediaData, VideoTrimParams videoTrimParams, Boolean bool) {
        this.A02 = bool;
        this.A00 = mediaData;
        this.A01 = videoTrimParams;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationProcessedMediaData)) {
                return false;
            }
            InspirationProcessedMediaData inspirationProcessedMediaData = (InspirationProcessedMediaData) obj;
            if (!11T.A0O(this.A02, inspirationProcessedMediaData.A02) || !11T.A0O(this.A00, inspirationProcessedMediaData.A00) || !11T.A0O(this.A01, inspirationProcessedMediaData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbN.A0s(parcel, this.A02);
        DKH.A10(parcel, this.A00, i);
        MRl.A0P(parcel, this.A01, i);
    }
}
