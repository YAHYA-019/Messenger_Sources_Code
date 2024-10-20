package com.facebook.contacts.server;

import X.1BL;
import X.C53v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.graphql.Contact;

/* loaded from: AddContactResult.class */
public final class AddContactResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(42);
    public final Contact A00;
    public final boolean A01;

    public AddContactResult(Parcel parcel) {
        this.A00 = (Contact) 1BL.A0C(parcel, Contact.class);
        this.A01 = C53v.A0S(parcel);
    }

    public AddContactResult(Contact contact, boolean z) {
        this.A00 = contact;
        this.A01 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
