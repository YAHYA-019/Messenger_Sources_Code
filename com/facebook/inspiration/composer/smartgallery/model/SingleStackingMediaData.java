package com.facebook.inspiration.composer.smartgallery.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKf;
import X.RIL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;

/* loaded from: SingleStackingMediaData.class */
public final class SingleStackingMediaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(24);
    public final int A00;
    public final ImmutableList A01;

    public SingleStackingMediaData(RIL ril) {
        ImmutableList immutableList = ril.A01;
        C1pq.A08("mediasInStack", immutableList);
        this.A01 = immutableList;
        this.A00 = ril.A00;
    }

    public SingleStackingMediaData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        MediaData[] mediaDataArr = new MediaData[A01];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                this.A01 = ImmutableList.copyOf(mediaDataArr);
                this.A00 = parcel.readInt();
                return;
            }
            i = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SingleStackingMediaData)) {
                return false;
            }
            SingleStackingMediaData singleStackingMediaData = (SingleStackingMediaData) obj;
            if (!11T.A0O(this.A01, singleStackingMediaData.A01) || this.A00 != singleStackingMediaData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A03(this.A01) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
        parcel.writeInt(this.A00);
    }
}
