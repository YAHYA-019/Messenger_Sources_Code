package com.facebook.stickers.service.models;

import X.0S2;
import X.4YV;
import X.4YW;
import X.82N;
import X.DKB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: FetchStickersParams.class */
public final class FetchStickersParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(8);
    public boolean A00;
    public final ImmutableList A01;
    public final Integer A02;

    public FetchStickersParams(Parcel parcel) {
        Integer num;
        this.A01 = ImmutableList.copyOf((Collection) 4YV.A0y(parcel, Sticker.class));
        String readString = parcel.readString();
        if (readString.equals(DKB.A00(74))) {
            num = 0S2.A00;
        } else {
            if (!readString.equals("DO_NOT_UPDATE_IF_CACHED")) {
                throw new IllegalArgumentException(readString);
            }
            num = 0S2.A01;
        }
        this.A02 = num;
        this.A00 = 4YW.A0K(parcel);
    }

    public FetchStickersParams(Integer num, Collection collection) {
        this.A01 = ImmutableList.copyOf(collection);
        this.A02 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeString(1 - this.A02.intValue() != 0 ? DKB.A00(74) : "DO_NOT_UPDATE_IF_CACHED");
        parcel.writeByte(this.A00 ? (byte) 1 : (byte) 0);
    }
}
