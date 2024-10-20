package com.facebook.quicksilver.common.sharing;

import X.0S2;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: GameScreenshotShareExtras.class */
public final class GameScreenshotShareExtras extends GameShareExtras {
    public static final Parcelable.Creator CREATOR = FKW.A00(78);
    public String A00;

    @Override // com.facebook.quicksilver.common.sharing.GameShareExtras
    public Integer A00() {
        return 0S2.A0Y;
    }

    @Override // com.facebook.quicksilver.common.sharing.GameShareExtras
    public void A01(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    @Override // com.facebook.quicksilver.common.sharing.GameShareExtras
    public void A02(Parcel parcel, int i) {
        parcel.writeString(this.A00);
    }
}
