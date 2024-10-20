package com.facebook.iabadscontext;

import X.04R;
import X.0S2;
import X.11T;
import X.1BK;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AbJ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.EOw;
import X.EUq;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.iabbwpextension.IABBwPExtension;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: IABAdsContext.class */
public final class IABAdsContext extends C04v implements Parcelable, IabCommonTrait {
    public static final Parcelable.Creator CREATOR = FKX.A00(99);
    public final IABAdsBwIntegrationExtension A00;
    public final IABAdsMetaCheckoutDataExtension A01;
    public final IABAdsMetaCheckoutPaymentsSDKDataExtension A02;
    public final IABBwPayPalExtension A03;
    public final IABPostClickPersonalizationDataExtension A04;
    public final IABWatchAndBrowseWebToWAExtension A05;
    public final IgPromoAdsExtension A06;
    public final IABBwPExtension A07;
    public final ImmutableList A08;
    public final Integer A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final Map A0E;
    public final String A0F;

    public IABAdsContext(IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension, IABAdsMetaCheckoutDataExtension iABAdsMetaCheckoutDataExtension, IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension, IABBwPayPalExtension iABBwPayPalExtension, IABPostClickPersonalizationDataExtension iABPostClickPersonalizationDataExtension, IABWatchAndBrowseWebToWAExtension iABWatchAndBrowseWebToWAExtension, IgPromoAdsExtension igPromoAdsExtension, IABBwPExtension iABBwPExtension, ImmutableList immutableList, Integer num, String str, String str2, String str3, List list, Map map) {
        1BK.A1K(immutableList, 2, map);
        4YV.A1M(list, 6, iABAdsMetaCheckoutDataExtension);
        this.A09 = num;
        this.A08 = immutableList;
        this.A0C = str;
        this.A0E = map;
        this.A0B = str2;
        this.A0D = list;
        this.A01 = iABAdsMetaCheckoutDataExtension;
        this.A07 = iABBwPExtension;
        this.A06 = igPromoAdsExtension;
        this.A02 = iABAdsMetaCheckoutPaymentsSDKDataExtension;
        this.A05 = iABWatchAndBrowseWebToWAExtension;
        this.A00 = iABAdsBwIntegrationExtension;
        this.A04 = iABPostClickPersonalizationDataExtension;
        this.A03 = iABBwPayPalExtension;
        this.A0F = str3;
        this.A0A = 0S2.A00;
    }

    @Override // com.facebook.browser.iabcontext.IabCommonTrait
    public List Ach() {
        return this.A0D;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IABAdsContext)) {
                return false;
            }
            IABAdsContext iABAdsContext = (IABAdsContext) obj;
            if (!11T.A0O(this.A09, iABAdsContext.A09) || !11T.A0O(this.A08, iABAdsContext.A08) || !11T.A0O(this.A0C, iABAdsContext.A0C) || !11T.A0O(this.A0E, iABAdsContext.A0E) || !11T.A0O(this.A0B, iABAdsContext.A0B) || !11T.A0O(this.A0D, iABAdsContext.A0D) || !11T.A0O(this.A01, iABAdsContext.A01) || !11T.A0O(this.A07, iABAdsContext.A07) || !11T.A0O(this.A06, iABAdsContext.A06) || !11T.A0O(this.A02, iABAdsContext.A02) || !11T.A0O(this.A05, iABAdsContext.A05) || !11T.A0O(this.A00, iABAdsContext.A00) || !11T.A0O(this.A04, iABAdsContext.A04) || !11T.A0O(this.A03, iABAdsContext.A03) || !11T.A0O(this.A0F, iABAdsContext.A0F)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A0D, (AnonymousClass002.A05(this.A0E, (AnonymousClass002.A05(this.A08, AnonymousClass001.A02(this.A09) * 31) + 1BL.A05(this.A0C)) * 31) + 1BL.A05(this.A0B)) * 31)) + AnonymousClass001.A02(this.A07)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A02)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 7zN.A05(this.A0F);
    }

    public String toString() {
        LinkedHashMap A0A = 04R.A0A(AbJ.A1b("eligible_experience_types", this.A08, 1BK.A1G(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, EUq.A00(this.A0A)), 1BK.A1G("click_ids", this.A0D)));
        Integer num = this.A09;
        if (num != null) {
            A0A.put("impression_time", num);
        }
        String str = this.A0C;
        if (str != null) {
            A0A.put("ad_id", str);
        }
        String str2 = this.A0F;
        if (str2 != null) {
            A0A.put("tracking_token", str2);
        }
        return A0A.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        C3o5.A0f(parcel, this.A09);
        parcel.writeSerializable(this.A08);
        parcel.writeString(this.A0C);
        Map map = this.A0E;
        parcel.writeInt(map.size());
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            1BL.A12(parcel, (EOw) A0z.getKey());
            ((DisclaimerText) A0z.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0B);
        parcel.writeStringList(this.A0D);
        this.A01.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A07, i);
        IgPromoAdsExtension igPromoAdsExtension = this.A06;
        if (igPromoAdsExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igPromoAdsExtension.writeToParcel(parcel, i);
        }
        IABAdsMetaCheckoutPaymentsSDKDataExtension iABAdsMetaCheckoutPaymentsSDKDataExtension = this.A02;
        if (iABAdsMetaCheckoutPaymentsSDKDataExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABAdsMetaCheckoutPaymentsSDKDataExtension.writeToParcel(parcel, i);
        }
        IABWatchAndBrowseWebToWAExtension iABWatchAndBrowseWebToWAExtension = this.A05;
        if (iABWatchAndBrowseWebToWAExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABWatchAndBrowseWebToWAExtension.writeToParcel(parcel, i);
        }
        IABAdsBwIntegrationExtension iABAdsBwIntegrationExtension = this.A00;
        if (iABAdsBwIntegrationExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABAdsBwIntegrationExtension.writeToParcel(parcel, i);
        }
        IABPostClickPersonalizationDataExtension iABPostClickPersonalizationDataExtension = this.A04;
        if (iABPostClickPersonalizationDataExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABPostClickPersonalizationDataExtension.writeToParcel(parcel, i);
        }
        IABBwPayPalExtension iABBwPayPalExtension = this.A03;
        if (iABBwPayPalExtension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iABBwPayPalExtension.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0F);
    }
}
