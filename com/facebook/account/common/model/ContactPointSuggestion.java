package com.facebook.account.common.model;

import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ContactPointSuggestion.class */
public class ContactPointSuggestion implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(52);
    public String contactPointTypeString = null;
    public String contactPoint = null;
    public String source = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contactPointTypeString);
        parcel.writeString(this.contactPoint);
        parcel.writeString(this.source);
    }
}
