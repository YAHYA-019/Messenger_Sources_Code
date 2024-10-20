package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YW;
import X.AbH;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MetaGalleryMediaPublishingData.class */
public final class MetaGalleryMediaPublishingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(98);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final String A03;

    public MetaGalleryMediaPublishingData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        int i2 = 0;
        while (i2 < A01) {
            i2 = AbH.A00(parcel, strArr, i2);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A02 = parcel.readString();
        int readInt = parcel.readInt();
        String[] strArr2 = new String[readInt];
        while (i < readInt) {
            i = AbH.A00(parcel, strArr2, i);
        }
        this.A01 = ImmutableList.copyOf(strArr2);
        this.A03 = AbK.A15(parcel, parcel.readInt());
    }

    public MetaGalleryMediaPublishingData(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2) {
        C1pq.A08("horizonWorldIds", immutableList);
        this.A00 = immutableList;
        C1pq.A08("mediaSource", str);
        this.A02 = str;
        C1pq.A08("photoHubMediaIds", immutableList2);
        this.A01 = immutableList2;
        this.A03 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MetaGalleryMediaPublishingData)) {
                return false;
            }
            MetaGalleryMediaPublishingData metaGalleryMediaPublishingData = (MetaGalleryMediaPublishingData) obj;
            if (!11T.A0O(this.A00, metaGalleryMediaPublishingData.A00) || !11T.A0O(this.A02, metaGalleryMediaPublishingData.A02) || !11T.A0O(this.A01, metaGalleryMediaPublishingData.A01) || !11T.A0O(this.A03, metaGalleryMediaPublishingData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeString(this.A02);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        4YW.A0E(parcel, this.A03);
    }
}
