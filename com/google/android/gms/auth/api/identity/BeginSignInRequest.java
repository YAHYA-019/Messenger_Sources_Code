package com.google.android.gms.auth.api.identity;

import X.1BK;
import X.2Go;
import X.AbM;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.DKD;
import X.JQx;
import X.JQy;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: BeginSignInRequest.class */
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(58);
    public final int A00;
    public final GoogleIdTokenRequestOptions A01;
    public final PasskeyJsonRequestOptions A02;
    public final PasskeysRequestOptions A03;
    public final PasswordRequestOptions A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    /* loaded from: BeginSignInRequest$GoogleIdTokenRequestOptions.class */
    public final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGn.A00(61);
        public final String A00;
        public final String A01;
        public final String A02;
        public final List A03;
        public final boolean A04;
        public final boolean A05;
        public final boolean A06;

        public GoogleIdTokenRequestOptions(String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            AbstractC00481b7.A08(z4, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.A04 = z;
            if (z) {
                AbstractC00481b7.A03(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.A00 = str;
            this.A01 = str2;
            this.A05 = z2;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = 1BK.A17(list);
                Collections.sort(arrayList);
            }
            this.A03 = arrayList;
            this.A02 = str3;
            this.A06 = z3;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof GoogleIdTokenRequestOptions) {
                GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
                if (this.A04 == googleIdTokenRequestOptions.A04 && AbstractC09524qc.A00(this.A00, googleIdTokenRequestOptions.A00) && AbstractC09524qc.A00(this.A01, googleIdTokenRequestOptions.A01) && this.A05 == googleIdTokenRequestOptions.A05 && AbstractC09524qc.A00(this.A02, googleIdTokenRequestOptions.A02) && AbstractC09524qc.A00(this.A03, googleIdTokenRequestOptions.A03) && this.A06 == googleIdTokenRequestOptions.A06) {
                    z = true;
                }
            }
            return z;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), this.A00, this.A01, Boolean.valueOf(this.A05), this.A02, this.A03, Boolean.valueOf(this.A06)});
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A06(parcel, 1, this.A04);
            AbstractC01153q8.A08(parcel, this.A00, 2);
            AbstractC01153q8.A08(parcel, this.A01, 3);
            AbstractC01153q8.A06(parcel, 4, this.A05);
            AbstractC01153q8.A08(parcel, this.A02, 5);
            AbstractC01153q8.A09(parcel, this.A03, 6);
            AbstractC01153q8.A06(parcel, 7, this.A06);
            AbstractC01153q8.A03(parcel, A0E);
        }
    }

    /* loaded from: BeginSignInRequest$PasskeyJsonRequestOptions.class */
    public final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGn.A00(62);
        public final String A00;
        public final boolean A01;

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                AbstractC00481b7.A02(str);
            }
            this.A01 = z;
            this.A00 = str;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof PasskeyJsonRequestOptions)) {
                    return false;
                }
                PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
                if (this.A01 != passkeyJsonRequestOptions.A01 || !AbstractC09524qc.A00(this.A00, passkeyJsonRequestOptions.A00)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return AbM.A05(Boolean.valueOf(this.A01), this.A00);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A06(parcel, 1, this.A01);
            JQy.A16(parcel, this.A00, A0E);
        }
    }

    /* loaded from: BeginSignInRequest$PasskeysRequestOptions.class */
    public final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGn.A00(63);
        public final String A00;
        public final boolean A01;
        public final byte[] A02;

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                AbstractC00481b7.A02(bArr);
                AbstractC00481b7.A02(str);
            }
            this.A01 = z;
            this.A02 = bArr;
            this.A00 = str;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (!(obj instanceof PasskeysRequestOptions)) {
                    return false;
                }
                PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
                if (this.A01 != passkeysRequestOptions.A01 || !Arrays.equals(this.A02, passkeysRequestOptions.A02) || !2Go.A00(this.A00, passkeysRequestOptions.A00)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return (AbM.A05(Boolean.valueOf(this.A01), this.A00) * 31) + Arrays.hashCode(this.A02);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int A0E = JQx.A0E(parcel);
            AbstractC01153q8.A06(parcel, 1, this.A01);
            AbstractC01153q8.A0B(parcel, this.A02, 2);
            JQy.A17(parcel, this.A00, A0E);
        }
    }

    /* loaded from: BeginSignInRequest$PasswordRequestOptions.class */
    public final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = LGn.A00(64);
        public final boolean A00;

        public PasswordRequestOptions(boolean z) {
            this.A00 = z;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if ((obj instanceof PasswordRequestOptions) && this.A00 == ((PasswordRequestOptions) obj).A00) {
                z = true;
            }
            return z;
        }

        public int hashCode() {
            return DKD.A04(Boolean.valueOf(this.A00));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            JQy.A15(parcel, JQx.A0E(parcel), this.A00);
        }
    }

    public BeginSignInRequest(GoogleIdTokenRequestOptions googleIdTokenRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, PasskeysRequestOptions passkeysRequestOptions, PasswordRequestOptions passwordRequestOptions, String str, int i, boolean z, boolean z2) {
        AbstractC00481b7.A02(passwordRequestOptions);
        this.A04 = passwordRequestOptions;
        AbstractC00481b7.A02(googleIdTokenRequestOptions);
        this.A01 = googleIdTokenRequestOptions;
        this.A05 = str;
        this.A06 = z;
        this.A00 = i;
        this.A03 = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, null, false) : passkeysRequestOptions;
        this.A02 = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.A07 = z2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof BeginSignInRequest) {
            BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
            if (AbstractC09524qc.A00(this.A04, beginSignInRequest.A04) && AbstractC09524qc.A00(this.A01, beginSignInRequest.A01) && AbstractC09524qc.A00(this.A03, beginSignInRequest.A03) && AbstractC09524qc.A00(this.A02, beginSignInRequest.A02) && AbstractC09524qc.A00(this.A05, beginSignInRequest.A05) && this.A06 == beginSignInRequest.A06 && this.A00 == beginSignInRequest.A00 && this.A07 == beginSignInRequest.A07) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A01, this.A03, this.A02, this.A05, Boolean.valueOf(this.A06), Integer.valueOf(this.A00), Boolean.valueOf(this.A07)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A07(parcel, this.A04, 1, i);
        AbstractC01153q8.A07(parcel, this.A01, 2, i);
        AbstractC01153q8.A08(parcel, this.A05, 3);
        AbstractC01153q8.A06(parcel, 4, this.A06);
        AbstractC01153q8.A04(parcel, 5, this.A00);
        AbstractC01153q8.A07(parcel, this.A03, 6, i);
        AbstractC01153q8.A07(parcel, this.A02, 7, i);
        AbstractC01153q8.A06(parcel, 8, this.A07);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
