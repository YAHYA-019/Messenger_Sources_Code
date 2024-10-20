package com.facebook.messaging.cowatch.intent.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zL;
import X.7zM;
import X.7zR;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CowatchShareSheetOptions.class */
public final class CowatchShareSheetOptions extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(25);
    public final String A00;
    public final String A01;
    public final String A02;

    public CowatchShareSheetOptions(String str, String str2, String str3) {
        7zR.A1N(str, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchShareSheetOptions)) {
                return false;
            }
            CowatchShareSheetOptions cowatchShareSheetOptions = (CowatchShareSheetOptions) obj;
            if (!11T.A0O(this.A02, cowatchShareSheetOptions.A02) || !11T.A0O(this.A00, cowatchShareSheetOptions.A00) || !11T.A0O(this.A01, cowatchShareSheetOptions.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 7zM.A05(this.A01, (4YV.A02(this.A02) + 1BL.A05(this.A00)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
