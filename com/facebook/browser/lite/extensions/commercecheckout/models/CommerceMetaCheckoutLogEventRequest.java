package com.facebook.browser.lite.extensions.commercecheckout.models;

import X.11T;
import X.1BL;
import X.7zN;
import X.7zR;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.MetaCheckoutExperienceType;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* loaded from: CommerceMetaCheckoutLogEventRequest.class */
public final class CommerceMetaCheckoutLogEventRequest extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(52);
    public final IABAdsContext A00;
    public final MetaCheckoutExperienceType A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public CommerceMetaCheckoutLogEventRequest(IABAdsContext iABAdsContext, MetaCheckoutExperienceType metaCheckoutExperienceType, Integer num, String str, String str2, String str3, String str4) {
        7zR.A1N(num, str);
        this.A02 = num;
        this.A00 = iABAdsContext;
        this.A04 = str;
        this.A06 = str2;
        this.A01 = metaCheckoutExperienceType;
        this.A05 = str3;
        this.A03 = str4;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ELIGIBILITY_SUCCESS";
            case 2:
                return "DISCLAIMER_IMPRESSION";
            case 3:
                return "OPT_OUT";
            case 4:
                return "URL_INTERCEPT_INIT";
            case 5:
                return "URL_INTERCEPT_SUCCESS";
            case 6:
                return "URL_INTERCEPT_FAIL";
            case 7:
                return OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
            default:
                return "CHECKOUT_LOADING_SCREEN_IMPRESSION";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommerceMetaCheckoutLogEventRequest)) {
                return false;
            }
            CommerceMetaCheckoutLogEventRequest commerceMetaCheckoutLogEventRequest = (CommerceMetaCheckoutLogEventRequest) obj;
            if (this.A02 != commerceMetaCheckoutLogEventRequest.A02 || !11T.A0O(this.A00, commerceMetaCheckoutLogEventRequest.A00) || !11T.A0O(this.A04, commerceMetaCheckoutLogEventRequest.A04) || !11T.A0O(this.A06, commerceMetaCheckoutLogEventRequest.A06) || this.A01 != commerceMetaCheckoutLogEventRequest.A01 || !11T.A0O(this.A05, commerceMetaCheckoutLogEventRequest.A05) || !11T.A0O(this.A03, commerceMetaCheckoutLogEventRequest.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        return ((((((AnonymousClass002.A07(this.A04, (C3o5.A05(num, A00(num)) + AnonymousClass001.A02(this.A00)) * 31) + 1BL.A05(this.A06)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A05)) * 31) + 7zN.A05(this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(A00(this.A02));
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }
}
