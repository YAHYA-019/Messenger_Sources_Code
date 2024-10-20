package com.facebook.messaging.pagesurface.about.params;

import X.11T;
import X.AbK;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: PageAboutInputParams.class */
public final class PageAboutInputParams implements Parcelable {
    public static final PageAboutInputParams A03 = new PageAboutInputParams(null, null, null);
    public static final Parcelable.Creator CREATOR = CST.A00(97);
    public final ThreadKey A00;
    public final String A01;
    public final String A02;

    public PageAboutInputParams(Parcel parcel) {
        this.A00 = AbK.A0X(parcel);
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public PageAboutInputParams(ThreadKey threadKey, String str, String str2) {
        this.A00 = threadKey;
        this.A02 = str2;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
