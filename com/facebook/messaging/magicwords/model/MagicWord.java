package com.facebook.messaging.magicwords.model;

import X.11T;
import X.82M;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MagicWord.class */
public final class MagicWord implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(38);
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public MagicWord(long j, String str, int i, String str2) {
        this.A01 = j;
        C1pq.A08("emojiString", str);
        this.A02 = str;
        C1pq.A08("keyword", str2);
        this.A03 = str2;
        this.A00 = i;
    }

    public MagicWord(Parcel parcel) {
        getClass().getClassLoader();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MagicWord)) {
                return false;
            }
            MagicWord magicWord = (MagicWord) obj;
            if (this.A01 != magicWord.A01 || !11T.A0O(this.A02, magicWord.A02) || !11T.A0O(this.A03, magicWord.A03) || this.A00 != magicWord.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.A01;
        return (C1pq.A04(this.A03, C1pq.A04(this.A02, ((int) (j ^ (j >>> 32))) + 31)) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
    }
}
