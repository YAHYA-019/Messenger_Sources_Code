package com.facebook.messaging.composer.platformmenu.row;

import X.11T;
import X.7zL;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;

/* loaded from: PlatformMenuOptionsRow.class */
public final class PlatformMenuOptionsRow implements PlatformMenuRow {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(17);
    public final CallToAction A00;

    public PlatformMenuOptionsRow(CallToAction callToAction) {
        11T.A0F(callToAction, 1);
        this.A00 = callToAction;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
