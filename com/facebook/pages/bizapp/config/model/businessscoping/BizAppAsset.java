package com.facebook.pages.bizapp.config.model.businessscoping;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLBusinessAssetTypeEnum;
import com.facebook.pages.bizapp.config.model.BizAppConfigNode;
import com.google.common.collect.ImmutableList;

/* loaded from: BizAppAsset.class */
public final class BizAppAsset implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(27);
    public final long A00;
    public final GraphQLBusinessAssetTypeEnum A01;
    public final BizAppConfigNode A02;
    public final int A03;
    public final long A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public BizAppAsset(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readLong();
        this.A06 = parcel.readString();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLBusinessAssetTypeEnum.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (BizAppConfigNode) BizAppConfigNode.CREATOR.createFromParcel(parcel);
        }
        this.A03 = parcel.readInt();
        this.A07 = parcel.readString();
        int i = 0;
        this.A0A = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0B = AbJ.A1V(parcel);
        this.A08 = parcel.readString();
        this.A04 = parcel.readLong();
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            while (i < readInt) {
                i = AbH.A00(parcel, strArr, i);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A05 = immutableList;
        this.A09 = parcel.readString();
    }

    public BizAppAsset(GraphQLBusinessAssetTypeEnum graphQLBusinessAssetTypeEnum, BizAppConfigNode bizAppConfigNode, ImmutableList immutableList, String str, String str2, String str3, String str4, int i, long j, long j2, boolean z, boolean z2) {
        this.A00 = j;
        this.A06 = str;
        this.A01 = graphQLBusinessAssetTypeEnum;
        this.A02 = bizAppConfigNode;
        this.A03 = i;
        this.A07 = str2;
        this.A0A = z;
        this.A0B = z2;
        this.A08 = str3;
        this.A04 = j2;
        this.A05 = immutableList;
        this.A09 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BizAppAsset)) {
                return false;
            }
            BizAppAsset bizAppAsset = (BizAppAsset) obj;
            if (this.A00 != bizAppAsset.A00 || !11T.A0O(this.A06, bizAppAsset.A06) || this.A01 != bizAppAsset.A01 || !11T.A0O(this.A02, bizAppAsset.A02) || this.A03 != bizAppAsset.A03 || !11T.A0O(this.A07, bizAppAsset.A07) || this.A0A != bizAppAsset.A0A || this.A0B != bizAppAsset.A0B || !11T.A0O(this.A08, bizAppAsset.A08) || this.A04 != bizAppAsset.A04 || !11T.A0O(this.A05, bizAppAsset.A05) || !11T.A0O(this.A09, bizAppAsset.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A06, 1BL.A01(this.A00) + 31);
        return C1pq.A04(this.A09, C1pq.A04(this.A05, C1pq.A01(C1pq.A04(this.A08, C1pq.A02(C1pq.A02(C1pq.A04(this.A07, (C1pq.A04(this.A02, (A04 * 31) + C3o5.A03(this.A01)) * 31) + this.A03), this.A0A), this.A0B)), this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A06);
        C3o5.A0e(parcel, this.A01);
        BizAppConfigNode bizAppConfigNode = this.A02;
        if (bizAppConfigNode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bizAppConfigNode.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeString(this.A08);
        parcel.writeLong(this.A04);
        ImmutableList immutableList = this.A05;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        parcel.writeString(this.A09);
    }
}
