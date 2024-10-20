package com.facebook.guidedaction;

import X.7zN;
import X.DKF;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLNegativeFeedbackActionType;

/* loaded from: GuidedActionItem.class */
public final class GuidedActionItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(93);
    public GraphQLNegativeFeedbackActionType A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A09);
        7zN.A0z(parcel, this.A00);
        DKF.A1F(parcel, this.A0B);
        DKF.A1F(parcel, this.A0C);
        parcel.writeInt(this.A01.intValue());
        DKF.A1F(parcel, this.A0E);
        DKF.A1F(parcel, this.A0D);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
    }
}
