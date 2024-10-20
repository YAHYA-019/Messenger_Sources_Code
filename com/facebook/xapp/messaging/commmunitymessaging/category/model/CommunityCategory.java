package com.facebook.xapp.messaging.commmunitymessaging.category.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityCategory.class */
public final class CommunityCategory implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(46);
    public final long A00;
    public final String A01;

    public CommunityCategory(long j, String str) {
        this.A00 = j;
        this.A01 = str;
    }

    public CommunityCategory(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readLong();
        this.A01 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityCategory)) {
                return false;
            }
            CommunityCategory communityCategory = (CommunityCategory) obj;
            if (this.A00 != communityCategory.A00 || !11T.A0O(this.A01, communityCategory.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, 1BL.A01(this.A00) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeString(this.A01);
    }
}
