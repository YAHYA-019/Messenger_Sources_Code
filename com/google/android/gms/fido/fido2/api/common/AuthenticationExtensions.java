package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.GOq;
import X.JQx;
import X.JR0;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: AuthenticationExtensions.class */
public final class AuthenticationExtensions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(13);
    public final FidoAppIdExtension A00;
    public final UserVerificationMethodExtension A01;
    public final GoogleThirdPartyPaymentExtension A02;
    public final zzab A03;
    public final zzad A04;
    public final zzag A05;
    public final zzai A06;
    public final zzak A07;
    public final zzaw A08;
    public final zzs A09;
    public final zzu A0A;
    public final zzz A0B;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, UserVerificationMethodExtension userVerificationMethodExtension, zzab zzabVar, zzad zzadVar, zzag zzagVar, zzai zzaiVar, zzak zzakVar, zzaw zzawVar, zzs zzsVar, zzu zzuVar, zzz zzzVar) {
        this.A00 = fidoAppIdExtension;
        this.A01 = userVerificationMethodExtension;
        this.A09 = zzsVar;
        this.A0B = zzzVar;
        this.A03 = zzabVar;
        this.A04 = zzadVar;
        this.A0A = zzuVar;
        this.A05 = zzagVar;
        this.A02 = googleThirdPartyPaymentExtension;
        this.A07 = zzakVar;
        this.A08 = zzawVar;
        this.A06 = zzaiVar;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AuthenticationExtensions) {
            AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
            if (AbstractC09524qc.A00(this.A00, authenticationExtensions.A00) && AbstractC09524qc.A00(this.A09, authenticationExtensions.A09) && AbstractC09524qc.A00(this.A01, authenticationExtensions.A01) && AbstractC09524qc.A00(this.A0B, authenticationExtensions.A0B) && AbstractC09524qc.A00(this.A03, authenticationExtensions.A03) && AbstractC09524qc.A00(this.A04, authenticationExtensions.A04) && AbstractC09524qc.A00(this.A0A, authenticationExtensions.A0A) && AbstractC09524qc.A00(this.A05, authenticationExtensions.A05) && AbstractC09524qc.A00(this.A02, authenticationExtensions.A02) && AbstractC09524qc.A00(this.A07, authenticationExtensions.A07) && AbstractC09524qc.A00(this.A08, authenticationExtensions.A08)) {
                z = JR0.A1X(this.A06, authenticationExtensions.A06);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A09, this.A01, this.A0B, this.A03, this.A04, this.A0A, this.A05, this.A02, this.A07, this.A08, this.A06});
    }

    public final String toString() {
        zzaw zzawVar = this.A08;
        zzak zzakVar = this.A07;
        GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = this.A02;
        zzag zzagVar = this.A05;
        zzu zzuVar = this.A0A;
        zzad zzadVar = this.A04;
        zzab zzabVar = this.A03;
        zzz zzzVar = this.A0B;
        UserVerificationMethodExtension userVerificationMethodExtension = this.A01;
        zzs zzsVar = this.A09;
        String valueOf = String.valueOf(this.A00);
        String valueOf2 = String.valueOf(zzsVar);
        String valueOf3 = String.valueOf(userVerificationMethodExtension);
        String valueOf4 = String.valueOf(zzzVar);
        String valueOf5 = String.valueOf(zzabVar);
        String valueOf6 = String.valueOf(zzadVar);
        String valueOf7 = String.valueOf(zzuVar);
        String valueOf8 = String.valueOf(zzagVar);
        String valueOf9 = String.valueOf(googleThirdPartyPaymentExtension);
        String valueOf10 = String.valueOf(zzakVar);
        String valueOf11 = String.valueOf(zzawVar);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AuthenticationExtensions{\n fidoAppIdExtension=");
        A0k.append(valueOf);
        A0k.append(", \n cableAuthenticationExtension=");
        A0k.append(valueOf2);
        A0k.append(", \n userVerificationMethodExtension=");
        A0k.append(valueOf3);
        A0k.append(", \n googleMultiAssertionExtension=");
        A0k.append(valueOf4);
        A0k.append(", \n googleSessionIdExtension=");
        A0k.append(valueOf5);
        A0k.append(", \n googleSilentVerificationExtension=");
        A0k.append(valueOf6);
        A0k.append(", \n devicePublicKeyExtension=");
        A0k.append(valueOf7);
        A0k.append(", \n googleTunnelServerIdExtension=");
        A0k.append(valueOf8);
        A0k.append(", \n googleThirdPartyPaymentExtension=");
        A0k.append(valueOf9);
        A0k.append(", \n prfExtension=");
        A0k.append(valueOf10);
        A0k.append(", \n simpleTransactionAuthorizationExtension=");
        return GOq.A12(valueOf11, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A00, 2, i);
        AbstractC01153q8.A07(parcel, this.A09, 3, i);
        AbstractC01153q8.A07(parcel, this.A01, 4, i);
        AbstractC01153q8.A07(parcel, this.A0B, 5, i);
        AbstractC01153q8.A07(parcel, this.A03, 6, i);
        AbstractC01153q8.A07(parcel, this.A04, 7, i);
        AbstractC01153q8.A07(parcel, this.A0A, 8, i);
        AbstractC01153q8.A07(parcel, this.A05, 9, i);
        AbstractC01153q8.A07(parcel, this.A02, 10, i);
        AbstractC01153q8.A07(parcel, this.A07, 11, i);
        AbstractC01153q8.A07(parcel, this.A08, 12, i);
        AbstractC01153q8.A07(parcel, this.A06, 13, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
