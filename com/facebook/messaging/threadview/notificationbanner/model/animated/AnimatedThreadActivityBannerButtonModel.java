package com.facebook.messaging.threadview.notificationbanner.model.animated;

import X.11T;
import X.4YW;
import X.AbF;
import X.AbK;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AnimatedThreadActivityBannerButtonModel.class */
public final class AnimatedThreadActivityBannerButtonModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(78);
    public final String A00;
    public final String A01;

    public AnimatedThreadActivityBannerButtonModel(Parcel parcel) {
        this.A00 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A01 = parcel.readString();
    }

    public AnimatedThreadActivityBannerButtonModel(String str, String str2) {
        this.A00 = str;
        AbF.A1V(str2);
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnimatedThreadActivityBannerButtonModel)) {
                return false;
            }
            AnimatedThreadActivityBannerButtonModel animatedThreadActivityBannerButtonModel = (AnimatedThreadActivityBannerButtonModel) obj;
            if (!11T.A0O(this.A00, animatedThreadActivityBannerButtonModel.A00) || !11T.A0O(this.A01, animatedThreadActivityBannerButtonModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
