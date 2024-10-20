package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zU;
import X.AbH;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKa;
import X.GKj;
import X.RaE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;

/* loaded from: InlineMediaPickerState.class */
public final class InlineMediaPickerState implements Parcelable, GKj {
    public static final Parcelable.Creator CREATOR = FKa.A00(90);
    public final int A00;
    public final int A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;

    public InlineMediaPickerState(RaE raE) {
        String str = raE.A04;
        C1pq.A08("folder", str);
        this.A04 = str;
        String str2 = raE.A05;
        C1pq.A08("folderBucketId", str2);
        this.A05 = str2;
        ImmutableList immutableList = raE.A02;
        C1pq.A08("folderIds", immutableList);
        this.A02 = immutableList;
        this.A00 = raE.A00;
        this.A01 = raE.A01;
        ImmutableList immutableList2 = raE.A03;
        C1pq.A08("selectedMedias", immutableList2);
        this.A03 = immutableList2;
    }

    public InlineMediaPickerState(Parcel parcel) {
        this.A04 = 7zU.A0l(parcel, this);
        this.A05 = parcel.readString();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A02 = ImmutableList.copyOf(strArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        int readInt2 = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt2];
        while (i < readInt2) {
            i = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i);
        }
        this.A03 = ImmutableList.copyOf(mediaDataArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InlineMediaPickerState)) {
                return false;
            }
            InlineMediaPickerState inlineMediaPickerState = (InlineMediaPickerState) obj;
            if (!11T.A0O(this.A04, inlineMediaPickerState.A04) || !11T.A0O(this.A05, inlineMediaPickerState.A05) || !11T.A0O(this.A02, inlineMediaPickerState.A02) || this.A00 != inlineMediaPickerState.A00 || this.A01 != inlineMediaPickerState.A01 || !11T.A0O(this.A03, inlineMediaPickerState.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, (((C1pq.A04(this.A02, C1pq.A04(this.A05, C1pq.A03(this.A04))) * 31) + this.A00) * 31) + this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        1Du A0b2 = 1BL.A0b(parcel, this.A03);
        while (A0b2.hasNext()) {
            DKG.A1I(parcel, A0b2, i);
        }
    }
}
