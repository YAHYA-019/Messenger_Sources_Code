package com.facebook.addresstypeahead.simpleaddresstypeahead;

import X.1BL;
import X.AnonymousClass001;
import X.LGo;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: AddressTypeAheadInput.class */
public final class AddressTypeAheadInput implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(86);
    public final int A00;
    public final Location A01;
    public final AddressTypeAheadParams A02;
    public final ImmutableList A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public AddressTypeAheadInput(Location location, AddressTypeAheadParams addressTypeAheadParams, ImmutableList immutableList) {
        this.A0A = false;
        this.A07 = "checkout_typeahead_payment_tag";
        this.A02 = addressTypeAheadParams;
        this.A01 = location;
        this.A06 = null;
        this.A05 = "STREET_TYPEAHEAD";
        this.A04 = "MESSENGER_TRANSPORTATION_ANDROID";
        this.A03 = immutableList;
        this.A00 = 3;
        this.A09 = true;
        this.A08 = false;
    }

    public AddressTypeAheadInput(Parcel parcel) {
        boolean z = false;
        this.A0A = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A07 = parcel.readString();
        this.A02 = (AddressTypeAheadParams) 1BL.A0C(parcel, AddressTypeAheadParams.class);
        this.A01 = (Location) 1BL.A0C(parcel, Location.class);
        this.A06 = parcel.readString();
        String readString = parcel.readString();
        this.A05 = readString == null ? "STREET_PLACE_TYPEAHEAD" : readString;
        String readString2 = parcel.readString();
        this.A04 = readString2 == null ? "MESSENGER_TRANSPORTATION_ANDROID" : readString2;
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readStringList(A0s);
        this.A03 = ImmutableList.copyOf((Collection) A0s);
        this.A00 = parcel.readInt();
        this.A09 = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A08 = parcel.readByte() == 1 ? true : z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeStringList(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
    }
}
