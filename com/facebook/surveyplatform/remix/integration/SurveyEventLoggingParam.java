package com.facebook.surveyplatform.remix.integration;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: SurveyEventLoggingParam.class */
public final class SurveyEventLoggingParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(73);
    public ImmutableMap A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeMap(this.A00);
    }
}
