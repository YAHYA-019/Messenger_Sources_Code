package com.google.android.gms.auth.api.identity;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JR0;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: GetSignInIntentRequest.class */
public final class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(60);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, int i, boolean z) {
        AbstractC00481b7.A02(str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = z;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof GetSignInIntentRequest) {
            GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
            if (AbstractC09524qc.A00(this.A01, getSignInIntentRequest.A01) && AbstractC09524qc.A00(this.A04, getSignInIntentRequest.A04) && AbstractC09524qc.A00(this.A02, getSignInIntentRequest.A02) && AbstractC09524qc.A00(Boolean.valueOf(this.A05), Boolean.valueOf(getSignInIntentRequest.A05)) && this.A00 == getSignInIntentRequest.A00) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0O(this.A01, this.A02, this.A04, Boolean.valueOf(this.A05), Integer.valueOf(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A01, 1);
        AbstractC01153q8.A08(parcel, this.A02, 2);
        AbstractC01153q8.A08(parcel, this.A03, 3);
        AbstractC01153q8.A08(parcel, this.A04, 4);
        AbstractC01153q8.A06(parcel, 5, this.A05);
        AbstractC01153q8.A04(parcel, 6, this.A00);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
