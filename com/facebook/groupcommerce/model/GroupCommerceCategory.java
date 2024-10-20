package com.facebook.groupcommerce.model;

import X.11T;
import X.1BL;
import X.AbM;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GroupCommerceCategory.class */
public final class GroupCommerceCategory implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(87);
    public final String categoryID;
    public final String name;

    public GroupCommerceCategory() {
        this.name = null;
        this.categoryID = null;
    }

    public GroupCommerceCategory(Parcel parcel) {
        this.name = parcel.readString();
        this.categoryID = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !1BL.A1V(this, obj)) {
                return false;
            }
            GroupCommerceCategory groupCommerceCategory = (GroupCommerceCategory) obj;
            if (!11T.A0O(this.name, groupCommerceCategory.name) || !11T.A0O(this.categoryID, groupCommerceCategory.categoryID)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A05(this.name, this.categoryID);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.name);
        parcel.writeString(this.categoryID);
    }
}
