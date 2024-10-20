package com.facebook.messaging.model.threads;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MarketplaceThreadData.class */
public final class MarketplaceThreadData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSV(62);
    public final MarketplaceThreadUserData A00;
    public final MarketplaceThreadUserData A01;
    public final ProfileSellingInvoice A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    /* JADX WARN: Multi-variable type inference failed */
    public MarketplaceThreadData(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (ProfileSellingInvoice) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MarketplaceThreadUserData) parcel.readParcelable(classLoader);
        }
        boolean z = false;
        this.A06 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = 1BM.A07(parcel);
        this.A0A = 1BM.A07(parcel);
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (MarketplaceThreadUserData) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() != 0) {
            int readInt = parcel.readInt();
            MarketplaceThreadLabel[] marketplaceThreadLabelArr = new MarketplaceThreadLabel[readInt];
            for (int i = 0; i < readInt; i++) {
                marketplaceThreadLabelArr[i] = parcel.readParcelable(classLoader);
            }
            immutableList = ImmutableList.copyOf(marketplaceThreadLabelArr);
        }
        this.A03 = immutableList;
        this.A0E = parcel.readInt() == 1 ? true : z;
    }

    public MarketplaceThreadData(MarketplaceThreadUserData marketplaceThreadUserData, MarketplaceThreadUserData marketplaceThreadUserData2, ProfileSellingInvoice profileSellingInvoice, ImmutableList immutableList, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A02 = profileSellingInvoice;
        this.A00 = marketplaceThreadUserData;
        this.A06 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A07 = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A0B = z6;
        this.A0C = z7;
        this.A0D = z8;
        this.A01 = marketplaceThreadUserData2;
        this.A03 = immutableList;
        this.A0E = z9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MarketplaceThreadData)) {
                return false;
            }
            MarketplaceThreadData marketplaceThreadData = (MarketplaceThreadData) obj;
            if (!11T.A0O(this.A02, marketplaceThreadData.A02) || !11T.A0O(this.A00, marketplaceThreadData.A00) || this.A06 != marketplaceThreadData.A06 || !11T.A0O(this.A04, marketplaceThreadData.A04) || !11T.A0O(this.A05, marketplaceThreadData.A05) || this.A07 != marketplaceThreadData.A07 || this.A08 != marketplaceThreadData.A08 || this.A09 != marketplaceThreadData.A09 || this.A0A != marketplaceThreadData.A0A || this.A0B != marketplaceThreadData.A0B || this.A0C != marketplaceThreadData.A0C || this.A0D != marketplaceThreadData.A0D || !11T.A0O(this.A01, marketplaceThreadData.A01) || !11T.A0O(this.A03, marketplaceThreadData.A03) || this.A0E != marketplaceThreadData.A0E) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A01, C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A00, C1pq.A03(this.A02)), this.A06))), this.A07), this.A08), this.A09), this.A0A), this.A0B), this.A0C), this.A0D))), this.A0E);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A02, i);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeInt(this.A06 ? 1 : 0);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        C3o5.A0d(parcel, this.A01, i);
        ImmutableList immutableList = this.A03;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                parcel.writeParcelable((MarketplaceThreadLabel) A0b.next(), i);
            }
        }
        parcel.writeInt(this.A0E ? 1 : 0);
    }
}
