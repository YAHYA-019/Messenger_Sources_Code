package com.facebook.api.reportableentity;

import X.11T;
import X.1BL;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLNegativeFeedbackActionType;

/* loaded from: NegativeFeedbackActionOnReportableEntityMethod$Params.class */
public final class NegativeFeedbackActionOnReportableEntityMethod$Params implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(4);
    public GraphQLNegativeFeedbackActionType A00;
    public String A01;
    public String A02;
    public boolean A03;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(String.valueOf(this.A03));
    }
}
