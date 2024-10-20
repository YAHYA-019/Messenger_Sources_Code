package com.facebook.stickers.service.models;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchTrendingStickersMessengerResult.class */
public final class FetchTrendingStickersMessengerResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(58);
    public final ImmutableList A00;
    public final String A01;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchTrendingStickersMessengerResult(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        int readInt = parcel.readInt();
        Sticker[] stickerArr = new Sticker[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = ImmutableList.copyOf(stickerArr);
                return;
            } else {
                stickerArr[i2] = Sticker.CREATOR.createFromParcel(parcel);
                i = i2 + 1;
            }
        }
    }

    public FetchTrendingStickersMessengerResult(ImmutableList immutableList, String str) {
        C1pq.A08("mnetRequestId", str);
        this.A01 = str;
        C1pq.A08("trendingStickers", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FetchTrendingStickersMessengerResult)) {
                return false;
            }
            FetchTrendingStickersMessengerResult fetchTrendingStickersMessengerResult = (FetchTrendingStickersMessengerResult) obj;
            if (!11T.A0O(this.A01, fetchTrendingStickersMessengerResult.A01) || !11T.A0O(this.A00, fetchTrendingStickersMessengerResult.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            ((Sticker) A0b.next()).writeToParcel(parcel, i);
        }
    }
}
