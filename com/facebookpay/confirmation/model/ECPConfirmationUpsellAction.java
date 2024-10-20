package com.facebookpay.confirmation.model;

import X.11T;
import X.1BL;
import X.4YT;
import X.4YV;
import X.7zK;
import X.7zT;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.DKH;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ECPConfirmationUpsellAction.class */
public final class ECPConfirmationUpsellAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(32);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public ECPConfirmationUpsellAction(String str, String str2, String str3, String str4, String str5) {
        7zT.A1W(str, str2, str3, str4);
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = str4;
        this.A02 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ECPConfirmationUpsellAction)) {
                return false;
            }
            ECPConfirmationUpsellAction eCPConfirmationUpsellAction = (ECPConfirmationUpsellAction) obj;
            if (!11T.A0O(this.A04, eCPConfirmationUpsellAction.A04) || !11T.A0O(this.A00, eCPConfirmationUpsellAction.A00) || !11T.A0O(this.A01, eCPConfirmationUpsellAction.A01) || !11T.A0O(this.A03, eCPConfirmationUpsellAction.A03) || !11T.A0O(this.A02, eCPConfirmationUpsellAction.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A00, 4YV.A02(this.A04)))) + 1BL.A05(this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ECPConfirmationUpsellAction(type=");
        A0k.append(this.A04);
        A0k.append(4YT.A00(485));
        A0k.append(this.A00);
        A0k.append(7zK.A00(15));
        A0k.append(this.A01);
        A0k.append(", title=");
        A0k.append(this.A03);
        A0k.append(", linkUrl=");
        return DKH.A0o(this.A02, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }
}
