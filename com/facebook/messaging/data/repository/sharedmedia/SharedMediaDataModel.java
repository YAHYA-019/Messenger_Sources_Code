package com.facebook.messaging.data.repository.sharedmedia;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.C5xo;
import X.C5xp;
import X.CSQ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.sharedimage.SharedMedia;
import com.google.common.collect.ImmutableList;

/* loaded from: SharedMediaDataModel.class */
public final class SharedMediaDataModel implements Parcelable, C5xo {
    public static final Parcelable.Creator CREATOR = new CSQ(32);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public SharedMediaDataModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        SharedMedia[] sharedMediaArr = new SharedMedia[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, sharedMediaArr, i);
        }
        this.A00 = ImmutableList.copyOf(sharedMediaArr);
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public SharedMediaDataModel(ImmutableList immutableList, String str, String str2) {
        C1pq.A08("data", immutableList);
        this.A00 = immutableList;
        this.A03 = "";
        C1pq.A08("mediaType", str);
        this.A01 = str;
        this.A02 = str2;
        C5xp.A00(this);
    }

    @Override // X.C5xo
    public String AlZ() {
        return this.A03;
    }

    @Override // X.C5xo
    public String BCK() {
        return this.A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SharedMediaDataModel)) {
                return false;
            }
            SharedMediaDataModel sharedMediaDataModel = (SharedMediaDataModel) obj;
            if (!11T.A0O(this.A00, sharedMediaDataModel.A00) || !11T.A0O(this.A03, sharedMediaDataModel.A03) || !11T.A0O(this.A01, sharedMediaDataModel.A01) || !11T.A0O(this.A02, sharedMediaDataModel.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((SharedMedia) A0b.next(), i);
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
