package com.facebook.pages.common.brandedcontent.model;

import X.11T;
import X.1BL;
import X.7zS;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: PageUnit.class */
public final class PageUnit implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(29);
    public final String category;
    public final String directShareStatus;
    public final String id;
    public final boolean isVerified;
    public final String name;
    public final String objectTypeName;
    public final String profilePicUri;
    public final String sponsorRelationship;
    public final String subtext;

    public PageUnit() {
        this.id = null;
        this.name = null;
        this.objectTypeName = null;
        this.profilePicUri = null;
        this.category = null;
        this.subtext = null;
        this.isVerified = false;
        this.directShareStatus = null;
        this.sponsorRelationship = null;
    }

    public PageUnit(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
        this.objectTypeName = parcel.readString();
        this.profilePicUri = parcel.readString();
        this.subtext = parcel.readString();
        this.category = parcel.readString();
        this.isVerified = 7zS.A1Z(parcel);
        this.directShareStatus = parcel.readString();
        this.sponsorRelationship = parcel.readString();
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
            PageUnit pageUnit = (PageUnit) obj;
            if (this.isVerified != pageUnit.isVerified || !11T.A0O(this.id, pageUnit.id) || !11T.A0O(this.name, pageUnit.name) || !11T.A0O(this.objectTypeName, pageUnit.objectTypeName) || !11T.A0O(this.profilePicUri, pageUnit.profilePicUri) || !11T.A0O(this.subtext, pageUnit.subtext) || !11T.A0O(this.category, pageUnit.category) || !11T.A0O(this.directShareStatus, pageUnit.directShareStatus) || !11T.A0O(this.sponsorRelationship, pageUnit.sponsorRelationship)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.id, this.name, this.objectTypeName, this.profilePicUri, this.subtext, this.category, Boolean.valueOf(this.isVerified), this.directShareStatus, this.sponsorRelationship});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.objectTypeName);
        parcel.writeString(this.profilePicUri);
        parcel.writeString(this.subtext);
        parcel.writeString(this.category);
        parcel.writeInt(this.isVerified ? 1 : 0);
        parcel.writeString(this.directShareStatus);
        parcel.writeString(this.sponsorRelationship);
    }
}
