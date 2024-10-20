package com.facebook.addresstypeahead.simpleaddresstypeahead;

import X.LGo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AddressTypeAheadParams.class */
public final class AddressTypeAheadParams implements Parcelable {
    public static AddressTypeAheadParams A02;
    public static final Parcelable.Creator CREATOR;
    public Bundle A00;
    public String A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.addresstypeahead.simpleaddresstypeahead.AddressTypeAheadParams] */
    static {
        ?? obj = new Object();
        obj.A01 = null;
        obj.A00 = null;
        A02 = obj;
        CREATOR = LGo.A00(87);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeBundle(this.A00);
    }
}
