package com.facebook.messaging.business.informationidentify.model;

import X.0Q8;
import X.11T;
import X.BSL;
import X.CSW;
import X.EWI;
import X.R0J;
import X.RVC;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PIIQuestion.class */
public final class PIIQuestion implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(34);
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public PIIQuestion(Parcel parcel) {
        String str;
        String readString = parcel.readString();
        str = "";
        this.A02 = readString == null ? str : readString;
        this.A01 = BSL.A00(parcel.readString());
        String readString2 = parcel.readString();
        this.A07 = readString2 != null ? readString2 : "";
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = EWI.A00(parcel.readString());
        this.A04 = parcel.readString();
    }

    public PIIQuestion(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        if (str != null) {
            this.A02 = str;
            this.A01 = num2;
            if (str6 != null) {
                this.A07 = str6;
                this.A05 = str4;
                this.A06 = str5;
                this.A03 = str2;
                this.A00 = num;
                this.A04 = str3;
                return;
            }
            str7 = "piIQuestionTitle";
        } else {
            str7 = "piIQuestionId";
        }
        11T.A0L(str7);
        throw 0Q8.createAndThrow();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        Integer num = this.A01;
        String str = null;
        parcel.writeString(num != null ? R0J.A00(num) : null);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        Integer num2 = this.A00;
        if (num2 != null) {
            str = RVC.A01(num2);
        }
        parcel.writeString(str);
        parcel.writeString(this.A04);
    }
}
