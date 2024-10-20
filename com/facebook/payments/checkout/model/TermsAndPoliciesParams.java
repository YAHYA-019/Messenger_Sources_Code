package com.facebook.payments.checkout.model;

import X.1BL;
import X.C0A2;
import X.C53v;
import X.FJ8;
import X.FKZ;
import X.GMA;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TermsAndPoliciesParams.class */
public final class TermsAndPoliciesParams implements Parcelable {
    public static final TermsAndPoliciesParams A05 = new TermsAndPoliciesParams(false, C0A2.A03("https://m.facebook.com/payments_terms"));
    public static final TermsAndPoliciesParams A06 = new TermsAndPoliciesParams(true, Uri.EMPTY);
    public static final Parcelable.Creator CREATOR = FKZ.A00(19);
    public Uri A00;
    public boolean A01;
    public final GMA A02;
    public final String A03;
    public final String A04;

    public TermsAndPoliciesParams(Parcel parcel) {
        this.A01 = C53v.A0S(parcel);
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = FJ8.A01(parcel);
    }

    public TermsAndPoliciesParams(boolean z, Uri uri) {
        this.A01 = z;
        uri.getClass();
        this.A00 = uri;
        this.A04 = null;
        this.A03 = null;
        this.A02 = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        FJ8.A0A(parcel, this.A02);
    }
}
