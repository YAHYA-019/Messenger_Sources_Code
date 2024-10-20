package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbI;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKE;
import X.DKG;
import X.DKH;
import X.FKf;
import X.RaH;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.media.data.MediaData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: InspirationFbShortsGallerySelectedMediasModel.class */
public final class InspirationFbShortsGallerySelectedMediasModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(52);
    public final int A00;
    public final int A01;
    public final int A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableMap A06;
    public final boolean A07;

    public InspirationFbShortsGallerySelectedMediasModel(RaH raH) {
        ImmutableList immutableList = raH.A03;
        C1pq.A08("positionIndices", immutableList);
        this.A03 = immutableList;
        this.A07 = raH.A07;
        this.A00 = raH.A00;
        this.A01 = raH.A01;
        this.A02 = raH.A02;
        ImmutableList immutableList2 = raH.A04;
        C1pq.A08("selectedMediaData", immutableList2);
        this.A04 = immutableList2;
        ImmutableList immutableList3 = raH.A05;
        C1pq.A08("selectedMediaIds", immutableList3);
        this.A05 = immutableList3;
        ImmutableMap immutableMap = raH.A06;
        C1pq.A08("selectedMediaMap", immutableMap);
        this.A06 = immutableMap;
    }

    public InspirationFbShortsGallerySelectedMediasModel(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        Integer[] numArr = new Integer[A01];
        for (int i = 0; i < A01; i++) {
            numArr[i] = AbI.A0z(parcel);
        }
        this.A03 = ImmutableList.copyOf(numArr);
        this.A07 = AbN.A1U(parcel);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        int readInt = parcel.readInt();
        MediaData[] mediaDataArr = new MediaData[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = DKG.A02(parcel, MediaData.CREATOR, mediaDataArr, i2);
        }
        this.A04 = ImmutableList.copyOf(mediaDataArr);
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr, i3);
        }
        this.A05 = ImmutableList.copyOf(strArr);
        HashMap A0u = AnonymousClass001.A0u();
        int readInt3 = parcel.readInt();
        for (int i4 = 0; i4 < readInt3; i4++) {
            AnonymousClass001.A1A(parcel.readString(), A0u, parcel.readInt());
        }
        this.A06 = ImmutableMap.copyOf((Map) A0u);
    }

    public InspirationFbShortsGallerySelectedMediasModel(ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableMap immutableMap, int i, int i2, int i3, boolean z) {
        C1pq.A08("positionIndices", immutableList);
        this.A03 = immutableList;
        this.A07 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        C1pq.A08("selectedMediaData", immutableList2);
        this.A04 = immutableList2;
        C1pq.A08("selectedMediaIds", immutableList3);
        this.A05 = immutableList3;
        C1pq.A08("selectedMediaMap", immutableMap);
        this.A06 = immutableMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationFbShortsGallerySelectedMediasModel)) {
                return false;
            }
            InspirationFbShortsGallerySelectedMediasModel inspirationFbShortsGallerySelectedMediasModel = (InspirationFbShortsGallerySelectedMediasModel) obj;
            if (!11T.A0O(this.A03, inspirationFbShortsGallerySelectedMediasModel.A03) || this.A07 != inspirationFbShortsGallerySelectedMediasModel.A07 || this.A00 != inspirationFbShortsGallerySelectedMediasModel.A00 || this.A01 != inspirationFbShortsGallerySelectedMediasModel.A01 || this.A02 != inspirationFbShortsGallerySelectedMediasModel.A02 || !11T.A0O(this.A04, inspirationFbShortsGallerySelectedMediasModel.A04) || !11T.A0O(this.A05, inspirationFbShortsGallerySelectedMediasModel.A05) || !11T.A0O(this.A06, inspirationFbShortsGallerySelectedMediasModel.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, (((((C1pq.A02(C1pq.A03(this.A03), this.A07) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            parcel.writeInt(DKE.A0F(A0b));
        }
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        1Du A0b2 = 1BL.A0b(parcel, this.A04);
        while (A0b2.hasNext()) {
            DKG.A1I(parcel, A0b2, i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A05);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        1Du A0g = DKH.A0g(parcel, this.A06);
        while (A0g.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0g);
            parcel.writeString(AnonymousClass001.A0j(A0z));
            parcel.writeInt(AnonymousClass001.A03(A0z.getValue()));
        }
    }
}
