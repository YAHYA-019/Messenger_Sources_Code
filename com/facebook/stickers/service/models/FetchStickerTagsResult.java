package com.facebook.stickers.service.models;

import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.stickers.model.StickerTag;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* loaded from: FetchStickerTagsResult.class */
public final class FetchStickerTagsResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(55);
    public final ImmutableList A00;
    public final String A01;

    public FetchStickerTagsResult(Parcel parcel) {
        this.A00 = ImmutableList.copyOf((Collection) parcel.readArrayList(StickerTag.class.getClassLoader()));
        String readString = parcel.readString();
        this.A01 = TextUtils.isEmpty(readString) ? "" : readString;
    }

    public FetchStickerTagsResult(String str, List list) {
        this.A00 = ImmutableList.copyOf((Collection) list);
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
        parcel.writeString(this.A01);
    }
}
