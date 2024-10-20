package com.meta.foa.cds;

import X.FGX;
import X.GHJ;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CdsOpenScreenCallerDismissCallback.class */
public final class CdsOpenScreenCallerDismissCallback implements CdsOpenScreenDismissCallback {
    public static final Parcelable.Creator CREATOR = new LGm(96);
    public final GHJ A00;

    public CdsOpenScreenCallerDismissCallback(GHJ ghj) {
        this.A00 = ghj;
    }

    @Override // com.meta.foa.cds.CdsOpenScreenDismissCallback
    public void Bu1(int i) {
        this.A00.Cim(i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(FGX.A00(this.A00));
    }
}
