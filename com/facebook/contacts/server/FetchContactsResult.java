package com.facebook.contacts.server;

import X.AbN;
import X.AnonymousClass001;
import X.EnumC08284mf;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.contacts.graphql.Contact;
import com.facebook.fbservice.results.BaseResult;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchContactsResult.class */
public final class FetchContactsResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKX(47);
    public String A00;
    public final ImmutableList A01;

    public FetchContactsResult(EnumC08284mf enumC08284mf, ImmutableList immutableList, String str, long j) {
        super(enumC08284mf, j);
        immutableList.getClass();
        this.A01 = immutableList;
        this.A00 = str;
    }

    public FetchContactsResult(Parcel parcel) {
        super(parcel);
        this.A01 = AbN.A0e(parcel, Contact.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FetchContactsResult: ");
        return AnonymousClass001.A0a(this.A01, A0k);
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.A01);
    }
}
