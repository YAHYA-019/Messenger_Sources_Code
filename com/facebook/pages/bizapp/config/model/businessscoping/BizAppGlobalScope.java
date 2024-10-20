package com.facebook.pages.bizapp.config.model.businessscoping;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLBusinessScopeTypeEnum;
import com.google.common.collect.ImmutableList;

/* loaded from: BizAppGlobalScope.class */
public final class BizAppGlobalScope implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(28);
    public final long A00;
    public final ImmutableList A01;
    public final GraphQLBusinessScopeTypeEnum A02;
    public final String A03;

    public BizAppGlobalScope(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        BizAppAsset[] bizAppAssetArr = new BizAppAsset[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, bizAppAssetArr, i);
        }
        this.A01 = ImmutableList.copyOf(bizAppAssetArr);
        this.A00 = parcel.readLong();
        this.A03 = parcel.readString();
        this.A02 = parcel.readInt() == 0 ? null : GraphQLBusinessScopeTypeEnum.values()[parcel.readInt()];
    }

    public BizAppGlobalScope(GraphQLBusinessScopeTypeEnum graphQLBusinessScopeTypeEnum, ImmutableList immutableList, String str, long j) {
        C1pq.A08("assetsList", immutableList);
        this.A01 = immutableList;
        this.A00 = j;
        this.A03 = str;
        this.A02 = graphQLBusinessScopeTypeEnum;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BizAppGlobalScope)) {
                return false;
            }
            BizAppGlobalScope bizAppGlobalScope = (BizAppGlobalScope) obj;
            if (!11T.A0O(this.A01, bizAppGlobalScope.A01) || this.A00 != bizAppGlobalScope.A00 || !11T.A0O(this.A03, bizAppGlobalScope.A03) || this.A02 != bizAppGlobalScope.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A03, C1pq.A01(C1pq.A03(this.A01), this.A00));
        return (A04 * 31) + C3o5.A03(this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((BizAppAsset) A0b.next(), i);
        }
        parcel.writeLong(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(DKH.A05(parcel, this.A02));
    }
}
