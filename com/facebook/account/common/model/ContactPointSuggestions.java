package com.facebook.account.common.model;

import X.AnonymousClass001;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: ContactPointSuggestions.class */
public class ContactPointSuggestions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(53);
    public final List autocompleteContactPoints;
    public final List prefillContactPoints;

    public ContactPointSuggestions() {
        this.prefillContactPoints = AnonymousClass001.A0s();
        this.autocompleteContactPoints = AnonymousClass001.A0s();
    }

    public ContactPointSuggestions(Parcel parcel) {
        Parcelable.Creator creator = ContactPointSuggestion.CREATOR;
        this.prefillContactPoints = parcel.createTypedArrayList(creator);
        this.autocompleteContactPoints = parcel.createTypedArrayList(creator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.prefillContactPoints);
        parcel.writeTypedList(this.autocompleteContactPoints);
    }
}
