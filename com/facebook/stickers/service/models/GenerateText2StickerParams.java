package com.facebook.stickers.service.models;

import X.C53v;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: GenerateText2StickerParams.class */
public final class GenerateText2StickerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(59);
    public final ImmutableList A00;
    public final Boolean A01;
    public final String A02;

    public GenerateText2StickerParams(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = Boolean.valueOf(C53v.A0S(parcel));
        this.A00 = C53v.A01(parcel);
    }

    public GenerateText2StickerParams(ImmutableList immutableList, Boolean bool, String str) {
        this.A02 = str;
        this.A01 = bool;
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01.booleanValue() ? 1 : 0);
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            immutableList = ImmutableList.of();
        }
        parcel.writeStringList(immutableList);
    }
}
