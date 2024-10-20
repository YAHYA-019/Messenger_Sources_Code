package com.facebook.payments.auth;

import X.11T;
import X.1BL;
import X.1BM;
import X.4YV;
import X.AbJ;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKG;
import X.FKY;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.payments.model.PaymentItemType;

/* loaded from: AuthenticationParams.class */
public final class AuthenticationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(32);
    public final Bundle A00;
    public final Bundle A01;
    public final BioPromptContent A02;
    public final PaymentsLoggingSessionData A03;
    public final PaymentItemType A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public AuthenticationParams(Bundle bundle, Bundle bundle2, BioPromptContent bioPromptContent, PaymentsLoggingSessionData paymentsLoggingSessionData, PaymentItemType paymentItemType, Boolean bool, String str, String str2, boolean z, boolean z2) {
        this.A00 = bundle;
        this.A01 = bundle2;
        this.A02 = bioPromptContent;
        C1pq.A08("fingerprintDialogTag", str);
        this.A06 = str;
        this.A08 = z;
        this.A09 = z2;
        this.A07 = str2;
        this.A04 = paymentItemType;
        this.A03 = paymentsLoggingSessionData;
        this.A05 = bool;
    }

    public AuthenticationParams(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (BioPromptContent) parcel.readParcelable(A0e);
        }
        this.A06 = parcel.readString();
        this.A08 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A09 = 1BM.A07(parcel);
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = DKG.A0l(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (PaymentsLoggingSessionData) parcel.readParcelable(A0e);
        }
        this.A05 = parcel.readInt() != 0 ? Boolean.valueOf(AbJ.A1W(parcel)) : bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AuthenticationParams)) {
                return false;
            }
            AuthenticationParams authenticationParams = (AuthenticationParams) obj;
            if (!11T.A0O(this.A00, authenticationParams.A00) || !11T.A0O(this.A01, authenticationParams.A01) || !11T.A0O(this.A02, authenticationParams.A02) || !11T.A0O(this.A06, authenticationParams.A06) || this.A08 != authenticationParams.A08 || this.A09 != authenticationParams.A09 || !11T.A0O(this.A07, authenticationParams.A07) || this.A04 != authenticationParams.A04 || !11T.A0O(this.A03, authenticationParams.A03) || !11T.A0O(this.A05, authenticationParams.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A07, C1pq.A02(C1pq.A02(C1pq.A04(this.A06, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))), this.A08), this.A09));
        return C1pq.A04(this.A05, C1pq.A04(this.A03, (A04 * 31) + C3o5.A03(this.A04)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.A00;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        Bundle bundle2 = this.A01;
        if (bundle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle2.writeToParcel(parcel, i);
        }
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        1BL.A13(parcel, this.A07);
        C3o5.A0e(parcel, this.A04);
        C3o5.A0d(parcel, this.A03, i);
        AbN.A0s(parcel, this.A05);
    }
}
