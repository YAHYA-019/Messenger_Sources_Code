package com.facebook.messaging.cowatch.intent.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zL;
import X.7zN;
import X.7zV;
import X.AnonymousClass001;
import X.BTQ;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CowatchShareModel.class */
public final class CowatchShareModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(24);
    public final CowatchShareSheetOptions A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public CowatchShareModel(CowatchShareSheetOptions cowatchShareSheetOptions, Integer num, String str, String str2, String str3, String str4) {
        1BL.A1F(str, num);
        this.A03 = str;
        this.A01 = num;
        this.A00 = cowatchShareSheetOptions;
        this.A02 = str2;
        this.A04 = str3;
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchShareModel)) {
                return false;
            }
            CowatchShareModel cowatchShareModel = (CowatchShareModel) obj;
            if (!11T.A0O(this.A03, cowatchShareModel.A03) || this.A01 != cowatchShareModel.A01 || !11T.A0O(this.A00, cowatchShareModel.A00) || !11T.A0O(this.A02, cowatchShareModel.A02) || !11T.A0O(this.A04, cowatchShareModel.A04) || !11T.A0O(this.A05, cowatchShareModel.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = 4YV.A02(this.A03);
        Integer num = this.A01;
        return ((((((7zV.A03(num, BTQ.A00(num), A02) + AnonymousClass001.A02(this.A00)) * 31) + 1BL.A05(this.A02)) * 31) + 1BL.A05(this.A04)) * 31) + 7zN.A05(this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(BTQ.A00(this.A01));
        CowatchShareSheetOptions cowatchShareSheetOptions = this.A00;
        if (cowatchShareSheetOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cowatchShareSheetOptions.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }
}
