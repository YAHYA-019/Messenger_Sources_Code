package com.facebookpay.confirmation.model;

import X.11T;
import X.1BK;
import X.4YV;
import X.4YW;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: ECPConfirmationUpsellSection.class */
public final class ECPConfirmationUpsellSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(33);
    public final String A00;
    public final List A01;

    public ECPConfirmationUpsellSection(String str, List list) {
        11T.A0F(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ECPConfirmationUpsellSection)) {
                return false;
            }
            ECPConfirmationUpsellSection eCPConfirmationUpsellSection = (ECPConfirmationUpsellSection) obj;
            if (!11T.A0O(this.A00, eCPConfirmationUpsellSection.A00) || !11T.A0O(this.A01, eCPConfirmationUpsellSection.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 4YV.A02(this.A00));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ECPConfirmationUpsellSection(upsellSectionTitle=");
        A0k.append(this.A00);
        A0k.append(", upsellActions=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A09 = 4YW.A09(parcel, this.A01);
        while (A09.hasNext()) {
            ((ECPConfirmationUpsellAction) A09.next()).writeToParcel(parcel, i);
        }
    }
}
