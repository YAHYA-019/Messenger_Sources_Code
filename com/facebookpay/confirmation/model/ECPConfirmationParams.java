package com.facebookpay.confirmation.model;

import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.7zM;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ECPConfirmationParams.class */
public final class ECPConfirmationParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(31);
    public final ECPConfirmationUpsellSection A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public ECPConfirmationParams(ECPConfirmationUpsellSection eCPConfirmationUpsellSection, String str, String str2, String str3, String str4, String str5, String str6) {
        1BL.A11(1, str, str3, str4);
        11T.A0F(str6, 7);
        this.A03 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A06 = str5;
        this.A00 = eCPConfirmationUpsellSection;
        this.A01 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ECPConfirmationParams)) {
                return false;
            }
            ECPConfirmationParams eCPConfirmationParams = (ECPConfirmationParams) obj;
            if (!11T.A0O(this.A03, eCPConfirmationParams.A03) || !11T.A0O(this.A02, eCPConfirmationParams.A02) || !11T.A0O(this.A05, eCPConfirmationParams.A05) || !11T.A0O(this.A04, eCPConfirmationParams.A04) || !11T.A0O(this.A06, eCPConfirmationParams.A06) || !11T.A0O(this.A00, eCPConfirmationParams.A00) || !11T.A0O(this.A01, eCPConfirmationParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, (((AnonymousClass002.A07(this.A04, AnonymousClass002.A07(this.A05, (4YV.A02(this.A03) + 1BL.A05(this.A02)) * 31)) + 1BL.A05(this.A06)) * 31) + 4YU.A03(this.A00)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ECPConfirmationParams(paymentSectionTitle=");
        A0k.append(this.A03);
        A0k.append(", paymentSectionSubtitle=");
        A0k.append(this.A02);
        A0k.append(", seeReceiptTitle=");
        A0k.append(this.A05);
        A0k.append(", seeReceiptLinkUrl=");
        A0k.append(this.A04);
        A0k.append(", upsellPINTitle=");
        A0k.append(this.A06);
        A0k.append(", upsellSection=");
        A0k.append(this.A00);
        A0k.append(", ctaType=");
        return DKH.A0o(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        ECPConfirmationUpsellSection eCPConfirmationUpsellSection = this.A00;
        if (eCPConfirmationUpsellSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eCPConfirmationUpsellSection.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
    }
}
