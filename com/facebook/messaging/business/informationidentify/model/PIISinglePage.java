package com.facebook.messaging.business.informationidentify.model;

import X.0Q8;
import X.11T;
import X.AbN;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: PIISinglePage.class */
public final class PIISinglePage implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(35);
    public final ImmutableList A00;
    public final String A01;

    public PIISinglePage(Parcel parcel) {
        String readString = parcel.readString();
        this.A01 = readString == null ? "" : readString;
        ImmutableList A0e = AbN.A0e(parcel, PIIQuestion.class);
        11T.A0I(A0e, "null cannot be cast to non-null type com.google.common.collect.ImmutableList<com.facebook.messaging.business.informationidentify.model.PIIQuestion>");
        this.A00 = A0e;
    }

    public PIISinglePage(ImmutableList immutableList, String str) {
        String str2;
        if (str == null) {
            str2 = "piIScreenTitle";
        } else {
            this.A01 = str;
            if (immutableList != null) {
                this.A00 = immutableList;
                return;
            }
            str2 = "piIQuestions";
        }
        11T.A0L(str2);
        throw 0Q8.createAndThrow();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeList(this.A00);
    }
}
