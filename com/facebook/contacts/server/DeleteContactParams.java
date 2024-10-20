package com.facebook.contacts.server;

import X.1BL;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.graphql.Contact;

/* loaded from: DeleteContactParams.class */
public final class DeleteContactParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(43);
    public final Contact A00;

    public DeleteContactParams(Parcel parcel) {
        this.A00 = (Contact) 1BL.A0C(parcel, Contact.class);
    }

    public DeleteContactParams(Contact contact) {
        this.A00 = contact;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, 0);
    }
}
