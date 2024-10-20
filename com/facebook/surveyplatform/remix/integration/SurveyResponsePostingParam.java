package com.facebook.surveyplatform.remix.integration;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;

/* loaded from: SurveyResponsePostingParam.class */
public final class SurveyResponsePostingParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(74);
    public ImmutableMap A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeMap(this.A00);
    }
}
