package com.facebookpay.form.cell.text;

import X.0S2;
import X.11T;
import X.AnonymousClass001;
import X.LGp;
import X.RVx;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: TextValidatorParams.class */
public final class TextValidatorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(73);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public TextValidatorParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        if (readString.equals("MIN_LENGTH")) {
            num = 0S2.A00;
        } else if (readString.equals("MAX_LENGTH")) {
            num = 0S2.A01;
        } else if (readString.equals("EXACT_LENGTH")) {
            num = 0S2.A0C;
        } else if (readString.equals("REGEX")) {
            num = 0S2.A0N;
        } else if (readString.equals("EMPTY")) {
            num = 0S2.A0Y;
        } else if (readString.equals("US_STATE")) {
            num = 0S2.A0j;
        } else if (readString.equals("DATE")) {
            num = 0S2.A0u;
        } else if (readString.equals("CARD")) {
            num = 0S2.A15;
        } else if (readString.equals("CARD_TYPE")) {
            num = 0S2.A1G;
        } else if (readString.equals("US_PHONE")) {
            num = 0S2.A1J;
        } else {
            if (!readString.equals("PHONE")) {
                throw AnonymousClass001.A0L(readString);
            }
            num = 0S2.A02;
        }
        this.A02 = num;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = readString2;
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public TextValidatorParams(Integer num, String str, int i) {
        this.A02 = num;
        this.A04 = "";
        this.A03 = str;
        this.A01 = 0;
        this.A00 = i;
    }

    public TextValidatorParams(Integer num, String str, int i, int i2) {
        11T.A0F(str, 2);
        this.A02 = num;
        this.A04 = str;
        this.A03 = null;
        this.A01 = i;
        this.A00 = i2;
    }

    public TextValidatorParams(String str, Integer num, String str2) {
        this.A02 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(RVx.A01(this.A02));
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
