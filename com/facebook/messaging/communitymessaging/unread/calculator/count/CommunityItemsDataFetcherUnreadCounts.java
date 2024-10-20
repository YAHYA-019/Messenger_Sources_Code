package com.facebook.messaging.communitymessaging.unread.calculator.count;

import X.82M;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityItemsDataFetcherUnreadCounts.class */
public final class CommunityItemsDataFetcherUnreadCounts implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(25);
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;

    public CommunityItemsDataFetcherUnreadCounts(int i, int i2, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A03 = false;
        this.A01 = i2;
    }

    public CommunityItemsDataFetcherUnreadCounts(Parcel parcel) {
        boolean z = false;
        this.A02 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt() == 1 ? true : z;
        this.A01 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityItemsDataFetcherUnreadCounts)) {
                return false;
            }
            CommunityItemsDataFetcherUnreadCounts communityItemsDataFetcherUnreadCounts = (CommunityItemsDataFetcherUnreadCounts) obj;
            if (this.A02 != communityItemsDataFetcherUnreadCounts.A02 || this.A00 != communityItemsDataFetcherUnreadCounts.A00 || this.A03 != communityItemsDataFetcherUnreadCounts.A03 || this.A01 != communityItemsDataFetcherUnreadCounts.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A02((C1pq.A05(this.A02) * 31) + this.A00, this.A03) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01);
    }
}
