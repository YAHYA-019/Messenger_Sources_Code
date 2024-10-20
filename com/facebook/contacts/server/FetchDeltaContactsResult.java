package com.facebook.contacts.server;

import X.AbN;
import X.EnumC08284mf;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.graphql.Contact;
import com.facebook.fbservice.results.BaseResult;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: FetchDeltaContactsResult.class */
public final class FetchDeltaContactsResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(49);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;
    public final boolean A03;

    public FetchDeltaContactsResult(EnumC08284mf enumC08284mf, ImmutableList immutableList, ImmutableList immutableList2, String str, long j, boolean z) {
        super(enumC08284mf, j);
        immutableList.getClass();
        immutableList2.getClass();
        this.A00 = immutableList;
        this.A01 = immutableList2;
        this.A02 = str;
        this.A03 = z;
    }

    public FetchDeltaContactsResult(Parcel parcel) {
        super(parcel);
        this.A00 = AbN.A0e(parcel, Contact.class);
        this.A01 = ImmutableList.copyOf((Collection) parcel.createStringArrayList());
        this.A02 = parcel.readString();
        this.A03 = AbN.A1U(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A00);
        parcel.writeList(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
