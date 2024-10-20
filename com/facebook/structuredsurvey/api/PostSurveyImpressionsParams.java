package com.facebook.structuredsurvey.api;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: PostSurveyImpressionsParams.class */
public final class PostSurveyImpressionsParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(72);
    public ImmutableMap A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeMap(this.A00);
    }
}
