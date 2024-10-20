package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YW;
import X.7zU;
import X.C1pq;
import X.DKG;
import X.DKH;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;

/* loaded from: GoodwillVideo.class */
public final class GoodwillVideo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(89);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;

    public GoodwillVideo(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = DKH.A0l(parcel);
        int readInt = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = ImmutableList.copyOf(mediaDataArr);
                return;
            }
            i = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i2);
        }
    }

    public GoodwillVideo(ImmutableList immutableList, String str, String str2) {
        C1pq.A08("campaignId", str);
        this.A01 = str;
        this.A02 = str2;
        C1pq.A08("uploadMedia", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GoodwillVideo)) {
                return false;
            }
            GoodwillVideo goodwillVideo = (GoodwillVideo) obj;
            if (!11T.A0O(this.A01, goodwillVideo.A01) || !11T.A0O(this.A02, goodwillVideo.A02) || !11T.A0O(this.A00, goodwillVideo.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A04(this.A02, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        4YW.A0E(parcel, this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            DKG.A1I(parcel, A0b, i);
        }
    }
}
