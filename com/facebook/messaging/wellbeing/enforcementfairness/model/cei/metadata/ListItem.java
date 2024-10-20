package com.facebook.messaging.wellbeing.enforcementfairness.model.cei.metadata;

import X.11T;
import X.7zN;
import X.7zU;
import X.BLH;
import X.C1pq;
import X.C1u3;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: ListItem.class */
public final class ListItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSU(90);
    public final C1u3 A00;
    public final BLH A01;
    public final String A02;
    public final String A03;

    public ListItem(C1u3 c1u3, BLH blh, String str, String str2) {
        C1pq.A08("description", str);
        this.A02 = str;
        C1pq.A08("helpType", blh);
        this.A01 = blh;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, c1u3);
        this.A00 = c1u3;
        C1pq.A08("title", str2);
        this.A03 = str2;
    }

    public ListItem(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        this.A01 = BLH.values()[parcel.readInt()];
        this.A00 = C1u3.values()[parcel.readInt()];
        this.A03 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ListItem)) {
                return false;
            }
            ListItem listItem = (ListItem) obj;
            if (!11T.A0O(this.A02, listItem.A02) || this.A01 != listItem.A01 || this.A00 != listItem.A00 || !11T.A0O(this.A03, listItem.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A03 = (C1pq.A03(this.A02) * 31) + C3o5.A03(this.A01);
        C1u3 c1u3 = this.A00;
        if (c1u3 != null) {
            i = c1u3.ordinal();
        }
        return C1pq.A04(this.A03, (A03 * 31) + i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        7zN.A0z(parcel, this.A01);
        7zN.A0z(parcel, this.A00);
        parcel.writeString(this.A03);
    }
}
