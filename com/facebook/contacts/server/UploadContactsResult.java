package com.facebook.contacts.server;

import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.graphql.Contact;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: UploadContactsResult.class */
public final class UploadContactsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(54);
    public final ImmutableList A00;
    public final String A01;

    public UploadContactsResult(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = ImmutableList.copyOf((Collection) parcel.createTypedArrayList(Contact.CREATOR));
    }

    public UploadContactsResult(String str, List list) {
        this.A01 = str;
        this.A00 = ImmutableList.copyOf((Collection) list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeTypedList(this.A00);
    }
}
