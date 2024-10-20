package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.4YU;
import X.4YW;
import X.C04v;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: DisclaimerText.class */
public final class DisclaimerText extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(97);
    public final String A00;
    public final List A01;

    public DisclaimerText(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DisclaimerText)) {
                return false;
            }
            DisclaimerText disclaimerText = (DisclaimerText) obj;
            if (!11T.A0O(this.A00, disclaimerText.A00) || !11T.A0O(this.A01, disclaimerText.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (1BL.A05(this.A00) * 31) + 4YU.A03(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A09 = 4YW.A09(parcel, list);
        while (A09.hasNext()) {
            ((DisclaimerBodyUrlRanges) A09.next()).writeToParcel(parcel, i);
        }
    }
}
