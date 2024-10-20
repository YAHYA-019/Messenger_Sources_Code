package com.facebook.rtc.interfaces;

import X.C1pq;
import X.DKI;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: WebrtcUiHandlerListenerParams.class */
public final class WebrtcUiHandlerListenerParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKW(95);
    public final boolean A00;

    public WebrtcUiHandlerListenerParams() {
        this.A00 = true;
    }

    public WebrtcUiHandlerListenerParams(Parcel parcel) {
        this.A00 = DKI.A0k(parcel, this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof WebrtcUiHandlerListenerParams) && this.A00 == ((WebrtcUiHandlerListenerParams) obj).A00);
    }

    public int hashCode() {
        return C1pq.A05(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
