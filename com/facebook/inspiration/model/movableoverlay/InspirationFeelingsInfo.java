package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbM;
import X.C1pq;
import X.C3o5;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationFeelingsInfo.class */
public final class InspirationFeelingsInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKc(11);
    public final float A00;
    public final float A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public InspirationFeelingsInfo(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        while (i < A01) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A02 = ImmutableList.copyOf(strArr);
        this.A00 = parcel.readFloat();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A01 = parcel.readFloat();
    }

    public InspirationFeelingsInfo(ImmutableList immutableList, String str, String str2, String str3, String str4, String str5, float f, float f2) {
        C1pq.A08("bubblePositions", immutableList);
        this.A02 = immutableList;
        this.A00 = f;
        C1pq.A08("iconId", str);
        this.A03 = str;
        C1pq.A08("objectId", str2);
        this.A04 = str2;
        C1pq.A08("objectText", str3);
        this.A05 = str3;
        C1pq.A08("taggableActivityId", str4);
        this.A06 = str4;
        C1pq.A08("verbText", str5);
        this.A07 = str5;
        this.A01 = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationFeelingsInfo)) {
                return false;
            }
            InspirationFeelingsInfo inspirationFeelingsInfo = (InspirationFeelingsInfo) obj;
            if (!11T.A0O(this.A02, inspirationFeelingsInfo.A02) || this.A00 != inspirationFeelingsInfo.A00 || !11T.A0O(this.A03, inspirationFeelingsInfo.A03) || !11T.A0O(this.A04, inspirationFeelingsInfo.A04) || !11T.A0O(this.A05, inspirationFeelingsInfo.A05) || !11T.A0O(this.A06, inspirationFeelingsInfo.A06) || !11T.A0O(this.A07, inspirationFeelingsInfo.A07) || this.A01 != inspirationFeelingsInfo.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, AbM.A00(C1pq.A03(this.A02), this.A00)))))), this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A01);
    }
}
