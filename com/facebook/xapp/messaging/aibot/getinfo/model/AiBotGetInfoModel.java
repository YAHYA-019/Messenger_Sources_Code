package com.facebook.xapp.messaging.aibot.getinfo.model;

import X.11T;
import X.1BL;
import X.4YU;
import X.4YV;
import X.AnonymousClass002;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AiBotGetInfoModel.class */
public final class AiBotGetInfoModel extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(44);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AiBotGetInfoModel(Integer num, String str, String str2, String str3) {
        1BL.A1F(str, str2);
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A00 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AiBotGetInfoModel)) {
                return false;
            }
            AiBotGetInfoModel aiBotGetInfoModel = (AiBotGetInfoModel) obj;
            if (!11T.A0O(this.A03, aiBotGetInfoModel.A03) || !11T.A0O(this.A01, aiBotGetInfoModel.A01) || !11T.A0O(this.A02, aiBotGetInfoModel.A02) || !11T.A0O(this.A00, aiBotGetInfoModel.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.A01, 4YV.A02(this.A03)) + 1BL.A05(this.A02)) * 31) + 4YU.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int intValue;
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }
}
