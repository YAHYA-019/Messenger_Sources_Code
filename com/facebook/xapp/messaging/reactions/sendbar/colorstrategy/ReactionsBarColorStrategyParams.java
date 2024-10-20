package com.facebook.xapp.messaging.reactions.sendbar.colorstrategy;

import X.11T;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ReactionsBarColorStrategyParams.class */
public final class ReactionsBarColorStrategyParams extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(61);
    public final int A00;
    public final int A01;

    public ReactionsBarColorStrategyParams(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReactionsBarColorStrategyParams)) {
                return false;
            }
            ReactionsBarColorStrategyParams reactionsBarColorStrategyParams = (ReactionsBarColorStrategyParams) obj;
            if (this.A00 != reactionsBarColorStrategyParams.A00 || this.A01 != reactionsBarColorStrategyParams.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.A00 * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
