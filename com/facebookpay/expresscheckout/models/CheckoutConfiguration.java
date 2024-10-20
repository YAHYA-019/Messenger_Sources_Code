package com.facebookpay.expresscheckout.models;

import X.11T;
import X.1BL;
import X.4YU;
import X.AbN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3o5;
import X.DKB;
import X.DKG;
import X.KNE;
import X.KNL;
import X.KwL;
import X.LGp;
import X.RW0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CheckoutConfiguration.class */
public final class CheckoutConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(36);
    public final int A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final Set A0D;
    public final Set A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final Boolean A0H;
    public final Integer A0I;
    public final String A0J;
    public final boolean A0K;

    public CheckoutConfiguration(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Integer num, Integer num2, Integer num3, String str, String str2, String str3, Set set, Set set2, int i, boolean z, boolean z2, boolean z3) {
        this.A0J = str;
        this.A0D = set;
        this.A0E = set2;
        this.A0B = str2;
        this.A0F = z;
        this.A0I = num;
        this.A0A = num2;
        this.A06 = bool;
        this.A07 = bool2;
        this.A02 = bool3;
        this.A08 = bool4;
        this.A0C = str3;
        this.A01 = bool5;
        this.A03 = bool6;
        this.A09 = num3;
        this.A05 = bool7;
        this.A00 = i;
        this.A0K = z2;
        this.A04 = bool8;
        this.A0G = z3;
        this.A0H = bool9;
    }

    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "CREDENTIAL_ACQUISITION_SOURCE_BANNER";
            case 2:
                return "IAP_INFORMATIONAL_BANNER";
            case 3:
                return "IAP_PAYER_PROFILE_BANNER";
            case 4:
                return "INCENTIVE_BANNER";
            case 5:
                return "META_PAY_BANNER";
            case 6:
                return "NO_BANNER";
            case 7:
                return "PROACTIVE_CHECKOUT_BANNER";
            default:
                return "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CheckoutConfiguration)) {
                return false;
            }
            CheckoutConfiguration checkoutConfiguration = (CheckoutConfiguration) obj;
            if (!11T.A0O(this.A0J, checkoutConfiguration.A0J) || !11T.A0O(this.A0D, checkoutConfiguration.A0D) || !11T.A0O(this.A0E, checkoutConfiguration.A0E) || !11T.A0O(this.A0B, checkoutConfiguration.A0B) || this.A0F != checkoutConfiguration.A0F || this.A0I != checkoutConfiguration.A0I || this.A0A != checkoutConfiguration.A0A || !11T.A0O(this.A06, checkoutConfiguration.A06) || !11T.A0O(this.A07, checkoutConfiguration.A07) || !11T.A0O(this.A02, checkoutConfiguration.A02) || !11T.A0O(this.A08, checkoutConfiguration.A08) || !11T.A0O(this.A0C, checkoutConfiguration.A0C) || !11T.A0O(this.A01, checkoutConfiguration.A01) || !11T.A0O(this.A03, checkoutConfiguration.A03) || this.A09 != checkoutConfiguration.A09 || !11T.A0O(this.A05, checkoutConfiguration.A05) || this.A00 != checkoutConfiguration.A00 || this.A0K != checkoutConfiguration.A0K || !11T.A0O(this.A04, checkoutConfiguration.A04) || this.A0G != checkoutConfiguration.A0G || !11T.A0O(this.A0H, checkoutConfiguration.A0H)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = (((AnonymousClass002.A05(this.A0E, AnonymousClass002.A05(this.A0D, 1BL.A05(this.A0J) * 31)) + 1BL.A05(this.A0B)) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31;
        Integer num = this.A0I;
        int hashCode = (A05 + (num == null ? 0 : RW0.A01(num).hashCode() + num.intValue())) * 31;
        Integer num2 = this.A0A;
        int hashCode2 = (((((((((((((((hashCode + (num2 == null ? 0 : RW0.A01(num2).hashCode() + num2.intValue())) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A08)) * 31 * 31) + 1BL.A05(this.A0C)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + AnonymousClass001.A02(this.A03)) * 31;
        Integer num3 = this.A09;
        return ((((((((((((hashCode2 + (num3 == null ? 0 : KwL.A01(num3).hashCode() + num3.intValue())) * 31) + AnonymousClass001.A02(this.A05)) * 31) + this.A00) * 31) + AnonymousClass002.A00(this.A0K ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31) + 4YU.A03(this.A0H);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CheckoutConfiguration(languageLocal=");
        A0k.append(this.A0J);
        A0k.append(", optionalFields=");
        A0k.append(this.A0D);
        A0k.append(", returnFields=");
        A0k.append(this.A0E);
        A0k.append(", checkoutCTAButtonText=");
        A0k.append(this.A0B);
        A0k.append(", fullBillingAddressRequired=");
        A0k.append(this.A0F);
        A0k.append(", nuxBannerType=");
        A0k.append(A00(this.A0I));
        A0k.append(", puxBannerType=");
        A0k.append(A00(this.A0A));
        A0k.append(", enableRedesignPhase2=");
        A0k.append(this.A06);
        A0k.append(", enableRedesignPhase4=");
        A0k.append(this.A07);
        A0k.append(", enableAnonCheckoutRedesign=");
        A0k.append(this.A02);
        A0k.append(", pickupOptionSupport=");
        A0k.append(this.A08);
        DKG.A1X(A0k, ", apmConfiguration=");
        A0k.append(", emailOptInUrl=");
        A0k.append(this.A0C);
        A0k.append(", defaultEmailOptOut=");
        A0k.append(this.A01);
        A0k.append(", enableCheckoutOptionality=");
        A0k.append(this.A03);
        A0k.append(", fulfillmentType=");
        Integer num = this.A09;
        A0k.append(num != null ? KwL.A01(num) : "null");
        A0k.append(", enableRedesignOptimizations=");
        A0k.append(this.A05);
        A0k.append(DKB.A00(35));
        A0k.append(this.A00);
        A0k.append(", isCheckoutInFullScreen=");
        A0k.append(this.A0K);
        A0k.append(", enableMissingBillingOptimization=");
        A0k.append(this.A04);
        A0k.append(", shouldShowHeaderBranding=");
        A0k.append(this.A0G);
        A0k.append(", isBloksCheckoutAvailable=");
        return AnonymousClass002.A0K(this.A0H, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0J);
        Iterator A0S = C3o5.A0S(parcel, this.A0D);
        while (A0S.hasNext()) {
            1BL.A12(parcel, (KNL) A0S.next());
        }
        Iterator A0S2 = C3o5.A0S(parcel, this.A0E);
        while (A0S2.hasNext()) {
            1BL.A12(parcel, (KNE) A0S2.next());
        }
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0F ? 1 : 0);
        Integer num = this.A0I;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(RW0.A01(num));
        }
        Integer num2 = this.A0A;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(RW0.A01(num2));
        }
        AbN.A0s(parcel, this.A06);
        AbN.A0s(parcel, this.A07);
        AbN.A0s(parcel, this.A02);
        AbN.A0s(parcel, this.A08);
        parcel.writeParcelable(null, i);
        parcel.writeString(this.A0C);
        AbN.A0s(parcel, this.A01);
        AbN.A0s(parcel, this.A03);
        Integer num3 = this.A09;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(KwL.A01(num3));
        }
        AbN.A0s(parcel, this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0K ? 1 : 0);
        AbN.A0s(parcel, this.A04);
        parcel.writeInt(this.A0G ? 1 : 0);
        AbN.A0s(parcel, this.A0H);
    }
}
