package com.facebook.contacts.server;

import X.AbN;
import X.EnumC08284mf;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.graphql.Contact;
import com.facebook.fbservice.results.BaseResult;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchAllContactsResult.class */
public final class FetchAllContactsResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(45);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public FetchAllContactsResult(EnumC08284mf enumC08284mf, ImmutableList immutableList, String str, String str2, String str3, long j, boolean z) {
        super(enumC08284mf, j);
        immutableList.getClass();
        this.A00 = immutableList;
        this.A02 = str;
        this.A04 = z;
        this.A01 = str2;
        this.A03 = str3;
    }

    public FetchAllContactsResult(Parcel parcel) {
        super(parcel);
        this.A00 = AbN.A0e(parcel, Contact.class);
        this.A02 = parcel.readString();
        this.A04 = AbN.A1U(parcel);
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
