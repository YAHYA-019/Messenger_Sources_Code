package com.facebook.messaging.service.model;

import X.1BL;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.Name;

/* loaded from: EditDisplayNameParams.class */
public final class EditDisplayNameParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(82);
    public final Name A00;

    public EditDisplayNameParams(Parcel parcel) {
        this.A00 = (Name) 1BL.A0C(parcel, Name.class);
    }

    public EditDisplayNameParams(Name name) {
        this.A00 = name;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
