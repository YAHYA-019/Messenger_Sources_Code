package com.facebook.structuredsurvey.api;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* loaded from: PostSurveyAnswersParams.class */
public final class PostSurveyAnswersParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(71);
    public ImmutableList A00;
    public ImmutableList A01;
    public ImmutableMap A02;
    public ImmutableMap A03;
    public String A04;
    public String A05;
    public boolean A06;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeMap(this.A02);
        parcel.writeTypedList(this.A01);
        parcel.writeList(this.A00);
        parcel.writeMap(this.A03);
    }
}
