package com.facebook.messaging.contacts.ranking.logging;

import X.11T;
import X.1BL;
import X.1Du;
import X.3MG;
import X.4YV;
import X.82M;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: RankingLoggingItem.class */
public final class RankingLoggingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(27);
    public final float A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;

    public RankingLoggingItem(3MG r302) {
        this.A02 = r302.A02;
        ImmutableList immutableList = r302.A01;
        C1pq.A08("rawScoreItems", immutableList);
        this.A01 = immutableList;
        this.A03 = r302.A03;
        this.A00 = r302.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RankingLoggingItem(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : null;
        int readInt = parcel.readInt();
        ScoreLoggingItem[] scoreLoggingItemArr = new ScoreLoggingItem[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A01 = ImmutableList.copyOf(scoreLoggingItemArr);
                this.A03 = C3o5.A0O(parcel);
                this.A00 = parcel.readFloat();
                return;
            }
            scoreLoggingItemArr[i2] = parcel.readParcelable(A0e);
            i = i2 + 1;
        }
    }

    public RankingLoggingItem(ImmutableList immutableList, String str, String str2, float f) {
        this.A02 = str;
        C1pq.A08("rawScoreItems", immutableList);
        this.A01 = immutableList;
        this.A03 = str2;
        this.A00 = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RankingLoggingItem)) {
                return false;
            }
            RankingLoggingItem rankingLoggingItem = (RankingLoggingItem) obj;
            if (!11T.A0O(this.A02, rankingLoggingItem.A02) || !11T.A0O(this.A01, rankingLoggingItem.A01) || !11T.A0O(this.A03, rankingLoggingItem.A03) || this.A00 != rankingLoggingItem.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A03(this.A02))) * 31) + Float.floatToIntBits(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ScoreLoggingItem) A0b.next(), i);
        }
        1BL.A13(parcel, this.A03);
        parcel.writeFloat(this.A00);
    }
}
