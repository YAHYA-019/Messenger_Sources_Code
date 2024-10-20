package com.facebook.ui.media.attachments.model.music;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKe;
import X.MRk;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MusicMetaData.class */
public final class MusicMetaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(88);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public MusicMetaData(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public MusicMetaData(String str, String str2, String str3, int i) {
        C1pq.A08("assetId", str);
        this.A01 = str;
        C1pq.A08("musicBrowseSessionId", str2);
        this.A02 = str2;
        C1pq.A08(MRk.A00(66), str3);
        this.A03 = str3;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MusicMetaData)) {
                return false;
            }
            MusicMetaData musicMetaData = (MusicMetaData) obj;
            if (!11T.A0O(this.A01, musicMetaData.A01) || !11T.A0O(this.A02, musicMetaData.A02) || !11T.A0O(this.A03, musicMetaData.A03) || this.A00 != musicMetaData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
    }
}
