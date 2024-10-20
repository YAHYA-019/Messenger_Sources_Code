package com.facebook.ipc.composer.model;

import X.11T;
import X.1BM;
import X.7zU;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbShortsGroupModel.class */
public final class FbShortsGroupModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(86);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public FbShortsGroupModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        this.A08 = AbJ.A1W(parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
    }

    public FbShortsGroupModel(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4) {
        C1pq.A08("groupId", str);
        this.A00 = str;
        C1pq.A08("groupName", str2);
        this.A01 = str2;
        this.A05 = z;
        this.A06 = z2;
        this.A07 = z3;
        this.A08 = z4;
        C1pq.A08("reelPrivacyDescription", str3);
        this.A02 = str3;
        C1pq.A08("reelPrivacyIconId", str4);
        this.A03 = str4;
        C1pq.A08("reelPrivacyTitle", str5);
        this.A04 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbShortsGroupModel)) {
                return false;
            }
            FbShortsGroupModel fbShortsGroupModel = (FbShortsGroupModel) obj;
            if (!11T.A0O(this.A00, fbShortsGroupModel.A00) || !11T.A0O(this.A01, fbShortsGroupModel.A01) || this.A05 != fbShortsGroupModel.A05 || this.A06 != fbShortsGroupModel.A06 || this.A07 != fbShortsGroupModel.A07 || this.A08 != fbShortsGroupModel.A08 || !11T.A0O(this.A02, fbShortsGroupModel.A02) || !11T.A0O(this.A03, fbShortsGroupModel.A03) || !11T.A0O(this.A04, fbShortsGroupModel.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A05), this.A06), this.A07), this.A08))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }
}