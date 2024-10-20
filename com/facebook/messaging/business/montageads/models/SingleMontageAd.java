package com.facebook.messaging.business.montageads.models;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YV;
import X.AbF;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: SingleMontageAd.class */
public final class SingleMontageAd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(40);
    public final int A00;
    public final Uri A01;
    public final Uri A02;
    public final Uri A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public SingleMontageAd(Uri uri, Uri uri2, Uri uri3, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z, boolean z2, boolean z3) {
        this.A07 = str;
        C1pq.A08("clientToken", str2);
        this.A08 = str2;
        this.A09 = str3;
        this.A0E = z;
        this.A01 = uri;
        AbF.A1T(str4);
        this.A0A = str4;
        this.A00 = i;
        this.A0F = z2;
        this.A0G = z3;
        C1pq.A08("mediaInfos", immutableList);
        this.A04 = immutableList;
        C1pq.A08("pageId", str5);
        this.A0B = str5;
        this.A02 = uri2;
        C1pq.A08("productTypes", immutableList2);
        this.A05 = immutableList2;
        C1pq.A08("profilePictureUrl", str6);
        this.A0C = str6;
        C1pq.A08("quickReplies", immutableList3);
        this.A06 = immutableList3;
        this.A03 = uri3;
        C1pq.A08("title", str7);
        this.A0D = str7;
    }

    public SingleMontageAd(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Uri uri = null;
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A08 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = parcel.readString();
        }
        int i = 0;
        this.A0E = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(A0e);
        }
        this.A0A = parcel.readString();
        this.A00 = parcel.readInt();
        this.A0F = 1BM.A07(parcel);
        this.A0G = AbJ.A1V(parcel);
        int readInt = parcel.readInt();
        MontageAdsMediaInfo[] montageAdsMediaInfoArr = new MontageAdsMediaInfo[readInt];
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, montageAdsMediaInfoArr, i2);
        }
        this.A04 = ImmutableList.copyOf(montageAdsMediaInfoArr);
        this.A0B = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (Uri) parcel.readParcelable(A0e);
        }
        int readInt2 = parcel.readInt();
        String[] strArr = new String[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbH.A00(parcel, strArr, i3);
        }
        this.A05 = ImmutableList.copyOf(strArr);
        this.A0C = parcel.readString();
        int readInt3 = parcel.readInt();
        String[] strArr2 = new String[readInt3];
        while (i < readInt3) {
            i = AbH.A00(parcel, strArr2, i);
        }
        this.A06 = ImmutableList.copyOf(strArr2);
        this.A03 = parcel.readInt() != 0 ? (Uri) parcel.readParcelable(A0e) : uri;
        this.A0D = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SingleMontageAd)) {
                return false;
            }
            SingleMontageAd singleMontageAd = (SingleMontageAd) obj;
            if (!11T.A0O(this.A07, singleMontageAd.A07) || !11T.A0O(this.A08, singleMontageAd.A08) || !11T.A0O(this.A09, singleMontageAd.A09) || this.A0E != singleMontageAd.A0E || !11T.A0O(this.A01, singleMontageAd.A01) || !11T.A0O(this.A0A, singleMontageAd.A0A) || this.A00 != singleMontageAd.A00 || this.A0F != singleMontageAd.A0F || this.A0G != singleMontageAd.A0G || !11T.A0O(this.A04, singleMontageAd.A04) || !11T.A0O(this.A0B, singleMontageAd.A0B) || !11T.A0O(this.A02, singleMontageAd.A02) || !11T.A0O(this.A05, singleMontageAd.A05) || !11T.A0O(this.A0C, singleMontageAd.A0C) || !11T.A0O(this.A06, singleMontageAd.A06) || !11T.A0O(this.A03, singleMontageAd.A03) || !11T.A0O(this.A0D, singleMontageAd.A0D)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A0D, C1pq.A04(this.A03, C1pq.A04(this.A06, C1pq.A04(this.A0C, C1pq.A04(this.A05, C1pq.A04(this.A02, C1pq.A04(this.A0B, C1pq.A04(this.A04, C1pq.A02(C1pq.A02((C1pq.A04(this.A0A, C1pq.A04(this.A01, C1pq.A02(C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A03(this.A07))), this.A0E))) * 31) + this.A00, this.A0F), this.A0G)))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A07);
        parcel.writeString(this.A08);
        1BL.A13(parcel, this.A09);
        parcel.writeInt(this.A0E ? 1 : 0);
        C3o5.A0d(parcel, this.A01, i);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        1Du A0b = 1BL.A0b(parcel, this.A04);
        while (A0b.hasNext()) {
            parcel.writeParcelable((MontageAdsMediaInfo) A0b.next(), i);
        }
        parcel.writeString(this.A0B);
        C3o5.A0d(parcel, this.A02, i);
        1Du A0b2 = 1BL.A0b(parcel, this.A05);
        while (A0b2.hasNext()) {
            C3o5.A0h(parcel, A0b2);
        }
        parcel.writeString(this.A0C);
        1Du A0b3 = 1BL.A0b(parcel, this.A06);
        while (A0b3.hasNext()) {
            C3o5.A0h(parcel, A0b3);
        }
        C3o5.A0d(parcel, this.A03, i);
        parcel.writeString(this.A0D);
    }
}
