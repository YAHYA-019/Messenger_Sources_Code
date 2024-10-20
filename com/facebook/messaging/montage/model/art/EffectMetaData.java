package com.facebook.messaging.montage.model.art;

import X.1BL;
import X.CST;
import X.Hau;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;

/* loaded from: EffectMetaData.class */
public final class EffectMetaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(8);
    public final Uri A00;
    public final Sticker A01;

    public EffectMetaData(Hau hau) {
        this.A01 = hau.A01;
        this.A00 = hau.A00;
    }

    public EffectMetaData(Parcel parcel) {
        this.A01 = (Sticker) 1BL.A0C(parcel, Sticker.class);
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }
}
